import org.testng.Assert;
import org.testng.annotations.Test;
import cs.lab.Auctioneer;
import cs.lab.Bidder;
import cs.lab.Observer;

import java.beans.BeanInfo;

@Test
public class AuctionTest {

    @Test
    public void test1(){
        Auctioneer auctioneer = new Auctioneer();
        auctioneer.update(40);
        Bidder observera= new Bidder(90);
        Bidder observerb=new Bidder(120);
        auctioneer.registerObserver(observera);
        auctioneer.registerObserver(observerb);
        auctioneer.broadcastBids();
        observera.bid(auctioneer);
        auctioneer.broadcastBids();
        observerb.bid(auctioneer);
        auctioneer.broadcastBids();
        Assert.assertEquals(auctioneer.getPrice(), 120);
    }

    @Test
    public void test2(){
        Auctioneer auctioneer = new Auctioneer();
        auctioneer.update(40);
        Bidder observera= new Bidder(90);
        Bidder observerb=new Bidder(120);
        Bidder observerc= new Bidder(140);
        Bidder observerd= new Bidder(150);
        auctioneer.registerObserver(observera);
        auctioneer.registerObserver(observerb);
        auctioneer.registerObserver(observerc);
        auctioneer.registerObserver(observerd);
        auctioneer.removeObserver(observera);
        Assert.assertEquals(auctioneer.getSizeList(), 3);
    }

    @Test
    public void test3(){
        Auctioneer auctioneer = new Auctioneer();
        auctioneer.update(40);
        Bidder observera= new Bidder(90);
        Bidder observerb=new Bidder(120);
        Bidder observerc= new Bidder(140);
        auctioneer.registerObserver(observera);
        auctioneer.registerObserver(observerb);
        auctioneer.registerObserver(observerc);
        auctioneer.broadcastBids();
        observera.bid(auctioneer);
        auctioneer.broadcastBids();
        observera.bid(auctioneer);
        auctioneer.broadcastBids();
        Assert.assertEquals(observera.getlastBid(), false);
    }

    @Test
    public void test4(){
        Auctioneer auctioneer = new Auctioneer();
        auctioneer.update(40);
        Bidder observera= new Bidder(90);
        Bidder observerb=new Bidder(120);
        auctioneer.registerObserver(observera);
        auctioneer.registerObserver(observerb);
        auctioneer.broadcastBids();
        observera.bid(auctioneer);
        auctioneer.broadcastBids();
        Assert.assertEquals(observera.getlastBid(), true);
    }

}
