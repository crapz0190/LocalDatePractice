import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class DurationTime {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        sc.close();
        LocalDateTime dateTime = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
        LocalDateTime startYear = LocalDateTime.parse("2017-01-01T00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));

        Duration duration = Duration.between(startYear, dateTime);
        long hours = duration.toHours();

        System.out.println(hours);

    }
}
