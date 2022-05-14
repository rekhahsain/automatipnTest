package Com.testpractice.testCases;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.testpractice.pageObjects.HomePage;

public class TC_searchProduct extends BaseClass {
	@Test
	public void SearchProductTest() throws InterruptedException {
		
		logger.info("Url is opened");{
			HomePage Home = new HomePage(driver);
			Home.ClickSearch();
			Thread.sleep(2000);
			
			logger.info("Entered Value- Dresses");
			Home.EnterSearchText("Dresses");
			Thread.sleep(2000);
			
			logger.info("Click on search button");
			Home.CickSearchButton();
			Thread.sleep(2000);
			
			logger.info("Click on Product");
			Home.ChooseProduct();
			Thread.sleep(2000);
			
			logger.info("Click on + button");
			Home.ClickOnPlusButton();
			Thread.sleep(2000);
			
			logger.info("Click on Add to cart button");
			Home.ClickAddToCartButton();
			Thread.sleep(2000);
			
			logger.info("Click on Procced to checkout button");
			Home.ClickProceedToCheckOut();
			Thread.sleep(1000);

			logger.info("Click on Procced to checkout button");
			Home.ClickProceedToCheckOut2();
			Thread.sleep(2000);
			
			
			
			
			
			
			
			
		
			
			
			
		
	

}
	}
	}
