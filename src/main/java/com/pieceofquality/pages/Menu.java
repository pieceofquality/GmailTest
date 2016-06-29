package com.pieceofquality.pages;

import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by piece on 27.06.2016.
 */
public class Menu {

        public static void refresh() {
            $(".nu").click();
        }

        public static void goToSent() {
            $(byTitle("Sent Mail")).click();
        }

        public static void goToInbox() {
            $("[title~='Inbox']").click();
        }
}
