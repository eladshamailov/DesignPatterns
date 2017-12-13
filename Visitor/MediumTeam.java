package VisitorPack;

public class MediumTeam implements Visitibale {

    private int ticketPrice;
    private String teamName;
    private int numOfFans;


    public MediumTeam(int ticketPrice, int numOfFans, String teamName){
        this.ticketPrice=ticketPrice;
        this.teamName=teamName;
        this.numOfFans=numOfFans;
    }
    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
    public int getTicketPrice() {
        return ticketPrice;
    }

    public int getNumOfFans() {
        return numOfFans;
    }

    public String getTeamName() {
        return teamName;
    }
}
