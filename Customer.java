public class Customer {

  private String name;
  private int age;
  private int wallet;
  private Account account;

  public Customer(String name, int age, int wallet, Account account){
    this.name = name;
    this.age = age;
    this.wallet = wallet;
    this.account = account;
  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public int getBalance(){
    return this.wallet;
  }

  public String withdrawMoney(int money, Atm atm){
    if(money > atm.getMaxWithdrawal()){
      return "Over daily limit";
    }
    this.wallet += money;
    atm.reduceTotalMoney(money);
    return "Here's yer money";
  }

  public void depositMoney(int money){
    this.wallet -= money;
  }

}