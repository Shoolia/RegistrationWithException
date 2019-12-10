package ua.training.model;

import ua.training.model.Entity.Notebook;

public class Model {
    private Notebook note;

    public void setNote(Notebook note) throws NicknameWithException {
        checkNicknameForUnique(note);
        this.note = note;
    }

    private void checkNicknameForUnique(Notebook note) throws NicknameWithException {
        for (BaseOfNickname nicknames : BaseOfNickname.values()) {
            if (nicknames.nickname().equals(note.nickname)) {
                throw new NicknameWithException(note);
            }
        }
    }
}
