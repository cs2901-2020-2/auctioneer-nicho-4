package cs.lab;

public class Bidder implements Observer {

    public boolean last_bid = false; //Indica si fue el ultimo en pujar
    public int price_auctioneer; //El precio de la subasta
    public int money; //Su dinero

    public Bidder(int _money){
        money = _money;
    }

    //Se actualiza el precio de la subasta para el postor
    @Override
    public void update(Object data) {
        price_auctioneer = (int) data;
    }

    //El postor da una nueva oferta
    public void bid(Auctioneer auctioneer){
        if(money > price_auctioneer && !last_bid){
            last_bid = true;
            auctioneer.update(money);
        } else{
            last_bid = false;
        }
    }
}
