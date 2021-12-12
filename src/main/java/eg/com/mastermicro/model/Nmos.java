package eg.com.mastermicro.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nmos extends Component {
    @JsonProperty("m(l)")
    private MofL mofL;

    public MofL getMofL() {
        return mofL;
    }

    public void setMofL(MofL mofL) {
        this.mofL = mofL;
    }
}
