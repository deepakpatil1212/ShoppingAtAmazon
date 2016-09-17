package tests;

import omelet.data.IProperty;
import omelet.data.driverconf.IBrowserConf;
import omelet.testng.support.SAssert;
import org.testng.annotations.Test;
import common.PageObjectFactory;


public class ProductSearchTest {
	
	SAssert sassert = new SAssert();

	@Test (dataProviderClass = omelet.data.DataProvider.class, dataProvider = "XmlData")
	public void productSearchTest(IBrowserConf browserConf, IProperty prop) {
		
		PageObjectFactory pof = new PageObjectFactory(browserConf, prop);
		pof.amazonHomePage().Accessurl();
		pof.amazonHomePage().searchProduct();
		pof.productsPage().verifyProduct();
		sassert.assertAll();
	}
	
}
