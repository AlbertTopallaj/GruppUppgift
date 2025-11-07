package me.code;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        CustomArrayList<Object> list = new CustomArrayList<>();
        CustomArrayList<Object> stringList = new CustomArrayList<>();



        list.display();
        stringList.display();


        stringList.add(0, "Hej");
        stringList.add(1, "Hej2");
        stringList.add(2, "Hej3");
        System.out.println(stringList.get(0));
        System.out.println(stringList.get(1));

        stringList.display();

        stringList.remove(1);
        stringList.remove(2);

        stringList.clear();
        list.clear();

        Class<?> clazz = Class.forName("me.code.Calculator");
        Constructor<?> constructor = clazz.getDeclaredConstructor(int.class);
        constructor.setAccessible(true);
        Object object = constructor.newInstance(1);

        Method method = clazz.getDeclaredMethod("add", int.class);
        method.setAccessible(true);
        Object result = method.invoke(object, 2);
        System.out.println(result); //should print 3

        UserService userService = new UserService();

        List<User> users = new ArrayList<>(Arrays.asList(
                new User(true, UserRole.ADMIN, 01, "admin01", "admin@admin.com"),
                new User(true, UserRole.ADMIN, 06, "admin03", "admin@admin.com"),
                new User(true, UserRole.ADMIN, 01, "admin04", "admin@admin.com"),
                new User(true, UserRole.ADMIN, 01, "admin05", "admin@admin.com"),
                new User(false, UserRole.USER, 02, "user01", "user@user.com"),
                new User(true, UserRole.USER, 02, "user01", "user2@user.com"),
                new User(false, UserRole.ADMIN, 03, "admin05", "admin@admin.com")
        ));

        System.out.println("INNAN FILTERING");

        for (User user : users) {
            System.out.println(user);
        }

        List<UserDTO> userDTOS = userService.getActiveAdminUsers(users);

        // userDTOS.forEach(System.out::println);

        System.out.println("EFTER FILTERING");

       for (UserDTO DTOuser : userDTOS) {

         System.out.println(DTOuser);

        }
        AnnotationTest annotationTest = new AnnotationTest();

        annotationTest.run();

    }


}