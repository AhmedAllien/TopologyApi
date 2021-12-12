package eg.com.mastermicro;

import eg.com.mastermicro.model.Topology;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class TopologyApiImplTest {

    private TopologyApi topologyApi = new TopologyApiImpl();

    @Test
    void readJSON_withValidFile() {
        try {
            Topology topology = topologyApi.readJSON("src/main/resources/topology.json");
            assertEquals(topology.getId(),"top1");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void queryDevicesWithNetlistNode() {
        try {
            Topology topology = topologyApi.readJSON("src/main/resources/topology.json");
            assertEquals(2,topologyApi.queryDevicesWithNetlistNode("top1","n1").size());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}