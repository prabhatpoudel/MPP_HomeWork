package lab2;

public class Person {

	String Name;
	String Phone;
	int Age;

	public Person() {

	}

	public Person(String name, String phone, int age) {
		this.Name = name;
		this.Phone = phone;
		this.Age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Age;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((Phone == null) ? 0 : Phone.hashCode());
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
		Person other = (Person) obj;
		if (Age != other.Age)
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (Phone == null) {
			if (other.Phone != null)
				return false;
		} else if (!Phone.equals(other.Phone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Phone=" + Phone + ", Age=" + Age + "]";
	}
}
