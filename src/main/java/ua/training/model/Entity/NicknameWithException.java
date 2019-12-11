package ua.training.model.Entity;

import ua.training.model.Entity.Notebook;

public class NicknameWithException extends Exception{
    private String loginData;



    public String getLoginData() {
        return loginData;
    }

    public NicknameWithException(String message, String loginData) {
        super(message);
        this.loginData = loginData;
    }
}

