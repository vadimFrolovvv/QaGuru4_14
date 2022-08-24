package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AuthorizationPage {

    private final SelenideElement
            inputFirstName = $("#firstName"),
            inputLastName = $("#lastName"),
            inputUserEmail = $("#userEmail"),
            inputUserNumber = $("#userNumber"),
            dayOfBirthDay = $("#dateOfBirthInput"),
            inputCurrentAddress = $("#currentAddress"),
            inputSubject = $("#subjectsInput"),
            inputFile = $("#uploadPicture"),
            stateAndCityInput = $("#stateCity-wrapper"),
            clickSubmitButton = $("#submit"),
            resultsTable = $(".table-responsive");

    public AuthorizationPage setName(String firstName) {
        inputFirstName.setValue(firstName);

        return this;
    }

    public AuthorizationPage setLastName(String lastName) {
        inputLastName.setValue(lastName);

        return this;
    }

    public AuthorizationPage setUserEmail(String userEmail) {
        inputUserEmail.setValue(userEmail);

        return this;
    }

    public AuthorizationPage setUserNumber(String userNumber) {
        inputUserNumber.setValue(userNumber);

        return this;
    }

    public AuthorizationPage selectDateOfBirthDay(String year, String mounth, String day) {
        dayOfBirthDay.click();
        $$(".react-datepicker__year-select option").findBy(text(year)).click();
        $$(".react-datepicker__month-select option").findBy(text(mounth)).click();
        $$(".react-datepicker__week div").findBy(text(day)).click();

        return this;
    }

    public AuthorizationPage setUserAdress(String currentAddress) {
        inputCurrentAddress.setValue(currentAddress);

        return this;
    }

    public AuthorizationPage clickRadiButtonGender(String userGender) {
        $(byText(userGender)).click();

        return this;
    }

    public AuthorizationPage clickRadiButtonHobbies(String userHobbies) {
        $(byText(userHobbies)).click();

        return this;
    }

    public AuthorizationPage pressSubject(String subjects) {
        inputSubject.setValue(subjects).pressEnter();

        return this;
    }

    public AuthorizationPage uploadFile(String fileName) {
        inputFile.uploadFromClasspath(fileName);

        return this;
    }

    public AuthorizationPage setState(String stateName) {
        stateAndCityInput.$("#state").scrollTo().click();
        $(byText(stateName)).click();

        return this;
    }

    public AuthorizationPage setCity(String cityName) {
        stateAndCityInput.$("#city").click();
        $(byText(cityName)).click();

        return this;
    }

    public AuthorizationPage clickSubmit() {
        clickSubmitButton.click();

        return this;
    }

    public AuthorizationPage checkForm(String fieldName, String value) {
        resultsTable.$(byText(fieldName))
                .parent().shouldHave(text(value));
        return this;
    }
}
