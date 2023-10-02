**#一实验目的**  
1.模拟学生选课系统  
2.创建基本的图形用户界面应用程序  
3.展示身份验证原理  
4.模拟不同用户的操作  
**#二业务要求**   
**##角色**
学校人员分为学生和教师，学生选课老师授课  
定义每种角色人员的属性，及其操作方法  
##**基本要求**  
学生可以注册登录选课退课打印课程  登录上可以查看可以选的课程  
#**解题思路**   
1.定义五个系统角色类：'People' 'Teacher' 'Student' 'Subject' 'FileOperations'  
2.建立逻辑关系：通过打印学生信息，实现对课程与教师信息的输出，因此有以下包含关系：学生信息→课程信息→教师信息  
3.属性与方法：为四个类（People、Teacher、Student、Subject）添加属性和方法，将People类设为Teacher类和Student类的父类，使子类能够继承父类的属性和方法  
4.覆盖Object根类中的toString方法：使每个类的toString方法返回特定的字符串信息  
5.IndexTest类：创建主页窗口，包括三个按钮：学生选课、学生退课和课程打印  
6.ChoiceSubject类：用于学生选课模块，继承JFrame类。创建窗口和面板容器，添加JList和JCheckBox组件，允许学生选择课程并将所选课程写入文本文件  
7.QuitSubjects类：用于学生退课模块，同样继承JFrame类。创建窗口和面板容器，允许学生点击课程信息来退课  
8.PrintSubjects类：用于打印课程模块，通过文件操作读取选课和退课后的数据并在窗口中显示  
9.AppendSubjects类：用于添加课程模块，允许输入课程信息，拼接成字符串并写入文件  
10.LoginTest类：用于登录和注册功能，通过单选按钮实现分角色登录。学生可以进行注册和登录，管理员登录后可以添加课程  
11.FileOperations类：用于文件操作，包括读取和写入数据，以实现信息在各个程序之间的传递  

#**流程图**  


#**关键代码**  


#**系统运行截图**  
**1.主页面**  
![Image text](https://github.com/banber0/expermint_two/blob/main/%E7%B3%BB%E7%BB%9F%E7%95%8C%E9%9D%A2.png)  
**2.登录页面,没有注册则会报错**  
![Imange text](https://github.com/banber0/expermint_two/blob/main/%E7%99%BB%E5%BD%95.png)  
**3.注册页面,分为学生和教师**  
![Imange text](https://github.com/banber0/expermint_two/blob/main/%E6%B3%A8%E5%86%8C.png)  
**4.注册成功**  
![Imange text](https://github.com/banber0/expermint_two/blob/main/%E6%B3%A8%E5%86%8C%E6%88%90%E5%8A%9F.png)  
**5.选课**  
![Imange text](https://github.com/banber0/expermint_two/blob/main/%E9%80%89%E8%AF%BE.png)  
**6.选课成功**  
![Imange text](https://github.com/banber0/expermint_two/blob/main/%E9%80%89%E8%AF%BE%E6%88%90%E5%8A%9F.png)  
**7.退课**  
![Imange text](https://github.com/banber0/expermint_two/blob/main/%E9%80%80%E8%AF%BE%E6%88%90%E5%8A%9F.png)

**#感想与体会**  

