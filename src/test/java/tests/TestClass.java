package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

    //mvn test
    //mvn test -Dtest=JAVACLASS
    //mvn test -Dtest=JAVACLASS#METHODNAME
    //mvn test -Dgroups=GROUPNAME

    @Test
    public void loginTest(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void failureTest(){
        Assert.assertFalse(true);
    }

    @Test
    public void testTrue(){
        Assert.assertTrue(false);
    }
}
