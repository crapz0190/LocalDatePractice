import java.time.LocalDate;
import java.util.Scanner;

class ConvertNumbersToDays {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        LocalDate[] dates = new LocalDate[3];

        for (int day = 0; day < dates.length; day++) {
            LocalDate date = LocalDate.ofYearDay(year, input.nextInt());
            dates[day] = date;
        }

        for (int day = 0; day < dates.length; day++) {
            System.out.println(dates[day]);
        }
    }
}
