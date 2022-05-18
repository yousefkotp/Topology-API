import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Map;
@JsonPropertyOrder({"type", "id", "m(1)", "netlist"})
public class Nmos extends Component{
    private M1 m1;

    public Nmos(@JsonProperty("type") String type, @JsonProperty("id") String id,@JsonProperty("m(1)") M1 m1,@JsonProperty("netlist") Map<String, String> netlist) {
        super(type,id,netlist);
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
