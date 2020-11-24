package observerPattern;

import java.util.ArrayList;

public interface Subject {
	ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public static void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	public static void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public static void notifyObservers() {
		for (Observer o : observers) {
			o.update("This is an update.");
		}
	}
}
