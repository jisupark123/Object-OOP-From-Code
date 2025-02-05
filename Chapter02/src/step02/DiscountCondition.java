package step02;

// 할인 조건
public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
