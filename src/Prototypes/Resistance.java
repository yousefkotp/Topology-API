import java.util.Objects;

public class Resistance {
    private double def;
    private double min;
    private double max;

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
        Resistance that = (Resistance) o;
        return Double.compare(that.def, def) == 0 && Double.compare(that.min, min) == 0 && Double.compare(that.max, max) == 0;
    }

    @Override
    public String toString() {
        return "Resistance{" +
                "def=" + def +
                ", min=" + min +
                ", max=" + max +
                '}';
    }
}
