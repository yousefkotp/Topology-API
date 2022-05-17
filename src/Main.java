import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        API api = API.createTopologyAPI();
        api.readJSON("topology.json");
    }
}
