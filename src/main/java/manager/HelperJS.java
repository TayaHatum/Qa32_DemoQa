package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

    public void typeJS(String name, String email) {

        // type name
       // wd.findElement(By.id("userName")).sendKeys(name);
        //document.querySelector('#userName').value='John';
        JavascriptExecutor executor = (JavascriptExecutor) wd;
       // executor.executeScript("document.querySelector('#userName').value='John';");
        executor.executeScript("document.querySelector('#userName').value='"+name+"';");


       // executor.executeScript("document.querySelector('#userEmail').value='john@mail.com';");
        executor.executeScript(String.format("document.querySelector('#userEmail').value='%s';",email));


    }

    public void clickBtnJS() {
        JavascriptExecutor executor = (JavascriptExecutor) wd;
        executor.executeScript("document.querySelector('#submit').style.background='Red';");
        executor.executeScript("document.querySelector('#submit').click();");
        //document.querySelector('#submit').click();
    }
}
