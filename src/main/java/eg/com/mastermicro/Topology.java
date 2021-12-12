package eg.com.mastermicro;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topology {

    private String id;
    private ArrayList<Component> component;

    public void readJSON(String fileName) {
        try {
            // create object mapper instance
            ObjectMapper mapper = new ObjectMapper();

            // convert JSON array to list of Topologies
            List<Topology> Topologies = Arrays.asList(mapper.readValue(Paths.get(fileName).toFile(), Topology[].class));

            // print books
            Topologies.forEach(System.out::println);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    Topology writeJSON(String TopologyID) {
        return null;
    }

    public void main(){
        this.readJSON("topology.json");
    }

    Topology deleteTopology(String TopologyID) {
        return null;
    }
}
