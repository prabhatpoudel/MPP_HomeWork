package lab1;

public class Course {
	private String Number;
	private String Title;
	private int Units;

//Course("cs201","programming",4, johnDoodle);
	public Course(String id, String course, int units)
	{
		setNumber(id);
		setTitle(course);
		setUnits(units);
	}
	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public int getUnits() {
		return Units;
	}

	public void setUnits(int units) {
		Units = units;
	}

}
