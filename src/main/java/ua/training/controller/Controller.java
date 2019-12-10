package ua.training.controller;


import ua.training.model.Entity.Notebook;
import ua.training.model.Model;
import ua.training.view.View;
import java.util.Scanner;

public class Controller {

        private Model model;
        private View view;
        private Notebook notebook;
//        private UtilityController utilityController;


        public Controller(Model model, View view,Notebook notebook) {
            this.model = model;
            this.view = view;
            this.notebook = notebook;


        }

        public void processUser() {
            Scanner sc = new Scanner(System.in);
            InputToNoteBook inputToNoteBook =
                    new InputToNoteBook(view, sc, notebook);
//            utilityController.tryToSetNote(inputToNoteBook,notebook);
            inputToNoteBook.inputNote();
        }

    }

