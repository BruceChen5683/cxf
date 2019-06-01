服务端

内置的服务器，不用配置文件，直接代码启动服务

JDK1.10版本出现问题：
JaxWsServerFactoryBean 
java.lang.NoClassDefFoundError: javax/xml/ws/WebServiceException
JDK版本降低到1.8


WSDL(Web Service Description Language,Web服务描述语言)

#### TCPMon
ListenPort  用于Client转发
TargetHostname 服务
TargetProt     服务端口

#### SOAP(Simple Object Access Protocol)

简单对象访问协议，里面的消息都是SOAP消息,WebService所发送的消息都是SOAP消息

##### WebService开发模式
1. 自底向上 (代码优先) 先java,再wsdl
2. 自顶向下(契约优先) 先有wsdl,再java  推荐

##### CXF中采用Jaxb(Java API for XML Binging)来处理对象到xml以及xml到对象之间的双向转换
wsdl2java -server -impl -frontend jaxws21 http://localhost:8080/myservice?wsdl

XMLGregorianCalendar Date互相转化

IdType包装或者不包装
