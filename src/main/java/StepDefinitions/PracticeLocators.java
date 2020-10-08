package StepDefinitions;

import org.openqa.selenium.By;

import java.util.function.Supplier;

public enum PracticeLocators implements Supplier<String> {
    TEST_URL("http://demoqa.com/automation-practice-form"),
    LAST_NAME_XPATH("//*[@id='lastName']"),
    FIRST_NAME_XPATH("//*[@id='firstName']"),
    EMAIL_XPATH("//*[@id='userEmail']"),
    GENDER_XPATH("//*[@id='gender-radio-1']"),
    PHONE_XPATH("//*[@id='userNumber']"),
    SPORTS_XPATH("//*[contains(@id, 'hobbies-checkbox-1')]"),
    SUBJECTS_XPATH("//*[@id='subjectsInput']"),
    STATE_XPATH("//*[@id='react-select-3-input']"),
    CITY_XPATH("//*[@id='react-select-4-input']"),
    SUBMIT_XPATH("//*[@id='submit']"),
    CLOSE_BUTTON_XPATH("//*[@id='closeLargeModal']"),
    ADDR_XPATH("//*[@id='currentAddress']");






    PracticeLocators(String loc){
        this.locator = loc;
    }

    private String locator;
    @Override
    public String get() {
        return locator;
    }

}
