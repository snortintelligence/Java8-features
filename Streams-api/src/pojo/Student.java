package pojo;

public class Student {
	String name;
	int socre;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSocre() {
		return socre;
	}

	public void setSocre(int socre) {
		this.socre = socre;
	}

	public Student(String name, int socre) {
		super();
		this.name = name;
		this.socre = socre;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", socre=" + socre + "]";
	}

}
