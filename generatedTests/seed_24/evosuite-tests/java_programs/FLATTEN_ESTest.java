/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 14:56:18 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.FLATTEN;

public class FLATTEN_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FLATTEN fLATTEN0 = new FLATTEN();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) fLATTEN0);
      ArrayList arrayList1 = (ArrayList)FLATTEN.flatten(arrayList0);
      assertFalse(arrayList1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = FLATTEN.flatten((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      ArrayList<Object> arrayList1 = new ArrayList<Object>();
      arrayList1.add((Object) arrayList0);
      ArrayList arrayList2 = (ArrayList)FLATTEN.flatten(arrayList1);
      assertTrue(arrayList2.isEmpty());
  }
}
