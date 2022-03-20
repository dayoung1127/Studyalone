import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.close();
		for(int j = 0; j < i; j++) {
			for(int k = 0; k < (i - 1 - j); k++) {
				System.out.print(" ");
			}
			for(int y = 0; y < (j + 1); y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
