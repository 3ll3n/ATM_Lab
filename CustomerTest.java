import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CustomerTest{

  Customer customer1;
  Customer customer2;
  Customer customer3;
  Atm atm;

  @Before
  public void before(){
    customer1 = new Customer("Tom", 77, 100);
    customer2 = new Customer("Gerry", 76, 200);
    customer3 = new Customer("Granny", 95, 1500);
    atm = new Atm("The Dingly Dell", 10000, 250);
  }

  @Test
  public void testGetName(){
    assertEquals("Tom", customer1.getName());
  }

  @Test
  public void testGetAge(){
    assertEquals(76, customer2.getAge());
  }

  @Test
  public void testGetBalance(){
    assertEquals(200, customer2.getBalance());
  }

  @Test
  public void testIncreaseBalance(){
    customer1.withdrawMoney(50, atm);
    assertEquals(150, customer1.getBalance());
  }

  @Test
  public void customerCanWithdrawMoney(){
    customer3.withdrawMoney(50, atm);
    assertEquals(150, customer1.getBalance());
    assertEquals(9950, atm.getTotalMoney());
  }

  @Test
  public void customerCannotWithdrawMoney(){
    customer3.withdrawMoney(500, atm);
    assertEquals(150, customer1.getBalance());
    assertEquals("Over daily limit", atm.getTotalMoney());
  }

  @Test
  public void testDecreaseBalance(){
    customer1.depositMoney(50);
    assertEquals(50, customer1.getBalance());
  }
}