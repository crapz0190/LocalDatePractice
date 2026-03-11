import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class FindAllMondays {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        int month = input.nextInt();

        LocalDate date = LocalDate.of(year, month, 1);

        // 3. Iterar por todos los días del mes
        // Verificamos que sigamos en el mismo mes con date.getMonthValue()
        while (date.getMonthValue() == month) {

            // 4. Si el día actual es Lunes (MONDAY), lo imprimimos
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(date);
            }

            // 5. Avanzamos al siguiente día
            date = date.plusDays(1);
        }

    }
}
