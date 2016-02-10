import java.util.Scanner;
public class Trik {

	public static void main(String[] args) {
		
		int Lef=1,Cet=0,Rig=0,Temp,i;
		String swap;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Value : ");
		swap = scan.next();
		for(i=0;i<swap.length();i++){
		if(swap.charAt(i) == 'A' || swap.charAt(i) == 'a'){
			Temp=Lef;
		Lef=Cet;
		Cet=Temp;
		}
		
		else if(swap.charAt(i) == 'B' || swap.charAt(i) == 'b')
		{
			Temp=Cet;
		Cet=Rig;
		Rig=Temp;
		}
		
		else
		{
			Temp=Lef;
		Lef=Rig;
		Rig=Temp;
		}
		}
		if(Lef == 1) System.out.println("COIN IS In LEFT GLASS : ");
		else if(Cet == 1) System.out.println("COIN IS In Center GLASS :");
		else System.out.println("COIN IS In Right GLASS :");
	}

}