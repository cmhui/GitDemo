
public class Person {
	public String name;
	String hobby;
	private int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Person(String name) {
		super();
		this.name = name;
	}

	protected Person(int age) {
		super();
		this.age = age;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person(String hobby, String name){
		this.hobby = hobby;
		this.name = name;
	}

	@Override
	public String toString() {
		System.out.println("toString");
		return "Person [name=" + name + ", age=" + age + "]";
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	protected String getHobby() {
		return hobby;
	}

	protected void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSet(int ega){
		
	}
	
	public void setSet2(int set2){
		
	}

	
	
}
