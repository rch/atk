package atk.app.model;

import java.math.BigDecimal;

public class NamedValue extends SlotData {
    public final String name;
    public final BigDecimal value;

    public NamedValue(int id, String name, BigDecimal value) {
        super(id);
        this.name = name;
        this.value = value;
    }

    public NamedValue(SlotData time, String name, BigDecimal value) {
        super(time);
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
