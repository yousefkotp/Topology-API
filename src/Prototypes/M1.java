import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"default", "min", "max"})
public class M1 {
    @JsonProperty("default")
    private double def;
    @JsonProperty("min")
    private double min;
    @JsonProperty("max")
    private double max;

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
        M1 m1 = (M1) o;
        return Double.compare(m1.max, max) == 0;
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
