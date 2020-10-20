import org.testng.annotations.Test;
import cs.lab.Auctioneer;
import cs.lab.Bidder;
import cs.lab.Observer;

@Test
public class Auction {

    @Test
    public void test1(){
        Auctioneer auctioneer = new Auctioneer();
        Observer observer = new Observer();
        auctioneer.registerObserver(observer);
    }
}
