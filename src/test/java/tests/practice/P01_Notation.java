package tests.practice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class P01_Notation {

    @Test @Ignore
    public void ANergiz(){
        System.out.println("Nergiz");
    }


    @Test (priority = 1)
    public void TOmer(){
        System.out.println("Omer");
    }

    @Test (priority = 30)
    public void ESenol(){
        System.out.println("Senol");
    }

    @Test (dependsOnMethods = "ESenol")
    public void ZBugra(){
        System.out.println("Bugra");
    }

}
