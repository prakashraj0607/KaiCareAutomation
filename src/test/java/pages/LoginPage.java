package pages;

import com.microsoft.playwright.Page;

public class LoginPage {

    private Page page;

    private String emailInput = "input[id='email']";
    private String passwordInput = "input[placeholder='Password']";
    private String loginButton = "button[type='submit']";

    public LoginPage(Page page) {
        this.page = page;
    }

    public void navigateToLoginPage() {
        page.navigate("https://doctorstaging.kaicare.ai/");
    }

    public void login(String email, String password) {
        page.fill(emailInput, email);
        page.fill(passwordInput, password);
        page.click(loginButton);
    }
}
