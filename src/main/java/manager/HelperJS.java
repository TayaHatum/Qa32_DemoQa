package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperJS extends HelperBase{
    public HelperJS(WebDriver wd) {
        super(wd);
    }

    public void selectItemElements() {
        hideAds();
        hideFooter();
        click(By.xpath("//div[@class='category-cards']/div[1]"));
    }

    public void selectTextBox() {
        click(By.xpath("//span[text()='Text Box']"));
        hideFooter();
    }
}
