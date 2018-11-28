package project_a;

public class Computer {
String name;
int id;
static String univName="DU";




 public Computer(String name,int id) {
	this.name=name;
	this.id=id;
	System.out.println("Student name is "   + name+  "  "  + "and  id is  "  +id);
	
 }
	
public void studentInfo() {
System.out.println("I am a Non static method, Student university name is "+ "Du");	
	}



 public static void emploinfo1() {
	 System.out.println("I am a static method");
	
}

}
