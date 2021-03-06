/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 22:40:42 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.POSSIBLE_CHANGE;

public class POSSIBLE_CHANGE_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        POSSIBLE_CHANGE.possible_change((int[]) null, 2856);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 725;
      intArray0[1] = 111;
      int int0 = POSSIBLE_CHANGE.possible_change(intArray0, 1261);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 725;
      intArray0[1] = 111;
      int int0 = POSSIBLE_CHANGE.possible_change(intArray0, 111);
      assertEquals(1, int0);
  }
}
