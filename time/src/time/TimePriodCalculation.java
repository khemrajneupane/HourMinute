package time;



import java.util.Scanner;

public class TimePriodCalculation {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			TimePeriod period = new TimePeriod(0, 0);

			System.out.print("Enter hours to add: ");
			int hours = input.nextInt();

			System.out.print("Enter minutes to add: ");
			int minutes = input.nextInt();

			period.addHours(hours);
			period.addMinutes(minutes);

			if (period.getMinutes() >= 60) {
				int hrs = 0;
				int min = 0;
				hrs = period.getHours() + period.getMinutes() / 60;
				min = period.getMinutes() % 60;
				period.setHours(hrs);
				period.setMinutes(min);
				System.out.println(period);
			} else {
				System.out.println(period);
			}

			System.out.println();

			input.close();
		}
	}
