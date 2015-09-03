class Citizen {

   // Properties of the class...
   private String name;
   private int    salary;
   private int    savings;
   private int    loan;

   // Constructor of the class...
   public Citizen(String aName, int aSalary, int aSavings, int aLoan) {
      name    = aName;
      salary  = aSalary;
      savings = aSavings;
      loan    = aLoan;
   }
   public Citizen(String aName)
   {
	   name = aName;
   }

   // Methods of the class...
   public int getSalary() {
      return salary;
   }
   public void setSalary(int aSalary) {
      salary = aSalary;
   }
   public void salaryRise(int Bonus)
   {
	   salary += Bonus;
   }
   public int getNetWorth()
   {
	  return savings - loan; 
   }
   public String toString()
   {
	   return ("Name: " + name + " Salary: " + salary + " Savings: " + savings + " Loan: " + loan);
   }

}

class CitizenTest {
    
   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Citizen e = new Citizen("Ernie", 50000, 2000,   0);
      Citizen b = new Citizen("Bert", 100000,10000,5000);
      Citizen f = new Citizen("Fred");
      
      // Raise Ernie's pay by 10k and show worth
      e.salaryRise(10000);
      System.out.println("Ernie's net worth is " + e.getNetWorth());
      System.out.println("Ernie's salary is: " + e.getSalary());
      System.out.println(e.toString());
      System.out.println(f.toString());
   }
}
