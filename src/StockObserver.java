
public class StockObserver implements Observer {

	private double ibmPrice;
	private double applePrice;
	private double googlePrice;

	private int observerID;
	
	private static int observerIDTracker = 0;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber){
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker; 
		System.out.println("New Observer with id :- " + this.observerID + " created");
		
		stockGrabber.register(this);
	}
	
	
	@Override
	public void update(double ibmPrice, double applePrice, double googlePrice) {
		// TODO Auto-generated method stub
		this.ibmPrice = ibmPrice;
		this.applePrice = applePrice;
		this.googlePrice = googlePrice;
		printThePrices();
	}


	private void printThePrices() {
		System.out.println("Observer id is :- " + observerID+ "\nIBM Price is :- " + ibmPrice + ", Google Price is :- "+googlePrice+", Apple Price is :- "+ applePrice);		
	}
	
}
