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

