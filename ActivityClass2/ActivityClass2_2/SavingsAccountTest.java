/*Document build by Debora Bastos ID 6213122
 * November 27th, 2022
 */

package ActivityClass2_2;

public class SavingsAccountTest {

  public static void main(String[] args) {

    SavingsAccount saver1, saver2;
    saver1 = new SavingsAccount(2000.0);
    saver2 = new SavingsAccount(3000.0);

    SavingsAccount.modifyInterestRate(0.04);

    saver1.getMonthlyInterest();
    saver2.getMonthlyInterest();

    System.out.println("This month:\nSaver 1 balance= " + saver1.getSavingBalance());
    System.out.println("Saver 2 balance= " + saver2.getSavingBalance());

    SavingsAccount.modifyInterestRate(0.05);

    saver1.getMonthlyInterest();
    saver2.getMonthlyInterest();
    System.out.println("Next month:\nSaver 1 balance= " + saver1.getSavingBalance());
    System.out.println("Saver 2 balance= " + saver2.getSavingBalance());

  }

}
