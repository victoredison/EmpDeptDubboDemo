# EmpDeptDubboDemo
A simple demo exercise of  dubbo rpc service 
Under api directory, two remote dubbo service api interfaces are provided: DeptDubboService and EmpDubboService
Under dept and emp directories, each of them providing a springboot application and a controller for visiting the service provider: ProviderApplication
A remote dubbo service provider is implemented under the provider directory
The dubbo services are registered with Zookeeper.
A mysql database is used to store the dept and emp info.
MyBatis is used as the database ORM framework.


