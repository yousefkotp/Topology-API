import java.util.Map;
import java.util.Objects;
public class Resistor extends Component{
    private Resistance resistance;

    public Resistor(String type, String id, Map<String, String> netlist, Resistance resistance) {
        super(type, id, netlist);
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
        return "Resistor{" +
                "resistance=" + resistance +
                '}';
    }
}
