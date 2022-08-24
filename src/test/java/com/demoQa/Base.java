package com.demoQa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.AuthorizationPage;

import static com.codeborne.selenide.Selenide.open;

public class Base {

    AuthorizationPage authorizationPage = new AuthorizationPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @BeforeEach
    public void beforeEach() {
        open("/automation-practice-form");
    }
}
