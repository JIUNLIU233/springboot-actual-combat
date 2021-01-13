# Chapter2 Spring常用配置

## demo1-Bean的Scope        
* @Scope 描述Spring容器如何新建Bean实例

        Singleton 一个spring容器只有一个Bean实例，此为Spring默认配置，全容器共享一个实例
        Prototype 每次调用新建一个Bean的实例。
        Request web项目中，给每一个http request新建一个Bean实例
        Session web项目中，给每一个http session新建一个Bean实例
        GlobalSession 这个只在protal应用中使用，给每一个global http session新建一个Bean实例。
## Spring EL 和资源调用
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