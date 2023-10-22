import java.util.Scanner;
import java.util.regex.Pattern;
public class Reggie {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String social = SafeInput.getRegExString(in, "Enter your social security number", "^\\d{3}-\\d{2}-\\d{4}$");
        String mNum = SafeInput.getRegExString(in, "Enter your M Number", "^(M|m)\\d{7}$");
        String menu = SafeInput.getRegExString(in, "Enter menu choice", "^[OoSsVvQq]$");
        System.out.println("Your social security number is " + social + " and your M number is " + mNum + ". You selected " + menu);
    }
}
