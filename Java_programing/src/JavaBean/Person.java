package JavaBean;

public class Person {
private String name;
private int age;
public Person(String name,int age) {
	this.name=name;
	this.age=age;
}
	public static void main(String[] args) {
		Person person=new Person ("Alice",30);
		Gson gson=new Gson();
		String json= gson.toJson(person);
		System.out.println("JSON:"+json);
	}
}

