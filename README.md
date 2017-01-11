# SpringEventBus
对guava EventBus进行spring化，并且实现全部注解配置
使用方式如下：

1.配置EventBus

@Configuration
@EnableEventBus
public class EventBusConfig {

    @Bean
    public SpringEventBus springEventBus() {
        return new SpringEventBus();
    }
}

2.在使用方法中调用

  springEventBus.publish(event);

3.实现事件监听器

public class MessageEventListener implements EventListener {

    @Subscribe
    public <Message> void onEvent(Message event) {
       //进行业务处理
    }
}
