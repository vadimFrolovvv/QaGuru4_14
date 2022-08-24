package com.demoQa;

import org.junit.jupiter.api.Test;

public class DemoQaTest extends Base {

    String  firstName = "Vadim",
            lastName = "Frolov",
            userEmail = "vadim.frolov.2018@inbox.ru",
            userNumber = "8999612028",
            currentAddress = "Moscow",
            userGender = "Male",
            userHobbies = "Sports",
            day = "15",
            month = "October",
            year = "1998",
            subjects = "Physics",
            subjectsTwo = "Computer Science",
            stateName = "NCR",
            city = "Delhi",
            fileName = "file.png";

    @Test
    public void formHomework () {
        authorizationPage.setName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .clickRadiButtonGender(userGender)
                .setUserNumber(userNumber)
                .selectDateOfBirthDay(year, month, day)
                .pressSubject(subjects)
                .pressSubject(subjectsTwo)
                .clickRadiButtonHobbies(userHobbies)
                .uploadFile(fileName)
                .setUserAdress(currentAddress)
                .setState(stateName)
                .setCity(city)
                .clickSubmit();

        authorizationPage
                .checkForm("Student Name", firstName + " " + lastName)
                .checkForm("Student Email", userEmail)
                .checkForm("Gender", userGender)
                .checkForm("Mobile", userNumber)
                .checkForm("Date of Birth", day + " " + month + "," + year)
                .checkForm("Subjects", subjects)
                .checkForm("Hobbies", userHobbies)
                .checkForm("Address", currentAddress)
                .checkForm("Picture", fileName)
                .checkForm("State and City", stateName + " " + city);
    }
}

