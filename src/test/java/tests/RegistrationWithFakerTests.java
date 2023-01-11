package tests;

import org.junit.jupiter.api.Test;

public class RegistrationWithFakerTests extends tests.TestBase {

    @Test
    void fillFormTest() {
        TestData testData = new TestData();

        registrationPage.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setEmail(testData.email)
                .setGender(testData.gender)
                .setPhone(testData.phone)
                .setBirthDate(testData.dayBirth, testData.monthBirth, testData.yearBirth)
                .setSubject(testData.subject)
                .setHobby(testData.hobby)
                .uploadPicture(testData.picture)
                .setAddress(testData.address)
                .setState(testData.state)
                .setCity(testData.city);

        registrationPage.clickSubmit();

        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", testData.firstName + " " + testData.lastName)
                .verifyResult("Student Email", testData.email)
                .verifyResult("Gender", testData.gender)
                .verifyResult("Mobile", testData.phone)
                .verifyResult("Date of Birth", testData.dayBirth + " " + testData.monthBirth + "," + testData.yearBirth)
                .verifyResult("Subjects", testData.subject)
                .verifyResult("Hobbies", testData.hobby)
                .verifyResult("Picture", testData.picture.getName())
                .verifyResult("Address", testData.address)
                .verifyResult("State and City", testData.state + " " + testData.city);

        registrationPage.clickClose();
    }
}