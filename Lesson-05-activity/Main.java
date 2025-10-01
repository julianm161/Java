class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
    

/*  
    Challenge 1:
    Create two integer variables and Assign values to them. 
    Calculate the sum of the two numbers and store the 
    calculated sum and then display it.
    
*/
int X1 = 10;
int X2 = -50;
int sum = X1 + X2;
System.out.println("Result is: " + sum);   


/*  
    Challenge 2:
    Create three variables to assign three grades and Assign values to each grade. 
    Calculate the sum of the three grades and store the 
    calculated sum and then display it.
    
*/
int grade1 = 85;
int grade2 = 90;
int grade3 = 78;



/*  
    Challenge 3:
    Calculate the average from the three grades from challenge 2,
    store the value and then display it.
    Declare and assign values to any new variables
    NOTE: Does it look correct, check with a calculator?
*/

    doubleaverage = (grade1 + grade2 + grade3) / 3.0;
    System.out.println("Average grade: " + average);

/*  
    Challenge 4:
    Write the following equation in EQ1.PNG file in Java; store the result and the display it:
    Declare and assign values to any new variables

*/
int a = 5;
int b = 3;
int c = 2;
int result = (a + b) * c;
System.out.println("Result of EQ1: " + result);
  

/*  
    Challenge 5:
    Using the variables same variables from challenge4 above, write the following equation in EQ2.PNG file in Java, store the result and the display it:

    Declare and assign values to any new variables

*/

int result2 = a +(b *c)
System.out.println("Result of EQ2: " + result2); 





/*  
    Challenge 6:
    Create the variables and write the equation in
    file  EQ3.PNG

    Declare and assign values to any new variables
*/
 
 // Challenge 6:
// Assuming EQ3 is: result = (x^2 + y^2) / (z + 1)

int x = 4;
int y = 3;
int z = 1;

double resultEQ3 = (Math.pow(x, 2) + Math.pow(y, 2)) / (z + 1.0);
System.out.println("Result of EQ3: " + resultEQ3);

/*  
    **** Bonus Challenge ****:
    Create a variable that stores the total number of eggs 
    and assign it 100. We want to fill as many baskets with 
    eggs as we can. Each basket can hold only 12 eggs.

    1) Write the java code that will calcute how many baskets
    of 12 eggs can we fill fully.

    HINT: What do we get when we divide an integer by 
    an integer in Java

    2) Write the java code that will calculate how many eggs
    are left over after we filled as many baskets of 12 eggs.
*/





    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}