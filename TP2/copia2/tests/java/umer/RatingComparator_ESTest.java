package umer;/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 19 10:00:28 GMT 2018
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RatingComparator_ESTest extends RatingComparator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RatingComparator ratingComparator0 = new RatingComparator();
      Double double0 = new Double(496.71);
      Double double1 = new Double((-846.02578076383));
      Driver driver0 = mock(Driver.class, new ViolatedAssumptionAnswer());
      doReturn(double0, double0, double0, double1).when(driver0).getRating();
      doReturn("", "").when(driver0).getEmail();
      int int0 = ratingComparator0.compare(driver0, driver0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RatingComparator ratingComparator0 = new RatingComparator();
      Driver driver0 = mock(Driver.class, new ViolatedAssumptionAnswer());
      doReturn((Double) null).when(driver0).getRating();
      Driver driver1 = mock(Driver.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ratingComparator0.compare(driver0, driver1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umer.RatingComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RatingComparator ratingComparator0 = new RatingComparator();
      Double double0 = new Double((-3151.60600450943));
      Double double1 = new Double((-1.0));
      Driver driver0 = mock(Driver.class, new ViolatedAssumptionAnswer());
      doReturn(double0, double1, double0, double1).when(driver0).getRating();
      int int0 = ratingComparator0.compare(driver0, driver0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RatingComparator ratingComparator0 = new RatingComparator();
      Double double0 = new Double((-1.0));
      Double double1 = new Double((-3151.60600450943));
      Driver driver0 = mock(Driver.class, new ViolatedAssumptionAnswer());
      doReturn(double0, double1).when(driver0).getRating();
      int int0 = ratingComparator0.compare(driver0, driver0);
      assertEquals((-1), int0);
  }
}
