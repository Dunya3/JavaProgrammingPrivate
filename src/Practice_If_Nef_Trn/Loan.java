package Practice_If_Nef_Trn;

public class Loan {
    public static void main(String[] args) {

      int salary = 45000;
      int creditScore = 730;

      String results = (salary > 60000 && creditScore > 650)? "\"Loan Approved\" " : "Loan Denied";

        System.out.println(results);




    }
}
/*
6. Create a class called Loans,
Given two variables salary and credit score,
 use those given info to determine if you can get a loan.

                To be approved for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.

 */