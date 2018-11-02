package time;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TimePriodCalculation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		TimePeriod period = new TimePeriod(0, 0, 0, 0);

		System.out.println(
				"=======You are converting amount of hours and minutes to display total numbers of days, hours and minutes: =======");
		try {
			System.out.print("Enter any number of hours to add: ");
			int hours = input.nextInt();

			System.out.print("Enter any number of minutes to add: ");
			int minutes = input.nextInt();

			period.addHours(hours);
			period.addMinutes(minutes);

			int hrs = 0;
			int min = 0;
			int days = 0;
			int weeks = 0;
			if (!(hours < 0) && !(minutes < 0)) {
				if (period.getMinutes() >= 60) {
					hrs = period.getHours() + period.getMinutes() / 60;
					min = period.getMinutes() % 60;
					period.setHours(hrs);

					if (hrs >= 24) {
						days = hrs / 24;
						period.addDays(days);
						period.setDays(days);

						if (days >= 7) {
							weeks = days / 7;
							period.addWeeks(weeks);
							period.setWeeks(weeks);
							days = days % 7;
							period.setDays(days);
						}

						hrs = hrs % 24;
						period.setHours(hrs);

					}
					period.setMinutes(min);
					System.out.println(period);

				}

				else {
					System.out.println(period);
				}
			} else {
				System.out.print("Inputs cannot be negative integer!");
			}
			System.out.println();

			input.close();
		} catch (InputMismatchException ime) {
			System.out.println("Invalid number format");
		}

	}
}
