package pages.component;

import static com.codeborne.selenide.Selenide.$;

public class CalendarElement {
    public void setDate(String day, String month, String year) {
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--0" + day
                + ":not(.react-datepicker__day--outside-month)").click();
    }

    public void setupCalendarElement(String month, String year, String day) {
    }
}