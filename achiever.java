package arraylist;
import java.util.Scanner;
public class StartEnd {
    public static void main(String args[])
    {
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter size of the array");
    	int n=s.nextInt();
    	int arr[]=new int[n];
    	System.out.println("enter the elements:");
    	for(int i=0;i<n;i++)
    	{

    		arr[i]=s.nextInt();
    	}
    	System.out.println("enter number");
    	int num=s.nextInt();
    	int sum=0,count=0;
    	for(int i=0;i<n;i++)
    	{ sum=0;
    		for(int j=i;j<n;j++)
    		{
    			sum=sum+arr[j];
    			if(sum==num)
    			{
    				count++;
    				System.out.println("Starting Index "+i+" and Ending Index "+j);

    				break;
    			}
    		}
    	}
    	if(sum==0)
    	{
    		System.out.println("no output available");
    	}
    }
}
