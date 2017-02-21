public class Atm {

  private String location;
  private int totalMoney;
  private int maxWithdrawal;

  public Atm(String location, int totalMoney, int maxWithdrawal){
    this.location = location;
    this.totalMoney = totalMoney;
    this.maxWithdrawal = maxWithdrawal;
  } 

  public String getLocation(){
    return this.location;
  }

  public int getTotalMoney(){
    return this.totalMoney;
  }

  public int getMaxWithdrawal(){
    return this.maxWithdrawal;
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