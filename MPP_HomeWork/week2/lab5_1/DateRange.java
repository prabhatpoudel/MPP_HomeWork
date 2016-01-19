package lab5_1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateRange {
	private GregorianCalendar startDate;

	private GregorianCalendar endDate;
	
	public DateRange(GregorianCalendar startDate, GregorianCalendar endDate)
	{
		this.startDate=startDate;
		this.endDate=endDate;
	}
	
	public GregorianCalendar getStartDate() {
		return startDate;
	}

	public GregorianCalendar getEndDate() {
		return endDate;
	}
	
	public boolean isRange(GregorianCalendar date)
	{
		if(startDate.after(date) & endDate.before(date))
		{
			return true;
		}
		else 
			return false;
	}
	
	public String  toString()
	{
		return "StartDate: "+startDate+" EndDate"+endDate;
	}

	public static GregorianCalendar getFirstDayOfMonth(GregorianCalendar date)
	{
	  date.set(GregorianCalendar.DATE,1);
	  return date;
	}
	
	public static GregorianCalendar getLastDayOfMonth(GregorianCalendar date)
	{
		 date.set((GregorianCalendar.DATE),date.getActualMaximum(Calendar.DAY_OF_MONTH));
		 return date;
	}
	
}
