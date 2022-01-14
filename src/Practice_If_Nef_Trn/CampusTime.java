package Practice_If_Nef_Trn;

public class CampusTime {

    public static void main(String[] args) {

        int time = 15;// 1~24
        String result = "";

        if (time >= 8 && time <= 23){
         result = "Open";
        }else if (time >= 23 && time <= 8){
            result = "Closed";

        }else{
            result = "not valid";
        }
        System.out.println(result);










    }}
/*
  Create a class called CampusTime,
  an integer variable named time is given with a number between 1~24 has been initialized,
  write a program that can find out if the campus is open or not.
  Campus is open from 8 am(8) to 11 pm (23)
  If user enters a time within the open time they should see message:
  “open”  but if the time entered is outside off operating hours they should see: “ closed”


 */