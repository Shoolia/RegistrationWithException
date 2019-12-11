package ua.training.model.Entity;

public enum BaseOfNickname {
    USER1("qwerty123"),
    USER2("s1mple11"),
    USER3("nickname2"),
    USER4("petrov1ch");

    private final String nickname;

    BaseOfNickname(String nickname) {
        this.nickname = nickname;
    }

    public String nickname() {
        return nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public static boolean checkLogin (String loginData){
        for (BaseOfNickname note : BaseOfNickname.values()){
            if (note.getNickname().equals(loginData)){return true;}
        }
        return  false;
    }
}
