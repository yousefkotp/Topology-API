import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class Resistor extends Component{
    private double def;
    private double min;
    private double max;

    public Resistor(String type, int id, Map<String, String> netlist, double def, double min, double max) {
        super(type, id, netlist);
        this.def = def;
        this.min = min;
        this.max = max;
    }

    public double getDef() {
        return def;
    }

    public void setDef(double def) {
        this.def = def;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Resistor resistor = (Resistor) o;
        return Double.compare(resistor.def, def) == 0 && Double.compare(resistor.min, min) == 0 && Double.compare(resistor.max, max) == 0;
    }

    @Override
    public String toString() {
        return "Resistor{" +
                "def=" + def +
                ", min=" + min +
                ", max=" + max +
                '}';
    }
}
