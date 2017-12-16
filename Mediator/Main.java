package MediatorPack;

public class Main {
    /*
    This program illustarte an auction. The AuctionMediator is responsible for adding the buyers,
    and afer each buyer bid a certain amount for the item, the mediator know who won the auction.
    */
    
    public static void main(String []args){

        AuctionMediator med = new AuctionMediator();
        Buyer b1= new AuctionBuyer(med,"Tal Baum");
        Buyer b2 = new AuctionBuyer(med,"Elad Shamailov");
        Buyer b3 = new AuctionBuyer(med,"John Smith");

        med.addBuyer(b1);
        med.addBuyer(b2);
        med.addBuyer(b3);

        System.out.println("Welcome to the auction. Tonight we are selling a vacation to Vegas. please Bid your offers.");
        System.out.println("-----------------------------------------------");
        System.out.println("Waiting for the buyer's offers...");
        b1.bid(1800);
        b2.bid(2000);
        b3.bid(780);
        System.out.println("-----------------------------------------------");
        med.findHighestBidder();

        b2.cancelTheBid();
        System.out.print(b2.name + " Has canceled his bid! , In that case ");
        med.findHighestBidder();
    }
}
