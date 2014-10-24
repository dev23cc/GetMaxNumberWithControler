/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getmaxnumberwithcontroller;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class GetMaxNumberWithControllerTest {
    
    public GetMaxNumberWithControllerTest() {
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

    /**
     * Test of getMaxNumber with correct values
     */
    @Test 
    public void testGetMaxNumberWithCorrectNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(2);
        int expResult = 2;
        ListDao dao= new ListDao(numbers);
        //dao.getNumbers();
        GetMaxNumberWithController instance = new GetMaxNumberWithController(dao);        
        int result = instance.getMaxNumber();
        assertEquals(expResult, result);

    }
     /**
     * Test of getMaxNumber with the same values
     */
    @Test 
    public void testGetMaxNumberWithTheSameNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-1);
        numbers.add(-1);
        int expResult = -1;
        ListDao dao= new ListDao(numbers);
        //dao.getNumbers();
        GetMaxNumberWithController instance = new GetMaxNumberWithController(dao);        
        int result = instance.getMaxNumber();
        assertEquals(expResult, result);
    }
     /**
     * Test of getMaxNumber with the same values
     */
    @Test 
    public void testGetMaxNumberNoNumbers() {
        List<Integer> numbers = new ArrayList<>();
        ListDao dao= new ListDao(numbers);
        //dao.getNumbers();
        GetMaxNumberWithController instance = new GetMaxNumberWithController(dao);        
        int result = instance.getMaxNumber();
        assertEquals(null, result);
    }
    
     /**
     * Test of getMaxNumber with the max value n the beginning of the list
     */
    @Test 
    public void testGetMaxNumberWithMaxNumberInTheBeginnng() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(20);
        numbers.add(15);
        numbers.add(10);
        ListDao dao= new ListDao(numbers);
        int expResult=45;
        GetMaxNumberWithController instance = new GetMaxNumberWithController(dao);        
        int result = instance.getMaxNumber();
        assertEquals(expResult, result);
    }
     /**
     * Test of getMaxNumber with the max value n the middle of the list
     */
    @Test 
    public void testGetMaxNumberWithMaxNumberInTheMiddle() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(20);
        numbers.add(10);
        ListDao dao= new ListDao(numbers);
        int expResult=45;
        GetMaxNumberWithController instance = new GetMaxNumberWithController(dao);        
        int result = instance.getMaxNumber();
        assertEquals(expResult, result);
    }
    
     /**
     * Test of getMaxNumber with the max value n the middle of the list
     */
    @Test 
    public void testGetMaxNumberWithMaxNumberInTheEnd() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(10);
        numbers.add(60);
        ListDao dao= new ListDao(numbers);
        int expResult=60;
        GetMaxNumberWithController instance = new GetMaxNumberWithController(dao);        
        int result = instance.getMaxNumber();
        assertEquals(expResult, result);
    }
    
         /**
     * Test of getMaxNumber with positive and negative numbers
     */
    @Test 
    public void testGetMaxNumberWithPositiveAndNegativeNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-990);
        numbers.add(10);
        numbers.add(300);
        numbers.add(200);
        ListDao dao= new ListDao(numbers);
        int expResult=300;
        GetMaxNumberWithController instance = new GetMaxNumberWithController(dao);        
        int result = instance.getMaxNumber();
        assertEquals(expResult, result);
    }
}
