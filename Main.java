import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	static LinkedList <Student> STUDENT = new LinkedList<Student>();

	public static void main(String[] args) {
		
		int myGPA;
		String myName;
		String myAddress;
		String temp;
		
		Sort srt = new Sort();
		
		Scanner StringScan = new Scanner(System.in);
		Scanner IntScan = new Scanner(System.in);
		
		System.out.println("Welcome! Would you like to enter a student's GPA? (yes/no?)");
		temp = StringScan.nextLine();
		
		if (temp.toLowerCase().equals("yes")) {	
			
			do {
			
			Student std = new Student();
			
			System.out.println("Please enter your Name: ");
			myName = StringScan.nextLine();
			
			System.out.println("Please enter your Address: ");
			myAddress = StringScan.nextLine();
			
			do {
				
				System.out.println("Please enter your GPA: ");
				
	            while (!IntScan.hasNextInt()) {
	            	
	                String input = IntScan.next();
	                System.out.printf("\"%s\" is not a valid number.\n", input);
	                System.out.println("Please enter your GPA:");
	            }
	            
	            myGPA = IntScan.nextInt();
	            
	        } while (myGPA < 0);
			
			std.setName(myName);
			std.setAddress(myAddress);
			std.setGPA(myGPA);
			
			STUDENT.add(std);
			
			System.out.println("Would you like to enter another student's GPA? (yes/no?)");
			temp = StringScan.nextLine();
			
			} 
			 while (temp.toLowerCase().equals("yes")); 
			
		}	
		
		else {
			System.exit(0);
		}
		
		srt.NameSelectorSort(STUDENT);
			
		PrintWriter();
		
	    }
	
	static void PrintWriter() {
		
		try {
			
			String Filename = "C:\\Temp\\log.txt";
			
			FileWriter file = new FileWriter(Filename);
			BufferedWriter write = new BufferedWriter(file);
			
			for (int i = 0; i < STUDENT.size(); ++i) {         
				   write.write("Name: "+ STUDENT.get(i).getName() + "\r\n");  
				   write.write("Add: "+ STUDENT.get(i).getAddress()+ "\r\n");  
				   write.write("GPA: "+ STUDENT.get(i).getGPA()+ "\r\n");  
				}
			
			write.close();
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	  }
}
		