package ua.training.model;

import ua.training.model.Entity.Notebook;

public class NicknameWithException extends Exception{

        private Notebook note;

        NicknameWithException (Notebook note) {
            this.note = note;
        }

        public Notebook getNote() {
            return note;
        }

    }

