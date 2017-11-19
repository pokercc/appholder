# appInjector
# 这个库的功能：

1. 无痕的注册需要在application 里注册的sdk代码。避免代码污染。
2. 避免各种混乱的context 引用




注入方式:
1. 支持在application 填写全类名
2. 支持注解，只支持主工程的注解,不支持依赖库，不然可能会有安全性的问题。
3. 支持android manifest 配置
4. 支持maven 远程依赖的方式,也是使用方式三实现的
5. 支持lib库单独使用

对内存泄露的处理:
1. 使用弱引用，避免打断instant run



