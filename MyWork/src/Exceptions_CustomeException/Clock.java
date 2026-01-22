package Exceptions_CustomeException;

public class Clock {
	private int hr;
	private int min;
	private int sec;

	public Clock(int hr, int min, int sec) {
		super();
		if (hr > 0 && hr <= 12 && min > 0 && min <= 60 && sec > 0 && sec <= 60) {
			this.hr = hr;
			this.min = min;
			this.sec = sec;
		} else {
			throw new IncorrectTimeException("Time is not Correct...");
		}
	}

	public int getHr() {
		return hr;
	}

	public void setHr(int hr) {
		if (hr > 0 && hr <= 12) {
			this.hr = hr;
		} else {
			throw new IncorrectTimeException("Hour Time is not Correct...");
		}
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if (min > 0 && min <= 60) {
			this.min = min;
		} else {
			throw new IncorrectTimeException("Minute Time is Not Correct...");
		}
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		if (sec > 0 && sec <= 60) {
			this.sec = sec;
		} else {
			throw new IncorrectTimeException("Seconds Time is not Correct...");
		}
	}

}
