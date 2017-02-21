import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class AtmTest{

  Atm atm1;
  Atm atm2;


  @Before
  public void before(){

    atm1 = new Atm("Main Street", 500, 250);
    atm2 = new Atm("High Street", 300, 250);
  }

  @Test
  public void testGetLocation(){
    assertEquals("Main Street", atm1.getLocation());
  }

  @Test 
  public void testGetTotalMoney(){
    assertEquals(500, atm1.getTotalMoney());
  }

  @Test
  public void testGetMaxWithdrawal(){
    assertEquals(250, atm1.getMaxWithdrawal());
  }

  @Test
  public void testReduceTotalMoney(){
    atm1.reduceTotalMoney(100);
    assertEquals(400, atm1.getTotalMoney());
  }

  @Test
  public void testFillUpAtm(){
    atm1.fillUpAtm(250);
    assertEquals(750, atm1.getTotalMoney());
  }

  @Test
  public void testDepletedReserves(){
    assertEquals("Unable to complete this transaction", atm1.reduceTotalMoney(550));
  }
  
}