package y22.m05.d27;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class calculatorTest {
    public int a = 10;
    @Before
    public void init(){
        System.out.println("init方法执行了。");
    }
    @After
    public void close(){
        System.out.println("close方法执行了。");
    }

    @Test
    public void addTest(){
        calculator cal = new calculator();
        int res = cal.add(2, 4);
        System.out.println("addTest...");
        Assert.assertEquals(res,6);
    }
}
