import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExerciseDateTimeFormatter {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String[] data = sc.nextLine().split(" ");
        int hours = Integer.parseInt(data[0]);
        int minutes = Integer.parseInt(data[1]);
        sc.close();

        LocalDateTime dateTime = LocalDateTime.parse(date, date.length() == 19 ? DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss") : DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm"));
        dateTime = dateTime.minusHours(hours).plusMinutes(minutes);

        System.out.println(dateTime);
    }
}
