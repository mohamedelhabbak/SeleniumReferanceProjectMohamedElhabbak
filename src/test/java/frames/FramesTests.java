package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FramesTests extends BaseTests {
    @Test
    public void testFrames() {
        String text="Hello World!";
        var framesPage = homePage.clickWysiwygEditorPage();
        framesPage.clearTextArea();
        framesPage.setTextArea(text);
        framesPage.clickIncreaseIndentButton();
        assertEquals(framesPage.getTextFromEditor(), text);
    }
}
