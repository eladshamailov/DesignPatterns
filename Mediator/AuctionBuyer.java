package MediatorPack;

public class AuctionBuyer extends Buyer {

   public AuctionBuyer(Mediator mediator, String name){
       super(mediator,name);
   }

    @Override
    public void bid(int price) {
       this.price=price;
    }

    @Override
    public void cancelTheBid() {
       this.price=-1;
    }
}
