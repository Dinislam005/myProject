import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class LoginTest {


    @Test
    void successfulLoginTest() {
        open("https://qa.guru/cms/system/login");
        $("[name=email]").setValue("qagurubot@gmail.com");
        $("[name=password]").setValue("qagurupassword");
    }

    @Test
    void successfulLoginWithCommentsTest() {

        Configuration.holdBrowserOpen = true;
        Configuration.browser = "firefox";
        Configuration.browserSize = "1280x720";

//        Открыть форму авторизации
        open("https://qa.guru/cms/system/login");

//        Ввести адрес электронной почты
        $("[name=email]").setValue("koychakaevd@gmail.com");
//        Ввести пароль
        $("[name=password]").setValue("qagurupassword");
//        Нажать кнопку "Войти"
        $(".btn-success").click();
        $(".btn-error").shouldHave(text("Неверный пароль"));


    }
}
