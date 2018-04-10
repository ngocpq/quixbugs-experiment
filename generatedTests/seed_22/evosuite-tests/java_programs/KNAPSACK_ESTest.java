/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 18:37:06 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.KNAPSACK;

public class KNAPSACK_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[][] intArray0 = new int[6][9];
      int[] intArray1 = new int[7];
      intArray1[0] = 706;
      intArray1[1] = 706;
      intArray1[2] = 706;
      intArray1[3] = 706;
      intArray1[4] = 706;
      intArray1[5] = 706;
      intArray1[6] = 706;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[6];
      intArray2[0] = 706;
      intArray2[1] = 706;
      intArray2[2] = 706;
      intArray2[3] = 706;
      intArray2[4] = 706;
      intArray2[5] = 706;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[3];
      intArray3[0] = 706;
      intArray3[1] = 706;
      intArray3[2] = 706;
      intArray0[2] = intArray3;
      int[] intArray4 = new int[6];
      intArray4[0] = 706;
      intArray4[1] = 706;
      intArray4[2] = 0;
      intArray4[3] = 2924;
      intArray4[4] = 0;
      intArray4[5] = 706;
      intArray0[3] = intArray4;
      int[] intArray5 = new int[3];
      intArray5[0] = 706;
      intArray5[1] = 2924;
      intArray5[2] = 0;
      intArray0[4] = intArray5;
      int[] intArray6 = new int[5];
      intArray6[0] = 0;
      intArray6[1] = 706;
      intArray6[2] = 706;
      intArray6[3] = 2924;
      intArray6[4] = 0;
      intArray0[5] = intArray6;
      int int0 = KNAPSACK.knapsack(706, intArray0);
      assertEquals(3630, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[][] intArray0 = new int[2][5];
      int[] intArray1 = new int[8];
      intArray1[0] = 0;
      intArray1[1] = 0;
      intArray1[2] = 0;
      intArray1[3] = 0;
      intArray1[4] = 0;
      intArray1[5] = 0;
      intArray1[6] = 0;
      intArray1[7] = 0;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[7];
      intArray2[0] = 0;
      intArray2[1] = 0;
      intArray2[2] = 0;
      intArray2[3] = 0;
      intArray2[4] = 0;
      intArray2[5] = 0;
      intArray2[6] = 0;
      intArray0[1] = intArray2;
      int int0 = KNAPSACK.knapsack(0, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[][] intArray0 = new int[1][5];
      int[] intArray1 = new int[2];
      intArray1[0] = 0;
      intArray1[1] = 0;
      intArray0[0] = intArray1;
      KNAPSACK.knapsack(0, intArray0);
      KNAPSACK.knapsack(0, intArray0);
      KNAPSACK kNAPSACK0 = new KNAPSACK();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      int[][] intArray0 = new int[0][9];
      KNAPSACK.knapsack(0, intArray0);
      KNAPSACK.knapsack(0, intArray0);
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack((-2231), intArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack((-1), (int[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[][] intArray0 = new int[1][7];
      int[] intArray1 = new int[0];
      intArray0[0] = intArray1;
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack(2921, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[][] intArray0 = new int[2][2];
      int[] intArray1 = new int[4];
      intArray1[0] = 1138;
      intArray1[1] = 1138;
      intArray1[2] = 1138;
      intArray1[3] = 1138;
      intArray0[0] = intArray1;
      intArray0[1] = intArray1;
      KNAPSACK.knapsack(1138, intArray0);
      KNAPSACK.knapsack(1674, intArray0);
      // Undeclared exception!
      KNAPSACK.knapsack(1138, intArray0);
  }
}