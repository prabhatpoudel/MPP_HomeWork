package lab2;

public class Course {
	private String Number;
	private String Title;
	private int Units;
	private Faculty fac;

//Course("cs201","programming",4, johnDoodle);
	public Course(String id, String course, int units,Faculty fac)
	{
		setNumber(id);
		setTitle(course);
		setUnits(units);
		this.fac=fac;
	}
	public Faculty getFac() {
		return fac;
	}
	public void setFac(Faculty fac) {
		this.fac = fac;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Number == null) ? 0 : Number.hashCode());
		result = prime * result + ((Title == null) ? 0 : Title.hashCode());
		result = prime * result + Units;
		result = prime * result + ((fac == null) ? 0 : fac.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (Number == null) {
			if (other.Number != null)
				return false;
		} else if (!Number.equals(other.Number))
			return false;
		if (Title == null) {
			if (other.Title != null)
				return false;
		} else if (!Title.equals(other.Title))
			return false;
		if (Units != other.Units)
			return false;
		if (fac == null) {
			if (other.fac != null)
				return false;
		} else if (!fac.equals(other.fac))
			return false;
		return true;
	}
	

}
