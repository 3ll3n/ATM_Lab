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
  public void testgetName(){
    assertEquals("Tom", customer1.getName());
  }

  @Test
  public void testgetAge(){
    assertEquals(76, customer2.getAge());
  }

  @Test
  public void testgetBalance(){
    assertEquals(200, customer2.getBalance());
  }
}