import java.util.Map;
import java.util.Objects;

public class Component {
    private String type;
    private int id;
    private Map<String,String> netlist;

    public Component(String type, int id, Map<String, String> netlist) {
        this.type = type;
        this.id = id;
        this.netlist = netlist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<String, String> getNetlist() {
        return netlist;
    }

    public void setNetlist(Map<String, String> netlist) {
        this.netlist = netlist;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Component component = (Component) o;
        return id == component.id && Objects.equals(type, component.type) && Objects.equals(netlist, component.netlist);
    }

    @Override
    public String toString() {
        return "Component{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", netlist=" + netlist +
                '}';
    }
}
