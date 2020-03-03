import java.util.Scanner;


class AdditiveWithBinaryOP
{
    public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int shift,i,n;
 String str;
 String str1="";
 String str2="";
 System.out.println("Enter the plaintext");
 str=sc.nextLine();
 str=str.toLowerCase();
 n=str.length();
 char ch1[]=str.toCharArray();
 char ch3,ch4;
 System.out.println("Enter the key value");
 shift=sc.nextInt();
 
 System.out.println();
 System.out.println("Encrypted text is");
 for(i=0;i<n;i++)
 {
 if(Character.isLetter(ch1[i]))
 {
 ch3=(char)(((int)ch1[i]+shift-97)%26+97);
 //System.out.println(ch1[i]+" = "+ch3);
 str1=str1+ch3;
 } 
 else if(ch1[i]==' ')
 {
 str1=str1+ch1[i];
 } 
 }
 String s = str1; 
  strToBinary(s);
 
}

  static void strToBinary(String s) 
    { 
        int n = s.length(); 
  
        for (int i = 0; i < n; i++)  
        { 
            // convert each char to 
            // ASCII value 
            int val = Integer.valueOf(s.charAt(i)); 
  
            // Convert ASCII value to binary 
            String bin = ""; 
            while (val > 0)  
            { 
                if (val % 2 == 1) 
                { 
                    bin += '1'; 
                } 
                else
                    bin += '0'; 
                val /= 2; 
            } 
            bin = reverse(bin); 
  
            //System.out.print(bin + " "); 
           
        
         String str  = bin;
            String strArray[] = str.split(" ");

        
        for(int j=0;j<strArray.length;j++){
            
            System.out.println(strArray[j]);
            
            
        }
        }
    } 
  
    static String reverse(String input)  
    { 
        char[] a = input.toCharArray(); 
        int l, r = 0; 
        r = a.length - 1; 
  
        for (l = 0; l < r; l++, r--) 
        { 
            // Swap values of l and r  
            char temp = a[l]; 
            a[l] = a[r]; 
            a[r] = temp; 
        } 
        return String.valueOf(a); 
    } 
  
    
 
 

}