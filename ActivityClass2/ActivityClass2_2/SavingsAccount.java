/*Document build by Debora Bastos ID 6213122
 * November 27th, 2022
 */

package ActivityClass2_2;

public class SavingsAccount {

  static private double annualInterestRate;
  private double savingBalance;

  public SavingsAccount(double savingBalance) {
    this.savingBalance = savingBalance;
  }

  public double getSavingBalance() {
    return this.savingBalance;
  }

  public static void modifyInterestRate(double newInterestRate) {
    annualInterestRate = newInterestRate;
  }

  public void getMonthlyInterest() {
    double monthlyInterest;
    monthlyInterest = (double) (this.savingBalance * annualInterestRate / 12);
    this.savingBalance += monthlyInterest;
  }
}