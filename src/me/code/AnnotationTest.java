package me.code;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationTest {
    public void run() {
        ObjektTillUppg objektTillUppg = new ObjektTillUppg();

        callAllMethods(objektTillUppg);
    }

    public void callAllMethods(ObjektTillUppg objektTillUppg){
        try {
            Class<?> clazz = objektTillUppg.getClass();
            Object object = clazz.newInstance();
            Method[] methods = clazz.getDeclaredMethods();

            for (Method m : methods) {
                if (m.isAnnotationPresent(AutoCall.class)) {
                    System.out.println("Auto calling method: " + m.getName());
                    m.invoke(object);
                    System.out.println();
                }
            }
        } catch (InvocationTargetException | IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }
}
