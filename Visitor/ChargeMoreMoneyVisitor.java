package VisitorPack;
public class ChargeMoreMoneyVisitor implements  Visitor{

    //Same as Charge Money Visitor (both implements Visitor) , accept those are important games, so we can charge more per ticket.
    //let's say the price is 200% higher at each situation.

    private int ticketPrice;
    private int numOfFans;

    @Override
    public int visit(PremiumTeam premiumTeam) {
        ticketPrice=(premiumTeam.getTicketPrice() *2);
        numOfFans=premiumTeam.getNumOfFans();
        System.out.println("A Match against the Premium team " + premiumTeam.getTeamName() + "! Expected income: ");
        return ticketPrice*numOfFans;
    }

    @Override
    public int visit(MediumTeam mediumTeam) {
        ticketPrice=(mediumTeam.getTicketPrice() *2);
        numOfFans=mediumTeam.getNumOfFans();
        System.out.println("A Match against the Medium team " + mediumTeam.getTeamName() + "! Expected income: ");
        return ticketPrice*numOfFans;
    }

    @Override
    public int visit(SmallTeam smallTeam) {
        ticketPrice=(smallTeam.getTicketPrice() *2);
        numOfFans=smallTeam.getNumOfFans();
        System.out.println("A Match against the Small team " + smallTeam.getTeamName() + "! Expected income: ");
        return ticketPrice*numOfFans;
    }
}
