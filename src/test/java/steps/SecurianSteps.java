package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SecurianPages;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.Utils;

import javax.rmi.CORBA.Util;


public class SecurianSteps extends SecurianPages {
Utils utils = new Utils();
    @When("user user launch the page")
    public void user_user_launch_the_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("securian_page"));
    }

    @Then("User enters {string} to inputBox")
    public void user_enters_to_quantity(String key) {
        if (key.equalsIgnoreCase("currentAge")) {
            currentAge.click();
            currentAge.sendKeys("48");
        } else if (key.equalsIgnoreCase("retirement")) {
            retirement.click();
            retirement.sendKeys("68");
        } else if (key.equalsIgnoreCase("currentAnnualIncome")) {
            currentAnnualIncome.click();
            currentAnnualIncome.sendKeys("100,000");
        } else if (key.equalsIgnoreCase("spouseAnnualIncome")) {
            spouseAnnualIncome.click();
            spouseAnnualIncome.sendKeys("75000");
        } else if (key.equalsIgnoreCase("currentRetireSavings")) {
            currentRetireSavings.click();
            currentRetireSavings.sendKeys("500000");
        } else if (key.equalsIgnoreCase("currentRetireContribution")) {
            currentRetireContribution.click();
            currentRetireContribution.sendKeys("10");
        } else if (key.equalsIgnoreCase("annualRetirementContributionIncrease")) {
            annualRetirementContributionIncrease.click();
            annualRetirementContributionIncrease.sendKeys(".25");
        } else if (key.equalsIgnoreCase("socialSecurityOverride")) {
            socialSecurityOverride.click();
            socialSecurityOverride.sendKeys("4000");
        } else if (key.equalsIgnoreCase("additionalOtherIncome")) {
            additionalOtherIncome.click();
            additionalOtherIncome.sendKeys("500");
        } else if (key.equalsIgnoreCase("numberOfYearsRetirement")) {
            numberOfYearsRetirement.click();
            numberOfYearsRetirement.sendKeys("20");
        } else if (key.equalsIgnoreCase("percentOfinFalAnnualIncomeDesired")) {
            percentOfinFalAnnualIncomeDesired.click();
            percentOfinFalAnnualIncomeDesired.sendKeys("75");
        } else if (key.equalsIgnoreCase("preRetirementInvestmentReturn")) {
            preRetirementInvestmentReturn.click();
            preRetirementInvestmentReturn.sendKeys("8");
        } else if (key.equalsIgnoreCase("postRetirementInvestmentReturn")) {
            postRetirementInvestmentReturn.click();
            postRetirementInvestmentReturn.sendKeys("5");
        }

    }

    @Then("User user click on {string} button")
    public void user_user_click_on_button(String key) {
        if (key.equalsIgnoreCase("Social_Security_income")) {
            socialSecurityIncome.click();
        } else if (key.equalsIgnoreCase("relatantipStatus")) {
            relatantipStatus.click();
        } else if (key.equalsIgnoreCase("adjustDefaultValuesButton")) {
            adjustDefaultValuesButton.click();
        } else if (key.equalsIgnoreCase("postRetirementIncomeIncreaseWithInflation")) {
            postRetirementIncomeIncreaseWithInflation.click();
        } else if (key.equalsIgnoreCase("save")) {
            saveButton.click();
        } else if (key.equalsIgnoreCase("calculate")) {
            calculatorButton.click();
        }
    }

    @Then("User user validates on {string} is displayed")
    public void user_user_validates_on_is_displayed(String string) {
        utils.waitForElementToPresent(results);
        Assert.assertTrue(results.isDisplayed());

    }



}
