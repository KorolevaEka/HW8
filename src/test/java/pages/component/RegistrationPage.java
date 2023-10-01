package pages.component;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.BasePage;
import pages.ResultTable;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage extends BasePage {

    private SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            phoneInput = $("#userNumber"),
            dateOfBirth = $("#dateOfBirthInput"),
            subjectInput = $("#subjectsInput"),
            uploadPicture = $("#uploadPicture"),
            currentAddress = $("#currentAddress"),
            stateField = $("#state"),
            stateCityWrapper = $("#stateCity-wrapper"),
            cityField = $("#city"),
            submitButton = $("#submit"),
            hobbiesWrapper = $("#hobbiesWrapper");

    private CalendarElement calendarElement = new CalendarElement();
    private FillingForm fillingForm = new FillingForm();

    public RegistrationPage openPage(String url) {
        open(url);
        removeBanner();
        return this;
    }

    public RegistrationPage setFirstName(String firstName) {
        firstNameInput.setValue(firstName);
        return this;
    }

    public RegistrationPage setLastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }

    public RegistrationPage setEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    public RegistrationPage selectGender(String gender) {
        $x(String.format("//*[contains(text(),'%s')]", gender)).click();
        return this;
    }

    public RegistrationPage setPhone(String phone) {
        phoneInput.setValue(phone);
        return this;
    }

    public RegistrationPage setCalendar(String month, String year, String day) {
        dateOfBirth.click();
        calendarElement.setupCalendarElement(month, year, day);
        return this;
    }

    public RegistrationPage selectSubject(String subjectFirstLatter) {
        subjectInput.setValue(subjectFirstLatter)
                .pressEnter();
        return this;
    }

    public RegistrationPage uploadPhoto(String fileName) {
        uploadPicture.uploadFromClasspath(fileName);
        return this;
    }

    public RegistrationPage setCurrentAddress(String address) {
        currentAddress.setValue(address);
        return this;
    }

    public RegistrationPage setState(String state) {
        stateField.click();
        stateCityWrapper.$(byText(state)).click();
        return this;
    }

    public RegistrationPage setCity(String city) {
        cityField.click();
        stateCityWrapper.$(byText(city)).click();
        return this;
    }

    public RegistrationPage submitButtonClick() {
        submitButton.click();
        return this;
    }

    public RegistrationPage closeButtonClick() {
        executeJavaScript("document.getElementById('closeLargeModal').click()");
        return this;
    }

    public RegistrationPage selectHobby(String hobby) {
        hobbiesWrapper.$(byText(hobby)).click();
        return this;
    }
}
