import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException {
        TopologyAPI api = TopologyAPI.createTopologyAPI();
        Topology t1 = api.readJSON("topology.json");
        api.writeJSON("top1");
        Topology t2 = api.readJSON("top1.json");
        // Comparing the two objects, note that we have already overridden the "equals" method
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1.equals(t2));
    }
}
