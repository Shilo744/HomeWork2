import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        String firstText, secondText;
        firstText = "i like to contain";
        secondText = "i like to be contained";
        System.out.println("firstText contain secondText is " + checkStringInside(firstText, secondText));
    }
    public static boolean checkStringInside(String firstText, String secondText) {
        if (secondText.length() > firstText.length()) {
            return false;
        }
        int counter=0;
        for (int i = 0; i < firstText.length(); i++) {
            if (firstText.charAt(i) == secondText.charAt(counter)) {
                if (counter + 1 == secondText.length()){
                   return true;
                }
                else
                {
                    counter++;
                }}
            else
            {
                counter = 0;
            }}
        return false;
        }}