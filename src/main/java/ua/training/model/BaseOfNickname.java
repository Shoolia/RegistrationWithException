package ua.training.model;

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
}
