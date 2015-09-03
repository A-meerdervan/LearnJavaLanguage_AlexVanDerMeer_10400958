class ArrayTest {

   public static void main(String[] args) {
      ArrayTest x = new ArrayTest();
      x.doStuff();
   }
   // Methods
   public void printArray(double[] Array){
      for (int i=0; i < Array.length; i++) {
          System.out.println(Array[i]);
       }
   }

   public void doStuff() {

      // creates the array fred of ten integers.
      int[] fred = new int[10];
      // create doubles array
      double[] nums = new double[10];
      // sets the values from 1.0 to 1.9 of nums
      for (int i = 0; i<10; i++){
    	  nums[i] = 1 + ((double) i)/10;
      }
      // print nums
      for (int i=0; i<10; i++) {
         System.out.println(nums[i]);
      }
      // sets the values of the fred array
      for (int i=0; i<10; i++) {
         fred[i] = i;
      }

      // prints the values of the fred array
      for (int i=0; i<10; i++) {
         System.out.println(fred[i]);
      }

      // insert your code for the nums array here:
      ArrayPrint.printArray(nums);
      // print nums with own created printArray function
      printArray(nums);
   }
}
