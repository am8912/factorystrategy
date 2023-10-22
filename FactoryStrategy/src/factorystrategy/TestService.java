package factorystrategy;

public class TestService {

	public static void main(String[] args) throws Exception {
		// ···处理前
		// 构造订单信息
		ProductOrderInfo productOrderInfo = new ProductOrderInfo();
		// 根据产品类型在产品策略工厂获取策略
		ProductStrategy productStrategy = ProductStrategyFactory.getProductStrategy(productOrderInfo.getProductType());
		// 通过产品策略构造产品处理器对象
		ProductHandler productHandler = new ProductHandler(productStrategy);
		// 执行处理操作
		productHandler.handler(productOrderInfo);
		// ···处理后
	}

}
