package eg.com.mastermicro.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Resistance {
    @JsonProperty("default")
    private int defaultResistance;
    private int min;
    private int max;

    public int getDefaultResistance() {
        return defaultResistance;
    }

    public void setDefaultResistance(int defaultResistance) {
        this.defaultResistance = defaultResistance;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
