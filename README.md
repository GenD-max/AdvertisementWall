# 一、**分组实习题目：广告墙**

# 二、**设计目的与要求**

## 1、**设计目的**

本团队面向大众，使用web语言开发了一套完整的广告墙系统。用户可以在本平台创建账户、发布广告、浏览广告，可通过使用手机、平板、电脑等工具，舍弃了传统的GUI界面，用户只需简单地输入网址即可访问本平台，使发布广告变得简单易操作，用来方便人们的生活，为促进媒体传播发挥着重要作用。

## 2、**设计要求**

（1）用户可以注册、登录

（2）登录的用户可以在主页查看天气和日历。

（3）登录成功的用户可以在浏览区浏览全部广告、某个用户的广告、某个广告。

（4）登录成功的用户可以在操作区浏添加广告、删除广告、更新广告。

（5）登录成功的用户可以在数据区查看当前平台用户和广告的数量信息。

# 三、**设计主要模块、类图**

## 1、**主要模块**

**（1）登录**

**（2）注册**

**（3）*查看天气、日历***

（4）浏览全部广告

（5）按用户浏览广告

**（6）按广告编号浏览**

（7）增加广告

**（8）删除广告**

（9）更新广告

**（10）广告墙数据**

 PS:加粗部分为本团队外加的功能。

## 2、**UML图**

![](https://gendml.oss-cn-hangzhou.aliyuncs.com/picgo/20220619163556.png)

# 四、**程序的运行结果**

**（1）登录**

![](https://gendml.oss-cn-hangzhou.aliyuncs.com/picgo/20220619163615.png)

**（2）注册**

![](https://gendml.oss-cn-hangzhou.aliyuncs.com/picgo/20220619163809.png)

**（3）查看天气、日历**

![](https://gendml.oss-cn-hangzhou.aliyuncs.com/picgo/20220619163819.png)

![](https://gendml.oss-cn-hangzhou.aliyuncs.com/picgo/20220619163825.png)

（4）浏览全部广告

![](https://gendml.oss-cn-hangzhou.aliyuncs.com/picgo/20220619163832.png)

（5）按用户浏览广告

![](https://gendml.oss-cn-hangzhou.aliyuncs.com/picgo/20220619163838.png)

**（6）按广告编号浏览**

![](https://gendml.oss-cn-hangzhou.aliyuncs.com/picgo/20220619163844.png)

（7）增加广告

![](https://gendml.oss-cn-hangzhou.aliyuncs.com/picgo/20220619163851.png)

**（8）删除广告**

![](https://gendml.oss-cn-hangzhou.aliyuncs.com/picgo/20220619163900.png)

**（9）更新广告**

![](https://gendml.oss-cn-hangzhou.aliyuncs.com/picgo/20220619163907.png)

**（10）广告墙数据**

![](https://gendml.oss-cn-hangzhou.aliyuncs.com/picgo/20220619163913.png)

# 五、**设计分工**

（1）Gendml：负责前端Html页面的更改、优化。同时也负责后端web层的编写，提供了云服务器，同时也负责云服务器Mysql和Tomcat环境的配置。

（2）Kuang Tianyu：负责后端Dao层和Service层的编写，负责UML的设计。除此之外，负责网站的压力测试，实现网站的高并发。

（3）Li Yueyue：负责数据库的创建，和sql语句的编写，同时也负责PPT和小组实习报告的撰写。

# 六、**简易Swing界面编程**

因为本项目并未使用JavaGUI，使用了当今比较热门的Html界面，所以无法提供Swing界面。

# 七、说明

- 项目已部署至云端，访问链接[广告墙 Advertising Wall](http://www.gendml.cn:8888/AdvertisementWall/)
- 本项目未使用任何框架，是本人学习**Javaweb**后实战的第一个项目，部分代码可能不严谨，欢迎各位大佬指出
- 如果这个项目对您有帮助，还请各位为此项目**点一点star**或者**关注一下作者**