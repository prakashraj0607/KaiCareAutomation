package tests;

import base.BaseTest;
import pages.LoginPage;
import pages.DashboardPage;
import pages.PatientListPage;
import pages.CommunicationModalPage;
import pages.GroupsPage;

import org.testng.annotations.Test;

import java.util.Random;

public class EndToEndCommunicationTest extends BaseTest {

    @Test
    public void testSMSGroupAndEmailGroupFlow() throws InterruptedException {

        LoginPage login = new LoginPage(page);
        login.navigateToLoginPage();
        login.login("robertharris@mailinator.com","Admin@123");

   
        DashboardPage dashboard = new DashboardPage(page);
        dashboard.clickTotalPatientsTile();

        PatientListPage patientPage = new PatientListPage(page);
        int tilePatientCount = patientPage.getTotalRows();
        System.out.println("Total Patients Count: " + tilePatientCount);
        patientPage.clickSelectAll();
        patientPage.uncheckOnePatient();
        patientPage.clickCommunicationButton();
        CommunicationModalPage modal = new CommunicationModalPage(page);
        modal.selectSMS();

        Random random = new Random();
        String groupName = "AutomationSMS_" + random.nextInt(1000);
        modal.createNewGroup(groupName);
        Thread.sleep(2000);
        GroupsPage groups = new GroupsPage(page);
        groups.navigateToSMSGroupList();
        dashboard.clickHealthAILogo();
        dashboard.clickNonConsentedTile();

        patientPage.clickSelectAll();
        patientPage.clickCommunicationButton();
        modal.selectEmail();
        modal.sendMail("Automation Test Mail", "Test Automation Mail");

        groups.navigateToEmailGroupList();

        System.out.println("=== End of Scenario ===");
    }
}

