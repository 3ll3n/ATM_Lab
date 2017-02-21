import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CustomerTest{

  Customer customer1;
  Customer customer2;

  @Before
  public void before(){
    customer1 = new Customer("Tom", 77, 100);
    customer2 = new Customer("Gerry", 76, 200);
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
    customer1.withdrawCash(50);
    assertEquals(150, customer1.getBalance());
  }

  // @Test
  // public void testDecreaseBalance(){

  // }
}