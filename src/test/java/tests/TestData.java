package tests;

import com.github.javafaker.Faker;

import java.io.File;
import java.util.*;

import static tests.TestData1.*;

public class TestData {
    Faker faker = new Faker(new Locale("fr"));
    Random random = new Random();

    String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = getSex(),
            phone = faker.phoneNumber().subscriberNumber(10),
            dayBirth = String.format("%02d", faker.number().numberBetween(1, 29)),
            monthBirth = getMonth(),
            yearBirth = String.valueOf(faker.number().numberBetween(1900, 2101)),
            subject = getSubject(),
            hobby = getHobby(),
            pictureName = getPictureName(),
            address = faker.address().fullAddress(),
            stateAndCity = printRandomMapKeyValueElement(),
            state = getState(),
            city = getCity();
    File picture = new File(pictureName);

    public String getSex() {
        String[] sex = {"Male", "Female", "Other"};
        int index = random.nextInt(sex.length);
        return sex[index];
    }

    public String getMonth() {
        String[] month = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};
        int index = random.nextInt(month.length);
        return month[index];
    }

    public String getSubject() {
        String[] subjects = {"Hindi", "English", "Civics", "Computer Science", "Social Studies",
                "Maths", "Commerce", "Arts", "Biology", "Accounting", "Chemistry", "Economics", "History", "Physics"};
        int index = random.nextInt(subjects.length);
        return subjects[index];
    }

    public String getHobby() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        int index = random.nextInt(hobbies.length);
        return hobbies[index];
    }

    public String getPictureName() {
        String[] pictureNames = {"src/test/resources/apple.jpg", "src/test/resources/orange.jpg", "src/test/resources/pear.jpg"};
        int index = random.nextInt(pictureNames.length);
        return pictureNames[index];
    }

    public String getCity() {
        String cityPart =  stateAndCity.split("-")[0];
        return cityPart;
    }

    public String getState() {
        String statePart = stateAndCity.split("-")[1];
        return statePart;
    }
}