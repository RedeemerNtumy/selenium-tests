package invoice;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InvoiceSummaryTests extends BaseTests {

    @Test
    public void testViewInvoiceSummary(){
        assertEquals(homePage.getChildFromInvoiceCard("item-id"),
                "# RT2080","Wrong Invoice Number");
        assertEquals(homePage.getChildFromInvoiceCard("item-amount"),
                "£102.04","Wrong Invoice Amount");
        assertEquals(homePage.getChildFromInvoiceCard("item-due-date"),
                "2021-10-12","Wrong Due Date");
        assertEquals(homePage.getChildFromInvoiceCard("name"),
                "Alysa Werner","Wrong Name");
        assertEquals(homePage.getStatusFromInvoiceCard(),
                "● Pending","Wrong Status");
    }
}
