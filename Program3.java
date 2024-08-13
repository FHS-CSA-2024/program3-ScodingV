//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program3{
    public static void main(String[] args){
        //Declare Variables
        /*int length_inp = 0;
        int width = 0;
        int area = 0;
        int perimeter = 0;*/
        //Create the Scanner
        Scanner numScanner = new Scanner(System.in);
        
        // Length input
        System.out.println("Enter the length:");
        int length = numScanner.nextInt();
        
        //Width input
        System.out.println("Enter the width:");
        int width = numScanner.nextInt();
        
        //Print out the statements along with length/width values
        System.out.println("The Length is " + length);
        System.out.println("The width is " + width);
        
        //Initialize area and perimeter
        int area = length * width;
        System.out.println("The area is " + area);
        
        int perimeter = length*2 + width*2;
        System.out.println("The perimeter is " + perimeter);
        
        
    }
}
        


//Paste console output below:
/*
Enter the length: 143

Enter the width: 82

The Length is 143

The width is 82

The area is 11726

The perimeter is 450

*/
