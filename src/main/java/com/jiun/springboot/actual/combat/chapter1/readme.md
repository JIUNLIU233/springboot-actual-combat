# chapter1 Spring基础
        spring简史，概述，基本配置，以下样例即为本章的基本配置样例

# 样例描述

## [demo1-依赖注入案例](https://github.com/JIUNLIU233/springboot-actual-combat/tree/master/src/main/java/com/jiun/springboot/actual/combat/chapter1/demo1)
使用到的相关点：
#### 声明Bean 注解
* @Component
* @Service
* @Repository
* @Controller
* 可以用在字段上或者卸载setter上
#### 注入Bean的注解
* @Autowire byType 自动注入
* @Resource JSR-250提供的注解 默认byName 自动注入，可通过name和type属性选择注入方式
* @Inject JSR-330提供的注解，现在测试的时候没有试出来
#### 声明配置注解
* @Configuration 声明当前类是一个配置类
* @ComponentScan("packageName") 结合@Configuration使用，配置类自动扫描包名下的声明Bean注解的类，并自动注册为Bean。

## [demo2-Java配置](https://github.com/JIUNLIU233/springboot-actual-combat/tree/master/src/main/java/com/jiun/springboot/actual/combat/chapter1/demo2)
使用到的相关点：
#### 声明配置注解
* @Configuration 声明当前类是一个配置类
* @Bean 表明当前方法返回的是一个spring管理的Bean，详见JavaConfig类
## [demo3-AOP](https://github.com/JIUNLIU233/springboot-actual-combat/tree/master/src/main/java/com/jiun/springboot/actual/combat/chapter1/demo3)
面向切面编程
#### 用到的相关依赖
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-aop</artifactId>
        </dependency>
        <dependency>
            <groupId>org.aspectj</groupId>
            <artifactId>aspectjrt</artifactId>
            <version>1.9.6</version>
        </dependency>
        <dependency>
            <groupId>org.aspectj</groupId>
            <artifactId>aspectjweaver</artifactId>
            <version>1.9.6</version>
        </dependency>
#### 自定义注解
* @interface 表明当前类是一个注解
* @Target 注解用加到的位置，METHOD是方法

        详解：
        TYPE 接口，类，枚举，注解
        FIELD 字段，枚举的常量
        METHOD 方法
        PARAMETER 方法参数
        CONSTRUCTOR 构造函数
        LOCAL_VARIABLE 局部变量
        ANNOTATION_TYPE 注解
        PACKAGE 包
* @Retention 注解保留的位置
        
        详解：RetentionPolicy.
        SOURCE 只在源码级别保留，编译时就会被忽略
        CLASS：编译时默认保留，在class文件中存在，但JVM将会忽略，运行时无法获得，默认的保留策略
        RUNTIME：将会被JVM保留，能够在运行时被JVM或反射机制的代码所读取和使用
* @Documented 说明该注解将会被包含在javadoc中
* @Inherited 说明子类可以继承父类中的该注解

#### 切面声明
* @Pointcut("@annotation(absoluteAnnotationName)")
        
        使用详解：
        annotation中写上自定义注解的全路径名称，然后只要在方法上加上该注解，即可进行全路径拦截
* @After/Before(execution(* absoluteClassName.*(..)))
        
        使用详解：
        execution括号中需要注意 * 后面的这个空格
        class.*(..) 指的是拦截该类的所有方法
        after 是方法执行后
        before 是方法执行前
