import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class VkTest {

    @Test
    void sucssesFullLogin () {

        Configuration.browser="firefox";

        open("https://vk.com/");
        $("[id=index_email]").setValue("koychakaevd@mail.ru");
        $("[class=FlatButton__content]").parent().click();
//        $(byText("Войти")).shouldBe(visible).click();
        $("[surrent-password]").setValue("Viteeagle750810");
        sleep(5000);
        $("FlatButton__content").click();


    }
}
