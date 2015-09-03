public class Iffy {
   private int anIntProp = 42;
   public static void main(String[] args) {
      Iffy me = new Iffy();
      me.callSomeMethods();
   }

   public void callSomeMethods() {
      // add statements here to exercise the other methods ...
	   // The if statement is followed by a ;, so the statement it executes is absolutely nothing. 
	   warnIfNegative(-1);
	   warnIfNegative(0);
	   warnIfNegative(1);
	   // The function only prints the error for a negative anIntProp, but
	   // now it always sets the anIntProp to zero, this is wat is wrong
	   System.out.println("an int prop = " + anIntProp);
	   resetIfNegative();
	   System.out.println("an int prop = " + anIntProp);
	   //Test bound checker
	   System.out.println(isInRange(5, 6, 4));
	   System.out.println(isInRange(5,6,5));
	   System.out.println(isInRange(5,5,4));
	   System.out.println(isInRange(5,5,5));
	   System.out.println(isInRange(5,8,6));
   }

   /**
    * Print out a warning if the value is negative
    * otherwise don't do anything.
    */
   public void warnIfNegative(int theValue) {
      if(theValue < 0) System.out.println("Caution - negative value given (" + theValue + ")");
   }
  
   /**
    * Print out a warning if the value of anIntProp is negative
    * and also set the value to zero.
    * Otherwise don't do anything.
    */
   public void resetIfNegative() {
      if(anIntProp < 0){
         System.out.println("Caution - negative value given (" + anIntProp + ")");
         anIntProp = 0;
      }
      
   }

   /**
    * return true if value is between upperBound and LowerBound
    * (or equal to either bound) otherwise return false.
    */
   public boolean isInRange(int value, int upperBound, int lowerBound) {
	 if(lowerBound <= value && value <= upperBound )
       return true;
     else
       return false;
   }
   public boolean isInRangeIfLess(int value, int upperB, int lowerB){
	   if (upperB <= lowerB){
		   System.out.println("warning");
		   return false;
	   }
	   else   return (lowerB <= value && value <= upperB);
   }

  // public boolean isInRangeIfLess(int value, int upperBound, int lowerBound) {
	  // what goes here?
  // }
}
