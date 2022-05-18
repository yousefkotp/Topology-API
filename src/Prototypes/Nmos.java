import java.util.Map;
public class Nmos extends Component{
    private M1 m1;

    public Nmos(String type,String id,M1 m1,Map<String, String> netlist) {
        super(type, id, netlist);
        this.m1 = m1;
    }

    public M1 getM1() {
        return m1;
    }

    public void setM1(M1 m1) {
        this.m1 = m1;
    }

    @Override
    public boolean equals(Object o) {
        Nmos nmos = (Nmos) o;
        return m1 != null ? m1.equals(nmos.m1) : nmos.m1 == null;
    }


    @Override
    public String toString() {
        return "Component{" +
                "type='" + this.getType() + '\'' +
                ", id='" + this.getId() + '\'' +
                ", netlist=" + this.getNetlist() +
                '}';
    }
}
