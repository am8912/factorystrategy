package factorystrategy;

public enum ProductType {
	/**
	 * 产品类型1
	 */
	ALPHA(0, "α"),
	/**
	 * 产品类型2
	 */
	BETA(1, "β"),
	/**
	 * 产品类型3
	 */
	GAMMA(2, "γ");

	private Integer code;
	private String desc;

	private ProductType(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public Integer getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

}
