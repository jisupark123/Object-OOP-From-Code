package step02;

// 관람객
public class Audience {
    private Bag bag; // 가방

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket){
        if (bag.hasInvitation()) {
            bag.setTicket(ticket);
            return 0L;
        } else {
           bag.setTicket(ticket);
           bag.minusAmount(ticket.getFee());
           return ticket.getFee();
        }
    }
}
