/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 21:21:25 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.List;
import java_programs.HANOI;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class HANOI_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      HANOI.Pair<String, Object> hANOI_Pair0 = (HANOI.Pair<String, Object>) mock(HANOI.Pair.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(hANOI_Pair0).toString();
      HANOI.Pair<Object, HANOI.Pair<String, Object>> hANOI_Pair1 = new HANOI.Pair<Object, HANOI.Pair<String, Object>>(object0, hANOI_Pair0);
      HANOI.Pair<String, Object> hANOI_Pair2 = new HANOI.Pair<String, Object>("", hANOI_Pair1);
      Object object1 = hANOI_Pair2.getSecond();
      assertNotNull(object1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer((-1763));
      HANOI.Pair<Object, Object> hANOI_Pair0 = new HANOI.Pair<Object, Object>("B", "");
      HANOI.Pair<Integer, Integer> hANOI_Pair1 = new HANOI.Pair<Integer, Integer>(integer0, (Integer) null);
      hANOI_Pair0.setFirst(hANOI_Pair1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object object0 = new Object();
      HANOI.Pair<String, Object> hANOI_Pair0 = (HANOI.Pair<String, Object>) mock(HANOI.Pair.class, new ViolatedAssumptionAnswer());
      HANOI.Pair<Object, HANOI.Pair<String, Object>> hANOI_Pair1 = new HANOI.Pair<Object, HANOI.Pair<String, Object>>(object0, hANOI_Pair0);
      HANOI.Pair<String, Object> hANOI_Pair2 = new HANOI.Pair<String, Object>("", hANOI_Pair1);
      hANOI_Pair2.setSecond("");
      assertFalse(hANOI_Pair2.equals((Object)hANOI_Pair0));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HANOI.Pair<Object, Integer> hANOI_Pair0 = (HANOI.Pair<Object, Integer>) mock(HANOI.Pair.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(hANOI_Pair0).toString();
      HANOI.Pair<HANOI.Pair<Object, Integer>, String> hANOI_Pair1 = new HANOI.Pair<HANOI.Pair<Object, Integer>, String>(hANOI_Pair0, "");
      String string0 = hANOI_Pair1.toString();
      assertEquals("(null, )", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HANOI.Pair<Integer, Object> hANOI_Pair0 = (HANOI.Pair<Integer, Object>) mock(HANOI.Pair.class, new ViolatedAssumptionAnswer());
      HANOI.Pair<String, HANOI.Pair<Integer, Object>> hANOI_Pair1 = new HANOI.Pair<String, HANOI.Pair<Integer, Object>>("", hANOI_Pair0);
      String string0 = hANOI_Pair1.getFirst();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HANOI hANOI0 = new HANOI();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      List<HANOI.Pair<Integer, Integer>> list0 = HANOI.hanoi(1, (-1127), 0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      List<HANOI.Pair<Integer, Integer>> list0 = HANOI.hanoi(0, 0, 0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      List<HANOI.Pair<Integer, Integer>> list0 = HANOI.hanoi((-3123), (-3123), 0);
      assertEquals(0, list0.size());
  }
}