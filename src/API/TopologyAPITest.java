import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TopologyAPITest {
    private static TopologyAPI api;
    private static String testFile;
    private static Topology expectedTopology;
    private static Topology resultedTopology;
    @BeforeAll
    static void setUp() throws IOException {
        api = TopologyAPI.createTopologyAPI();
        testFile = "topology.json";
        Map<String, String> netlistRes = new TreeMap<>();
        netlistRes.put("t1", "vdd");
        netlistRes.put("t2", "n1");
        Map<String, String> netlistNmos = new TreeMap<>();
        netlistNmos.put("drain", "n1");
        netlistNmos.put("gate", "vin");
        netlistNmos.put("source", "vss");
        Resistor res = new Resistor("resistor","res1", new Resistance(100, 10, 1000),netlistRes);
        Nmos nmos = new Nmos("nmos","m1" , new M1(1.5, 1, 2),netlistNmos);
        ArrayList<Component> components = new ArrayList<Component>();
        components.add(res);
        components.add(nmos);
        expectedTopology = new Topology("top1",components);
        TopologyAPITest.resultedTopology = api.readJSON(testFile);
    }

    @AfterEach
    void tearDown() throws IOException {
        TopologyAPI.deleteTopologyAPI();
        TopologyAPITest.api = TopologyAPI.createTopologyAPI();
        TopologyAPITest.api.readJSON(TopologyAPITest.testFile);
    }
    @Test
    void readJSON() {
        Assertions.assertEquals(resultedTopology, expectedTopology);
    }
    @Test
    void writeJSON() throws IOException {
        Assertions.assertTrue(api.writeJSON("top1"));
    }
    @Test
    void queryTopologies() {
        Assertions.assertEquals(api.queryTopologies().get(0), expectedTopology);
    }

    @Test
    void deleteTopology() {
        Assertions.assertTrue(api.deleteTopology(expectedTopology.getId()));
    }

    @Test
    void queryDevices() {
        Assertions.assertEquals(api.queryDevices(TopologyAPITest.resultedTopology.getId()), expectedTopology.getComponents());
    }

    @Test
    void queryDevicesWithNetlistNode() {
        Assertions.assertEquals(api.queryDevicesWithNetlistNode(expectedTopology.getId(), "n1"), expectedTopology.getComponents());
    }
}
