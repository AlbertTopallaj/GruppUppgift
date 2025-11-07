package me.code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserService {

    public List<UserDTO> getActiveAdminUsers(List<User> users) {

        List<UserDTO> result = users.stream()
                .filter(user -> user.isActive)
                .filter(user -> user.getRole() == UserRole.ADMIN)
                .map(this::convertToDTO)
                .collect(Collectors.toList());

        return result;
    }

    public UserDTO convertToDTO (User user){

        System.out.println(user.getId());

        return new UserDTO(user.getId(), user.getUsername(), user.getEmail());


    }
}
