import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();
        String thePhoneIs = correctPhoneNumber(phoneNumber);
        System.out.println(thePhoneIs);
    }
    public static String correctPhoneNumber(String phoneNumber){
        int i;
        String line = "-";
        String wrongNumber = " ";
        String thePhoneNumber;
        String regularPrefix = "05";
        for(i=0;i<phoneNumber.length();i++){
        if (phoneNumber.charAt(i)!='0'&& phoneNumber.charAt(i)!='1'&& phoneNumber.charAt(i)!='2'&& phoneNumber.charAt(i)!='3'&&phoneNumber.charAt(i)!='4'&&phoneNumber.charAt(i)!='5'&&phoneNumber.charAt(i)!='6'&&phoneNumber.charAt(i)!='7'&&phoneNumber.charAt(i)!='8'&&phoneNumber.charAt(i)!='9'&&phoneNumber.charAt(i)!='-'){
         phoneNumber=wrongNumber;
        }}
         if (phoneNumber.length() > 12 | phoneNumber.length() < 10) {
            thePhoneNumber = wrongNumber;
        }
        else if (phoneNumber.charAt(0) == '9' && phoneNumber.charAt(1) == '7' && phoneNumber.charAt(2) == '2' && phoneNumber.length() == 12){
            thePhoneNumber = regularPrefix + phoneNumber.charAt(4) + line +
             phoneNumber.charAt(5) + phoneNumber.charAt(6) + phoneNumber.charAt(7) + phoneNumber.charAt(8) + phoneNumber.charAt(9)+ phoneNumber.charAt(10)+ phoneNumber.charAt(11);}
        else if (phoneNumber.charAt(0) == '0' && phoneNumber.charAt(1)=='5' && phoneNumber.length() == 10){
            thePhoneNumber = regularPrefix + phoneNumber.charAt(2) + line +
            phoneNumber.charAt(3) + phoneNumber.charAt(4) + phoneNumber.charAt(5) + phoneNumber.charAt(6) + phoneNumber.charAt(7) + phoneNumber.charAt(8) + phoneNumber.charAt(9);}
        else if (phoneNumber.charAt(0) == '0' && phoneNumber.length() == 11){
            thePhoneNumber = phoneNumber;}
        else {
            thePhoneNumber = wrongNumber;}
        return thePhoneNumber;
    }}
