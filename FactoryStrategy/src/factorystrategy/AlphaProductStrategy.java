package factorystrategy;


public class AlphaProductStrategy implements ProductStrategy {

    @Override
    public ProductType getProductType() {
        return ProductType.ALPHA;
    }

    @Override
    public boolean processProduct(ProductOrderInfo productOrderInfo) {
		return false;
       //具体处理逻辑···
    }
    
}
