import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        TopologyAPI api = TopologyAPI.createTopologyAPI();

        Topology topology = api.readJSON("topology.json");
        Component r =  topology.getComponents().get(0);
                            //Another Testing statements
        //Topology t1 = api.readJSON("topology.json");
        //ArrayList<Topology> topologies = api.queryTopologies();
        //ArrayList<Component> components = api.queryDevices("top1");
        //ArrayList<Component> components = api.queryDevicesWithNetlistNode("top1","res1");
        //api.deleteTopology("top1");
        //api.writeJSON("top1");
        //Topology t2 = api.readJSON("top1.json");
        //System.out.println(t1.equals(t2));
    }
}
