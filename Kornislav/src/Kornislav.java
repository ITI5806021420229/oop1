import java.util.Scanner;
public class Kornislav {

	public static void main(String[] args) {
	int line1,line2,line3,line4,temp;
	Scanner scan = new Scanner(System.in);
	System.out.print("Input line_1 : ");
	line1=scan.nextInt();
	System.out.print("Input line_2 : ");
	line2=scan.nextInt();
	System.out.print("Input line_3 : ");
	line3=scan.nextInt();
	System.out.print("Input line_4 : ");
	line4=scan.nextInt();
	if(line1>line2){
		temp=line1;
		line1=line2;
		line2=temp;
	}
	if(line1>line3){
		temp=line1;
		line1=line3;
		line3=temp;
	}
	if(line1>line4){
		temp=line1;
		line1=line4;
		line4=temp;
	}
	if(line2>line3){
		temp=line2;
		line2=line3;
		line3=temp;
	}
	if(line2>line4){
		temp=line2;
		line2=line4;
		line4=temp;
	}
	if(line3>line4){
		temp=line3;
		line3=line4;
		line4=temp;
	}
	System.out.print("\nRectangle Area = : "+""+line3+""+" * "+line1+" = "+line3*line1);
	}

}