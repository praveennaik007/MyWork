package enumpack;

public enum Weekdays {
	sunday(1), monday, tuesday(3), wednesday(4), thursday(5), friday(6), saturday(7);
	
	
	private int days;
	 Weekdays(int days ) {
       this.days=days;
	}
	 
	 
	 
	 Weekdays( ) {
		}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	 
	 
	 
}
