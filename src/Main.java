import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        API api = API.createTopologyAPI();
        api.readJSON("topology.json");

    }
}

//    ArrayList<Component> components = new ArrayList<>();
//    Map<String,String> map1 = new HashMap<>();
//        map1.put("t1","vdd");
//                map1.put("t2","n1");
//                Map<String,String> map2 = new HashMap<>();
//        map2.put("drain","n1");
//        map2.put("gate","vin");
//        map2.put("source","vss");
//        Resistor r = new Resistor("resistor","res1",map1,new Resistance(100d,10d,1000d));
//        Nmos nmos = new Nmos("nmos","m1",new M1(1.5d,1d,2d),map2);
//        components.add(r);
//        components.add(nmos);
//        topologies.add(new Topology("t1",components));