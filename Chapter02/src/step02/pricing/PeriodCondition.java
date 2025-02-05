package step02.pricing;

import step02.DiscountCondition;
import step02.Screening;

import java.time.DayOfWeek;
import java.time.LocalTime;

// 할인 조건 (기간)
public class PeriodCondition implements DiscountCondition {
    private DayOfWeek dayOfWeek; // 요일
    private LocalTime startTime; // 시작 시간
    private LocalTime endTime; // 종료 시간

    public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // 상영 시작 시간이 기간 안에 포함되면 할인 조건 성립
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
                !startTime.isAfter(screening.getStartTime().toLocalTime()) &&
                !endTime.isBefore(screening.getStartTime().toLocalTime());
    }
}
