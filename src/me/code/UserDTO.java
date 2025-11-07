package me.code;

public class UserDTO {

    private int Id;
    private String username;
    private String email;

    public UserDTO(int Id, String username, String email) {
        this.Id = Id;
        this.username = username;
        this.email = email;
    }

    public int getId() {
        return Id;
    }

    public String getUsername(){
        return username;
    }

    public String getEmail(){
        return email;
    }

    @Override
    public String toString() {
        return Id + ", " + username + ", " + email;
    }
}
