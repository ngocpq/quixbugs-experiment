/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 09 01:03:15 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.SUBSEQUENCES;

public class SUBSEQUENCES_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SUBSEQUENCES sUBSEQUENCES0 = new SUBSEQUENCES();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<ArrayList> arrayList0 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(50, (-209), 50);
      assertEquals(0, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<ArrayList> arrayList0 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences((-209), (-1284), 0);
      assertFalse(arrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      SUBSEQUENCES.subsequences((-128), 0, 50);
  }
}
