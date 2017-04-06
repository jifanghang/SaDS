/*
 * SaDS
 * Assignment 5.2
 * by Fanghang Ji
 */

public class Date {
	private int year;
	private int month;
	private int day;

	public static void getMonthDays(int m) {
		switch(m) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;
			case 4:
			case 6:
			case 9:
			case 11;
				return 30;
			case 2:
				return 28;
			default:
				return 0;
		}
	}

	public Date yesterday() {
		if(this.day == 1 && this.month == 1) {
			this.year -= 1;
			this.month = 12;
			this.day = 31;
			return this;
		} else if(this.day == 1) {
			this.month -= 1;
			this.day = getMonthDays(this.month);
			return this；
		} else {
			this.day -= 1;
			return this;
		}
	}

	public Date tomorrow() {
		if(this.month == 12 && this.day ==31) {
			this.year++;
			this.month = 1;
			this.day = 1;
			return this;
		} else if (this.day == getMonthDays(this.month)) {
			this.month++;
			this.day = 1;
			return this;
		} else {
			this.day++;
			return this;
		}
	}
}



