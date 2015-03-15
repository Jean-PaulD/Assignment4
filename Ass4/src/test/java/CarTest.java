/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.ass4.Audi;
import com.mycompany.ass4.BMW;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JEAN-PAUL
 */
public class CarTest {
    
    public CarTest() {
    }
    
    @Test
    public void testBMW(){
        BMW bmw = new BMW();
        
        Assert.assertEquals(bmw.getCountry(), "Germany");
        
    }
    
    @Test
    public void testAudi(){
        Audi a = new Audi();
        
        Assert.assertEquals(a.getCountry(), "Germany");
        
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
