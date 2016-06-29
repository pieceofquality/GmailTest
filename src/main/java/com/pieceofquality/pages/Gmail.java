package com.pieceofquality.pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by piece on 27.06.2016.
 */
public class Gmail {

    public static void visit() {
        open("http://gmail.com");
    }

    public static void logIn(String email, String pass) {
        $("#Email").setValue(email);
        $("#next").click();
        $("#Passwd").setValue(pass);
        $("#signIn").click();
    }
}
