# 使用 IntelliJ IDEA创建Spring Boot项目

## 创建项目

打开IDEA创建项目：
![Alt text](http://static.bluersw.com/images/spring-boot-helloworld-1.png)  

选择Spring Assistant创建项目
![Alt text](http://static.bluersw.com/images/spring-boot-helloworld-2.png)  

书写项目信息，Spring Boot 2.X 版本最低需要JDK8的支持也就是Java 1.8版本
![Alt text](http://static.bluersw.com/images/spring-boot-helloworld-3.png)  

选择需要的依赖项，使用REST风格的接口服务至少要勾选Spring Boot DevTools和Spring Web Starter（spring-boot-starter-web 自动依赖了 spring-boot-starter），spring-boot-starter是核心模块，包括自动配置支持、日志和 YAML。
![Alt text](http://static.bluersw.com/images/spring-boot-helloworld-4.png)  

设置项目名称和本地存储的位置
![Alt text](http://static.bluersw.com/images/spring-boot-helloworld-5.png)  

项目创建之后结构如下：
![Alt text](http://static.bluersw.com/images/spring-boot-helloworld-6.png)  

HelloworldApplication是项目启动入口，使用包创建子模块：  

* beans:实体类
* dao:数据访问
* bll:业务类
* service:业务组装
* controller:控制访问
* ui:页面视图，如果是纯接口服务可以没有此模块
![Alt text](http://static.bluersw.com/images/spring-boot-helloworld-7.png)  

此时POM文件中的依赖项：
![Alt text](http://static.bluersw.com/images/spring-boot-helloworld-8.png)  

## 编写Hello world程序

新建并编写控制器类：  

```java
package com.bluersw.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//此类里面的方法都以json格式输出
@RestController
public class HelloWorldController {

    //打开浏览器访问http://localhost:8080/helloworld
    @RequestMapping("/helloworld")
    public String helloworld(){
        return "你好！";
    }
}
```

启动项目访问[http://localhost:8080/helloworld](http://localhost:8080/helloworld)
![Alt text](http://static.bluersw.com/images/spring-boot-helloworld-9.png)  

## 对Controller模块进行单元测试
