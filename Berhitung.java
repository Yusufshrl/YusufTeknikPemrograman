package soal3;
import java.util.Scanner;

public class Berhitung {
	public static void main(String args[]) {
		try (Scanner input = new Scanner(System.in)){
			int result = 0;
			int A = input.nextInt();        //Input integer 
			String operator = input.next(); //Input Operasi aritmatika 
			int B = input.nextInt();        //Input integer 
			switch (operator) {
			case("+"):
				result = A+B;
				break;
			case("-"):
				result = A-B;
				break;
			case("*"):
				result = A*B;
				break;
			case("/"):
				result = A/B;
				break;
			case("%"):
				result = A%B;
				break;
			}
			System.out.printf("%d", result);  //Tampilkan hasil
		}catch (Exception e) {
			System.out.println("something error");
		}

	}

}
