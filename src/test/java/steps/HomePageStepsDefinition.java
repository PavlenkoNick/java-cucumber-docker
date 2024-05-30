package steps;

import io.cucumber.java.en.Given;

public class HomePageStepsDefinition {
    CommonSteps steps = new steps.CommonSteps();

    @Given("A user navigates to the home page")
    public void a_user_navigates_to_the_home_page() {
        steps.openUrl("https://letcode.in/test");
    }

}
