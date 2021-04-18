学习笔记

一、 布隆过滤器
布隆过滤器的原理和实现:
https://www.cnblogs.com/cpselvis/p/6265825.html

哈希表不仅可以判断元素是否在集合中，还可以准确的信息存在里面。

布隆过滤器：只是用于检索一个元素是否在还是不在, 空间效率和查找效率远远高于其他一般的算法。
（二进制向量）

缺点：有一定误识别率。（查到它不在的话，就肯定不在；查到它在的话，有可能在）



使用BloomFilter布隆过滤器解决缓存击穿、垃圾邮件识别、集合判重：https://blog.csdn.net/tianyaleixiaowu/article/details/74721877

布隆过滤器 Java 实现示例 1：https://github.com/lovasoa/bloomfilter/blob/master/src/main/java/BloomFilter.java

布隆过滤器 Java 实现示例 2：https://github.com/Baqend/Orestes-Bloomfilter


二、LRU 缓存机制

LRU: Least Recently Used
LFU: Least Frequently Used

LRU Cache Python 代码示例：https://shimo.im/docs/CoyPAyXooGcDuLQo/read

三、排序
十大经典排序算法：https://www.cnblogs.com/onepixel/p/7674659.html

