package assignment2;

public class TrainerArray {
	
	String name;
	String  department;
	String email;
	int id;
	TrainerArray(String n,String d,String e,int i)
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
		String[] trainerDetails = {"Mukesh","Selenium","mukesh@gmail.com","1","Hitesh","Dev","mukesh@gmail.com","2","Mukesh","DevOps","mukesh@gmail.com","3"};
		Trainer t1 = new Trainer( trainerDetails[0],trainerDetails[1],trainerDetails[2], Integer.parseInt(trainerDetails[3]));
		t1.display();
		Trainer t2 = new Trainer( trainerDetails[4],trainerDetails[5],trainerDetails[6], Integer.parseInt(trainerDetails[7]));
		t2.display();
		Trainer t3 = new Trainer( trainerDetails[8],trainerDetails[9],trainerDetails[10], Integer.parseInt(trainerDetails[11]));
		t3.display();
		
	}

}
