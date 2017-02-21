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

  public void withdrawMoney(int money){
    this.wallet += money;
  }

  public void spendMoney(int money){
    this.wallet -= money;
  }

}