public class Atm {

  private String location;
  private int total_money;
  private int daily_limit;

  public Atm(String location, int total_money, int daily_limit){
    this.location = location;
    this.total_money = total_money;
    this.daily_limit = daily_limit;
  } 

  public String getLocation(){
    return this.location;
  }


}