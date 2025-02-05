package step02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 할인 정책
public abstract class DefaultDiscountPolicy implements DiscountPolicy {
    private List<DiscountCondition> conditions = new ArrayList<>();

    // 여러개의 조건을 가짐
    public DefaultDiscountPolicy(DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    // 할인 금액 계산
    @Override
    public Money calculateDiscountAmount(Screening screening) {

        // 하나라도 조건에 부합하면 할인
        for (DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}
