package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.DriverUtils;
import actions.OrderActions;
import base.LoadProperties;
import enums.Products;

/*
 *  Created by Tejaswini Khairnar.
 */
public class PurchaseOrder {

	public WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = DriverUtils.getDriver();

	}

	@Test()
	public void test_createPurchaseOrderForSingleProduct()
			throws InterruptedException {
		Products tv = Products.TV;
		String username = LoadProperties.user.getProperty("username");
		String password = LoadProperties.user.getProperty("password");
		OrderActions orderActions = new OrderActions();

		orderActions.navigateToHomePage();

		orderActions.loginAs(username, password);

		orderActions.initializeCart();

		orderActions.addProductToShoppingCartReview(tv);
		orderActions.signOut();
	}

	@AfterClass
	public void browserClose() {
		driver.quit();
	}
}
