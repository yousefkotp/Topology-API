import java.util.Map;

public abstract class Component {
    private String type;

    public Component() {

    }

    private String id;
    private Map<String,String> netlist;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        Component component = (Component) o;
        return netlist != null ? netlist.equals(component.netlist) : component.netlist == null;
    }

    @Override
    public String toString() {
        return "Component{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", netlist=" + netlist +
                '}';
    }
}
