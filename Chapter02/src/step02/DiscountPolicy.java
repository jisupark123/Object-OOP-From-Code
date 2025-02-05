package step02;

public interface DiscountPolicy {
    public Money calculateDiscountAmount(Screening screening);
}
