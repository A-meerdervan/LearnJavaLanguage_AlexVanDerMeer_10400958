import java.io.IOException;

public class BRTest {
	// properties
	// total
	private static int calls;
	// num of succesful value
	private static int succesfulCalls;
	// sum of all values
	private static int totalReturned;
	// 0 = arithmetic, 1 = nullpointer,
	//2 = array index out of b, 3 = classcast, 4 = negativaArraySize
	private static int[] excepCounts = new int[5];
	// Methods
	public static void callIt(){
		calls++;
		try{
			int Random = BadRandom.randVal();
			succesfulCalls += 1;
			totalReturned += Random;
			
		}
		catch (ArithmeticException e) { 
			excepCounts[0] += 1; 
			System.out.println("some Exception occured");
		}
		catch (NullPointerException e) {
			excepCounts[1] += 1; 
			System.out.println("some Exception occured");
		}
		catch (ArrayIndexOutOfBoundsException e){
		excepCounts[2] += 1; 
		System.out.println("some Exception occured");
		}
		catch (ClassCastException e){ 
		excepCounts[3] += 1; 
		System.out.println("some Exception occured");
		}
		catch (NegativeArraySizeException e){
		excepCounts[4] += 1; 
		System.out.println("some Exception occured");
		}
	}
	public void resetCounts(){
		calls = 0;
		succesfulCalls = 0;
		totalReturned = 0;
	}
	public static void nRandInts(int n){
		// stop at n succes
		while (succesfulCalls < n){
			callIt();
		}
	}
	public static void writeData(){
		System.out.println("num of calls " + calls + " #succes " +  succesfulCalls + " Sum : " + totalReturned);
		System.out.println("% of this exeption of total calls: " + ((double)excepCounts[0]/(double)calls) * (double)100);
		System.out.println("% of this exeption of total calls: " + ((double)excepCounts[1]/(double)calls) * (double)100);
		System.out.println("% of this exeption of total calls: " + ((double)excepCounts[2]/(double)calls) * (double)100);
		System.out.println("% of this exeption of total calls: " + ((double)excepCounts[3]/(double)calls) * (double)100);
		System.out.println("% of this exeption of total calls: " + ((double)excepCounts[4]/(double)calls) * (double)100);
	}
	public static void main (String[] args){
	    //Student me = new Student();
		nRandInts(10);
		writeData();
	  }
}