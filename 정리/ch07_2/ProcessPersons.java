package ch07_2;

class Person {
	private String pno;
	private String pname;
	private int age;

	public Person() {
		pno = null;
		pname = null;
		age = 0;
	}

	public Person(String pn) {
		this();
		pno = pn;
	}

	public Person(String pn, String name) {
		this(pn);
		pname = name;
	}

	public Person(String pn, String name, int a) {
		this(pn, name);
		age = a;
	}

	public String toString() {
		return "pno = " + pno + " pname = " + pname + " age = " + age;
	}

	public void show() {
		System.out.println("pno = " + pno + " pname = " + pname + " age = " + age);
	}

}

class Student extends Person {
	private String schoolName;
	private int schoolYear;

	public Student(String pn, String name, int a, String sn, int sy) {
		super(pn, name, a);
		schoolName = sn;
		schoolYear = sy;
	}

	public String toString() {
		return super.toString() + "schoolName = " + schoolName + " schoolYear = " + schoolYear;
	}

	public void show() {
		super.show();
		System.out.println("schoolName = " + schoolName + " schoolYear = " + schoolYear);
	}
}

class WorkStrudent extends Student {
	private String job;
	private int salary;

	/*
	 * public WorkStrudent() { job = null; salary = 0; }
	 */

	public WorkStrudent(String pn, String name, int a, String sname, int syear, String j, int pay) {
		super(pn, name, a, sname, syear);
		job = j;
		salary = pay;
	}

	public String toString() {
		return super.toString() + "job = " + job + " salary = " + salary;
	}

	public void show() {
		super.show();
		System.out.println("job = " + job + " salary = " + salary);
	}

}

public class ProcessPersons {
	static void display(Person[] p) {
		for (int i = 0; i < p.length; i++) {
			if (p[i]==null) break;			
			p[i].show();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person list[] = new Person[10];
		Person p = new Person();
		Person p1 = new Person("p001");
		Person p2 = new Person("p002", "choi");
		Person p3 = new Person("p003", "choi", 20);
		Student s1 = new Student("p004", "Lee", 30, "부산대", 1000);
		WorkStrudent ws = new WorkStrudent("p001", "choi", 30, "부산대", 3, "code", 300);

		list[0] = p;
		list[1] = p1;
		list[2] = p2;
		list[3] = p3;
		list[4] = s1;
		list[5] = ws;

		display(list);
		//ProcessPersons.display(list);

		/*
		 * p3.show(); System.out.println(""); s1.show(); System.out.println("");
		 * ws.show();
		 * type casting
		 */

	}

}