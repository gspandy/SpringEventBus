

使用教程
1.配置EventBus
@Configuration
@EnableEventBus
public class com.test.EventBusConfig {

    @Bean
    public SpringEventBus springEventBus() {
        return new SpringEventBus();
    }
}

2.在使用方法中调用springEventBus.publish(event);

3.实现事件监听器
public class com.test.MessageEventListener implements EventListener {

    @Subscribe
    public <com.test.Message> void onEvent(com.test.Message event) {
       //进行业务处理
    }
}