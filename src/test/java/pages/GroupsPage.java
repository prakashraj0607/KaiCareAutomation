package pages;

import com.microsoft.playwright.Page;

public class GroupsPage {

    private Page page;

    private String menuProfileIcon = "//div[contains(@class,'profile')]";
    private String groupsMenu = "//a[contains(text(),'Groups')]";
    private String smsGroup = "//a[contains(text(),'SMS Group')]";
    private String emailGroup = "//a[contains(text(),'Email Group')]";
    private String groupListMenu = "//a[contains(text(),'Group List')]";
    private String groupNameCell = "//tbody/tr/td[1]";
    private String groupCountCell = "//tbody/tr/td[2]";

    public GroupsPage(Page page) {
        this.page = page;
    }

    public void navigateToSMSGroupList() {
        page.click(menuProfileIcon);
        page.click(groupsMenu);
        page.click(smsGroup);
        page.click(groupListMenu);
    }

    public void navigateToEmailGroupList() {
        page.click(menuProfileIcon);
        page.click(groupsMenu);
        page.click(emailGroup);
        page.click(groupListMenu);
    }
}
