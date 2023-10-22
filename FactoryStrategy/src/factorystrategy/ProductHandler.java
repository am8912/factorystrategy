package factorystrategy;

public class ProductHandler{

    //产品策略
    private ProductStrategy productStrategy;

    public ProductHandler(ProductStrategy productStrategy){
        this.productStrategy = productStrategy;
    }

  //处理方法
    public Boolean handler(ProductOrderInfo productOrderInfo) {
                //···处理前
        boolean result = productStrategy.processProduct(productOrderInfo);
                //···处理后
		return result;
    }
}
