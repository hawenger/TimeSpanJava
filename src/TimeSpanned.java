
public class TimeSpanned {
	private int minutes;
	private int hours;
	//private TimeSpanned TimeSpanned;
	
	/**
	 * @param minutes time in minutes (1-60)
	 * @param hours time in hours (each hour == 60 minutes)
	 */
	public TimeSpanned(int minutes, int hours) {
		this.minutes = minutes;
		this.hours = hours;
	}

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}
	
	public void add(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}
	
	//public void add(TimeSpanned t) {
	//	this.getTotalHours(hours, minutes) += getTotalHours(t);
	//}
	public double getTotalHours(int hours, int minutes) {
		double totalHours = ((hours * 60) + minutes) / 60;
		return totalHours;
	}
	
	//public String toString() {
		
	//	return TimeString;
	//}

}
