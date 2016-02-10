import java.util.Scanner;
public class Seven_Dwarves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int SD1,SD2,SD3,SD4,SD5,SD6,SD7,SD8,SD9;
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter Dwarves Number 1 : ");
			SD1 = scan.nextInt();
			System.out.print("Enter Dwarves Number 2 : ");
			SD2 = scan.nextInt();
			System.out.print("Enter Dwarves Number 3 : ");
			SD3 = scan.nextInt();
			System.out.print("Enter Dwarves Number 4 : ");
			SD4 = scan.nextInt();
			System.out.print("Enter Dwarves Number 5 : ");
			SD5 = scan.nextInt();
			System.out.print("Enter Dwarves Number 6 : ");
			SD6 = scan.nextInt();
			System.out.print("Enter Dwarves Number 7 : ");
			SD7 = scan.nextInt();
			System.out.print("Enter Dwarves Number 8 : ");
			SD8 = scan.nextInt();
			System.out.print("Enter Dwarves Number 9 : ");
			SD9 = scan.nextInt();
			System.out.println();
			if(SD3+SD4+SD5+SD6+SD7+SD8+SD9==100)
				System.out.print("Fake Dwarf is SD1 & SD2");
			if(SD2+SD4+SD5+SD6+SD7+SD8+SD9==100)
				System.out.print("Fake Dwarf is SD1 & SD3");
			if(SD3+SD2+SD5+SD6+SD7+SD8+SD9==100)
				System.out.print("Fake Dwarf is SD1 & SD4");
			if(SD3+SD4+SD2+SD6+SD7+SD8+SD9==100)
				System.out.print("Fake Dwarf is SD1 & SD5");
			if(SD3+SD4+SD5+SD2+SD7+SD8+SD9==100)
				System.out.print("Fake Dwarf is SD1 & SD6");
			if(SD3+SD4+SD5+SD6+SD2+SD8+SD9==100)
				System.out.print("Fake Dwarf is SD1 & SD7");
			if(SD3+SD4+SD5+SD6+SD7+SD2+SD9==100)
				System.out.print("Fake Dwarf is SD1 & SD8");
			if(SD3+SD4+SD5+SD6+SD7+SD8+SD2==100)
				System.out.print("Fake Dwarf is SD1 & SD9");
			if(SD1+SD4+SD5+SD6+SD7+SD8+SD9==100)
				System.out.print("Fake Dwarf is SD2 & SD3");
			if(SD3+SD1+SD5+SD6+SD7+SD8+SD9==100)
				System.out.print("Fake Dwarf is SD2 & SD4");
			if(SD3+SD4+SD1+SD6+SD7+SD8+SD9==100)
				System.out.print("Fake Dwarf is SD2 & SD5");
			if(SD3+SD4+SD5+SD1+SD7+SD8+SD9==100)
				System.out.print("Fake Dwarf is SD2 & SD6");
			if(SD3+SD4+SD5+SD6+SD1+SD8+SD9==100)
				System.out.print("Fake Dwarf is SD2 & SD7");
			if(SD3+SD4+SD5+SD6+SD7+SD1+SD9==100)
				System.out.print("Fake Dwarf is SD2 & SD8");
			if(SD3+SD4+SD5+SD6+SD7+SD8+SD1==100)
				System.out.print("Fake Dwarf is SD2 & SD9");
			if(SD1+SD2+SD5+SD6+SD7+SD8+SD9==100)
				System.out.print("Fake Dwarf is SD3 & SD4");
			if(SD1+SD4+SD2+SD6+SD7+SD8+SD9==100)
				System.out.print("Fake Dwarf is SD3 & SD5");
			if(SD1+SD4+SD5+SD2+SD7+SD8+SD9==100)
				System.out.print("Fake Dwarf is SD3 & SD6");
			if(SD1+SD4+SD5+SD6+SD2+SD8+SD9==100)
				System.out.print("Fake Dwarf is SD3 & SD7");
			if(SD1+SD4+SD5+SD6+SD7+SD2+SD9==100)
				System.out.print("Fake Dwarf is SD3 & SD8");
			if(SD1+SD4+SD5+SD6+SD7+SD8+SD2==100)
				System.out.print("Fake Dwarf is SD3 & SD9");
			if(SD3+SD1+SD2+SD6+SD7+SD8+SD9==100)
				System.out.print("Fake Dwarf is SD4 & SD5");
			if(SD3+SD1+SD5+SD2+SD7+SD8+SD9==100)
				System.out.print("Fake Dwarf is SD4 & SD6");
			if(SD3+SD1+SD5+SD6+SD2+SD8+SD9==100)
				System.out.print("Fake Dwarf is SD4 & SD7");
			if(SD3+SD1+SD5+SD6+SD7+SD2+SD9==100)
				System.out.print("Fake Dwarf is SD4 & SD8");
			if(SD3+SD1+SD5+SD6+SD7+SD8+SD2==100)
				System.out.print("Fake Dwarf is SD4 & SD9");
			if(SD3+SD4+SD1+SD2+SD7+SD8+SD9==100)
				System.out.print("Fake Dwarf is SD5 & SD6");
			if(SD3+SD4+SD1+SD6+SD2+SD8+SD9==100)
				System.out.print("Fake Dwarf is SD5 & SD7");
			if(SD3+SD4+SD1+SD6+SD7+SD2+SD9==100)
				System.out.print("Fake Dwarf is SD5 & SD8");
			if(SD3+SD4+SD1+SD6+SD7+SD8+SD2==100)
				System.out.print("Fake Dwarf is SD5 & SD9");
			if(SD3+SD4+SD5+SD1+SD2+SD8+SD9==100)
				System.out.print("Fake Dwarf is SD6 & SD7");
			if(SD3+SD4+SD5+SD1+SD7+SD2+SD9==100)
				System.out.print("Fake Dwarf is SD6 & SD8");
			if(SD3+SD4+SD5+SD1+SD7+SD8+SD2==100)
				System.out.print("Fake Dwarf is SD6 & SD9");
			if(SD3+SD4+SD5+SD6+SD1+SD2+SD9==100)
				System.out.print("Fake Dwarf is SD7 & SD8");
			if(SD3+SD4+SD5+SD6+SD1+SD8+SD2==100)
				System.out.print("Fake Dwarf is SD7 & SD9");
			if(SD3+SD4+SD5+SD6+SD7+SD1+SD2==100)
				System.out.print("Fake Dwarf is SD8 & SD9");
			
		}
	}