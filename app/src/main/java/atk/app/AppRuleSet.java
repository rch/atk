package atk.app;

import org.evrete.dsl.annotation.Fact;
import org.evrete.dsl.annotation.Rule;
import org.evrete.dsl.annotation.RuleSet;
import org.evrete.dsl.annotation.Where;

import java.math.BigInteger;


@RuleSet(value = "App RuleSet", defaultSort = RuleSet.Sort.BY_NAME)
public class AppRuleSet {

    @Rule
    @Where("$vCoreSeconds < 5")
    public void rule1(@Fact("$vCoreSeconds") BigInteger vCoreSeconds) {
        System.out.printf("vCoreSeconds: %d", vCoreSeconds);
    }
}
