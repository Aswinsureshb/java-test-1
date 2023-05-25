import java.util.Scanner;

public class RPGLoan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("RPG LOAN PROVIDERS");
        System.out.println("Loan Type           Interest Rate");
        System.out.println("1. Home Loan        4.2%");
        System.out.println("2. Car Loan         3.9%");
        System.out.println("3. Gold Loan        5.2%");
        System.out.println("4. Study Loan       2.8%");
        System.out.println("5. Business Loan    5.8%");
        System.out.println("6. Exit");

        double income = 80000;
        double annual_income = 0;
        int loan1 = 0;
        int loan2 = 0;
        double installment1 = 0;
        double installment2 = 0;
        double amount1 = 0;
        double amount2 = 0;
        double total_loan = loan1 + loan2;

        System.out.println("Enter your family annual income");
        annual_income = input.nextDouble();
        if (annual_income < income) {
            System.out.print("You are not eligible to get the loan from RPG Loan Providers.");
        } else {
            try {
                System.out.println("Select at least 2 loans from the list. Press enter after each selection");
                loan1 = input.nextInt();
                loan2 = input.nextInt();
                if (  loan1 < 1 || loan1 > 6 || loan2 < 1|| loan2 > 6 ) {
                    throw new Error("Input invalid Try again");
                }
            
                System.out.println("Enter the number of monthly installments(minimum 6 months to maximum 60 months)");
                System.out.print("1: ");
                installment1 = input.nextDouble();
                System.out.print("2: ");
                installment2 = input.nextDouble();
                System.out.println("Enter the amounts to take as the loan");
                System.out.print("Amount 1: ");
                amount1 = input.nextDouble();
                System.out.print("Amount 2: ");
                amount2 = input.nextDouble();
            } catch (Exception e) {
                System.out.println("Input Invalid");
            }
            

        }

    }

}