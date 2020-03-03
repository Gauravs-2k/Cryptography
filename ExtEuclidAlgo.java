import java.util.Scanner;
public class ExtEuclidAlgo
{
	public static void main(String[] args) {
	   int a,b,r1,r2,q,r,s,t;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the value of a");
	   a = sc.nextInt();
	   System.out.println("Enter the value of b");
	   b = sc.nextInt();
	   r1 = a;
	   r2 = b;
	   int s1 = 1;
	   int s2 = 0;
	   int t1 = 0;
	   int t2 = 1;
	   while(r2>0){
	       q = r1/r2;
	       r = r1-q*r2;
	       r1= r2;
	       r2 = r;
	       s = s1-q*s2;
	       s1 = s2;
	       s2 = s;
	       t = t1-q*t2;
	       t1 = t2;
	       t2 = t;
	   }
	   System.out.println("gcd("+a+","+b+") is "+ r1);
	   System.out.println("s is "+s1);
	   System.out.println("t is "+t1);
	   
	}
}
