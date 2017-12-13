package VisitorPack;
public class Main {

    /*
    At this example, we will use the Visitor design pattern by implementing a soccer team money advisor.
    We would like to know how much money we will get by selling tickets to the game against different teams ,
    with different level of seniority.
    The stronger the team -> the more fans it has -> the higher the price that they are willing to pay for a ticket.
    In this code we will have 3 seniority levels: Premium , Medium , and Small teams.
    And 2 kinds of chargers. The first will be the income for regular games, and the other one will be for
    important (and therefore more expensive tickets will be sold).
    We will use the same methods for the different teams and take advantage of the Visitor design pattern.
     */


    public static void main(String[] args) {

        ChargeMoneyVisitor RegularGamesCharger = new ChargeMoneyVisitor();
        ChargeMoreMoneyVisitor ImportantGamesCharger = new ChargeMoreMoneyVisitor();

        PremiumTeam maccabiHaifa = new PremiumTeam(80,40000,"Maccabi Haifa");
        MediumTeam hapoelPetachTikva = new MediumTeam(53,5480,"Hapoel Petach Tikva");
        SmallTeam hapoelMarmorek = new SmallTeam(37,421,"Hapoel Marmorek");

        System.out.println("Regular game prices:");
        System.out.println(maccabiHaifa.accept(RegularGamesCharger));
        System.out.println(hapoelPetachTikva.accept(RegularGamesCharger));
        System.out.println(hapoelMarmorek.accept(RegularGamesCharger));
        System.out.println("----------------------------------------------");

        System.out.println("Important game prices:");
        System.out.println(maccabiHaifa.accept(ImportantGamesCharger));
        System.out.println(hapoelPetachTikva.accept(ImportantGamesCharger));
        System.out.println(hapoelMarmorek.accept(ImportantGamesCharger));
    }

}
