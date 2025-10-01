/* 
Lesson 6: Using the Input Class that I provide to get input from a user via the keyboard. The example below the function call for each datatypes: int, double, string, char, boolean. 
*/
class Main{
	  public static void main(String[] args) {
    	(new Main()).init();
	  }

  void init(){
    int age;
    double measure;
    String name;
    char firstInitial;
    boolean stillAlive;

    //Always prompt the user for what information you are requesting
    
    System.out.println("Enter your age:");

    age = Input.readInt();
    System.out.println("Your age is: "+age);
    


    System.out.println("Enter the measurement to 100th place:");

    measure = Input.readDouble();
    System.out.println("Your measure is: "+measure);
    
    
    System.out.println("Enter your Name");
    
    name = Input.readString();
    System.out.println("Your name is: "+name);
    
    
    System.out.println("Enter your first initial:");
    
    firstInitial = Input.readChar();
    System.out.println("Your first initial : "+firstInitial);
    
    System.out.println("Enter true if alive or false if not alive");
    
    stillAlive = Input.readBoolean();
    System.out.println("Are you alive : "+stillAlive);
    
    System.out.println("End of exercise");

  }
}