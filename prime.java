package primenumber;
import java.util.*;
import java.lang.Math;
public class prime {
	public static void main(String[] args){
			Scanner obj=new Scanner(System.in);
			
	System.out.println("enter the number to be checked");
	double a=obj.nextDouble();
	double b=(Math.sqrt(a/2));		
	if(a==1 || a==2 || (a%2)==0) {
		System.out.println("not a prime");
		return ;
	}
	for(double i=2;i<=b;i++) {
		if((b%i)==0) {
			System.out.println("not a prime");
			return ;
		}
	}
	System.out.println("it is a prime");
	obj.close();
	return ;
		
		}
		

	}