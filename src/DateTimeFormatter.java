import java.time.LocalDateTime;
import java.util.Scanner;

public class DateTimeFormatter {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String[] data = sc.nextLine().split(" ");
        int hours = Integer.parseInt(data[0]);
        int minutes = Integer.parseInt(data[1]);
        sc.close();

        LocalDateTime dateTime = LocalDateTime.parse(date);
        dateTime = dateTime.minusHours(hours).plusMinutes(minutes);

        if (date.length() == 19) {
            System.out.println(dateTime.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")));
        } else {
            System.out.println(dateTime.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        }
    }
}
