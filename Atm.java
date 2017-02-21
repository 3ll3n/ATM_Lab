public class Atm {

  private String location;
  private int totalMoney;
  private int maxWithdrawl;

  public Atm(String location, int totalMoney, int maxWithdrawl){
    this.location = location;
    this.totalMoney = totalMoney;
    this.maxWithdrawl = maxWithdrawl;
  } 

  public String getLocation(){
    return this.location;
  }

  public int getTotalMoney(){
    return this.totalMoney;
  }

  public int getMaxWithdrawl(){
    return this.maxWithdrawl;
  }

  public void reduceTotalMoney(int money){
    this.totalMoney -= money;
  }

  public void fillUpAtm(int money){
    this.totalMoney += money;
  }

}