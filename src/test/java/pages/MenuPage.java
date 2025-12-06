package pages;

import com.microsoft.playwright.Page;

public class MenuPage {

    private Page page;

    private String menuProfileIcon = "//div[contains(@class,'profile')]";
    private String logoutButton = "//a[contains(text(),'Logout')]";

    public MenuPage(Page page) {
        this.page = page;
    }

    public void logout() {
        page.click(menuProfileIcon);
        page.click(logoutButton);
    }
}
