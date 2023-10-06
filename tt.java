import java.util.Scanner;
import java.text.DecimalFormat;

public class ss{
  public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    String pattern = "R #,##0.00";

    DecimalFormat format = new DecimalFormat(pattern);

    final int PIN_CODE = 2023;
    double rBalance = 2500;
    int iChoice,iPin;
    double rWithdrawal,rDeposit;

    System.out.println("\n==============================");
    System.out.println("\tTransaction account");
    System.out.println("==============================\n");

    System.out.print("Enter your account pin: ");
    iPin = sc.nextInt();

    while(iPin != PIN_CODE){
      System.out.println("incorrect pin - try again");
      iPin = sc.nextInt();

    }
    System.out.println("pin is correct");

    do {
      System.out.println("=============MENU=================");
      System.out.println("[1] Check Balance");
      System.out.println("[2] Deposit cash");
      System.out.println("[3] withdraw cash");
      System.out.println("[4] quit\n?");

      iChoice = sc.nextInt();

      switch(iChoice){
        case 1:
        System.out.println("\n----Checking Balance----\n");
        System.out.println("Balance  :  "+ format.format(rBalance) + "\n");
        break;

        case 2:
        System.out.println("\n----Deposit Cash----\n");
        System.out.print("How much do you wanna Deposit? R");
        rDeposit = sc.nextDouble();
        if(rDeposit > 0){
          rBalance += rDeposit ;
          System.out.println(format.format(rDeposit) + "successfully deposited.\n");
        }
        else {
          System.out.println("----Deposit failed!\n");
        }
        break;

        case 3:
        System.out.println("\n----withdrawal----\n");
        System.out.print("How much do you wanna withdraw? ");
        rWithdrawal = sc.nextDouble();
        if(rWithdrawal <= rBalance){
          rBalance -= rWithdrawal;
          System.out.println(format.format(rWithdrawal) + "successfully withdrawn\n");
        } else{
          System.out.println("----withdrawal failed!\n");
        }
        break;

        case 4:
        System.out.println("----goodbye!----");
        break;

        default:
          System.out.println("\n-----invalid choice!\n");
      }
    }while(iChoice != 4);
  }
}
