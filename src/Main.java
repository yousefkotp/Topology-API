import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        API api = API.createTopologyAPI();
        api.readJSON("topology.json");    //The api stores the array of topologies within it
        //ArrayList<Topology> topologies = api.queryTopologies();
        //ArrayList<Component> components = api.queryDevices("top1");
        //components = api.queryDevicesWithNetlistNode("t1","res1");
        //api.deleteTopology("top1");
        //api.writeJSON("result.json");

    }
}
