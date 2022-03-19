import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int day = scanner.nextInt();

		int daysInMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		String days[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		for(int i = 0; i < month - 1; i++) {
			day += daysInMonth[i];
		}
		System.out.println(days[day % 7]);
		
	}

}
