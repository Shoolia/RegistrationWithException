package ua.training.controller;


import ua.training.model.Entity.NicknameWithException;
import ua.training.model.Entity.Notebook;
import ua.training.model.Model;
import ua.training.view.View;
import java.util.Scanner;

public class Controller {

        private Model model;
        private View view;

//        private UtilityController utilityController;


        public Controller(Model model, View view ) {
            this.model = model;
            this.view = view;



        }

        public void processUser() {
            Scanner sc = new Scanner(System.in);
            InputToNoteBook inputToNoteBook =
                    new InputToNoteBook(view, sc);
//            utilityController.tryToSetNote(inputToNoteBook,notebook);
            inputToNoteBook.inputNote();
            Notebook noteBook = getNoteBook(inputToNoteBook);
            System.out.println(noteBook);
        }
    private Notebook getNoteBook(InputToNoteBook inputToNoteBook) {
        Notebook noteBook = null;
        while(true) {
            try {
                noteBook = new Notebook(inputToNoteBook.getName(),
                        inputToNoteBook.getLogin());
                break;
            } catch (NicknameWithException e) {
                e.printStackTrace();
                System.out.println("Not Unique Login " + e.getLoginData());
                inputToNoteBook.inputLogin();
            }
        }
        return noteBook;
    }

    }

