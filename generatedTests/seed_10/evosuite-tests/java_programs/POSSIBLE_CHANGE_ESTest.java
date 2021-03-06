/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 02:24:15 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.POSSIBLE_CHANGE;

public class POSSIBLE_CHANGE_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      int[] intArray0 = null;
      // Undeclared exception!
      try { 
        POSSIBLE_CHANGE.possible_change((int[]) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = 1;
      intArray0[1] = 500;
      int int0 = (-1);
      intArray0[2] = (-1);
      intArray0[3] = 0;
      int int1 = (-1);
      intArray0[4] = (-1);
      intArray0[5] = 0;
      intArray0[6] = 2268;
      int int2 = 1;
      intArray0[7] = 1;
      intArray0[8] = (-1484);
      // Undeclared exception!
      try { 
        POSSIBLE_CHANGE.possible_change(intArray0, int2);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      int[] intArray0 = new int[0];
      int int0 = POSSIBLE_CHANGE.possible_change(intArray0, 607);
      POSSIBLE_CHANGE.possible_change(intArray0, 1330);
      POSSIBLE_CHANGE.possible_change(intArray0, 0);
      POSSIBLE_CHANGE.possible_change(intArray0, 0);
      POSSIBLE_CHANGE.possible_change(intArray0, 0);
      POSSIBLE_CHANGE.possible_change(intArray0, 3894);
      POSSIBLE_CHANGE.possible_change(intArray0, 0);
      POSSIBLE_CHANGE.possible_change(intArray0, 1);
      POSSIBLE_CHANGE.possible_change(intArray0, 1);
      POSSIBLE_CHANGE.possible_change(intArray0, 0);
      POSSIBLE_CHANGE.possible_change(intArray0, 0);
      POSSIBLE_CHANGE.possible_change(intArray0, 1);
      POSSIBLE_CHANGE.possible_change(intArray0, 1);
      POSSIBLE_CHANGE.possible_change(intArray0, 0);
      POSSIBLE_CHANGE.possible_change(intArray0, 0);
      int[] intArray1 = new int[0];
      POSSIBLE_CHANGE.possible_change(intArray1, 607);
      POSSIBLE_CHANGE.possible_change(intArray0, 0);
      int int1 = POSSIBLE_CHANGE.possible_change(intArray1, 0);
      assertFalse(int1 == int0);
      assertEquals(1, int1);
  }
}
