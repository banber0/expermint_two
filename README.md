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
1.学生选课模块ChoiceSubject类  

    public ChoiceSubject() {
        // ... （省略部分代码）

        confirmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 获取勾选的课程并将其写入文件
                String selectedSubjects = "选修的课程：";
                for (int i = 0; i < subjects.length; i++) {
                    if (checkBoxes[i].isSelected()) {
                        selectedSubjects += subjects[i] + " ";
                    }
                }
                // 假设当前登录的学生名字为"张三"
                FileOperations.writeFile("selected_subjects.txt", "张三: " + selectedSubjects);
                JOptionPane.showMessageDialog(null, "选课成功！", "提示", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
        });

        // ... （省略部分代码）
    }
}'  
'ChoiceSubject 类允许学生选择课程，将选课结果写入文件，并提供友好的界面交互'  
2.退课模块  
public QuitSubjects() {
        // ... （省略部分代码）

        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 获取用户选择要退课的课程
                String selectedSubjects = "";
                for (int i = 0; i < subjectList.getSelectedValuesList().size(); i++) {
                    selectedSubjects += subjectList.getSelectedValuesList().get(i) + " ";
                }
                // 假设当前登录的学生名字为"张三"
                FileOperations.writeFile("selected_subjects.txt", "张三: " + selectedSubjects);
                JOptionPane.showMessageDialog(null, "退课成功！", "提示", JOptionPane.INFORMATION_MESSAGE);
                // 关闭当前窗口
                QuitSubjects.this.dispose();
            }
        });

        // ... （省略部分代码）
    }
}'  
'QuitSubjects 类允许学生退课，将退课结果更新到文件中，并提供友好的界面交互'  
3.用户类  
    public boolean registerUser(String username, String password, String userType) {
        // 用户注册逻辑，将用户信息存储到内存中
        // ...

        return true; // 注册成功
    }

    public User loginUser(String username, String password, UserRole userRole) {
        // 用户登录逻辑，验证用户名、密码、角色，返回用户对象
        // ...

        return null; // 登录失败
    }

    // ... （省略部分代码）
}'  

registerUser 方法用于用户注册，将用户信息存储在内存中（此代码未实际实现文件存储）  
loginUser 方法用于用户登录，验证用户名、密码和角色，返回用户对象  
UserManager 类管理用户的注册和登录，根据提供的用户名、密码和角色验证用户身份  
'


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

