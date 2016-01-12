package lab12;

public class Person {

	String Name;
	String Phone;
	int Age;
	public Person()
	{
		
	}
	public Person(String name, String phone, int age)
	{
		this.Name=name;
		this.Phone=phone;
		this.Age=age;
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
	
}
