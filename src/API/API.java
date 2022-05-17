import java.io.IOException;
import java.util.ArrayList;

public interface API {
    Topology readJSON(String fileName) throws IOException;

    boolean writeJSON(String topologyID) throws IOException;

    ArrayList<Topology> queryTopologies();

    boolean deleteTopology(int topologyID);

    ArrayList<Component> queryDevices(int topologyID);

    ArrayList<Component> queryDevicesWithNetlistNode(String topologyID, int NetlistNodeID);
}
