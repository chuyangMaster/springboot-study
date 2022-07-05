获取.properties中的值
    使用 @Value(${key}) 语法
    @Value("${server.port}")
    private String port;

springboot的配置绑定，即将.properties文件中的属性值与javabean的属性进行配置绑定。方法
    1.@ConfigurationProperties + @Component
    2.@ConfigurationProperties + @EnableConfigurationProperties


