package atk.app.model;

import java.math.BigDecimal;

public class Observation extends NamedValue {

    public Observation(SlotData time, String name, BigDecimal value) {
        super(time, name, value);
    }
}
