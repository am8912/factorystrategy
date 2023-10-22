package factorystrategy;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProductStrategyFactory implements InitializingBean {

	private List<ProductStrategy> productStrategies;

	private static Map<ProductType, ProductStrategy> productStrategyMap;

	@Override
	// 初始化bean的时候执行，将策略存入map当中
	public void afterPropertiesSet() throws Exception {
		productStrategyMap = productStrategies.stream()
				.collect(Collectors.toMap(ProductStrategy::getProductType, Function.identity()));
	}

	// 根据产品类型获取对应的策略
	public static ProductStrategy getProductStrategy(ProductType productType) throws Exception {
		if (productType == null) {
			throw new Exception("productType不能为空!");
		}
		return productStrategyMap.get(productType);
	}
}
