import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Map;
@JsonPropertyOrder({"type", "id", "resistance", "netlist"})
public class Resistor extends Component{
    @JsonProperty("resistance")
    private Resistance resistance;


    public Resistor(@JsonProperty("type") String type,@JsonProperty("id")  String id, @JsonProperty("resistance") Resistance resistance, @JsonProperty("netlist") Map<String, String> netlist) {
        super(type,id,netlist);
        this.resistance = resistance;
    }

    public Resistance getResistance() {
        return resistance;
    }

    public void setResistance(Resistance resistance) {
        this.resistance = resistance;
    }


    @Override
    public boolean equals(Object o) {
        Resistor resistor = (Resistor) o;
        return resistance != null ? resistance.equals(resistor.resistance) : resistor.resistance == null;
    }

    @Override
    public String toString() {
        return "Component{" +
                "type='" + this.getType() + '\'' +
                ", id='" + this.getId() + '\'' +
                this.getResistance()+
                ", netlist=" + this.getNetlist() +
                '}';
    }
}
