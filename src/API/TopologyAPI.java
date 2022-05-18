import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class TopologyAPI {
    private static TopologyAPI api=null;
    private final ArrayList<Topology>topologies;

    //private constructor for singleton design pattern
    private TopologyAPI() {
        topologies = new ArrayList<>();
    }
    public static TopologyAPI createTopologyAPI(){
        if(api==null)
            api= new TopologyAPI();
        return api;
    }
    public static void deleteTopologyAPI (){
        api= null;
    }

    //Deserialization
    public Topology readJSON(String fileName) throws IOException {
        Topology topology = new ObjectMapper().readValue(new File(fileName),Topology.class);

        boolean flag =false;            //flag to find if the topology has been previously inserted
        for(Topology t : topologies){
            if(t.equals(topology)){
                flag =true;
                break;
            }
        }
        if(!flag)
            topologies.add(topology);
        return topology;
    }

    //writing topology into json file remove the topology from the topologies list
    public boolean writeJSON(String topologyID) throws IOException {
        for(Topology t : topologies){
            if(t.getId().equals(topologyID)){
                //Serialization
                ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
                objectMapper.writeValue(new File(t.getId()+".json"),t);

                //removing topology from the list after being written to a file
                topologies.remove(t);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Topology> queryTopologies() {
        return topologies;
    }

    public boolean deleteTopology(String topologyID) {
        for(Topology t : topologies){
            if(t.getId().equals(topologyID)){       //if we found the required topology
                topologies.remove(t);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Component> queryDevices(String topologyID) {
        for(Topology t :topologies){
            if(t.getId().equals(topologyID)){           //if we found the required topology
                return t.getComponents();
            }
        }
        return null;
    }

    public ArrayList<Component> queryDevicesWithNetlistNode(String topologyID, String netlistNodeID) {
        ArrayList<Component> components = new ArrayList<>();
        for(Topology t : topologies){
            if(t.getId().equals(topologyID)){
                for( Component c : t.getComponents()){
                    for (Map.Entry<String,String> entry : c.getNetlist().entrySet()){
                        if(entry.getValue().equals(netlistNodeID)){
                            components.add(c);
                        }
                    }
                }
            }
        }
        return components;
    }
}
