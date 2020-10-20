package cs.lab;

import java.util.ArrayList;

public class Auctioneer implements Subject {
    int price;
    ArrayList<Observer> observerList;

    public Auctioneer() {
        observerList = new ArrayList<>();
    }

    //Se actualiza el precio de la subasta para el subastador
    public void update(int priceAuctioneer) {price = priceAuctioneer;}
    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    //Se actualiza el precio de la subasta para el postor
    @Override
    public void broadcastBids() {
        for (Observer observ : observerList) {
            observ.update(price);
        }
    }
    public int getPrice(){
        return this.price;
    }
    public int getSizeList(){
        return this.observerList.size();
    }
}
