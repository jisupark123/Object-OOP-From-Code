package step01;

// 가방
public class Bag {
    private long amount; // 현금
    private Invitation invitation; // 초대장 (이벤트에 당첨된 사람)
    private Ticket ticket; // 티켓

    // 이벤트에 당첨되지 않은 사람
    public Bag(long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }
}
