package eg.com.mastermicro;

public interface TopologyApi {
    Topology readJSON(String fileName);
    Topology writeJSON(String TopologyID);
    Topology deleteTopology(String TopologyID);
    TopologyList queryTopologies();
    DeviceList queryDevices(String TopologyID);
    DeviceList queryDevicesWithNetlistNode(String TopologyID,String NetlistNodeID);
}
