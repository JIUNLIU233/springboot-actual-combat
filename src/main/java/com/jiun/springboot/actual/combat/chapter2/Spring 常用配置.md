# Chapter2 Spring常用配置

## demo1-Bean的Scope        
* @Scope 描述Spring容器如何新建Bean实例

        Singleton 一个spring容器只有一个Bean实例，此为Spring默认配置，全容器共享一个实例
        Prototype 每次调用新建一个Bean的实例。
        Request web项目中，给每一个http request新建一个Bean实例
        Session web项目中，给每一个http session新建一个Bean实例
        GlobalSession 这个只在protal应用中使用，给每一个global http session新建一个Bean实例。