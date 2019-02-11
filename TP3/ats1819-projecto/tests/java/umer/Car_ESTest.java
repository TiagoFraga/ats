package umer;/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 19 09:59:42 GMT 2018
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.Point2D;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

import java.util.*;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Car_ESTest extends Car_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double();
      Car car0 = new Car("umer.Car", 1.5, point2D_Double0, "umer.Car");
      Car car1 = car0.clone();
      assertEquals(65.0, car0.getSpeed(), 0.01);
      assertEquals(1.5, car1.getPrice(), 0.01);
      assertEquals(1.5, car0.getPrice(), 0.01);
      assertEquals(4, car0.getSeats());
      assertEquals(65.0, car1.getSpeed(), 0.01);
      assertEquals(4, car1.getSeats());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double((-1545.0), (-1545.0));
      Car car0 = new Car("", (-1545.0), point2D_Double0, "");
      Car car1 = car0.clone();
      assertEquals(4, car1.getSeats());
      assertEquals(1.5, car1.getPrice(), 0.01);
      assertEquals(65.0, car0.getSpeed(), 0.01);
      assertEquals(65.0, car1.getSpeed(), 0.01);
      assertEquals(4, car0.getSeats());
      assertEquals(1.5, car0.getPrice(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double(0.0, 1026.97561642729);
      Car car0 = new Car(";3=yn", 0.0, point2D_Double0, ";3=yn");
      Trip trip0 = new Trip();
      car0.addTrip(trip0);
      // Undeclared exception!
      try { 
        car0.clone();
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
      Point2D.Double point2D_Double0 = new Point2D.Double();
      Car car0 = new Car("", 0.0, point2D_Double0, "");
      // Undeclared exception!
      try { 
        car0.calculateTraffic((HashMap<String, Vehicle>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umer.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Car car0 = null;
      try {
        car0 = new Car("Jjv);%cDu~+7#*fsw", 3181.9687393752, (Point2D.Double) null, "Jjv);%cDu~+7#*fsw");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umer.Vehicle", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Car car0 = null;
      try {
        car0 = new Car((Car) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umer.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double(0.0, 1026.97561642729);
      Car car0 = new Car(";3=yn", 0.0, point2D_Double0, ";3=yn");
      Car car1 = new Car(car0);
      assertEquals(4, car1.getSeats());
      assertEquals(1.5, car1.getPrice(), 0.01);
      assertEquals(65.0, car0.getSpeed(), 0.01);
      assertEquals(4, car0.getSeats());
      assertEquals(1.5, car0.getPrice(), 0.01);
      assertEquals(65.0, car1.getSpeed(), 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double(0.0, 0.0);
      Car car0 = new Car("EKDi^9{", 0.0, point2D_Double0, "EKDi^9{");
      Car car1 = car0.clone();
      assertEquals(1.5, car0.getPrice(), 0.01);
      assertEquals(65.0, car0.getSpeed(), 0.01);
      assertEquals(65.0, car1.getSpeed(), 0.01);
      assertEquals(4, car1.getSeats());
      assertEquals(1.5, car1.getPrice(), 0.01);
      assertEquals(4, car0.getSeats());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Car car0 = null;
      try {
        car0 = new Car();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /*Teste Manual */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double(3.4,5.7);
      Point2D.Double point2D_Double1 = new Point2D.Double(3.5,5.7);
      Point2D.Double point2D_Double12 = new Point2D.Double(3.5,5.7);
      Car car0 = new Car("mercedes", 2.5, point2D_Double0, "umer.Car");
      Car car2 = new Car("mercedes2", 2.5, point2D_Double1, "umer.Car2");
      Car car3 = new Car("mercedes3", 2.5, point2D_Double1, "umer.Car3");
      Car car1 = car0.clone();

      HashMap<String,Vehicle> vehicles = new HashMap<String,Vehicle>();
      vehicles.put("aaa",car2);
      vehicles.put("aabb",car0);
      vehicles.put("aabb",car3);

      assertEquals(4, car1.calculateTraffic(vehicles), 0.1);
  }

    /*Teste Manual */
    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        Point2D.Double point2D_Double0 = new Point2D.Double();
        Car car0 = new Car("mercedes", 1.5, point2D_Double0, "umer.Car");
        Car car1 = new Car(car0);
        //Car car2 = car1.clone();

        assertEquals(1.5, car1.getPrice(), 0.01);
    }

    /*Teste Manual */
    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        Point2D.Double point2D_Double0 = new Point2D.Double();
        Car car0 = new Car("mercedes", 1.5, point2D_Double0, "umer.Car");
        Car car1 = new Car(car0);
        //Car car2 = car1.clone();

        assertEquals(65, car1.getSpeed(), 0.01);
    }

    /*Teste Manual */
    @Test(timeout = 4000)
    public void test12()  throws Throwable  {
        Point2D.Double point2D_Double0 = new Point2D.Double();
        Car car0 = new Car("mercedes", 1.5, point2D_Double0, "umer.Car");
        Car car1 = new Car(car0);
        //Car car2 = car1.clone();

        assertEquals(4, car1.getSeats(), 0.01);
    }

}
