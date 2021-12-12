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
    Topology writeJSON(String TopologyID) throws IOException;

    /**
     * @param TopologyID the id of given topology
     *        deletes the topology of the given id from memory
     * @return the topologies after deleting the one with the given id
     */
    Topology deleteTopology(String TopologyID);

    /**
     * Query about which topologies are currently in the memory.
     * @return the list of topologies that currently in the memory.
     */
    List<Topology> queryTopologies();

    /**
     * Query about which devices are in a given topology.
     * @param TopologyID the id of given topology
     * @return which devices are in a given topology.
     */
    List<Component> queryDevices(String TopologyID);


    /**
     * Query about which devices are connected to a given netlist node in a given topology.
     * @param TopologyID the id of given topology
     * @param NetlistNodeID the id of given netlist node
     * @return devices are connected to a given netlist node in a given topology.
     */
    List<Component> queryDevicesWithNetlistNode(String TopologyID, String NetlistNodeID);
}
