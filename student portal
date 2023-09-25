import java.util.Scanner;
import java.text.DecimalFormat;

public class dd{
  public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    DecimalFormat format = new DecimalFormat("R #,#00.00");

    int PIN_CODE = 2020;
    int STUDENT_NUM = 230040869;
    int iPin,iChoice,new_Pin,iStudentNo,iChoice2;
    double iMaths = 78;
    double iCAP = 80;
    double iCOH = 67;
    double iPPA = 89;
    final double rAllowance = 89900;
    double rAccomodation = 45000;
    double rTution = 23000;
    double rBookAllowance = 5400;
    double rMonthlyAllowance = 1650;
    double rAvrg, rBalance;
    char cAnswer;

    System.out.print("\t----STUDENT PORTAL----\t");
    System.out.print("\nplease enter your pin: ");
    iPin = sc.nextInt();

    System.out.print("\nplease enter your student number: ");
    iStudentNo = sc.nextInt();

    while(iPin != PIN_CODE){
      System.out.print("\n----incorrect pin try again------\n");
      iPin = sc.nextInt();
    }
    while(iStudentNo != STUDENT_NUM ){
      System.out.print("\n-----incorrect student number-----\n");
      iStudentNo = sc.nextInt();
    }
    do {
      System.out.print("\t-----MAIN MENU------\n");
      System.out.print("\n[1]Check Results");
      System.out.print("\n[2]Calculate Avarage");
      System.out.print("\n[3]Change Pin");
      System.out.print("\n[4]Check account Balance");
      System.out.print("\n[5]Quit \n? ");
      iChoice = sc.nextInt();

      switch(iChoice){
        case 1:
         System.out.print("-----Checking Results------");
         System.out.print("\nyour maths marks are: "+ iMaths);
         System.out.print("\nyour CAP Marks are: " + iCAP);
         System.out.print("\nyour COH Marks are: "+ iCOH);
         System.out.print("\nyour PPA Marks are: "+ iPPA);
         break;

         case 2:
         System.out.print("\t------Calculate Avarage------\t");
         rAvrg = (iMaths + iCAP + iCOH + iPPA) / 4;
         System.out.print("\nyour Avarage is: "+ rAvrg);
         break;

         case 3:
         System.out.print("\t------Change Pin-----\t");
         System.out.print("\nplease enter new pin: ");
         new_Pin = sc.nextInt();

         if (new_Pin != iPin){
           System.out.print("\nyour new pin has been saved\n");
           System.out.print("\nplease enter new pin to continue: ");
           new_Pin = sc.nextInt();

           iPin = new_Pin;
           System.out.print("\nPlease enter the new pin again to confirm: ");
         int confirm_Pin = sc.nextInt();

         if (confirm_Pin == iPin) {
             System.out.print("\nPin successfully updated.\n");
           }

         } else {
           System.out.print("\npin is the same as old pin");
         }
         break;

         case 4:
         System.out.print("\t-----Balance-----\t");
         System.out.print("\nAre you an Nsfas Beneficiary? ");
         cAnswer = sc.next().charAt(0);

         if (cAnswer == 'y'){
           System.out.print("you have been award "+ format.format(rAllowance));
           rBalance = rAllowance - rAccomodation - rTution - rBookAllowance;

           System.out.print("\nwhich month are we on?\t  \n[1]February\n[2]March\n[3]April\n[4]May\n[5]June\n[6]July\n[7]August\n[8]September\n[9]October\n[10]November\n? ");
           iChoice2 = sc.nextInt();

           switch(iChoice2){
             case 1:
             rBalance -= rMonthlyAllowance;
             System.out.print("\nyour balance is: " +format.format(rBalance));
             break;

             case 2:
             rBalance -= (rMonthlyAllowance *2);
              System.out.print("\nyour balance is: " + format.format(rBalance));
              break;

              case 3:
              rBalance -= (rMonthlyAllowance *3);
               System.out.print("\nyour balance is: "+format.format(rBalance));
               break;

               case 4:
               rBalance -= (rMonthlyAllowance *4);
                System.out.print("\nyour balance is: "+format.format(rBalance));
                break;

                case 5:
                rBalance -= (rMonthlyAllowance *5);
                 System.out.print("\nyour balance is: "+format.format(rBalance));
                 break;

                 case 6:
                 rBalance -= (rMonthlyAllowance *6);
                  System.out.print("\nyour balance is: "+format.format(rBalance));
                  break;

                  case 7:
                  rBalance -= (rMonthlyAllowance *7);
                   System.out.print("\nyour balance is: "+format.format(rBalance));
                   break;

                   case 8:
                   rBalance -= (rMonthlyAllowance *8);
                    System.out.print("\nyour balance is: "+format.format(rBalance));
                    break;

                    case 9:
                    rBalance -= (rMonthlyAllowance *9);
                     System.out.print("\nyour balance is: "+format.format(rBalance));
                     break;

                     case 10:
                     rBalance -= (rMonthlyAllowance *10);
                      System.out.print("\nyour balance is: "+format.format(rBalance));
                      break;
                      default:
                      System.out.print("----invalid option-----");
           }
         } else {
           System.out.print("\nplease check on the website for your avail balance");
         }
         break;
         case 5:
         System.out.print("\t-----GOODBYE-----\t");
         break;

         default:
         System.out.print("\t-----invalid option-----\t");
         break;
      }
    } while ( iChoice != 5);
  }
}
