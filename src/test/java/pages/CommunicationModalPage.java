package pages;

import com.microsoft.playwright.Page;

public class CommunicationModalPage {

    private Page page;

    private String smsOption = "//button[@title='SMS']";
    private String emailOption = "//button[@title='Email']";
    private String newGroupOption = "//button[contains(text(),'New Group')]";
    private String groupNameInput = "//input[@placeholder='Enter Group Name']";
    private String saveGroupBtn = "//button[contains(text(),'Save Group')]";
    private String sendEmailButton = "//button[contains(text(),'Send')]";
    private String subjectInput = "//input[@placeholder='Enter Subject']";
    private String mailContentTextArea = "//textarea";

    public CommunicationModalPage(Page page) {
        this.page = page;
    }

    public void selectSMS() {
        page.click(smsOption);
    }

    public void selectEmail() {
        page.click(emailOption);
    }

    public void createNewGroup(String groupName) {
        page.click(newGroupOption);
        page.fill(groupNameInput, groupName);
        page.click(saveGroupBtn);
    }

    public void sendMail(String subject, String message) {
        page.fill(subjectInput, subject);
        page.fill(mailContentTextArea, message);
        page.click(sendEmailButton);
    }
}

