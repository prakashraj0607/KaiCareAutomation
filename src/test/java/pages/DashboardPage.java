package pages;

import com.microsoft.playwright.Page;

public class DashboardPage {

    private Page page;

    private String totalPatientsTile = "//p[text()='Total Patients']";
    private String nonConsentedTile = "//p[text()='Non-Consented But Eligible']";
    private String myHealthAILogo = "img[src='assets/images/kaiCareLogo1.png']";

    public DashboardPage(Page page) {
        this.page = page;
    }

    public void clickTotalPatientsTile() {
        page.click(totalPatientsTile);
    }

    public void clickNonConsentedTile() {
        page.click(nonConsentedTile);
    }

    public void clickHealthAILogo() {
        page.click(myHealthAILogo);
    }

    public int getTileCount(String tileLocator) {
        String text = page.locator(tileLocator).textContent().trim();
        return Integer.parseInt(text.replaceAll("[^0-9]", ""));
    }
}

