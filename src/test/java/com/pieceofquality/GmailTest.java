package com.pieceofquality;

import com.codeborne.selenide.Configuration;
import com.pieceofquality.pages.Gmail;
import com.pieceofquality.pages.Mails;
import com.pieceofquality.pages.Menu;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.pieceofquality.Credentials.email;
import static com.pieceofquality.Credentials.password;
import static com.pieceofquality.Helpers.getUniqueText;

/**
 * Created by piece on 27.06.2016.
 */
public class GmailTest {

    @BeforeClass
    public static void setup() {
        Configuration.timeout = 20000;
    }

    @Test
    public void testSendAndSearchEmail()  {
        Gmail.visit();
        Gmail.logIn(email, password);


        Mails.send(email, subject);
        Menu.refresh();
        Mails.assertMail(0, subject);

        Menu.goToSent();
        Mails.assertMail(0, subject);

        Menu.goToInbox();
        Mails.searchBySubject(subject);
        Mails.assertMails(subject);
    }

    String subject  = getUniqueText("selenide");
}
