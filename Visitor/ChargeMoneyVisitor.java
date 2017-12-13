package VisitorPack;
public class ChargeMoneyVisitor implements  Visitor{

        /* This is the team that hosts the game, and want to know the expected income.
        they will calculate how much money according to the seniority level of the team that they will face.
        This will be done when each received team will go to the relevant "visit" function
        and perform the calculations.
         */


    private int ticketPrice;
    private int numOfFans;

    @Override
    public int visit(PremiumTeam premiumTeam) {
            ticketPrice=premiumTeam.getTicketPrice();
            numOfFans=premiumTeam.getNumOfFans();
            System.out.println("A Match against the Premium team " + premiumTeam.getTeamName() + "! Expected income: ");
            return ticketPrice*numOfFans;
    }

    @Override
    public int visit(MediumTeam mediumTeam) {
        ticketPrice=mediumTeam.getTicketPrice();
        numOfFans=mediumTeam.getNumOfFans();
        System.out.println("A Match against the Medium team " + mediumTeam.getTeamName() + "! Expected income: ");
        return ticketPrice*numOfFans;
    }

    @Override
    public int visit(SmallTeam smallTeam) {
        ticketPrice=smallTeam.getTicketPrice();
        numOfFans=smallTeam.getNumOfFans();
        System.out.println("A Match against the Small team " + smallTeam.getTeamName() + "! Expected income: ");
        return ticketPrice*numOfFans;
    }
}
