package TestCase11POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class POMTestCase11 {

	private WebDriver driver;
	
	public POMTestCase11(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Shop')]")
	private WebElement shopMenu;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	private WebElement homeButton;
	
	@FindBy(xpath="//li[@class='post-160 product type-product status-publish has-post-thumbnail product_cat-selenium product_tag-ruby product_tag-selenium has-post-title no-post-date has-post-category has-post-tag has-post-comment has-post-author first instock downloadable taxable shipping-taxable purchasable product-type-simple']//img[@class='attachment-shop_catalog size-shop_catalog wp-post-image']")
	private WebElement imageRuby;
	
	
	@FindBy(xpath="//button[@class='single_add_to_cart_button button alt']")
	private WebElement addToBasket;
	
	@FindBy(xpath="//span[@class='cartcontents']")
	private WebElement clickOnItem;
	
	@FindBy(xpath="//a[@class='remove']")
	private WebElement clickOnRemove;
	
	public void clickShop()
	{
		this.shopMenu.click();
	}
	
	public void clickHome()
	{
		this.homeButton.click();
	}
	
	
	public void clickOnImage()
	{
		this.imageRuby.click();
	}
	
	public void clickOnAddBasket()
	{
		this.addToBasket.click();
	}
	
	public void clickOnItemButton()
	{
		this.clickOnItem.click();
	}
	
	public void clickOnRemoveButton()
	{
		this.clickOnRemove.click();
	}
}
