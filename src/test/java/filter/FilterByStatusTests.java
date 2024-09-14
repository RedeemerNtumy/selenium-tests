package filter;

import base.BaseTests;
import com.google.common.io.Files;
import components.FilterByStatusComponent;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class FilterByStatusTests extends BaseTests {

    @Test
    public void testStatusDraftSelection() throws IOException {
        FilterByStatusComponent filterByStatusComponent = new FilterByStatusComponent(homePage.getDriver());
        filterByStatusComponent.hoverOverFilterByStatus();

        filterByStatusComponent.selectCheckbox(filterByStatusComponent.draftCheckbox);
        takeScreenShot("draft");
        assertTrue(filterByStatusComponent.isCheckboxSelected(filterByStatusComponent.draftCheckbox),
                "Draft checkbox should be selected");


    }

    @Test
    public void testStatusPendingSelection() throws IOException {
        FilterByStatusComponent filterByStatusComponent = new FilterByStatusComponent(homePage.getDriver());
        filterByStatusComponent.hoverOverFilterByStatus();

        filterByStatusComponent.selectCheckbox(filterByStatusComponent.pendingCheckbox);
        takeScreenShot("pending");
        assertTrue(filterByStatusComponent.isCheckboxSelected(filterByStatusComponent.pendingCheckbox),
                "Pending checkbox should be selected");
    }

    @Test
    public void testStatusPaidSelection() throws IOException {
        FilterByStatusComponent filterByStatusComponent = new FilterByStatusComponent(homePage.getDriver());
        filterByStatusComponent.hoverOverFilterByStatus();

        filterByStatusComponent.selectCheckbox(filterByStatusComponent.paidCheckbox);
        takeScreenShot("paid");
        assertTrue(filterByStatusComponent.isCheckboxSelected(filterByStatusComponent.paidCheckbox),
                "Paid checkbox should be selected");
    }

    @Test
    public void testStatusSelection() throws IOException {
        FilterByStatusComponent filterByStatusComponent = new FilterByStatusComponent(homePage.getDriver());
        filterByStatusComponent.hoverOverFilterByStatus();

        filterByStatusComponent.selectCheckbox(filterByStatusComponent.draftCheckbox);
        assertTrue(filterByStatusComponent.isCheckboxSelected(filterByStatusComponent.draftCheckbox),
                "Draft checkbox should be selected");


        filterByStatusComponent.selectCheckbox(filterByStatusComponent.pendingCheckbox);
        assertTrue(filterByStatusComponent.isCheckboxSelected(filterByStatusComponent.pendingCheckbox),
                "Pending checkbox should be selected");

        filterByStatusComponent.selectCheckbox(filterByStatusComponent.paidCheckbox);
        takeScreenShot("AllFilters");
        assertTrue(filterByStatusComponent.isCheckboxSelected(filterByStatusComponent.paidCheckbox),
                "Paid checkbox should be selected");
    }

    public void takeScreenShot(String text) throws IOException {
        var camera=(TakesScreenshot)homePage.getDriver();
        File screenshot=camera.getScreenshotAs(OutputType.FILE);
        Files.move(screenshot,new File("resources/screenshots/filter/"+text+".png"));
    }


}
