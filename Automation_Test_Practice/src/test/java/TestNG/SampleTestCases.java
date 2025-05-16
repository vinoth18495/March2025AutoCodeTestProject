package TestNG;

import org.testng.DependencyMap;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersExample.class)
public class SampleTestCases {

//    @Test(priority = 0)   //if want to do not run the test case we can use the (enable = false)
//     public void FirstTestCase(){
//
//         System.out.println("1st case");
//     }
//    @Test() // we want to run multi time use (invocationCount =3, parallel ah work aahanumna 'threadPoolsize = 2')
//    public void SecondTestCase(){
//        System.out.println("2nd case");
//    }
//    @Test
//    public void ThirdTestCase(){
//        System.out.println("3rd case");
//    }
//    @Test
//    public void FourthTestCase(){
//        System.out.println("4th case");
//    }

    @Test
    public void sampleTest() {
        System.out.println("Executing Sample Test");
    }


}
