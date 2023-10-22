package factorystrategy;

public interface ProductStrategy {

    /**
     * 获取产品类型
     * @return 产品类型
     */
    ProductType getProductType();

    /**
     * 处理订单信息
     * @param productOrderInfo 订单信息
     * @return 处理结果
     */
    boolean processProduct(ProductOrderInfo productOrderInfo);
}
