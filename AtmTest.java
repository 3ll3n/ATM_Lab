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
  
}