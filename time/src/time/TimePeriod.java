package time;


public class TimePeriod {
	private int hours;
	private int minutes;
	private int days;

	TimePeriod(int days,int hours, int minutes) {
		this.hours = 0;
		this.minutes = 0;
		this.days = 0;

	}

	public void addHours(int hours) {
		this.hours += hours;
	}

	public void addMinutes(int minutes) {
		this.minutes += minutes;
	}
	public void addDays(int days) {
		this.days += days;
	}

	public int getHours() {
		return hours;
	}
	

	public int getMinutes() {
		return minutes;
	}
	public int getDays() {
		return days;
	}

	public String toString() {
		return this.days +" Days "+this.hours + " Hours & " + this.minutes + " Minutes";
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public void setDays(int days) {
		this.days = days;
	}

}
