public class Customer {

  private String name;
  private int age;
  private int wallet;

  public Customer(String name, int age, int wallet){
    this.name = name;
    this.age = age;
    this.wallet = wallet;
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
    if(money > atm.getMaxWithdrawl()){
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