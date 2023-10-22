package factorystrategy;

public interface InitializingBean {

    //初始化bean的时候执行
    void afterPropertiesSet() throws Exception;

}
