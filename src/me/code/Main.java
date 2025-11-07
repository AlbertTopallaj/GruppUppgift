package me.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

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
    }
}