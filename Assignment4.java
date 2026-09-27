import java.util.Scanner;

public class Assignment4 {
    public static void main(String []agre){

       int PhonePrice = 18000, numberOfInstallment, installmentPerMonth;

       Scanner scanner = new Scanner(System.in);

       System.out.print("Number of installments is: ");
       numberOfInstallment = scanner.nextInt();


       installmentPerMonth = PhonePrice / numberOfInstallment;
       

       System.out.println("Monthly installment Amount: "+installmentPerMonth+"euros");

    }
}
