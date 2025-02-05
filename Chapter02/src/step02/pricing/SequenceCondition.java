package step02.pricing;

import step02.DiscountCondition;
import step02.Screening;

// 할인 조건 (순번)
public class SequenceCondition implements DiscountCondition {
    private int sequence; // 순번

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    // screening의 상영 순번과 일치할 경우 할인 조건 성립
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
