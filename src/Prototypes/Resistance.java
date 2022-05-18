public class Resistance {
    private double def;
    private double min;
    private double max;

    public Resistance(double def, double min, double max) {
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
        Resistance that = (Resistance) o;
        return Double.compare(that.max, max) == 0;
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
