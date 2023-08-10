package atk.app.rule;

import atk.app.model.Observation;
import atk.app.model.ClusterNode;
import com.typesafe.config.Config;
import org.evrete.api.RhsContext;
import org.evrete.dsl.annotation.Fact;
import org.evrete.dsl.annotation.Rule;
import org.evrete.dsl.annotation.RuleSet;
import org.evrete.dsl.annotation.Where;

import java.math.BigDecimal;

@RuleSet
public class BaseRuleset {
    //MessagingGateway messenger;

    @Rule("BASE-0: Initialization")
    public void init(RhsContext ctx, Config cfg) {
        //this.messenger = cfg.get("MESSAGING-GW");
    }

    @Rule("BASE-1: Compute initial")
    @Where("$evt.id == 0")
    public void rule1(RhsContext ctx, @Fact("$evt") ClusterNode event, BaseConfig baseConfig) {
        ctx.insert(event);
    }

    @Rule("BASE-2: Compute next")
    @Where({"$evt.id == $prev.id + 1", "$cfg.name == $prev.name"})
    public void rule2(RhsContext ctx, @Fact("$evt") ClusterNode event, @Fact("$prev") Observation prev, @Fact("$cfg") BaseConfig cfg) {
        BigDecimal k = new BigDecimal(2.0 /(cfg.smoothingRange + 1));
        BigDecimal tmp = new BigDecimal(1.0).subtract(event.availMemoryMB);
        BigDecimal nextValue = k.multiply(event.availMemoryMB).add(tmp.multiply(prev.value));
        Observation ind = new Observation(event, cfg.name, nextValue);
        ctx.insert(ind);
    }

    public static class BaseConfig {
        public final int smoothingRange;
        public final String name;

        public BaseConfig(String name, int smoothingRange) {
            this.smoothingRange = smoothingRange;
            this.name = name;
        }

        @Override
        public String toString() {
            return "BaseConfig{" +
                    "smooth=" + smoothingRange +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
