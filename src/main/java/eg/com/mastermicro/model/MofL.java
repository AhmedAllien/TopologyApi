package eg.com.mastermicro.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MofL {
    @JsonProperty("default")
    private float defaultNmos;
    private float min;
    private float max;

    public float getDefaultNmos() {
        return defaultNmos;
    }

    public void setDefaultNmos(float defaultNmos) {
        this.defaultNmos = defaultNmos;
    }

    public float getMin() {
        return min;
    }

    public void setMin(float min) {
        this.min = min;
    }

    public float getMax() {
        return max;
    }

    public void setMax(float max) {
        this.max = max;
    }
}
