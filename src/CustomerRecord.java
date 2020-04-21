/*
A program is required to read a customer’s name, a purchase amount and a tax code.
        The tax code has been validated and will be one of the following:
        0  tax exempt (0%)
        1  state sales tax only (3%)
        2  federal and state sales tax (5%)
        3  special sales tax (7%)
        The program must then compute the sales tax and
            the total amount due, and print the customer’s name,
            purchase amount, sales tax and total amount due.

Pseudocode:
import Scanner
declare method
declare vars for scanner, 0 tax, state, fed and state, special tax,
    applicable tax, total due, customer name
Get input for name, purchase amount, tax rate and initial vars
calculate vars
print customer's name
    purchase amount
    sales tax
    total amount
 */

import java.util.Scanner;

public class CustomerRecord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int taxCode;
        double exemptedTax, stateTax, fedAndStateTax, specialTax,
                purchaseAmount, applicableTaxRate, taxPercentage,
                applicableTaxAmount, total;
        exemptedTax = 0.00;
        stateTax = 0.03;
        fedAndStateTax = 0.05;
        specialTax = 0.07;

        System.out.println("Please enter your name.");
        name = input.nextLine();
        System.out.println("Now enter your purchase amount.");
        purchaseAmount = input.nextDouble();
        System.out.println("Lastly, enter a tax code: \n" +
                "'0' for tax exempt.\n" +
                "'1' for state sales tax only.\n" +
                "'2' for federal and state sales tax .\n" +
                "'3' for special sales tax.");
        taxCode = input.nextInt();
        switch (taxCode) {
            case 0:
                taxPercentage = exemptedTax;
                break;
            case 1:
                taxPercentage = stateTax;
                break;
            case 2:
                taxPercentage = fedAndStateTax;
                break;
            default:
                taxPercentage = specialTax;
                break;
        }
        applicableTaxAmount = purchaseAmount * taxPercentage;
        applicableTaxRate = taxPercentage * 100;
        total = purchaseAmount + applicableTaxAmount;

        System.out.printf("%s, your purchase amount was $%.2f taxed at %.2f%%.\n" +
                "Your total is $%.2f.", name, purchaseAmount, applicableTaxRate, total);
    }

}
