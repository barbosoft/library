package com.example.library.dto;

public class UserRegisterDTO {

    private Long id;
    private String username;
    private String name;
    private String lastName;
    private String email;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRegisterDTO(Long id, String username, String name, String lastName, String email, String password) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public UserRegisterDTO() {
    }

    public UserRegisterDTO(String username, String lastName, String name, String email, String password) {
        this.username = username;
        this.lastName = lastName;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public UserRegisterDTO(String email) {
        this.email = email;
    }
}
