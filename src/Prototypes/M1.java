import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Objects;

public class M1 {
    @JsonProperty("default")
    private double def;
    @JsonProperty("min")
    private double min;
    @JsonProperty("max")
    private double max;

    @JsonCreator
    public M1(@JsonProperty("default") double def, @JsonProperty("min") double min,@JsonProperty("max") double max) {
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
        M1 m1 = (M1) o;
        return Double.compare(m1.def, def) == 0 && Double.compare(m1.min, min) == 0 && Double.compare(m1.max, max) == 0;
    }

    @Override
    public String toString() {
        return "M1{" +
                "def=" + def +
                ", min=" + min +
                ", max=" + max +
                '}';
    }
}
