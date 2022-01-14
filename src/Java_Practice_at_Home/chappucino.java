package Java_Practice_at_Home;

public class chappucino {
    public static void main(String[] args) {


        String size = "Grande";
        String result = "";

        if(size == "Grande" || size== "Venti" || size == "Tall"){

        switch (size) {
            case "Tall":
                result = "Price is $3.69" + "\n 90 calories";
                break;

            case "Grande":
                result = "Price is $3.99" + "\n 120 calories";
                break;

            case "Venti":
                result = "Price is $4.29" + "\n 150 calories";
                break;

            default:
                result = "Invalid size";


        }
        System.out.println(result);
    }}}
