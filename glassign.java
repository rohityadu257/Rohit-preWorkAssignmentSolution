import java.util.Scanner;

public class glassign {
	
	Scanner sc = new Scanner(System.in);

	 

        //checkPalindrome

	       public void checkPalindrome(int num1)  {
	    	   int t,s,rem;
	    	   	t=num1;
	    	   	for(s=0;num1>0;num1/=10)
	    	   	{
	    	   		rem=num1%10;
	    	   		s=(s*10)+rem;
	    	   	}
	    	   	if(s==t)
	    	   		System.out.println(t+" is a palindrome number ");
             else
            	 System.out.println(t+" is not a palindrome number ");

	      }

	 // printPattern

	      public void printPattern(int num2) {
	    	  
	    	  int i,j;
	    	  
	    	  for (i=num2;i>0;i--) {
	    		  for( j=0;j<i;j++) {
	    				  
	    		  System.out.print("*");
	    		  }
	    		  System.out.println();
	    	  }
	      }
	    	  

	// check no is prime or not

	     public void checkPrimeNumber(int num3) {
	    	 
	       boolean flag = false;
	       for (int i = 2; i <= num3 / 2; ++i) {
	 // condition for nonprime number
	         if (num3 % i == 0) {
	           flag = true;
	           break;
	         }
	       }

	       if (!flag)
	         System.out.println(num3 + " is a prime number.");
	       else
	         System.out.println(num3 + " is not a prime number.");
	     }
	   
        

	   // print Fibonacci Series

	     public void printFibonacciSeries(int Count) {

	     //initialize the first and second value as 0,1 respectively.
	     
	     int num1=0,num2=1;
			
			System.out.print(num1+ "," +num2 );
			int i;
			for (i=0;i<Count-2;i++)
			{
				int Sum = num1 + num2;
				System.out.print( "," + Sum);
				num1=num2;
				num2=Sum ;
				
			}
	     }
			

	
	//main method which contains switch and do while loop

	      public static void main(String[] args) {

	                glassign obj = new glassign();
	                int choice;
	                Scanner sc = new Scanner(System.in);

	do {

	System.out.println("Choose from below list.\n" + "1. Find palindrome of number.\n"

	+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

	+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

	System.out.println();

	choice = sc.nextInt();

	switch (choice) {

	case 0:

	choice = 0;

	break;

	case 1: {
		System.out.println("enter the number to check for pelindrome" );
		Scanner my = new Scanner(System.in);
		int Num1 = my.nextInt();
	    obj.checkPalindrome(Num1); 
	    
	    
	}
	break;
	case 2: {
		System.out.println("Enter the Number of Star to print");
		Scanner my0 = new Scanner (System.in);
		int Num4 = my0.nextInt();
		obj.printPattern(Num4);
		
	}

	break;
	case 3: {
		
		System.out.println("enter any number for prime check" );
		Scanner my1 = new Scanner(System.in);
		int Num2 = my1.nextInt();
		obj.checkPrimeNumber(Num2);
		
	}
	break;
	case 4: {

		System.out.println("enter any no to generate the fibonnaci" );
		Scanner my2 = new Scanner(System.in);
		int Num4 = my2.nextInt();
		obj.printFibonacciSeries(Num4);
		
		
	}


	break;

	default:
	System.out.println("Invalid choice. Enter a valid no.\n");

	}

	} while (choice != 0);

	System.out.println("Exited Successfully!!!");

	sc.close();

	}

	 

	}




