package TestNG;

import org.testng.annotations.Test;

public class Priority {
    @Test(enabled = true)
    public void highSchool(){
        System.out.println("HighSchool Completed");
    }
    @Test(dependsOnMethods = "highSchool") //if we do run even depondsonmethods false (alwaysRun = true)
    public void higherSecondary(){
        System.out.println("HSLC completed");
    }
    @Test(dependsOnMethods = "higherSecondary")
    public void degree(){
        System.out.println("Doing Degree");
    }
}
