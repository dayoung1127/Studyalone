import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 1; i < num + 1; i++) {
			for(int k = 0; k < i - 1; k++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2 * num + 1 - (2 * i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int y = 1; y < num ; y++) {
			for(int r = 0; r < num - 1 - y; r++) {
				System.out.print(" ");
			}
			for(int t = 0; t < (y * 2) + 1; t++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
