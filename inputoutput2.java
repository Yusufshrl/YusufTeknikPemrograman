package soal2;
import java.util.Scanner;

public class inputoutput2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String teks[] = new String[3];
		Short number[] = new Short[3];
		Scanner keyboard = new Scanner(System.in);

		//Mengambil input dari keyboard
		for (byte i = 0; i <3; i++) {
			teks[i]=keyboard.next();
			number[i] = keyboard.nextShort();
		}
		
		//Menampilkan output sesuai format
		System.out.println("==================================================");
		for (byte j = 0; j <3; j++) {
			System.out.printf("%-15s%03d %n",teks[j], number[j] );
		}
		keyboard.close();
		System.out.println("==================================================");
	}

}
