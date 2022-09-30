package ch07;

public class Person {
	private String pno;
	private String pname;
	private int page;

	public Person() {
		System.out.println("person 생성자 실행");
	}

	public Person(String name, int age) {
		this.pname = name;
		this.page = age;
	}

	public String getName() {
		return pname;
	}

	public void setName(String name) {
		this.pname = name;
	}

	public int getAge() {
		return page;
	}

	public void setAge(int age) {
		this.page = age;
	}
	
	public String toString(){
		return pname + ":" + page;
	}

}
