package String_Loop_Practice;
import java.util.Scanner;
public class Smsmassage {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    String message = scan.nextLine();



    String sender;
    String phoneNumber;
    String messageBody;

    sender = message.substring(message.indexOf(":<")+2,message.indexOf(">."));
    phoneNumber=message.substring(message.indexOf(":[")+2,message.indexOf("]."));
    messageBody=message.substring(message.indexOf(":{")+2,message.indexOf("}"));

        System.out.println("Sender: " + sender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Message body: " + messageBody);
}}
