/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 22:24:18 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.KNAPSACK;

public class KNAPSACK_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[][] intArray0 = new int[2][4];
      int[] intArray1 = new int[9];
      intArray1[8] = 1079;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[3];
      intArray2[0] = 1079;
      intArray2[2] = 1079;
      intArray0[1] = intArray2;
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      int int0 = KNAPSACK.knapsack(189, intArray0);
      assertEquals(0, int0);
      
      int int1 = KNAPSACK.knapsack(0, intArray0);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[][] intArray0 = new int[1][2];
      int[] intArray1 = new int[4];
      intArray1[0] = 1;
      intArray1[1] = 1;
      intArray1[2] = 1;
      intArray1[3] = 1;
      intArray0[0] = intArray1;
      int int0 = KNAPSACK.knapsack(1, intArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[][] intArray0 = new int[3][3];
      int[] intArray1 = new int[6];
      intArray1[0] = 3472;
      intArray1[1] = 3472;
      intArray1[2] = (-1760);
      intArray1[3] = 3472;
      intArray1[4] = 3472;
      intArray1[5] = 3472;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[2];
      intArray2[0] = (-1760);
      intArray2[1] = (-1760);
      intArray0[1] = intArray2;
      int[] intArray3 = new int[2];
      intArray3[0] = 3472;
      intArray3[1] = 3472;
      intArray0[2] = intArray3;
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack(3472, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3473
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      int[][] intArray0 = new int[2][3];
      int[] intArray1 = new int[4];
      intArray1[0] = 0;
      intArray1[1] = 0;
      intArray1[2] = 0;
      intArray1[3] = (-1);
      intArray0[0] = intArray1;
      int[] intArray2 = new int[3];
      intArray2[0] = 0;
      intArray2[1] = (-1);
      intArray2[2] = 0;
      intArray0[1] = intArray2;
      KNAPSACK.knapsack(0, intArray0);
      KNAPSACK.knapsack(1359, intArray0);
      KNAPSACK.knapsack(0, intArray0);
      KNAPSACK.knapsack(0, intArray0);
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack((-1), intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[][] intArray0 = new int[1][9];
      int[] intArray1 = new int[8];
      intArray1[0] = 6555;
      intArray1[1] = 6555;
      intArray1[2] = 6555;
      intArray1[3] = 0;
      intArray1[4] = 6555;
      intArray1[5] = 6555;
      intArray1[6] = 6555;
      intArray1[7] = 6555;
      intArray0[0] = intArray1;
      // Undeclared exception!
      KNAPSACK.knapsack(6555, intArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[][] intArray0 = new int[0][0];
      KNAPSACK.knapsack(190, intArray0);
      int[][] intArray1 = new int[0][4];
      KNAPSACK.knapsack(3536, intArray1);
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack((-158), intArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack(2152, (int[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
