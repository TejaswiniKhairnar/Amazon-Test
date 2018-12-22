package enums;

/**
 * Created by Tejaswini Khairnar
 */
public enum Products {
    TV("B07HB7SSPZ", "Mi LED TV 4C PRO 80 cm (32) HD Ready Android TV (Black)");

    // The price will always fluctuate. The product id and product title will be more or less constant.
    private String id;
    private String productTitle;

    Products(String id, String productTitle){
        this.id = id;
        this.productTitle = productTitle;
    }

    public String getProductId(){
        return id;
    }

    public String getProductTitle(){
        return productTitle;
    }
}
