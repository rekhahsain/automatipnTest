package Com.testpractice.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage {
	WebDriver ldriver;
	public HomePage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//*[@id=\"search_query_top\"]")
	@CacheLookup
	WebElement SearchClick;
	
	@FindBy(xpath="//*[@id=\"search_query_top\"]")
	@CacheLookup
	WebElement EnterValues;
	
	@FindBy(xpath="//*[@id=\"searchbox\"]/button")
	@CacheLookup
	WebElement SearchButtonClick;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img") 
	@CacheLookup
	WebElement ClickOnProduct;
	
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
	@CacheLookup
	WebElement AddToCart;
	
	@FindBy(xpath="//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")
	@CacheLookup
	WebElement IncreaseQuantity;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	@CacheLookup
	WebElement ProceedToCheckOut;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span")
	@CacheLookup
	WebElement ProceedToCheckOut2;
	
	
	
	public void ClickSearch() {
		SearchClick.click();
	}
	
	public void EnterSearchText(String SearchProduct) {
		EnterValues.sendKeys(SearchProduct);
	}
	
	
	public void CickSearchButton(){
		SearchButtonClick.click();
	}
	
	
	public void ChooseProduct() {
		ClickOnProduct.click();
	}
	
	
	public void ClickAddToCartButton() {
		AddToCart.click();
	}
	
	public void ClickOnPlusButton() {
		IncreaseQuantity.click();
	}
	
	
	public void ClickProceedToCheckOut() {
		ProceedToCheckOut.click();
	}
	
	public void ClickProceedToCheckOut2() {
		ProceedToCheckOut2.click();
	}
	
	
	

}