package soal6;
import java.util.Scanner;
import java.math.*;

public class BigNumber {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String bil1, bil2;
		bil1 = keyboard.nextLine();
		bil2 = keyboard.nextLine();
		keyboard.close();
		System.out.println(new BigInteger(bil1).add(new BigInteger(bil2)));
		System.out.println(new BigInteger(bil1).multiply(new BigInteger(bil2)));
	}

}
