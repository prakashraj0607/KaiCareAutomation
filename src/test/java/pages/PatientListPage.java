package pages;

import com.microsoft.playwright.Page;

public class PatientListPage {

    private Page page;

    private String headerSelectAll = "//input[@id='checkAll']";
    private String rowCheckbox = "//input[contains(@id,'checkbox')][1]";
    private String rowList = "//tbody/tr";
    private String communicationButton = "//button[text()=' Communication ']";

    public PatientListPage(Page page) {
        this.page = page;
    }

    public void clickSelectAll() {
        page.click(headerSelectAll);
    }

    public void uncheckOnePatient() {
        page.click(rowCheckbox);
    }

    public int getTotalRows() {
        return page.locator(rowList).count();
    }

    public void clickCommunicationButton() {
        page.click(communicationButton);
    }
}
