/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 23:15:22 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.POWERSET;

public class POWERSET_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      POWERSET pOWERSET0 = new POWERSET();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) "");
      ArrayList<ArrayList> arrayList1 = (ArrayList<ArrayList>)POWERSET.powerset(arrayList0);
      arrayList1.add(arrayList0);
      arrayList1.add(arrayList0);
      ArrayList<ArrayList> arrayList2 = (ArrayList<ArrayList>)POWERSET.powerset(arrayList1);
      // Undeclared exception!
      POWERSET.powerset(arrayList2);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        POWERSET.powerset((ArrayList) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}