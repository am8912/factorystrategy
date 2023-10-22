package factorystrategy;

public class BetaProductStrategy implements ProductStrategy {

    @Override
    public ProductType getProductType() {
        return ProductType.BETA;
    }

    @Override
    public boolean processProduct(ProductOrderInfo productOrderInfo) {
		return false;
       //具体处理逻辑···
    }
}
