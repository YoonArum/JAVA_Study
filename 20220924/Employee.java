package edu;

class person {
	private String name;
	private int age;
	private String dept;

	public person() {
	}

	public person(String s, int a, String d) {
		name = s;
		age = a;
		dept = d;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class Employee extends person {
	private int salary;

	public Employee(String s, int a, String d, int pay) {
		super(s, a, d);
	}

	private String name;
	private int age;
	private String dept;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("sd", 10, "", 10);
		person p = new person();
		Student s = new Student();

		e.setAge(10);
		System.out.println(e.getAge());

		s.setAge(28);
		System.out.println(s.getAge());

		p.setAge(29);
		System.out.println(p.getAge());

	}

}
