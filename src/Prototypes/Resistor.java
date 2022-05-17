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
        if (o == null || getClass() != o.getClass()) return false;
        Resistor resistor = (Resistor) o;
        return Objects.equals(resistance, resistor.resistance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resistance);
    }

    @Override
    public String toString() {
        return "Resistor{" +
                "resistance=" + resistance +
                '}';
    }
}
