package Calender;




public class MyDate extends calender{
	private int year;
	
	private int month;
	
	private int day;
	
	private int week;
	
	
	
	public MyDate(int year, int month, int day, int week) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.week = week;
	}

	public MyDate() {}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * @return the week
	 */
	public int getWeek() {
		return week;
	}

	/**
	 * @param week the week to set
	 */
	public void setWeek(int week) {
		this.week = week;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day
				+ ", week=" + week + "]";
	}
	
	

}
