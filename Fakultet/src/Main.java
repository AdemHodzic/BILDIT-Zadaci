import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("H i!\nW h o  a r e  y o u ?");
		System.out.println("1. P E R S O N\n"
				+ "2.S T U D E N T\n"
				+ "3.E M P L O Y E E\n"
				+"4.F A C U L T Y\n"
				+"5.S T A F F\n");
		int opcija = input.nextInt();
		Person person;
		switch(opcija){
			case 1:
				person = new Person();
				System.out.println(person.toString());
				break;
			case 2:
				person = new Student();
				System.out.println(person.toString());
				break;
			case 3:
				person = new Employee();
				System.out.println(person.toString());
				break;
			case 4:
				person = new Faculty();
				System.out.println(person.toString());
				break;
			case 5:
				person = new Staff();
				System.out.println(person.toString());
				break;
			default:
				System.out.println("W R O N G  I N P U T !!!");
		}
		input.close();
	}

}
