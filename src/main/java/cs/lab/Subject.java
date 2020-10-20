package cs.lab;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void broadcastBids();
    public int getPrice();
    public int getSizeList();

}
