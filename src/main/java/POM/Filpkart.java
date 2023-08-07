package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filpkart {

public Filpkart(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//button[text()='✕']")
private WebElement cancelButton;

@FindBy(xpath="//a[text()='Login']")
private WebElement loginButton;

@FindBy(partialLinkText="New to")
private WebElement link;

@FindBy(xpath="//div[text()='Mobiles']")
private WebElement mobilesLink;

@FindBy(xpath="(//img[@alt='Shop Now'])[1]")
private WebElement shopNow;

@FindBy(xpath="//img[@alt='realme C33 2023 (Aqua Blue, 64 GB)']")
private WebElement mobileImage;

@FindBy(xpath="//button[text()='Add to cart']")
private WebElement addToCart;

public WebElement getCancelButton() {
	return cancelButton;
}

public void setCancelButton(WebElement cancelButton) {
	this.cancelButton = cancelButton;
}

public WebElement getLoginButton() {
	return loginButton;
}

public void setLoginButton(WebElement loginButton) {
	this.loginButton = loginButton;
}

public WebElement getLink() {
	return link;
}

public void setLink(WebElement link) {
	this.link = link;
}

public WebElement getMobilesLink() {
	return mobilesLink;
}

public void setMobilesLink(WebElement mobilesLink) {
	this.mobilesLink = mobilesLink;
}

public WebElement getShopNow() {
	return shopNow;
}

public void setShopNow(WebElement shopNow) {
	this.shopNow = shopNow;
}

public WebElement getMobileImage() {
	return mobileImage;
}

public void setMobileImage(WebElement mobileImage) {
	this.mobileImage = mobileImage;
}

public WebElement getAddToCart() {
	return addToCart;
}

public void setAddToCart(WebElement addToCart) {
	this.addToCart = addToCart;
}

public void launchFilpKart() throws InterruptedException
{
	cancelButton.click();
	loginButton.click();
	link.click();
	cancelButton.click();
	mobilesLink.click();
	Thread.sleep(2000);
	shopNow.click();
	mobileImage.click();
	addToCart.click();
	
}

}
