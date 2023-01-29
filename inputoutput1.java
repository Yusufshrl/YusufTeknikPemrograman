package soal1;
import java.util.Scanner;

public class inputoutput1 {
public static void main(String[] args) {
		
		//untuk Mengambil input dari keyboard
		Scanner keyboard = new Scanner(System.in);
		String s = keyboard.nextLine();
		keyboard.close();
		
		//untuk Memisahkan String yang berdasar karakter tertentu
		//s.trim() berguna menghapus spasi di bagian awal dan akhir 
		String[] token = s.trim().split("[!,?._'@\\ ]");
		
		//Menghitung panjang dari string yang telah dipisahkan
		int length = token.length;
		
		//Menampilkan panjang dari string yang telah dipisahkan
		System.out.println(length);
		
		//Menampilkan setiap kata dari string yang telah dipisahkan
		for(int i = 0; i < length; i++) {
			System.out.println(token[i]);
		}
		
	}

}
