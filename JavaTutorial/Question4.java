class Flea {
   
   // Properties of the class...
   private String name;
   
   // Constructor of the class...
   public Flea(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a flea called " + name;
   }
   public String getName()
   {
	   return name;
   }

}

class Dog {

   // Properties of the class...
   private String name;
   private int    age;
   private Flea   dogsFlea;

   // Constructor of the class...
   public Dog(String aName, int anAge, Flea aFlea) {
      name     = aName;
      age      = anAge;
      dogsFlea = aFlea;
   }
   // Methods of the class...
   public String toString() {
      return "I am a Dog called " + name + " My age is " + age + " My Flea is called " + dogsFlea.getName();
   }

}
//By copying the pattern of the Flea and Dog classes, write a class DogOwner that has three
//properties: name, salary and ownersDog. Also write a three-parameter constructor for the
//DogOwner class that sets these properties.
class DogOwner {
	// Properties
	private String name;
	private int salary;
	private Dog ownersDog;
	
	// Constructor
	public DogOwner(String aName, int Sal, Dog dog){
		name = aName;
		salary = Sal;
		ownersDog = dog;
	}
	// Methods
	public String toString(){
		return "I am called " + name + " My salary is " + salary + " My dog has something to say: " + ownersDog.toString() + " \" ";
	}
}

class DogTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {
	   // Create 3 Flea's
	   Flea Pop = new Flea("Pop");
	   Flea Squeak = new Flea("Squeak");
	   Flea Zip = new Flea("Zip");
	   // Create 3 Dog's
	   Dog Rex = new Dog("Rex", 1, Pop);
	   Dog Jimbo = new Dog("Jimbo", 2, Squeak);
	   Dog Fido = new Dog("Fido", 3, Zip);
 
	   // create owners
	   DogOwner Angus = new DogOwner("Angus", 1000, Rex);
	   DogOwner Brian = new DogOwner("Brian", 2000, Jimbo);
	   DogOwner Charles = new DogOwner("Charles", 3000, Fido);
	   
	   // print owner and dog statistics
	   System.out.println(Angus.toString() + "\n" + Brian.toString() + "\n"  + Charles.toString());
	   
   }
}

