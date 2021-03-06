/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 20:12:12 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.FIND_IN_SORTED;

public class FIND_IN_SORTED_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FIND_IN_SORTED fIND_IN_SORTED0 = new FIND_IN_SORTED();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        FIND_IN_SORTED.find_in_sorted((int[]) null, 1918);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[5];
      int int0 = FIND_IN_SORTED.find_in_sorted(intArray0, 0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = FIND_IN_SORTED.binsearch((int[]) null, 1918, 0, 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[5] = 1264;
      int int0 = FIND_IN_SORTED.find_in_sorted(intArray0, 1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        FIND_IN_SORTED.binsearch(intArray0, 2, (-1), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        FIND_IN_SORTED.binsearch((int[]) null, 994, 994, (-3627));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[1] = (-1447);
      int int0 = FIND_IN_SORTED.binsearch(intArray0, (-1447), 1, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      int[] intArray0 = new int[5];
      int int0 = FIND_IN_SORTED.binsearch(intArray0, 0, 0, (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-1);
      int int0 = FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
      assertEquals(0, int0);
  }
}
