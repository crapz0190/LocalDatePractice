import java.time.LocalDate;
import java.util.Scanner;

public class BeforeAfter {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        LocalDate today = LocalDate.parse(input.nextLine());

        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        int offSet = 30;

        int yearBefore = year - offSet;
        int yearAfter = year + offSet;

        LocalDate before = LocalDate.of(yearBefore, month, day);
        LocalDate after = LocalDate.of(yearAfter, month, day);

        System.out.println(before);
        System.out.println(after);
    }
}
