package step01;

import java.math.BigDecimal;

// 금액과 관련된 다양한 계산을 구현
public class Money {
    public static final Money ZERO = Money.wons(0);
    private final BigDecimal amount;

    Money(BigDecimal amount) {
        this.amount = amount;
    }

    public static Money wons(long amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    public static Money wons(double amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    // N만큼 더하기
    public Money plus(Money amount) {
        return new Money(this.amount.add(amount.amount));
    }

    // N만큼 빼기
    public Money minus(Money amount) {
        return new Money(this.amount.subtract(amount.amount));
    }

    // N배로 곱하기
    public Money times(double percent) {
        return new Money(this.amount.multiply(BigDecimal.valueOf(percent)));
    }

    // other보다 작은지
    public boolean isLessThan(Money other) {
        return amount.compareTo(other.amount) < 0;
    }

    // other보다 크거나 같은지
    public boolean isGreaterThanOrEqual(Money other) {
        return amount.compareTo(other.amount) >= 0;
    }

}