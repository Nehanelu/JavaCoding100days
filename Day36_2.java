import java.util.regex.*;

public class Day36_2 {
    
    public boolean isNumber(String s) {
        String regex = "^[+-]?((\\d+\\.?\\d*)|(\\.\\d+))([eE][+-]?\\d+)?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}
