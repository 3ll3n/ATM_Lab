public class Atm {

  private String location;
  private int totalMoney;
  private int dailyLimit;

  public Atm(String location, int totalMoney, int dailyLimit){
    this.location = location;
    this.totalMoney = totalMoney;
    this.dailyLimit = dailyLimit;
  } 

  public String getLocation(){
    return this.location;
  }

  public int getTotalMoney(){
    return this.totalMoney;
  }

  public int getDailyLimit(){
    return this.dailyLimit;
  }

  public void reduceTotalMoney(int money){
    this.totalMoney -= money;
  }

  public void fillUpAtm(int money){
    this.totalMoney += money;
  }


}