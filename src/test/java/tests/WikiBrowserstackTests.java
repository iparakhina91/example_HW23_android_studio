package tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;

@Tag("remote")
public class WikiBrowserstackTests extends TestBase {

    @Test
    @Owner("korovinaiyu")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Check that on the login page there is information about privacy policy")
    void checkAvailabilityOfPrivacyPolicy() {
        step("Click menu button", () ->
                $(id("org.wikipedia.alpha:id/menu_overflow_button")).click());

        step("Click button log in", () ->
                $(id("org.wikipedia.alpha:id/explore_overflow_account_name")).click());

        step("Check that on the page there is information about privacy policy", () ->
                $(id("org.wikipedia.alpha:id/privacy_policy_link")).
                        shouldHave(text("Privacy policy")));
    }
}
