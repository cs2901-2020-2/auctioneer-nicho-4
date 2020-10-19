package cs.lab;

import java.util.ArrayList;

public class Auctioneer implements Subject {
    int price;
    ArrayList<Observer> observerList;

    public Auctioneer() {
        observerList = new ArrayList<>();
    }

    //Se actualiza el precio de la subasta para el subastador
    public void update(int price_auctioneer) {
        price = price_auctioneer;
    }

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
        for (Observer o : observerList) {
            o.update(price);
        }
    }
}
