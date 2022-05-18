import java.util.ArrayList;
public class Topology {
    private String id;
    private ArrayList<Component> components;

    // Constructor
    public Topology(String id, ArrayList<Component> components) {
        this.id = id;
        this.components = components;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Component> getComponents() {
        return components;
    }

    public void setComponents(ArrayList<Component> components) {
        this.components = components;
    }

    //Overridden equals method
    @Override
    public boolean equals(Object o) {
        Topology topology = (Topology) o;
        return components != null ? components.equals(topology.components) : topology.components == null;
    }

    // Overridden toString method


    @Override
    public String toString() {
        return "Topology{" +
                "id='" + id + '\'' +
                ", components=" + components +
                '}';
    }
}
