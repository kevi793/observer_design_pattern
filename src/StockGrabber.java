import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double applePrice;
	private double googlePrice;
	
	public StockGrabber(){
		observers = new ArrayList<Observer>();
	}
	
	public void unregister(Observer deleteObserver) {
		int observerIndex = observers.indexOf(deleteObserver);
		System.out.println("Observer " + (observerIndex + 1) + " deleted");
		observers.remove(observerIndex);
	}

	public void notifyObservers() {
		for(Observer observer : observers){
			observer.update(ibmPrice, applePrice, googlePrice);
		}
	}

	public void register(Observer newObserver) {
		observers.add(newObserver);
	}
	
	public void setIbmPrice(double ibmPrice){
		this.ibmPrice = ibmPrice;
		notifyObservers();
	}
	
	public void setApplePrice(double applePrice){
		this.applePrice = applePrice;
		notifyObservers();
	}
	
	public void setGooglePrice(double googlePrice){
		this.googlePrice = googlePrice;
		notifyObservers();
	}
	
}
