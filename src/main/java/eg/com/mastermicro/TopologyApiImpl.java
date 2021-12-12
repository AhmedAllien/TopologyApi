package eg.com.mastermicro;

import com.fasterxml.jackson.databind.ObjectMapper;
import eg.com.mastermicro.model.Component;
import eg.com.mastermicro.model.Topology;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopologyApiImpl implements TopologyApi {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final Map<String,Topology> topologies=new HashMap<>();
    @Override
    public Topology readJSON(String fileName) throws IOException {

        Topology topology = objectMapper.readValue(new File(fileName), Topology.class);
        topologies.put(topology.getId(),topology);
        return topology;
    }

    @Override
    public Topology writeJSON(String topologyId) {
        Topology topology = getTopologyById(topologyId);
//        objectMapper.wr
        return topology;
    }

    private Topology getTopologyById(String topologyId) {
        return topologies.get(topologyId);
    }

    @Override
    public Topology deleteTopology(String TopologyID) {
        return topologies.remove(TopologyID);
    }

    @Override
    public List<Topology> queryTopologies() {
        return topologies.values().stream().toList();
    }

    @Override
    public List<Component> queryDevices(String topologyId) {
        return getTopologyById(topologyId).getComponents();
    }

    @Override
    public List<Component> queryDevicesWithNetlistNode(String topologyId, String netlistNodeID) {
        return getTopologyById(topologyId)
                .getComponents()
                .stream()
                .filter(component -> component.getNetlist().containsValue(netlistNodeID))
                .collect(Collectors.toList());
    }
}
