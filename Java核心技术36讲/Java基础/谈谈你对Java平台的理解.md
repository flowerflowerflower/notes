第一讲：
Exception 和Error 有什么区别？
1.共性：
Exception 和Error 都是继承了 Throwable 类型的实例才可以被抛出（throw）或者捕获（catch）,它是异常处理机制的基本组成类型。

区别：
Error 是指在正常情况下，不大可能出现的情况，绝大部分的Error 都会导致程序（比如 JVM 自身）处于非正常的，不可恢复状态。既然是非正常情况，所以不便于也不需要捕获，常见的比如OutOfMemoryError 之类，都是Error 的子类


Exception 又分为可检查（checked）异常和不检查（unchecked）异常，可检查异常在源代码里必须显示地进行捕获处理，这是编译期检查的一部分。


不检查异常时所谓的运行时异常，类似 NullPointerException,Array‘indexOutOfBoundsExeption 之类，通常是可以编码避免的逻辑错误，具体根据需要来判断是否寻要捕获，并不会在编译期强制要求


## 重点 Error,Exception 或者RuntimeException?
图片地址 [https://time.geekbang.org/column/article/6849]

### NoClassDefFoundError和 ClassNotFoundException  （编译时期）有什么区别，这也是个经典的入门题目






### 有规范的使用异常，不要生吞异常


### 对于响应式的异常处理的建议：
1.异常：这种情况下的异常，可以通过完善任务重试机制，当执行异常时，保存当前任务信息加入重试队列。重试的策略根据业务需要决定，当达到重试上限依然无法成功，记录任务执行失败，同时发出告警。
2.日志：类比消息中间件，处在不同线程之间的同一任务，简单高效一点的做法可能是用traceId/requestId串联。有些日志系统本身支持MDC/NDC功能，可以串联相关联的日志。




