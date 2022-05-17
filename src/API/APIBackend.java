import java.io.IOException;
import java.util.ArrayList;

public class APIBackend implements API{
    private static APIBackend api=null;
    private ArrayList<Topology>topologies;

    //Empty constructor for singleton design pattern
    private APIBackend() {
        topologies = new ArrayList<>();
    }
    public static APIBackend createTopologyAPI(){
        if(api==null)
            api= new APIBackend();
        return api;
    }


    @Override
    public Topology readJSON(String fileName) throws IOException {
        return null;
    }

    @Override
    public boolean writeJSON(String topologyID) throws IOException {
        return false;
    }

    @Override
    public ArrayList<Topology> queryTopologies() {
        return topologies;
    }

    @Override
    public boolean deleteTopology(String topologyID) {
        for(Topology t : topologies){
            if(t.getId().equals(topologyID)){
                topologies.remove(t);
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Component> queryDevices(String topologyID) {
        for(Topology t :topologies){
            if(t.getId().equals(topologyID)){
                return t.getComponents();
            }
        }
        return null;
    }

    @Override
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
