import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class AccountTest{

  Account account1;
  Account account2;

  @Before
  public void before(){
    account1 = new Account(1000);
    account2 = new Account(500);
  }

  @Test
  public void testGetBalance(){
    assertEquals(1000, account1.getBalance());
  }

}