import java.io.IOException;
import java.util.ArrayList;

public class APIBackend implements API{
    private static APIBackend api=null;
    private ArrayList<Topology>topologies;
    //Empty constructor for singleton design pattern
    private APIBackend() {
        topologies = new ArrayList<Topology>();
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
        return null;
    }

    @Override
    public boolean deleteTopology(int topologyID) {
        return false;
    }

    @Override
    public ArrayList<Component> queryDevices(int topologyID) {
        return null;
    }

    @Override
    public ArrayList<Component> queryDevicesWithNetlistNode(String topologyID, int NetlistNodeID) {
        return null;
    }
}
