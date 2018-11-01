package time;


public class TimePeriod {
	private int hours;
	private int minutes;

	TimePeriod(int hours, int minutes) {
		this.hours = 0;
		this.minutes = 0;

	}

	public void addHours(int hours) {
		this.hours += hours;
	}

	public void addMinutes(int minutes) {
		this.minutes += minutes;
	}

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public String toString() {
		return this.hours + " Hours & " + this.minutes + " Minutes";
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

}
