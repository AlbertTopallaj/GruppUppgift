package me.code;

public class User {

    public boolean isActive;
    private UserRole userRole;
    private int Id;
    private String username;
    private String email;

    public User(boolean isActive, UserRole userRole, int Id, String username, String email){
        this.isActive = isActive;
        this.userRole = userRole;
        this.Id = Id;
        this.username = username;
        this.email = email;

    }

    public UserRole getRole() {
        return userRole;
    }

    public int getId() {
        return Id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return username + ", " + isActive + ", " + userRole + ", " + email + ", " + Id;

    }
}
