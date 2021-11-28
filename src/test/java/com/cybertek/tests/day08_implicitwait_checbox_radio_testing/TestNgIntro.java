package com.cybertek.tests.day08_implicitwait_checbox_radio_testing;

import org.testng.annotations.Test;

public class TestNgIntro {

@Test
    public void test1(){
    System.out.println("Hello world");
    }
    @Test

    public void test2(){
try {


    System.out.println(10 / 0);
}catch (ArithmeticException e){
    System.out.println(e.getMessage());
}

    }

}
