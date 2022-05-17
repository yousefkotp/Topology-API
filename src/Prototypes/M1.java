public class M1 {
    private double def;
    private double min;
    private double max;

    public M1(double def, double min,double max) {
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
        if (Double.compare(m1.def, def) != 0) return false;
        if (Double.compare(m1.min, min) != 0) return false;
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
