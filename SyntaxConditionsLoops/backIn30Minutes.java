import java.util.Scanner;

public class backIn30Minutes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int hours = Integer.parseInt(input.nextLine());
        int minutes = Integer.parseInt(input.nextLine()) + 30;

        if (minutes >= 60) {
            minutes = minutes - 60;
            ++hours;
            if (hours == 24) {
                hours = 0;
            }
        }
        System.out.printf("%d:%02d", hours, minutes);
    }
}
