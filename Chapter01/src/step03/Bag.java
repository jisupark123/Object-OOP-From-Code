package step03;

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

    public Long hold(Ticket ticket){
        if (hasInvitation()){
            setTicket(ticket);
            return 0L;
        } else{
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    private boolean hasInvitation() {
        return invitation != null;
    }


    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }


    private void minusAmount(Long amount) {
        this.amount -= amount;
    }
}
