import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        TopologyAPI api = TopologyAPI.createTopologyAPI();
        Topology t1 = api.readJSON("topology.json");

                            //Testing statements
        //ArrayList<Topology> topologies = api.queryTopologies();
        //ArrayList<Component> components = api.queryDevices("top1");
        //component = api.queryDevicesWithNetlistNode("top1","res1");
        //api.deleteTopology("top1");

        api.writeJSON("top1");
        Topology t2 = api.readJSON("top1.json");
        // Comparing the two objects using overridden equals method
        System.out.println(t1.equals(t2));
    }
}
