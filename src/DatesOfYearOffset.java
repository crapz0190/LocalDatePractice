import java.time.LocalDate;
import java.util.Scanner;

public class DatesOfYearOffset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Leer la fecha de inicio (ISO format: YYYY-MM-DD)
        String inputDate = scanner.next();
        LocalDate date = LocalDate.parse(inputDate);

        // 2. Leer el desplazamiento (offset)
        int offset = scanner.nextInt();

        // 3. Guardar el año inicial para la condición de parada
        int initialYear = date.getYear();

        // 4. Bucle: imprimir mientras sigamos en el mismo año
        while (date.getYear() == initialYear) {
            // Imprimir la fecha actual
            System.out.println(date);

            // Sumar el desplazamiento para la siguiente iteración
            date = date.plusDays(offset);
        }
    }
}
