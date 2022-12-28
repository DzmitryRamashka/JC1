package home_work9;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest{
    @Test
    public void dragAndDropLinkTest() {

        HomePage homePage = new HomePage();
        DragAndDropPage dragAndDropPage = new DragAndDropPage();


        homePage.clickDragAndDropLink();

        Assert.assertEquals(dragAndDropPage.getHeader(),"Drag and Drop");
    }
}
