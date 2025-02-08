package step01;

import java.time.LocalDateTime;

public class Screening {

    // 2. '예매하라' 책임을 수행할 인스턴스 변수(데이터)를 결정
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    // 1. Screening은 '예매하라' 메시지에 응답할 수 있어야 함
    public Reservation reserve(Customer customer, int audienceCount){
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    private Money calculateFee(int audienceCount){
        return movie.calculateMovieFee(this).times(audienceCount);
    }

    public LocalDateTime getWhenScreened() {
        return whenScreened;
    }

    public int getSequence() {
        return sequence;
    }
}
