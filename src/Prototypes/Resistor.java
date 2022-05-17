import java.util.Map;
import java.util.Objects;
public class Resistor extends Component{
    private Resistor resistor;

    public Resistor(String type, String id, Map<String, String> netlist, Resistor resistor) {
        super(type, id, netlist);
        this.resistor = resistor;
    }

    public Resistor getResistor() {
        return resistor;
    }

    public void setResistor(Resistor resistor) {
        this.resistor = resistor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Resistor resistor1 = (Resistor) o;
        return Objects.equals(resistor, resistor1.resistor);
    }

    @Override
    public String toString() {
        return "Resistor{" +
                "resistor=" + resistor +
                '}';
    }
}
