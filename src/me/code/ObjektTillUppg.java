package me.code;

public class ObjektTillUppg {
    @AutoCall
    void testMethodOne() {
        System.out.println("test one");
    }
    @AutoCall
    void testMethodTwo() {
        System.out.println("test two");
    }
    @AutoCall
    void testMethodThree() {
        System.out.println("test three");
    }
    void testMethodFour() { //ska inte köras
        System.out.println("test four");
    }
}
