package ua.training.controller;

import ua.training.model.Entity.Notebook;
import ua.training.view.View;

import java.util.Scanner;

import static ua.training.controller.RegexContainer.*;
import static ua.training.view.TextConstant.FIRST_NAME;
import static ua.training.view.TextConstant.LOGIN_DATA;

public class InputToNoteBook {
    private View view;
    private Scanner sc;
    private Notebook notebook;

    private String firstName;
    private String login;

    public InputToNoteBook(View view, Scanner sc, Notebook notebook) {
        this.view = view;
        this.sc = sc;
        this.notebook = notebook;
    }

    public void inputNote() {
        UtilityController utilityController =
                new UtilityController(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        this.firstName =
                utilityController.inputStringValueWithScanner
                        (FIRST_NAME, str);
        this.login =
                utilityController.inputStringValueWithScanner
                        (LOGIN_DATA, REGEX_LOGIN);
    }
}