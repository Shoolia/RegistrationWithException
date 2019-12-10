package ua.training.controller;

import ua.training.model.Entity.Notebook;
import ua.training.model.Model;
import ua.training.model.NicknameWithException;
import ua.training.view.TextConstant;
import ua.training.view.View;

import java.util.Scanner;

public class UtilityController {
    private Scanner scanner;
    private View view;
    private Model model;


    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    String inputStringValueWithScanner(String message, String regex) {
        String res;
        view.printStringInput(message);
        while( !(scanner.hasNext() &&
                (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return res;
    }

    public void tryToSetNote(InputToNoteBook inputToNoteBook, Notebook note) {

        while (true) {
            try {
                model.setNote(note);
                break;
            } catch (NicknameWithException exception) {
                view.printMessage(TextConstant.LOGIN_DATA);

            }
        }
    }
}
