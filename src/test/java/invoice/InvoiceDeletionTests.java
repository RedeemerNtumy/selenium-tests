package invoice;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DetailsPage;

import static org.testng.Assert.assertTrue;

public class InvoiceDeletionTests extends BaseTests {

    @Test
    public void testInvoiceDeletion(){
        DetailsPage detailsPage=homePage.navigateToDetailsPage();
        detailsPage.clickDeleteButton();
        detailsPage.clickConfirmDeleteButton();
        assertTrue(!homePage.getAllInvoiceNumbers().contains("# RT2080"));
    }

    @Test
    public void testInvoiceCancelDeletion(){
        DetailsPage detailsPage=homePage.navigateToDetailsPage();
        detailsPage.clickDeleteButton();
        detailsPage.clickCancelDeleteButton();
        detailsPage.clickGoBackButton();
        assertTrue(homePage.getAllInvoiceNumbers().contains("# RT2080"));
    }
}
