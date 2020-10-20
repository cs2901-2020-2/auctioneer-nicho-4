import org.testng.annotations.Test;
import org.testng.annotations.Test;
import cs.lab.Auctioneer;
import cs.lab.Bidder;
import cs.lab.Observer;

@Test
public class MultithreadAuctionTest {

    @Test(invocationCount = 100, threadPoolSize = 100)
    public void testMultithread(){
        Auctioneer auctioneer = new Auctioneer();
        auctioneer.update(100);
        Bidder bidder = new Bidder(50);        
        auctioneer.registerObserver(bidder);
        auctioneer.broadcastBids();
    }

}
