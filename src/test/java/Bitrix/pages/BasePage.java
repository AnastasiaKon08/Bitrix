package Bitrix.pages;

import Bitrix.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.apache.log4j.Logger;
import org.jsoup.Connection;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class BasePage {
    private final  static Logger logger = Logger.getLogger(BasePage.class);
    protected WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    public void navigateTo(String moduleName){
        String xpath = "//span[contains(text(), '"+moduleName+"') and @class='menu-item-link-text']";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).click();
        logger.info("Navigating to: " + moduleName);

    }
}
