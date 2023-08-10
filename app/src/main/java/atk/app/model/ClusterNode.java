package atk.app.model;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ClusterNode extends SlotData {
    public int id;
    public String rack;
    public String state;
    public BigDecimal usedMemoryMB;
    public BigDecimal availMemoryMB;
    public Integer usedVirtualCores;
    public Integer availableVirtualCores;

    public ClusterNode(int id,
                       String rack,
                       String state,
                       BigDecimal usedMemoryMB,
                       BigDecimal availMemoryMB,
                       Integer usedVirtualCores,
                       Integer availableVirtualCores) {
        super(id);
        this.rack = rack;
        this.state = state;
        this.usedMemoryMB = usedMemoryMB;
        this.availMemoryMB = availMemoryMB;
        this.usedVirtualCores = usedVirtualCores;
        this.availableVirtualCores = availableVirtualCores;
    }
}
