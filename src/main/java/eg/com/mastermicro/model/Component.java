package eg.com.mastermicro.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.Map;
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Resistor.class, name = "resistor"),
        @JsonSubTypes.Type(value = Nmos.class, name = "nmos"),
})

public abstract class Component {

    private String id;
    private Map<String, String> netlist;
    private Type type;


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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Component{" +
                "id='" + id + '\'' +
                ", netlist=" + netlist +
                ", type=" + type +
                '}';
    }
}
