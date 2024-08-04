public class DayTen {
        public static void main(String[] args) {
        String input = "00000123569";
        String output = removeLeadingZeros(input);
        System.out.println("Output: " + output);
    }
  public static String removeLeadingZeros(String str) {
         int index = 0;
        while (index < str.length() && str.charAt(index) == '0') {
            index++;
        }
        if (index == str.length()) {
            return "0";
        }
        return str.substring(index);
    }
}
