package observerPattern;

import java.util.ArrayList;

public class Channel implements Subject {
		String status;
		String channelName;
		
		ArrayList<Observer> ObserverArrayList = new ArrayList<Observer>();

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public void notifyObservers() {
			for (Observer obs : observers) {
				obs.update(this.status);
			}
		}

		public void registerObserver(Observer observer) {
			observers.add(observer);
		}

		public void removeObserver(Observer observer) {
			observers.remove(observer);
		}
	}


