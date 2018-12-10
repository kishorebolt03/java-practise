import java.lang.*; 
import java.io.*; 
import java.util.*; 
  
// Class of Reverse String from a specific letter 
public class ReverseString 
{ 
    public static void main(String[] args) 
    { 
		Scanner s= new Scanner(System.in);
		System.out.println("enter the sentence");			
        String input =s.nextLine();  							//getting string
        
        char[] strArray = input.toCharArray(); 					//storing the string in a character array 
  
        char[] result = new char[strArray.length]; 				// character array to store reversed values
		System.out.println("enter the letter");
		char input2 = s.next().charAt(0);						// getting the letter
		int i=input.indexOf(input2); 							// finding the position of the letter 
		int j=i;
        for (int k=0;i<strArray.length; i++,k++) 
		{
			result[k] =strArray[strArray.length-k-1];			//reversing the string from the index of the given letter 
		}			
  
        System.out.println(input.substring(0,j)+new String(result)); 	// printing the result after reversing
    } 
}