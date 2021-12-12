package eg.com.mastermicro;

import eg.com.mastermicro.model.Topology;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TopologyApiImplTest {

    private TopologyApi topologyApi = new TopologyApiImpl();

    @Test
    void readJSON_withValidFile() throws IOException {

        Topology topology = topologyApi.readJSON("src/main/resources/topology.json");
        assertEquals(topology.getId(),"top1");
    }

    @Test
    void queryDevicesWithNetlistNode() throws IOException {

        Topology topology = topologyApi.readJSON("src/main/resources/topology.json");
        assertEquals(2,topologyApi.queryDevicesWithNetlistNode("top1","n1").size());

    }

    @Test
    void queryTopologies() throws IOException {

        Topology topology = topologyApi.readJSON("src/main/resources/topology.json");
        assertAll(this::queryTopologies);
    }

    @Test
    void writeJSON() throws IOException {
        Topology topology = topologyApi.readJSON("src/main/resources/topology.json");
        topologyApi.writeJSON(topology.getId());
    }

    @Test
    void deleteTopology() {
    }

    @Test
    void queryDevices() {
    }
}