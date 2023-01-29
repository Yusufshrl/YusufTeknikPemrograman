package soal5;
import java.util.Scanner;
import java.math.BigInteger;

public class Bukatutupjalan {
	public static void main(String args[]) {
		try (Scanner input = new Scanner(System.in)){
			String mobil1 = input.next();						
			String mobil2 = input.next();						
			String mobil3 = input.next();						
			String mobil4 = input.next();						
			String numberInput = mobil1+mobil2+mobil3+mobil4;	
			long number = Long.parseLong(numberInput);			
			if((number-999999)%5 == 0) {						
				System.out.println("Jalan");// Print "Jalan" jika mobil memenuhi syarat untuk jalan
			}else {
				System.out.println("Berhenti");// Print "Berhenti" jika mobil memenuhi syarat untuk berhenti
			}
		}
	}

}
