package soal4;
import java.util.Scanner;

public class Gajiagen {
	public static final int gajiPokok = 500000;
	public static final int hargaItem = 50000;
	public static void main(String[] args) {
		int gaji;
		Scanner keyboard = new Scanner (System.in);
			short penjualan = keyboard.nextShort();
			keyboard.close();
			if (penjualan > 80) {
				gaji = (int)(0.35*(hargaItem*penjualan) + gajiPokok);
			}else if(penjualan > 40) {
				gaji = (int)(0.25*(hargaItem*penjualan) + gajiPokok);
			}else if (penjualan < 15) {
				gaji =(int)( gajiPokok - (0.15*((15-penjualan)*hargaItem)));
			}else {
				gaji = (int)(0.1*(hargaItem*penjualan)+gajiPokok);
			}
		System.out.println(gaji);
	}

}
