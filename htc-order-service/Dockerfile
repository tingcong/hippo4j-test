#指定基础镜像，在其上进行定制
FROM java:8

#维护者信息
MAINTAINER htc <hutingcong@163.com>

#这里的 /tmp 目录就会在运行时自动挂载为匿名卷，任何向 /tmp 中写入的信息都不会记录进容器存储层
VOLUME /tmp

#复制上下文目录下的target/htc-order-service-1.0.0-SNAPSHOT.jar 到容器里
COPY htc-order-service-1.0.0-SNAPSHOT.jar demo-1.0.0.jar


#声明运行时容器提供服务端口，这只是一个声明，在运行时并不会因为这个声明应用就会开启这个端口的服务
EXPOSE 19095

#指定容器启动程序及参数   <ENTRYPOINT> "<CMD>"
ENTRYPOINT ["java","-jar","htc-order-service-1.0.0-SNAPSHOT.jar"]