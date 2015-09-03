class Person {

   // Properties of the class...
   private String name;
   private int    age;
   private String SexualPrefference;
    
   // Constructor of the class...
   /*
   public Person(String aName, int anAge, String SexPref) {
      name = aName;
      age  = anAge;
      SexualPrefference = SexPref;
   }
   */

   // Methods of the class...
   public void talk() {
      System.out.println("Hi, my name's " + name);
      System.out.println("and my age is " + age);
      commentAboutAge();
      System.out.println("My sexual prefference is " + SexualPrefference);
      System.out.println();
   }
   public void commentAboutAge() {
      if (age < 5) {
         System.out.println("baby");
      }
      else if (age == 5) {
         System.out.println("time to start school");
      }
      else if (age > 60) 
      {
    	  System.out.println("old person");
      }
   }
   public void growOlder()
   {
	   age += 1;
   }
   public void growOlderBy(int NumOfYears)
   {
	   age += NumOfYears;
   }
   
   public void getKnighthood()
   {
	   name = "Sir " + name;
   }
   public int getAge()
   {
	   return age;
   }

}

class PersonTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Person ls = new Person();
      Person wp = new Person();
      // Luke Skywalker actions
      ls.growOlderBy(10);
      ls.talk();
      // Winston peters actions
      wp.getKnighthood();
      wp.growOlder();
      wp.talk();
     // Other stuff
      System.out.println(wp.getAge());

   }

}

