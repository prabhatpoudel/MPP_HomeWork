package lab5_1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateRange {
	private GregorianCalendar startDate;

	private GregorianCalendar endDate;

	public DateRange(GregorianCalendar startDate, GregorianCalendar endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public GregorianCalendar getStartDate() {
		return startDate;
	}

	public GregorianCalendar getEndDate() {
		return endDate;
	}

	public boolean isRange(GregorianCalendar date) {
		if (startDate.before(date) & endDate.after(date)) {
			// System.out.println("I am in range");
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {

		return "DateRange [startDate=" + startDate.getTime() + ", endDate=" + endDate.getTime() + "]";
	}

	public static GregorianCalendar getFirstDayOfMonth(GregorianCalendar date) {
		GregorianCalendar cal = new GregorianCalendar(date.get(GregorianCalendar.YEAR),
				date.get(GregorianCalendar.MONTH), 1);
		return cal;
	}

	public static GregorianCalendar getLastDayOfMonth(GregorianCalendar date) {
		GregorianCalendar cal = new GregorianCalendar(date.get(GregorianCalendar.YEAR),
				date.get(GregorianCalendar.MONTH), date.getActualMaximum(Calendar.DAY_OF_MONTH));
		return cal;

	}

}
