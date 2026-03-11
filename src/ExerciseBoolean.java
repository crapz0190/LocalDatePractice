import java.time.LocalDate;
import java.util.Scanner;

public class ExerciseBoolean {
    public static void main(String[] args) {
        option1();
    }

    public static void option1() {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int dayOfYear = scanner.nextInt();
        scanner.close();

        // 1. Creamos un objeto LocalDate basado en el año y el número de día
        LocalDate date = LocalDate.ofYearDay(year, dayOfYear);

        // 2. Simplemente verificamos si el día del mes es 1
        if (date.getDayOfMonth() == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void option2() {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int dayOfYear = scanner.nextInt();
        scanner.close();

        // 1. Determinar si es año bisiesto
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // 2. Días que tiene cada mes
        int[] daysInMonths = {
                31, isLeap ? 29 : 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        // 3. Verificar si el día coincide con el inicio de algún mes
        boolean isFirstDay = false;
        int currentCheckDay = 1; // El primer día del año siempre es el 1 de enero

        for (int days : daysInMonths) {
            if (dayOfYear == currentCheckDay) {
                isFirstDay = true;
                break;
            }
            // Sumamos los días del mes actual para encontrar el inicio del siguiente
            currentCheckDay += days;
        }

        System.out.println(isFirstDay);
    }
}
