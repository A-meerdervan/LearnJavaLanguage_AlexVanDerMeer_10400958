class Human {

   // Properties of the class...
   String name;

   // Constructor of the class...
   public Human(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a human and my name is " + name;
   }
}

class ArrayTest2 {

   public static void main(String[] args) {
      ArrayTest2 x = new ArrayTest2();
      x.doStuff();
   }

   public void doStuff() {

      // insert your code here:
      Human[] threesome = new Human[3];
      Human Angus = new Human("Angus");
      Human Brian = new Human("Brian");
      Human Charles = new Human("Charles");
      threesome[0] = Angus;
      threesome[1] = Brian;
      threesome[2] = Charles;
      // Print humans
      for (int i = 0; i < threesome.length; i++){
    	  System.out.println(threesome[i].toString());
      }
      // use print method
      printArray(threesome);
   }
   public void printArray(Human[] humans){
      for (int i=0; i < humans.length; i++) {
          System.out.println(humans[i].toString());
       }
   }
}

