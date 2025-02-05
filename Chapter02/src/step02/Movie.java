package step02;

import java.time.Duration;

// 영화
public class Movie {
    private String title; // 제목
    private Duration runningTime; // 러닝 타임
    private Money fee; // 기본 요금
    private DefaultDiscountPolicy discountPolicy; // 할인 정책 (하나의 영화에는 하나의 할인 정책)

    public Movie(String title, Duration runningTime, Money fee, DefaultDiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
