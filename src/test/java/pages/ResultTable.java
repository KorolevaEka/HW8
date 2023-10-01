package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResultTable {
    public void checkResult(String key, String value) {
        $(".modal-body").$(byText(key)).parent().shouldBe(Condition.text(value));
    }

}
