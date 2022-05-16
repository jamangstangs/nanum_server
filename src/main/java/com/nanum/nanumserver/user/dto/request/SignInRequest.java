package com.nanum.nanumserver.user.dto.request;

public class SignInRequest {
    private String username;
    private String password;

    protected SignInRequest() {
    }

    public SignInRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


}
