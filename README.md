# tx-differences

1.以proxyTargetClass为true或者false，分析Jdk动态代理和Cglib代理实现的区别
2，以案例在 接口的方法上使用@Transaction注解，然后分被使用jdk代理和cglib代理，分析为什么cglib 没有实现事务拦截

问题源Issue ：https://github.com/spring-projects/spring-framework/issues/18894 
