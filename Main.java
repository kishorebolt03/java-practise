import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]=new int[100];
		int n=s.nextInt();
		int m=0,flag=0;
		int sum=0;
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
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