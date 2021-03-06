/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 22:27:31 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.KNAPSACK;

public class KNAPSACK_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      int[][] intArray0 = new int[1][0];
      int[] intArray1 = new int[1];
      intArray0[0] = intArray1;
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[][] intArrayArray0 = null;
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack((-46), (int[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[][] intArray0 = new int[1][0];
      int[] intArray1 = new int[5];
      intArray1[0] = (-1685);
      intArray1[1] = (-1685);
      intArray1[2] = (-1685);
      intArray1[3] = (-1685);
      intArray1[4] = (-1685);
      intArray0[0] = intArray1;
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack((-1685), intArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack(490, (int[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      int[][] intArray0 = new int[0][6];
      KNAPSACK.knapsack(1675, intArray0);
      KNAPSACK.knapsack(0, intArray0);
      int[][] intArray1 = new int[0][2];
      KNAPSACK.knapsack(0, intArray1);
      int[][] intArray2 = new int[2][5];
      int[] intArray3 = new int[3];
      intArray3[0] = 0;
      intArray3[1] = 0;
      intArray3[2] = 0;
      intArray2[0] = intArray3;
      int[] intArray4 = new int[2];
      intArray4[0] = 0;
      intArray4[1] = 0;
      intArray2[0] = intArray4;
      KNAPSACK.knapsack(0, intArray2);
      int int0 = KNAPSACK.knapsack(0, intArray2);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      int int0 = 2049;
      int[][] intArray0 = new int[1][1];
      int[] intArray1 = new int[3];
      intArray1[0] = 2049;
      intArray1[1] = 2049;
      intArray1[2] = 2049;
      intArray0[0] = intArray1;
      KNAPSACK.knapsack(2049, intArray0);
      KNAPSACK.knapsack(0, intArray0);
      KNAPSACK.knapsack(2049, intArray0);
      // Undeclared exception!
      KNAPSACK.knapsack(2049, intArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[][] intArray0 = new int[1][3];
      int[] intArray1 = new int[2];
      intArray1[0] = 833;
      intArray1[1] = (-884);
      intArray0[0] = intArray1;
      KNAPSACK.knapsack(833, intArray0);
      int int0 = KNAPSACK.knapsack(833, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      int[][] intArray0 = new int[1][6];
      int[] intArray1 = new int[7];
      intArray1[0] = 0;
      intArray1[1] = 0;
      intArray1[2] = 0;
      intArray1[3] = 0;
      intArray1[4] = 0;
      intArray1[5] = 0;
      intArray1[6] = 0;
      intArray0[0] = intArray1;
      KNAPSACK.knapsack(0, intArray0);
      KNAPSACK.knapsack(0, intArray0);
      KNAPSACK.knapsack(1, intArray0);
      int int0 = KNAPSACK.knapsack(1, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      int[][] intArray0 = new int[2][3];
      int[] intArray1 = new int[2];
      intArray1[0] = 4289;
      intArray1[1] = 4289;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[2];
      intArray2[0] = 4289;
      intArray2[1] = 4289;
      intArray0[1] = intArray2;
      // Undeclared exception!
      KNAPSACK.knapsack(4289, intArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      int[][] intArray0 = new int[3][9];
      int[] intArray1 = new int[8];
      intArray1[0] = 1272;
      intArray1[1] = 1272;
      intArray1[2] = 1272;
      intArray1[3] = 1272;
      intArray1[4] = 1272;
      intArray1[5] = 1;
      intArray1[6] = 1272;
      intArray1[7] = 1272;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[4];
      intArray2[0] = 1098;
      intArray2[1] = 1;
      intArray2[2] = 1272;
      intArray2[3] = 1;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[1];
      intArray3[0] = 1;
      intArray0[2] = intArray3;
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack(1272, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      int[][] intArray0 = new int[3][9];
      int[] intArray1 = new int[7];
      intArray1[0] = 1920;
      intArray1[1] = 1920;
      intArray1[2] = 1920;
      intArray1[3] = 1920;
      intArray1[4] = 1920;
      intArray1[5] = 1920;
      intArray1[6] = 0;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[2];
      intArray2[0] = 0;
      intArray2[1] = 1920;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[6];
      intArray3[0] = 1920;
      intArray3[1] = 575;
      intArray3[2] = 0;
      intArray3[3] = 1920;
      intArray3[4] = 0;
      intArray3[5] = 1920;
      intArray0[2] = intArray3;
      KNAPSACK.knapsack(1920, intArray0);
  }
}
