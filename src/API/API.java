
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class API {
    private static API api=null;
    private final ArrayList<Topology>topologies;

    //private constructor for singleton design pattern
    private API() {
        topologies = new ArrayList<>();
    }
    public static API createTopologyAPI(){
        if(api==null)
            api= new API();
        return api;
    }

    //Deserialization
    public void readJSON(String fileName) throws IOException {

        String s = new String(Files.readAllBytes(Path.of(fileName)));
        Topology topology = new Gson().fromJson(s,Topology.class);
        topologies.add(topology);
        //This only reads one topolgy bacause that's how the JSON file is
        //aka the JSON file doesn't start with square brackets
    }


    public boolean writeJSON(String topologyID) throws IOException {
        for(Topology t : topologies){
            if(t.getId().equals(topologyID)){
                //Serialization
                // Creating Gson object with pretty painting to put new lines, etc.
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                //String representing the topology which will be written to the new file
                String s = gson.toJson(new Topology(t.getId(),t.getComponents()));
                //Writing to the file
                File file = new File(t.getId()+".json");
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(s);
                fileWriter.flush();
                fileWriter.close();
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
            if(t.getId().equals(topologyID)){
                topologies.remove(t);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Component> queryDevices(String topologyID) {
        for(Topology t :topologies){
            if(t.getId().equals(topologyID)){
                return t.getComponents();
            }
        }
        return null;
    }

    public ArrayList<Component> queryDevicesWithNetlistNode(String topologyID, String NetlistNodeID) {
        ArrayList<Component> components = new ArrayList<>();
        for(Topology t : topologies){
            if(t.getId().equals(topologyID)){
                for( Component c : t.getComponents()){
                    if(c.getId().equals(NetlistNodeID)){
                        components.add(c);
                    }
                }
            }
        }
        return components;
    }
}
