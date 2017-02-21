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

  public String reduceTotalMoney(int money){
    if(money > getTotalMoney()){
      return "Unable to complete this transaction";
    }
    this.totalMoney -= money;
    return "Please take your funds";
  }

  public void fillUpAtm(int money){
    this.totalMoney += money;
  }

}