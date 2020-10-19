package cs.lab;

public class Bidder implements Observer {

    private boolean lastBid = false; //Indica si fue el ultimo en pujar
    private int priceAuctioneer; //El precio de la subasta
    private int money; //Su dinero

    public Bidder(int moneyData){
        money = moneyData;
    }

    //Se actualiza el precio de la subasta para el postor
    @Override
    public void update(Object data) {
        priceAuctioneer = (int) data;
    }

    //El postor da una nueva oferta
    public void bid(Auctioneer auctioneer){
        if(money > priceAuctioneer && !lastBid){
            lastBid = true;
            auctioneer.update(money);
        } else{
            lastBid = false;
        }
    }
}
