package invoice;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.NewInvoicePage;

import static org.testng.Assert.*;


public class InvoiceCreationTests extends BaseTests {

    @Test
    public void testInvoiceCreation() {
        NewInvoicePage newInvoicePage=homePage.navigateToNewInvoicePage();
        assertNotEquals(homePage.getHomeUrl(),newInvoicePage.getNewInvoicePageUrl());
    }

}
