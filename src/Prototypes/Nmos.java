import java.util.Map;
import java.util.Objects;
public class Nmos extends Component{
    private M1 m1;

    public Nmos(String type,String id,Map<String, String> netlist, M1 m1) {
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
        if (o == null || getClass() != o.getClass()) return false;
        Nmos nmos = (Nmos) o;
        return Objects.equals(m1, nmos.m1);
    }

    @Override
    public String toString() {
        return "Nmos{" +
                "m1=" + m1 +
                '}';
    }
}
