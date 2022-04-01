package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JSTests extends TestBase{

    @BeforeMethod
    public void preCondition(){
        app.js().selectItemElements();
        app.js().selectTextBox();

    }
    @Test
    public void textBoxJS(){

        app.js().typeJS("John","john@mail.com");
        app.js().clickBtnJS();
    }
}
