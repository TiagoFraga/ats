package umer;/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 19 09:54:07 GMT 2018
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.Point2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Van_ESTest extends Van_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double(0.0, 0.0);
      Van van0 = new Van("&m70?YQMBr", 0.0, point2D_Double0, "&m70?YQMBr");
      Van van1 = van0.clone();
      assertEquals(9, van1.getSeats());
      assertEquals(55.0, van0.getSpeed(), 0.01);
      assertEquals(1.9, van1.getPrice(), 0.01);
      assertEquals(9, van0.getSeats());
      assertEquals(1.9, van0.getPrice(), 0.01);
      assertEquals(55.0, van1.getSpeed(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double((-1603.4387068560416), (-1603.4387068560416));
      Van van0 = new Van("\nPre\u00E7o estimado : ", (-1603.4387068560416), point2D_Double0, "\nPre\u00E7o estimado : ");
      Van van1 = van0.clone();
      assertEquals(55.0, van0.getSpeed(), 0.01);
      assertEquals(1.9, van1.getPrice(), 0.01);
      assertEquals(55.0, van1.getSpeed(), 0.01);
      assertEquals(9, van1.getSeats());
      assertEquals(1.9, van0.getPrice(), 0.01);
      assertEquals(9, van0.getSeats());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double();
      Van van0 = new Van("", 3433.913102967916, point2D_Double0, "");
      Trip trip0 = new Trip();
      van0.addTrip(trip0);
      // Undeclared exception!
      try { 
        van0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umer.Trip", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Van van0 = null;
      try {
        van0 = new Van("]\nTempo previsto at\u00E9 ao cliente : ", 2213.534, (Point2D.Double) null, "]\nTempo previsto at\u00E9 ao cliente : ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umer.Vehicle", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Van van0 = null;
      try {
        van0 = new Van((Van) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umer.Van", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double(0.0, 0.0);
      Van van0 = new Van("&m70?YQMBr", 0.0, point2D_Double0, "&m70?YQMBr");
      Van van1 = new Van(van0);
      assertEquals(9, van0.getSeats());
      assertEquals(1.9, van1.getPrice(), 0.01);
      assertEquals(55.0, van0.getSpeed(), 0.01);
      assertEquals(1.9, van0.getPrice(), 0.01);
      assertEquals(9, van1.getSeats());
      assertEquals(55.0, van1.getSpeed(), 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double();
      Van van0 = new Van("", 3433.913102967916, point2D_Double0, "");
      Van van1 = van0.clone();
      assertEquals(55.0, van1.getSpeed(), 0.01);
      assertEquals(9, van1.getSeats());
      assertEquals(9, van0.getSeats());
      assertEquals(1.9, van0.getPrice(), 0.01);
      assertEquals(1.9, van1.getPrice(), 0.01);
      assertEquals(55.0, van0.getSpeed(), 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Van van0 = null;
      try {
        van0 = new Van();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
