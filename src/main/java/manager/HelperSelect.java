package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperSelect extends HelperBase{
    public HelperSelect(WebDriver wd) {
        super(wd);
    }

    public void selectItemWidgets() {
        hideAds();
        click(By.xpath("//div//h5[text()='Widgets']"));
    }

    public void clickSelectMenu() {
        hideFooter();
        click(By.xpath("//span[.='Select Menu']"));
    }


}
