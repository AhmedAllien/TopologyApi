package eg.com.mastermicro;

import eg.com.mastermicro.model.Component;
import eg.com.mastermicro.model.Topology;

import java.io.IOException;
import java.util.List;

public interface TopologyApi {
    /**
     * @param fileName the name of json file
     *        reads json file and parses it
     * @return
     */
    Topology readJSON(String fileName) throws IOException;

    /**
     * @param TopologyID the id of given topology
     *        prints the topology with "id" = TopologyID to a json file
     * @return
     */
    Topology writeJSON(String TopologyID);

    /**
     * @param TopologyID the id of given topology
     * @return
     */
    Topology deleteTopology(String TopologyID);
    List<Topology> queryTopologies();
    List<Component> queryDevices(String TopologyID);
    List<Component> queryDevicesWithNetlistNode(String TopologyID, String NetlistNodeID);
}
