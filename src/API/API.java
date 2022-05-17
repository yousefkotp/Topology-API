import java.io.IOException;
import java.util.ArrayList;

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


    public ArrayList<Topology> readJSON(String fileName) throws IOException {

        return topologies;
    }

    public boolean writeJSON(String topologyID) throws IOException {
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
