# Chapter2 Spring常用配置

## demo1-Bean的Scope        
* @Scope 描述Spring容器如何新建Bean实例

        Singleton 一个spring容器只有一个Bean实例，此为Spring默认配置，全容器共享一个实例
        Prototype 每次调用新建一个Bean的实例。
        Request web项目中，给每一个http request新建一个Bean实例
        Session web项目中，给每一个http session新建一个Bean实例
        GlobalSession 这个只在protal应用中使用，给每一个global http session新建一个Bean实例。
## demo2-Spring EL 和资源调用
Spring开发中经常涉及调用各种资源的情况，包含普通文件、网址、配置文件、系统环境变量等，我们可以使用Spring的表达式语言实现资源的注入

* @Value 通过参数中使用表达式实现注入资源信息

        "~~~"   注入普通字符串
        "#{systemProperties['os.name']}"    注入操作系统属性
        "#{T(java.lang.Math).random()*100.0}"   注入表达式结果
        "#{demoService.anther}" 注入其他Bean属性
        "classpath:com/jiun/..../test.txt"  注入文件资源
        "http://www.baidu.com"  注入网址资源
        "${book.name}"  注入配置文件
        
* @PropertySource("classpath:chapter2/demo2/test.properties")
* @Value("classpath:chapter2/demo2/test.txt")
  
        这里的classpath:后面跟的地址是 resources 下的文件地址。
        
        
* 注

        通过@PropertySource 注解的配置文件，可以直接通过：
        org.springframework.core.env.Environment.getProperty(key) 来获取值（字符串类型）。
        
## demo3-Bean的初始化和销毁

        在Bean使用之前和之后进行一些必要的操作。
        
* Java 配置方式：@Bean 的initMethod和destroyMethod
* @PostConstruct 和 @PreDestroy JSR-250 的支持

## demo4-Profile
    
        Profile 为在不同环境下使用不同的配置提供了支持。
        
1)、通过设定Environment的ActiveProfiles来设定当前context需要使用的配置环境。在开发中使用@Profile注解类或者方法，达到在不同情况下选择实例化不同Bean

2）、通过设定jvm的spring.profiles.active 参数来设置配置环境

3）、Web项目设置在Servlet的context parameter中。

## demo5-事件 Application Event

        spring 事件为Bean与Bean之间的消息之间的消息通信提供了支持。当一个Bean处理完一个任务之后，希望另一个Bean知道并做相应的处理。
        这时我们就需要让另一个Bean监听当前Bean所发送的事件。
    
Spring的事件遵循如下流程：
* 自定义事件，继承ApplicationEvent。
* 定义事件监听器，实现ApplicationListener。
* 使用容器发布事件。

思考：
    这里是否可以通过Spring的ApplicationEvent写一个阿里云基于http的mq消费者的监听者呢？
    讲道理是可以的。