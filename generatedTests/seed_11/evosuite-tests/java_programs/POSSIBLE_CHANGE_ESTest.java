/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 02:26:50 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.POSSIBLE_CHANGE;

public class POSSIBLE_CHANGE_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[0];
      POSSIBLE_CHANGE.possible_change(intArray0, 0);
      int int0 = POSSIBLE_CHANGE.possible_change(intArray0, 2420);
      POSSIBLE_CHANGE.possible_change(intArray0, 0);
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      POSSIBLE_CHANGE.possible_change(intArray0, 1);
      int int1 = POSSIBLE_CHANGE.possible_change(intArray0, 0);
      assertFalse(int1 == int0);
      
      int[] intArray1 = new int[8];
      intArray1[0] = 0;
      intArray1[1] = 2420;
      intArray1[2] = 0;
      intArray1[3] = 0;
      intArray1[4] = 1;
      intArray1[5] = 1;
      intArray1[6] = 0;
      intArray1[7] = 1;
      int int2 = POSSIBLE_CHANGE.possible_change(intArray1, 0);
      assertEquals(1, int2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = 0;
      intArray0[1] = 1762;
      int int0 = 1;
      intArray0[2] = 1;
      intArray0[3] = 0;
      intArray0[4] = 251;
      // Undeclared exception!
      try { 
        POSSIBLE_CHANGE.possible_change(intArray0, int0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      int[] intArray0 = new int[1];
      intArray0[0] = 2080;
      POSSIBLE_CHANGE.possible_change(intArray0, 2080);
      int int0 = 2755;
      POSSIBLE_CHANGE.possible_change(intArray0, 2755);
      POSSIBLE_CHANGE.possible_change(intArray0, 836);
      POSSIBLE_CHANGE.possible_change(intArray0, 2755);
      int int1 = 0;
      POSSIBLE_CHANGE.possible_change(intArray0, 0);
      POSSIBLE_CHANGE.possible_change(intArray0, (-914));
      POSSIBLE_CHANGE.possible_change(intArray0, 0);
      int[] intArray1 = new int[5];
      intArray1[0] = 2755;
      intArray1[1] = 2080;
      intArray1[2] = 2755;
      intArray1[3] = 0;
      intArray1[4] = 836;
      POSSIBLE_CHANGE.possible_change(intArray1, 0);
      // Undeclared exception!
      try { 
        POSSIBLE_CHANGE.possible_change(intArray1, intArray1[4]);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      assertNotNull(pOSSIBLE_CHANGE0);
      
      int[] intArray0 = new int[1];
      intArray0[0] = (-5400);
      int int0 = 1;
      // Undeclared exception!
      try { 
        POSSIBLE_CHANGE.possible_change(intArray0, int0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

//  @Test(timeout = 4000)
//  public void test04()  throws Throwable  {
//      int[] intArray0 = new int[5];
//      intArray0[0] = (-729);
//      intArray0[1] = (-1855);
//      intArray0[2] = 0;
//      intArray0[3] = 1;
//      intArray0[4] = 3603;
//      int int0 = 0;
//      int int1 = POSSIBLE_CHANGE.possible_change(intArray0, 0);
//      assertEquals(5, intArray0.length);
//      assertEquals(1, int1);
//      assertArrayEquals(new int[] {(-729), (-1855), 0, 1, 3603}, intArray0);
//      assertFalse(int1 == int0);
//      
//      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
//      assertNotNull(pOSSIBLE_CHANGE0);
//      
//      int int2 = POSSIBLE_CHANGE.possible_change(intArray0, (-1));
//      assertEquals(5, intArray0.length);
//      assertEquals(0, int2);
//      assertArrayEquals(new int[] {(-729), (-1855), 0, 1, 3603}, intArray0);
//      assertFalse(int2 == int1);
//      assertTrue(int2 == int0);
//      
//      int int3 = POSSIBLE_CHANGE.possible_change(intArray0, (-729));
//      assertEquals(5, intArray0.length);
//      assertEquals(0, int3);
//      assertArrayEquals(new int[] {(-729), (-1855), 0, 1, 3603}, intArray0);
//      assertTrue(int3 == int2);
//      assertFalse(int3 == int1);
//      assertTrue(int3 == int0);
//      
//      int int4 = POSSIBLE_CHANGE.possible_change(intArray0, (-1221));
//      assertEquals(5, intArray0.length);
//      assertEquals(0, int4);
//      assertArrayEquals(new int[] {(-729), (-1855), 0, 1, 3603}, intArray0);
//      assertTrue(int4 == int0);
//      assertTrue(int4 == int2);
//      assertFalse(int4 == int1);
//      assertTrue(int4 == int3);
//      
//      int int5 = 0;
//      int int6 = POSSIBLE_CHANGE.possible_change(intArray0, 0);
//      assertEquals(5, intArray0.length);
//      assertEquals(1, int6);
//      assertArrayEquals(new int[] {(-729), (-1855), 0, 1, 3603}, intArray0);
//      assertFalse(int6 == int5);
//      assertTrue(int6 == int1);
//      assertFalse(int6 == int2);
//      assertFalse(int6 == int0);
//      assertFalse(int6 == int3);
//      assertFalse(int6 == int4);
//      
//      int int7 = 315;
//      POSSIBLE_CHANGE.possible_change(intArray0, int7);
//      POSSIBLE_CHANGE.possible_change(intArray0, int0);
//      int int8 = 0;
//      POSSIBLE_CHANGE.possible_change(intArray0, int8);
//      int int9 = 2078;
//      POSSIBLE_CHANGE.possible_change(intArray0, int9);
//      int[] intArray1 = null;
//      int int10 = 1;
//      POSSIBLE_CHANGE.possible_change(intArray1, int10);
//      POSSIBLE_CHANGE.possible_change(intArray0, int5);
//      int int11 = 688;
//      POSSIBLE_CHANGE.possible_change(intArray0, int11);
//      int int12 = (-1578);
//      POSSIBLE_CHANGE.possible_change(intArray1, int12);
//      int int13 = 869;
//      POSSIBLE_CHANGE.possible_change(intArray1, int13);
//      POSSIBLE_CHANGE.possible_change(intArray1, int6);
//  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      assertNotNull(pOSSIBLE_CHANGE0);
      
      int[] intArray0 = new int[1];
      intArray0[0] = 0;
      int int0 = POSSIBLE_CHANGE.possible_change(intArray0, 0);
      assertEquals(1, intArray0.length);
      assertEquals(1, int0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      assertNotNull(pOSSIBLE_CHANGE0);
      
      int[] intArray0 = new int[7];
      intArray0[0] = 2577;
      intArray0[1] = (-3596);
      intArray0[2] = (-385);
      intArray0[3] = 541;
      intArray0[4] = (-1);
      intArray0[5] = 0;
      intArray0[6] = 0;
      int int0 = POSSIBLE_CHANGE.possible_change(intArray0, (-2042));
      assertEquals(7, intArray0.length);
      assertEquals(0, int0);
      assertArrayEquals(new int[] {2577, (-3596), (-385), 541, (-1), 0, 0}, intArray0);
      
      int[] intArray1 = new int[9];
      assertFalse(intArray1.equals((Object)intArray0));
      
      intArray1[0] = 0;
      intArray1[1] = 2577;
      intArray1[2] = (-385);
      intArray1[3] = 2577;
      intArray1[4] = 0;
      intArray1[5] = (-2042);
      intArray1[6] = 541;
      intArray1[7] = 541;
      intArray1[8] = 0;
      int int1 = POSSIBLE_CHANGE.possible_change(intArray1, 0);
      assertEquals(9, intArray1.length);
      assertNotSame(intArray1, intArray0);
      assertEquals(1, int1);
      assertArrayEquals(new int[] {0, 2577, (-385), 2577, 0, (-2042), 541, 541, 0}, intArray1);
      assertFalse(int1 == int0);
      assertFalse(intArray1.equals((Object)intArray0));
  }

//  @Test(timeout = 4000)
//  public void test07()  throws Throwable  {
//      int[] intArray0 = new int[3];
//      intArray0[0] = 1584;
//      int int0 = (-1);
//      intArray0[1] = (-1);
//      int int1 = (-292);
//      intArray0[2] = (-292);
//      int int2 = POSSIBLE_CHANGE.possible_change(intArray0, 0);
//      assertEquals(3, intArray0.length);
//      assertEquals(1, int2);
//      assertArrayEquals(new int[] {1584, (-1), (-292)}, intArray0);
//      assertFalse(int2 == int0);
//      assertFalse(int2 == int1);
//      
//      int int3 = POSSIBLE_CHANGE.possible_change(intArray0, 0);
//      assertEquals(3, intArray0.length);
//      assertEquals(1, int3);
//      assertArrayEquals(new int[] {1584, (-1), (-292)}, intArray0);
//      assertFalse(int3 == int0);
//      assertFalse(int3 == int1);
//      assertTrue(int3 == int2);
//      
//      int int4 = POSSIBLE_CHANGE.possible_change(intArray0, 0);
//      assertEquals(3, intArray0.length);
//      assertEquals(1, int4);
//      assertArrayEquals(new int[] {1584, (-1), (-292)}, intArray0);
//      assertFalse(int4 == int1);
//      assertTrue(int4 == int3);
//      assertFalse(int4 == int0);
//      assertTrue(int4 == int2);
//      
//      int int5 = POSSIBLE_CHANGE.possible_change(intArray0, (-1));
//      assertEquals(3, intArray0.length);
//      assertEquals(0, int5);
//      assertArrayEquals(new int[] {1584, (-1), (-292)}, intArray0);
//      assertFalse(int5 == int2);
//      assertFalse(int5 == int4);
//      assertFalse(int5 == int3);
//      assertFalse(int5 == int0);
//      assertFalse(int5 == int1);
//      
//      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
//      assertNotNull(pOSSIBLE_CHANGE0);
//      
//      int int6 = POSSIBLE_CHANGE.possible_change(intArray0, (-1));
//      assertEquals(3, intArray0.length);
//      assertEquals(0, int6);
//      assertArrayEquals(new int[] {1584, (-1), (-292)}, intArray0);
//      assertFalse(int6 == int3);
//      assertFalse(int6 == int4);
//      assertFalse(int6 == int2);
//      assertTrue(int6 == int5);
//      assertFalse(int6 == int0);
//      assertFalse(int6 == int1);
//      
//      int int7 = POSSIBLE_CHANGE.possible_change(intArray0, 0);
//      assertEquals(3, intArray0.length);
//      assertEquals(1, int7);
//      assertArrayEquals(new int[] {1584, (-1), (-292)}, intArray0);
//      assertTrue(int7 == int4);
//      assertFalse(int7 == int0);
//      assertFalse(int7 == int6);
//      assertFalse(int7 == int5);
//      assertFalse(int7 == int1);
//      assertTrue(int7 == int2);
//      assertTrue(int7 == int3);
//      
//      int int8 = POSSIBLE_CHANGE.possible_change(intArray0, (-1));
//      assertEquals(3, intArray0.length);
//      assertEquals(0, int8);
//      assertArrayEquals(new int[] {1584, (-1), (-292)}, intArray0);
//      assertFalse(int8 == int1);
//      assertFalse(int8 == int0);
//      assertFalse(int8 == int3);
//      assertFalse(int8 == int4);
//      assertTrue(int8 == int6);
//      assertFalse(int8 == int2);
//      assertFalse(int8 == int7);
//      assertTrue(int8 == int5);
//      
//      int int9 = 0;
//      int int10 = POSSIBLE_CHANGE.possible_change(intArray0, 0);
//      assertEquals(3, intArray0.length);
//      assertEquals(1, int10);
//      assertArrayEquals(new int[] {1584, (-1), (-292)}, intArray0);
//      assertFalse(int10 == int9);
//      assertTrue(int10 == int4);
//      assertFalse(int10 == int6);
//      assertFalse(int10 == int1);
//      assertTrue(int10 == int2);
//      assertTrue(int10 == int3);
//      assertFalse(int10 == int5);
//      assertFalse(int10 == int0);
//      assertFalse(int10 == int8);
//      assertTrue(int10 == int7);
//      
//      int int11 = 0;
//      int int12 = POSSIBLE_CHANGE.possible_change(intArray0, 0);
//      assertEquals(3, intArray0.length);
//      assertEquals(1, int12);
//      assertArrayEquals(new int[] {1584, (-1), (-292)}, intArray0);
//      assertTrue(int12 == int7);
//      assertFalse(int12 == int0);
//      assertTrue(int12 == int4);
//      assertFalse(int12 == int8);
//      assertFalse(int12 == int9);
//      assertTrue(int12 == int3);
//      assertFalse(int12 == int11);
//      assertFalse(int12 == int6);
//      assertFalse(int12 == int1);
//      assertTrue(int12 == int10);
//      assertFalse(int12 == int5);
//      assertTrue(int12 == int2);
//      
//      int int13 = POSSIBLE_CHANGE.possible_change(intArray0, (-292));
//      assertEquals(3, intArray0.length);
//      assertEquals(0, int13);
//      assertArrayEquals(new int[] {1584, (-1), (-292)}, intArray0);
//      assertFalse(int13 == int4);
//      assertFalse(int13 == int10);
//      assertFalse(int13 == int12);
//      assertFalse(int13 == int7);
//      assertTrue(int13 == int5);
//      assertFalse(int13 == int3);
//      assertFalse(int13 == int1);
//      assertFalse(int13 == int0);
//      assertTrue(int13 == int9);
//      assertTrue(int13 == int8);
//      assertTrue(int13 == int6);
//      assertTrue(int13 == int11);
//      assertFalse(int13 == int2);
//      
//      POSSIBLE_CHANGE.possible_change(intArray0, int2);
//      int int14 = POSSIBLE_CHANGE.possible_change(intArray0, int7);
//      POSSIBLE_CHANGE.possible_change(intArray0, int9);
//      int int15 = 102;
//      POSSIBLE_CHANGE.possible_change(intArray0, int15);
//      POSSIBLE_CHANGE.possible_change(intArray0, int11);
//      POSSIBLE_CHANGE.possible_change(intArray0, int14);
//      POSSIBLE_CHANGE.possible_change(intArray0, int1);
//      int int16 = 0;
//      POSSIBLE_CHANGE.possible_change(intArray0, int16);
//      POSSIBLE_CHANGE.possible_change(intArray0, int0);
//      POSSIBLE_CHANGE.possible_change(intArray0, int5);
//      POSSIBLE_CHANGE.possible_change(intArray0, int11);
//  }

//  @Test(timeout = 4000)
//  public void test08()  throws Throwable  {
//      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
//      assertNotNull(pOSSIBLE_CHANGE0);
//      
//      int[] intArray0 = new int[3];
//      int int0 = 1;
//      intArray0[0] = 1;
//      intArray0[1] = 1;
//      int int1 = 1;
//      intArray0[2] = 1;
//      int int2 = POSSIBLE_CHANGE.possible_change(intArray0, 1);
//      assertEquals(3, intArray0.length);
//      assertEquals(3, int2);
//      assertArrayEquals(new int[] {1, 1, 1}, intArray0);
//      assertFalse(int2 == int0);
//      assertFalse(int2 == int1);
//      
//      int int3 = POSSIBLE_CHANGE.possible_change(intArray0, 1);
//      assertEquals(3, intArray0.length);
//      assertEquals(3, int3);
//      assertArrayEquals(new int[] {1, 1, 1}, intArray0);
//      assertTrue(int3 == int2);
//      assertFalse(int3 == int1);
//      assertFalse(int3 == int0);
//      
//      int int4 = 830;
//      int int5 = POSSIBLE_CHANGE.possible_change(intArray0, int4);
//      int int6 = 2426;
//      POSSIBLE_CHANGE.possible_change(intArray0, int6);
//      int int7 = POSSIBLE_CHANGE.possible_change(intArray0, int5);
//      POSSIBLE_CHANGE.possible_change(intArray0, int1);
//      POSSIBLE_CHANGE.possible_change(intArray0, int0);
//      int int8 = (-1564);
//      POSSIBLE_CHANGE.possible_change(intArray0, int8);
//      POSSIBLE_CHANGE.possible_change(intArray0, int0);
//      int int9 = POSSIBLE_CHANGE.possible_change(intArray0, int1);
//      int int10 = POSSIBLE_CHANGE.possible_change(intArray0, int6);
//      int int11 = POSSIBLE_CHANGE.possible_change(intArray0, int6);
//      int[] intArray1 = new int[6];
//      intArray1[0] = int2;
//      intArray1[1] = int10;
//      intArray1[2] = int9;
//      intArray1[3] = int11;
//      intArray1[4] = int7;
//      intArray1[5] = int8;
//      POSSIBLE_CHANGE.possible_change(intArray1, int2);
//  }

//  @Test(timeout = 4000)
//  public void test09()  throws Throwable  {
//      int[] intArray0 = new int[7];
//      intArray0[0] = 0;
//      intArray0[1] = 1;
//      intArray0[2] = (-566);
//      intArray0[3] = (-238);
//      intArray0[4] = 0;
//      intArray0[5] = 4873;
//      intArray0[6] = 0;
//      int int0 = POSSIBLE_CHANGE.possible_change(intArray0, 0);
//      assertEquals(7, intArray0.length);
//      assertEquals(1, int0);
//      assertArrayEquals(new int[] {0, 1, (-566), (-238), 0, 4873, 0}, intArray0);
//      
//      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
//      assertNotNull(pOSSIBLE_CHANGE0);
//      
//      int int1 = POSSIBLE_CHANGE.possible_change(intArray0, 0);
//      assertEquals(7, intArray0.length);
//      assertEquals(1, int1);
//      assertArrayEquals(new int[] {0, 1, (-566), (-238), 0, 4873, 0}, intArray0);
//      assertTrue(int1 == int0);
//      
//      int int2 = POSSIBLE_CHANGE.possible_change(intArray0, 0);
//      assertEquals(7, intArray0.length);
//      assertEquals(1, int2);
//      assertArrayEquals(new int[] {0, 1, (-566), (-238), 0, 4873, 0}, intArray0);
//      assertTrue(int2 == int1);
//      assertTrue(int2 == int0);
//      
//      int int3 = POSSIBLE_CHANGE.possible_change(intArray0, int0);
//      int int4 = 4598;
//      POSSIBLE_CHANGE.possible_change(intArray0, int4);
//      int int5 = 0;
//      POSSIBLE_CHANGE.possible_change(intArray0, int5);
//      int[] intArray1 = new int[3];
//      intArray1[0] = int1;
//      intArray1[1] = int1;
//      intArray1[2] = int3;
//      int int6 = 1676;
//      int int7 = POSSIBLE_CHANGE.possible_change(intArray1, int6);
//      POSSIBLE_CHANGE.possible_change(intArray0, int7);
//  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = POSSIBLE_CHANGE.possible_change((int[]) null, (-1));
      assertEquals(0, int0);
      
      int int1 = POSSIBLE_CHANGE.possible_change((int[]) null, (-1));
      assertEquals(0, int1);
      assertTrue(int1 == int0);
      
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      assertNotNull(pOSSIBLE_CHANGE0);
      
      int int2 = POSSIBLE_CHANGE.possible_change((int[]) null, (-1406));
      assertEquals(0, int2);
      assertTrue(int2 == int1);
      assertTrue(int2 == int0);
      
      int int3 = POSSIBLE_CHANGE.possible_change((int[]) null, 0);
      assertEquals(1, int3);
      assertFalse(int3 == int2);
      assertFalse(int3 == int0);
      assertFalse(int3 == int1);
      
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
}
