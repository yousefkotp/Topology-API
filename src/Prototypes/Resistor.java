import java.util.Map;
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

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
