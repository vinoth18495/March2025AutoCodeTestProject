package TestNG;

import org.testng.annotations.Test;

public class Groups {

    @Test(groups = {"Apple"})
    public void Apple1() {
        System.out.println("Apple testing");
    }

    @Test(groups = {"Apple"})
    public void Apple2() {
        System.out.println("Apple testing");
    }

    @Test(groups = {"vivo"})
    public void vivo1() {
        System.out.println("vivo testing");
    }

    @Test(groups = {"vivo"})
    public void vivo2() {
        System.out.println("vivo testing");
    }

    @Test(groups = {"oppo"})
    public void oppo1() {
        System.out.println("oppo testing");
    }

    @Test(groups = {"oppo"})
    public void oppo2() {
        System.out.println("oppo testing");
    }

    @Test(groups = {"moto"})
    public void moto1() {
        System.out.println("moto testing");
    }

    @Test(groups = {"moto"})
    public void moto2() {
        System.out.println("moto testing");
    }


}


