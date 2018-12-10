import java.io.*;
import java.util.*;
//Program to check wether sum of any 2 elements in the given array are equal to sum of rest of the elements in the array
//Main is the class  and i hav used only one class and a main method to complete the code 
public class Main{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 					//Scanner class is imported to get input of the elements and the number of elements
		int arr[]=new int[100];							//Initializing variables 
		int n=s.nextInt();
		int m=0,flag=0;
		int sum=0;
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();						// getting elements in array
		}
		for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){							//  
                m=arr[i]+arr[j];
                sum=0;
                for(int k=0;((k<n));k++){
			if( (k!=i) && (k!=j))
			{
			          sum+=arr[k];
				}
                }
                if(m==sum){
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                break;
            }
        }
        if(flag==1){
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
