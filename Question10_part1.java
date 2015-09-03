/* Need to import java.io package to use the BufferedReader and
	 InputStreamReader. 
*/
import java.io.*;
//import java.util.Scanner;


public class Student {

  private static BufferedReader stdIn = new BufferedReader(new
		InputStreamReader(System.in));
  //private static Scanner in = new Scanner(System.in);

  private String name;
  private int age;
  
// Constructor
  public Student () {
    name = "";
    age = 0;
  }

  public void readName () throws IOException {
    System.out.print("Input your name: ");
    name = stdIn.readLine();
  }
    

  public void printName () {
    System.out.println("Name: " + name);
  }
  public void readAge()throws IOException {
	  System.out.printf("Enter i Value:  ");
	  try{
		  String StringInt = stdIn.readLine();
		  Integer intClass = new Integer(StringInt);
		  age = intClass.intValue();
	  }
	 // age = in.nextInt();
	  catch (IOException e) {
		  System.out.println("Unknown terror has accured, program terminated!");
		  System.exit(0);
	  }
	  catch (NumberFormatException e) {
		  System.out.println("Input was not an integer, Try again");
		  age = -1;
		  readAge();
	  }
	  if (age < 0 || age > 150){
		  System.out.println("input was outside the range 0 to 150, please don't lie");
		  readAge();
	  }
  }
  public void printAge(){
	  System.out.printf("Age is:  " + age);
  }

  public static void main (String[] args) throws IOException {
    Student me = new Student();
    me.readName();
    me.printName();
    me.readAge();
    me.printAge();

  }
}

  
  
