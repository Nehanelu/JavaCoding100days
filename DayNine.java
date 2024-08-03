
public class DayNine {
    public static void main(String[] args) {
        String str = "Geeks";
        String reversedStr = reverseString(str);
        System.out.println("Reversed string: " + reversedStr);
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        String reversedStr = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedStr += charArray[i];
        }
        return reversedStr;
    }
}
