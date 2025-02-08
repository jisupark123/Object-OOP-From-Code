package step01;

import java.time.Duration;
import java.util.List;

public class Movie {
    private String title; // 제목
    private Duration runningTime; // 러닝 타임
    private Money fee; // 기본 요금
    private List<DiscountCondition> discountConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;

    public Money calculateMovieFee(Screening screening){
        if(isDiscountable(screening)){
            return  fee.minus(calculateDiscountAmount());
        }

        return fee;
    }

    private boolean isDiscountable(Screening screening){
        return discountConditions.stream()
                .anyMatch(condition -> condition.isSatisfiedBy(screening));
    }

    private Money calculateDiscountAmount(){
        switch (movieType){
            case AMOUNT_DISCOUNT:
                return calculateAmountDiscountAmount();
            case PERCENT_DISCOUNT:
                return calculatePercentDiscountAmount();
            case NONE_DISCOUNT:
                return calculateNoneDiscountAmount();
        }

        throw new IllegalStateException();
    }

    private Money calculateAmountDiscountAmount(){
        return discountAmount;
    }

    private Money calculatePercentDiscountAmount(){
        return fee.times(discountPercent);
    }

    private Money calculateNoneDiscountAmount(){
        return  Money.ZERO;
    }
}
