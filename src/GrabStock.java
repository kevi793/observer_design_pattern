
public class GrabStock {
	public static void main(String[] args){
		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setIbmPrice(10.12);
		stockGrabber.setApplePrice(19.32);
		stockGrabber.setGooglePrice(26.90);
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.setIbmPrice(12.12);
		stockGrabber.setApplePrice(15.32);
		
		stockGrabber.unregister(observer1);
		
		stockGrabber.setGooglePrice(30.23);
		
	}
}
