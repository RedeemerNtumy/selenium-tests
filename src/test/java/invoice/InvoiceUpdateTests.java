package invoice;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DetailsPage;
import pages.EditInvoicePage;

import static org.testng.Assert.assertNotEquals;

public class InvoiceUpdateTests extends BaseTests {

    @Test
    public void testInvoiceUpdate(){
        DetailsPage detailsPage=homePage.navigateToDetailsPage();
        EditInvoicePage editInvoicePage = detailsPage.clickEditButton();
        assertNotEquals(detailsPage.getDetailsPageUrl(),editInvoicePage.getEditInvoicePageUrl());
    }
}
