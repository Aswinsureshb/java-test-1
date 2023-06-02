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

        String[] Loan_type = { "home", "car", "gold", "study", "business", "Quit" };
        double[] Interest = { 4.2 / 100, 3.9 / 100, 5.2 / 100, 2.8 / 100, 5.8 / 100, -1 };
        String Loan;
        double rate;
        double income = 80000;
        double annual_income = 0;
        double Total_loan1 = 0;
        double Total_loan2 = 0;
        double Total_loan = 0;
        double installment1 = 0;
        double installment2 = 0;
        double amount1 = 0;
        double amount2 = 0;
        int loan_type1 = 0;
        int loan_type2 = 0;
        double Amount = amount1 + amount2;
        double installment = installment1 + installment2;
        double payment_amount1 = 0;
        double payment_amount2 = 0;
        double payment_amount = 0;

        System.out.println("Enter your family annual income");
        annual_income = input.nextDouble();
        if (annual_income < income) {
            System.out.print("You are not eligible to get the loan from RPG Loan Providers.");

        } else {
            try {
                while (true) {
                    System.out.println("Select at least 2 loans from the list. Press enter after each selection");
                    loan_type1 = input.nextInt();
                    loan_type2 = input.nextInt();
                    if ((loan_type1 > 0 && loan_type1 <= 6) & (loan_type2 > 0 && loan_type2 <= 6)) {
                        break;
                    } else {
                        System.out.println("Input Invalid");
                    }
                }
                while (true) {
                    System.out
                            .println("Enter the number of monthly installments(minimum 6 months to maximum 60 months)");
                    System.out.print("1: ");
                    installment1 = input.nextDouble();
                    System.out.print("2: ");
                    installment2 = input.nextDouble();
                    if ((installment1 <= 60 && installment1 >= 6 && installment1 == 0)
                            & (installment2 <= 60 && installment2 >= 6 && installment2 == 0)) {
                        break;
                    } else {
                        throw new Error("Please enter a value within the specified range");
                    }
                }

                System.out.println("Enter the amounts to take as the loan");
                System.out.print("Amount 1: ");
                amount1 = input.nextDouble();
                System.out.print("Amount 2: ");
                amount2 = input.nextDouble();

                Loan = Loan_type[loan_type1 - 1];
                Loan = Loan_type[loan_type1 - 1];
                rate = Interest[loan_type2 - 1];
                rate = Interest[loan_type2 - 1];

                Total_loan1 = amount1 + rate * amount1;
                payment_amount1 = Total_loan1 / installment1;

                Total_loan2 = amount2 + rate * amount2;
                payment_amount2 = Total_loan2 / installment2;

                Total_loan = Total_loan1 + Total_loan2;
                payment_amount = payment_amount1 + payment_amount2;

                if (amount1 > 500000 || amount2 > 500000 || Amount > 500000) {
                    rate -= 0.1 / 100;
                }

            } catch (Exception e) {
                System.out.println("Input Invalid");
            }

            System.out.println("The total amount for Loan1: " + Total_loan1);
            System.out.println("Payment installment amount for loan1: " + payment_amount1);
            System.out.println("The total amount for Loan2: " + Total_loan2);
            System.out.println("Payment installment amount for loan2: " + payment_amount2);

        }

    }

}
