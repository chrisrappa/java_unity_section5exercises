public class VIPCustomer {




  String name;
  String emailAddress;
  int creditLimit;


  public VIPCustomer(){
    this("John Doe", "johndoe@gmail.com", 9999);
  }

  public VIPCustomer(String name, String emailAddress){
    this(name, emailAddress, 0);
  }

  public VIPCustomer(String name, String emailAddress, int creditLimit) {
    this.name = name;
    this.emailAddress = emailAddress;
    this.creditLimit = creditLimit;
  }

  public String getName() {
    return name;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public int getCreditLimit() {
    return creditLimit;
  }


}

