package Test;

import java.util.Iterator;

abstract class Person {
	String pnum;
	String name;
	int age;

	public Person() {
	}

	public Person(String pnum, String name, int age) {
		this.pnum = pnum;
		this.name = name;
		this.age = age;
	}

	abstract void show();

	abstract void increase();

	@Override
	public String toString() {
		return " 학생번호 = " + pnum + " " + "학생이름 = " + name + " " + "나이 = " + age + " ";
	}

}

class Employee extends Person {

	private String job;
	private String dept;
	private int salary;

	public Employee(String p_pnum, String p_name, int p_age, String job, String dept, int salary) {
		super(p_pnum, p_name, p_age);
		this.job = job;
		this.dept = dept;
		this.salary = salary;
	}

	@Override
	void show() {
		System.out.println(toString());
	}

	@Override
	void increase() {
		salary *= 1.1;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "직업" + job + " " + "부서" + dept + " " + "연봉" + " " + salary;
	}

}

class Desiner extends Employee {

	private String language;
	private int workYear;

	public Desiner(String p_pnum, String p_name, int p_age, String job, String dept, int salary, String language,
			int workyear) {
		super(p_pnum, p_name, p_age, job, dept, salary);
		this.language = language;
		this.workYear = workyear;
	}

	void show() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return super.toString() + "언어" + language + " " + "연차" + workYear;
	}
}

class Student extends Person {

	private String schoolName;
	private int schoolyear;
	private int scholarship;

	public Student(String pnum, String name, int age, String schoolName, int schoolyear, int scholarship) {
		super(pnum, name, age);
		this.schoolName = schoolName;
		this.scholarship = scholarship;
		this.schoolyear = schoolyear;
	}

	@Override
	void show() {
		System.out.println(toString());
	}

	@Override
	void increase() {
		scholarship *= 1.1;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "학교이름 : " + schoolName + " " + "학교년도" + schoolyear + " " + "장학금" + scholarship;
	}

}

class WorkStudent extends Student {
	String job;
	int dayPay;

	public WorkStudent(String pnum, String name, int age, String schoolName, int schoolyear, int scholarship,
			String job, int dayPay) {
		super(pnum, name, age, schoolName, schoolyear, scholarship);
		this.job = job;
		this.dayPay = dayPay;
	}

	@Override
	public String toString() {
		return super.toString() + "직업" + job + " " + "일급" + dayPay;
	}
}

public class TestPersons {
	static void showall(Person p[]) {
		for (int i = 0; i < p.length; i++) {
			p[i].show();
		}
	}

	static void increaseAll(Person p[]) {
		for (int i = 0; i < p.length; i++) {
			p[i].increase();
		}
	}

	static void getData(Person p[]) {
		Employee e = new Employee("p01", "hong", 20, "DB", "Design", 2000);
		Desiner d = new Desiner("p02", "Choi", 30, "Com", "Design", 0, "한국어", 3);
		Student s = new Student("p03", "Jung", 23, "부경대", 3, 450);
		WorkStudent w = new WorkStudent("p04", "jung", 23, "부경대", 3, 450, "편의점", 70);
		p[0] = e;
		p[1] = d;
		p[2] = s;
		p[3] = w;
	}

	public static void main(String[] args) {
		Person[] setP = new Person[4];
		getData(setP);
		showall(setP);
		increaseAll(setP);
		showall(setP);

	}

}