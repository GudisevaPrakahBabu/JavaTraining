import java.util.*;
public class Switchconditionalstatement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter month's number");
		int month = scanner.nextInt();
		//or
		//int month = 11;
		String name_Month="the month you choose";
		System.out.println(name_Month);
		
		//SWITCH CONDITION
		switch(month) //SWITCH take a variable and checks which of the switch_cases match with given input and executes that case
		//switch only supports following Variables ---int, byte, short, char, string, enum
		{
		case 1 : name_Month = "Jan";
		break; // break statement is used to break or end the flow of code execution
		
		case 2 : name_Month = "Feb";
		break; //if we did not use break statement the code keeps on executing.
		
		case 3 : name_Month = "Mar";
		break;
		
		case 4 : name_Month = "Apr";
		break;
		
		case 5 : name_Month = "MAy";
		break;
		
		case 6 : name_Month = "June";
		break;
		
		case 7 : name_Month = "July";
		break;
		
		case 8 : name_Month = "Aug";
		break;
		
		case 9 : name_Month = "Sep";
		break;
		
		case 10 : name_Month = "Oct";
		break;
		
		case 11 : name_Month = "Nov";
		break;
		
		case 12 : name_Month = "Dec";
		break;
		
		default:
			System.out.println("the variable you have give does not match with any of given cases");
		}
		System.out.println(name_Month);
		
		
		scanner.close();
	}

}
