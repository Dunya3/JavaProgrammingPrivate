package day23_CustomMethods_Void;

public class EligibleToVoteTask {
    public static void main(String[] args) {
       eligibleToVote(23,"USA");
    }

    public static void eligibleToVote(int age,String Country){
        if(age>21 && Country.equals("USA")){
            System.out.println("You are eligible");
        }else {
            System.out.println("You are not eligible");
        }
    }

}