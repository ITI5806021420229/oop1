import java.util.Scanner;
public class decode {
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
			if(ch=='R'){
				ch='E';
			}
			else if(ch=='W'){
				ch='R';
			}
			else if(ch=='E'){
				ch='W';
			}
			System.out.print(ch);
		}
	}
}