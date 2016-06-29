package com.pieceofquality.pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by piece on 27.06.2016.
 */
public class Mails {

    public static void send(String to, String subject) {
        $(byText("COMPOSE")).click();
        $(By.name("to")).setValue(to);
        $(By.name("subjectbox")).setValue(subject);
        $(byText("Send")).click();
    }

    public static void assertMails(String... emailTexts) {
        emails.shouldHave(texts(emailTexts));
    }

    public static void assertMail(int index, String subject) {
        emails.get(index).shouldHave(text(subject));
    }

    public static void searchBySubject(String text) {
        $(byName("q")).setValue("subject: " + text).pressEnter();
    }

    public static ElementsCollection emails = $$("[role='main'] .zA");
}
