import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Formatter {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        String date = input.nextLine();
        int minutes = input.nextInt();
        input.close();

        LocalDateTime dateTime = LocalDateTime.parse(date);
        LocalDateTime updateDateTime = dateTime.plusMinutes(minutes);

        String pattern = updateDateTime.getSecond() == 0 ? "yyyy D HH:mm" : "yyyy D HH:mm:ss";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        System.out.println(updateDateTime.format(formatter));
    }
}
