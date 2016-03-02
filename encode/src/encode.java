import java.util.Scanner;
public class encode {
public static void main(String[] args) {
	String Str1,Str2;
	char ch;
	int i=0;
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter String : ");
	Str1=scan.nextLine();
	Str2=Str1.toUpperCase();
		
		for(i=Str2.length()-1;i>=0;i--)
		{
			ch=Str2.charAt(i);
			if(ch=='E'){
				ch='R';
			}
			else if(ch=='R'){
				ch='W';
			}
			else if(ch=='W'){
				ch='E';
			}
			System.out.print(ch);
		}
	}
}