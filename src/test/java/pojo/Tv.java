package pojo;

import org.testng.TestException;
import pages.ProductPage;

public class Tv {
	private String productTitle = "";

	public Tv() {
	}

	@Override
	public String toString() {
		return String.format("Product Title:  " + this.productTitle + "\n");
	}

	public void loadInfoFromProductPage() {
		ProductPage productPage = new ProductPage();
		String currentURL = productPage.getCurrentURL();

		if (!currentURL.contains("product")) {
			throw new TestException(
					"LOAD INFO ERROR: Product data should only be loaded from product page!\nCurrent URL: "
							+ currentURL);
		} else {
			System.out.println("LOAD_INFO: Loading data...\n");
			this.productTitle = productPage.getProductTitle();
		}
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

}
