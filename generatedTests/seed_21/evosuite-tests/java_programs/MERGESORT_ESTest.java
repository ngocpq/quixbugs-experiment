/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 21:09:56 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.MERGESORT;

public class MERGESORT_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MERGESORT mERGESORT0 = new MERGESORT();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      // Undeclared exception!
      try { 
        MERGESORT.merge(arrayList0, (ArrayList<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        MERGESORT.mergesort((ArrayList<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      ArrayList<Integer> arrayList1 = MERGESORT.merge(arrayList0, arrayList0);
      assertNotSame(arrayList1, arrayList0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      ArrayList<Integer> arrayList1 = MERGESORT.mergesort(arrayList0);
      assertEquals(0, arrayList1.size());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(432);
      arrayList0.add(integer0);
      Integer integer1 = new Integer((-656));
      arrayList0.add(integer1);
      ArrayList<Integer> arrayList1 = MERGESORT.merge(arrayList0, arrayList0);
      assertEquals(2, arrayList0.size());
      assertFalse(arrayList1.equals((Object)arrayList0));
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(1314);
      arrayList0.add(integer0);
      Integer integer1 = new Integer(0);
      Integer integer2 = new Integer(0);
      arrayList0.add(integer2);
      arrayList0.add(integer1);
      ArrayList<Integer> arrayList1 = MERGESORT.mergesort(arrayList0);
      assertTrue(arrayList1.contains(1314));
      assertFalse(arrayList1.equals((Object)arrayList0));
      assertNotSame(arrayList1, arrayList0);
      assertEquals(3, arrayList1.size());
  }
}
