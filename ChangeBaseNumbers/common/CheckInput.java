package ChangeBaseNumbers.common;
import java.util.regex.Pattern;

public class CheckInput{
    public int checkInput16(String input) {
        Pattern p16 = Pattern.compile("^[0-9A-F]+$");
        if (p16.matcher(input).find()) {
            return 1; 
        }
        return 0;
    }

      public int checkInput2(String input) {
        Pattern p2 = Pattern.compile("^[01]+$");
        if (p2.matcher(input).find()) {
            return 1;
        }
        return 0;
    }

    public int checkInput10(String input) {
        Pattern p10 = Pattern.compile("^[0-9]+$");
        if (p10.matcher(input).find()) {
            return 1;
        }
        return 0;
    }

    public void getString(int a, String input){
        if (a == 2) {
            
        }
    }

    



}
