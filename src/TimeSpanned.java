//Hannah Wenger

public class TimeSpanned {
	private int minutes;
	private int hours;
	//private TimeSpanned TimeSpanned;
	
	/**
	 * @param minutes time in minutes (1-60)
	 * @param hours time in hours (each hour == 60 minutes)
	 */
	
	//Constructor
	public TimeSpanned(int hours, int minutes) {
		this.minutes = minutes;
		this.hours = hours;
	}
	
	//Getters
	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}
	
	public void add(int hours, int minutes) {
		
		this.hours = this.hours + hours;
		this.minutes = this.minutes + minutes;

	}
	
	public void add(TimeSpanned t) {
		
		this.add(t.hours, t.minutes);

	}
	
	public double getTotalHours() {
		
		int newHours = this.hours;
		int newMinutes = this.minutes;
		int minutesToHours = 0;
			if(newMinutes > 59) {
				minutesToHours = newMinutes / 60;
			}

		double totalHours = minutesToHours + newHours;
		minutes = ((newHours * 60) + newMinutes) -((int)totalHours * 60) ;
		this.hours = (int)totalHours;

		return totalHours;
	}
	
	public String toString() {
		String timeString = ( (int)getTotalHours() + "h" + minutes + "m");
		return timeString;
	}

}
