import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int day = 0;
        int year = SafeInput.getRangedInt(in, "What year were you born?", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "What month were you born?", 1, 12);
        day = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> SafeInput.getRangedInt(in, "What day were you born?", 1, 31);
            case 4, 6, 9, 11 -> SafeInput.getRangedInt(in, "What day were you born?", 1, 30);
            case 2 -> SafeInput.getRangedInt(in, "What day were you born?", 1, 28);
            default -> day;
        };
        int hour = SafeInput.getRangedInt(in, "What hour were you born?", 1, 24);
        int minute = SafeInput.getRangedInt(in, "What minute were you born?", 1, 59);

        System.out.println("Your birthday is " + month + "/" + day + "/" + year + " and your time of birth is " + hour + ":" + minute + ".");
    }
}
