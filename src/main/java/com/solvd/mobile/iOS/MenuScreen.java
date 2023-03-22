package com.solvd.mobile.iOS;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.mobile.common.AboutAppScreenBase;
import com.solvd.mobile.common.MenuScreenBase;
import com.solvd.mobile.common.QRCodeScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE,parentClass = MenuScreenBase.class)
public class MenuScreen extends MenuScreenBase{
    @ExtendedFindBy(iosPredicate = "name == \"QrCodeScanner-menu-item\"")
    private ExtendedWebElement qrCodeBtn;
    public MenuScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public AboutAppScreenBase clickOnAboutButton() {
        return null;
    }

    @Override
    public QRCodeScreenBase clickOnQRCodeButton() {
        qrCodeBtn.click();
        return initPage(getDriver(), QRCodeScreenBase.class);
    }
}