/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rhiscom.jenkins.quickstart;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roberto Lopez
 */
public class MathOperationsTest {
   
   public MathOperationsTest() {
   }
   
   @BeforeClass
   public static void setUpClass() {
   }
   
   @AfterClass
   public static void tearDownClass() {
   }
   
   @Before
   public void setUp() {
   }
   
   @After
   public void tearDown() {
   }

   @Test
   public void testSum() {
      System.out.println("sum");
      int a = 5;
      int b = 3;
      MathOperations instance = new MathOperations();
      int expResult = 8;
      int result = instance.sum(a, b);
      assertEquals(expResult, result);
   }

   @Test
   public void testRest() {
      System.out.println("rest");
      int a = 10;
      int b = 3;
      MathOperations instance = new MathOperations();
      int expResult = 7;
      int result = instance.rest(a, b);
      assertEquals(expResult, result);
   }

   @Test
   public void testMultiply() {
      System.out.println("multiply");
      int a = 0;
      int b = 0;
      MathOperations instance = new MathOperations();
      int expResult = 0;
      int result = instance.multiply(a, b);
      assertEquals(expResult, result);
      fail("The test case is a prototype.");
   }
   
}
