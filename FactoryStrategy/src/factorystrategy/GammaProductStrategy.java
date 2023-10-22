package factorystrategy;


public class GammaProductStrategy implements ProductStrategy {

    @Override
    public ProductType getProductType() {
        return ProductType.GAMMA;
    }

    @Override
    public boolean processProduct(ProductOrderInfo productOrderInfo) {
		return false;
       //具体处理逻辑···
    }
}
