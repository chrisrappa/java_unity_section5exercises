public class BankAccount {

  long accountNumber;
  double accountBalance;
  String customerName;
  String customerEmail;
  String customerPhoneNumber;

  public BankAccount(long accountNumber,
                     double accountBalance,
                     String customerName,
                     String customerEmail,
                     String customerPhoneNumber){
    this.accountNumber = accountNumber;
    this.accountBalance = accountBalance;
    this.customerName = customerName;
    this.customerEmail = customerEmail;
    this.customerPhoneNumber = customerPhoneNumber;
  }

  public double depositMoney(double depositAmount){
    this.accountBalance += depositAmount;
    return (this.accountBalance);
  }

  public double withdrawMoney(double withdrawAmount) {
    if (this.accountBalance - withdrawAmount < 0) {
      System.out.println("Not enough funds");
    }
    return (this.accountBalance - withdrawAmount);
  }

  public long getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(long accountNumber) {
    this.accountNumber = accountNumber;
  }

  public double getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(long accountBalance) {
    this.accountBalance = accountBalance;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public String getCustomerPhoneNumber() {
    return customerPhoneNumber;
  }

  public void setCustomerPhoneNumber(String customerPhoneNumber) {
    this.customerPhoneNumber = customerPhoneNumber;
  }


}
