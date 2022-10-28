package assignment2;

public class Trainer {
	String name;
	String  department;
	String email;
	int id;
	Trainer(String n,String d,String e,int i)
	{
		name = n;
		department = d;
		email = e;
		id = i;
	}
	void display()
	{
		System.out.println(name+" "+department+" "+email+" "+id);
	}

	public static void main(String[] args) {
		Trainer t1 = new Trainer( "Mukesh","Testing","mukesh@gmail.com", 1);
		t1.display();
		Trainer t2 = new Trainer( "Hitesh","Dev","mukesh@gmail.com", 2);
		t2.display();
		Trainer t3 = new Trainer( "Mukesh","DevOps","mukesh@gmail.com", 3);
		t3.display();
		Trainer t4 = new Trainer( "Hitesh","Web Development","mukesh@gmail.com", 2);
		t4.display();
		Trainer t5 = new Trainer( "Mukesh","Selenium","mukesh@gmail.com", 3);
		t5.display();
	
	}

}
