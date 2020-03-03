import java.util.*;
import java.lang.Math.*;
import java.math.*;
public class RSA {
	static int Encrypt(int p,int q,int Ptext){
		int n = p*q;
		int phiN = (p-1)*(q-1);
		int e = 13;
		int d = Euclid(phiN,e);//PRIVATE KEY
		int Ctext = (int)((Math.pow(Ptext,e))%n);

		return Ctext;
	}

	static String Decrypt(int p,int q,int Ctext){
		int n = p*q;
		int phiN = (p-1)*(q-1);
		int e = 13;
		int d = Euclid(phiN,e);//PRIVATE KEY
		BigInteger b1 = new BigInteger(Integer.toString(Ctext));
		BigInteger exp = new BigInteger(Integer.toString(d));
		BigInteger n1 = new BigInteger(Integer.toString(n));
		BigInteger result = b1.modPow(exp,n1);

		return result.toString();
	}

	static int Euclid(int a, int b){
		//int prevr1=a,prevr2=b,prevt1=0,prevt2=1;
		int r1=a,r2=b,t1=0,t2=1;
		int q = 0,r=0;
		int t = 0;
		int ans = 0;
		while(r1!=1){
			q=r1/r2;
			r=r1%r2;
			t=t1-(q*t2);
			r1=r2;
			r2=r;
			t1=t2;
			t2=t;
		}
		if(t1<0)
			ans=a-(Math.abs(t1)%a);
		else
			ans = t1%a;
		return ans;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the choice \n 1. Encryption \n2.Decryption");
	int x = sc.nextInt();
	if(x == 1){
	System.out.println(Encrypt(7,11,5));

	}else if(x == 2){
	System.out.println(Decrypt(7,11,26));
}
}
}