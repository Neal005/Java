package Lab1;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;

public class CalcTest{
    
    private Mycalc calc;
    
    @Before
    public void setUp() {
        calc = new Mycalc();
    }
    
    @After
    public void tearDown() {
        calc = null;
    }
    
    @Test
    public void testAdd() {
        int num1 = 2;
        int num2 = 3;
        int expected = 5;
        assertEquals(expected, calc.add(num1,num2));
    }
    
    @Test
    public void testMul(){
        int num1=2;
        int num2=3;
        int expected=6;
        assertEquals(expected,calc.mul(num1,num2));
    }
    
    @Test
    public void testSub(){
        int num1=2;
        int num2=3;
        int expected=-1;
        assertEquals(expected,calc.sub(num1,num2));
    }
    
    @Test
    public void testDiv(){
        int num1=6;
        int num2=3;
        int expected=2;
        assertEquals(expected,calc.div(num1,num2),0.01);
    }
    
    @Test
    public void testMin() {
        int num1 = 2;
        int num2 = 3;
        int expected = 2;
        assertEquals(expected, calc.min(num1,num2));
    }
    
    @Test
    public void testMax(){
        int num1=2;
        int num2=3;
        int expected=3;
        assertEquals(expected,calc.max(num1,num2));
    }
    
    @Test
    public void testEqual(){
        int num1=2;
        int num2=3;
        int expected=0;
        assertEquals(expected,calc.equal(num1,num2));
    }
    
    @Test
    public void testMux(){
        int x=2;
        int n=3;
        int expected=8;
        assertEquals(expected,calc.mux(x,n));
    }
    
    @Test
    public void testQrt(){
        int x=3;
        int expected=9;
        assertEquals(expected,calc.qrt(x));
    }
    
    @Test
    public void testProgression(){
        int x=2;
        int d=3;
        int n=3;
        int expected=8;
        assertEquals(expected,calc.progression(x,d,n));
    }
    
    @Test
    public void testSumProgression(){
        int x=2;
        int d=3;
        int n=3;
        int expected=15;
        assertEquals(expected,calc.sumProgression(x,d,n),0.01);
    }
}
