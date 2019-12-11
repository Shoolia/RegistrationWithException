package ua.training.model.Entity;

public class Notebook {

    public String name;
    public String nickname;

    public Notebook(String name, String nickname)
            throws NicknameWithException{
        if (BaseOfNickname.checkLogin(nickname)){
            throw new NicknameWithException("Not Unique Login",
                    nickname);
        }
        this.name = name;
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
