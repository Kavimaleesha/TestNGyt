package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnTest {

    @Test()
    public void oLevel(){
        System.out.println("O/level");
//        Assert.fail();
    }

    @Test(dependsOnMethods = "oLevel")
    public void aLevel(){
        System.out.println("A/level");
    }

    @Test(dependsOnMethods = {"oLevel","aLevel"}, alwaysRun = true)
    public void campus(){
        System.out.println("Campus");
    }


}
