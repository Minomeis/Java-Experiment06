# 大202 2020310853
## 一、实验目的
1. 掌握文件输入输出；
2. 掌握对象序列化方法。

## 二、业务要求
在实验三（学生选课模拟系统）的基础上，利用文件保存选课结果，过程如下：
1. 采用对象序列化的writeObject方法把选课结果存到硬盘文件系统中；
2. 采用对象序列化的readObject方法从文件中恢复对象，并操作学生的选课课表，实现退课操作。
3. 打印课程对象信息，采用覆盖定义toString（）方法的方式

## 三、实验要求
1. 提交源程序到gitee或github，代码仓库命名为“实验六文件输入输出”
2. 写实验报告文件（readme.md），本次实验提交时间截止到12月22日。

## 四、实验过程 
1. 首先，在Student类里面，添加write函数，将学生课表写入TXT文件中，创建输出流-写入课表-关闭流。
2. 然后，经过思考，我认为将写入这个过程添加在学生添加课程之后比较合理，于是在之前Show函数中，添加执行write函数。
3. 之后，在退课函数中，实现读取TXT文件中的信息后，对信息进行更改。

## 五、流程图
![](https://github.com/Minomeis/Java-Experiment06/blob/master/img/lc.png)

## 六、主要代码
1. 在student类中，创建私有变量“f”用来表示学生课表的路径。
```java
    private File f = new File("d:" + File.separator + "Java\\Experiment06\\TXT" + File.separator + this.getName() + "的课表.txt");
```
2. write函数，创建输出流-写入课表数组-关闭流。
```java
    public void write() throws Exception{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f)); //输出流：往外输出
        out.writeObject(c);
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
        out.close();
    }
```
3. 在退课函数中，实现读取TXT文件中的信息后，对信息进行更改。
```java
    public void drop_course(int id)throws Exception{
        Course[] d = new Course[5];;
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
        Course[] c = (Course[]) in.readObject();
        int j = 0;
        for(int i=0;i<this.i;i++) {
            int a = c[i].getId();
            if (id == a) {
                continue;
            }
            else {
                d[j] = c[i];
                j++;
            }
        }
        c = d;
        this.c = d;
        System.out.println("您已成功退出该课程,现在课表为");
        show(c);
    }
```
## 七、运行截图
![](https://github.com/Minomeis/Java-Experiment06/blob/master/img/001.jpg)
![](https://github.com/Minomeis/Java-Experiment06/blob/master/img/002.jpg)
## 八、感想体悟
&emsp;&emsp;本次实验，主要目的是让我们熟悉IO流的使用，在实验之前，先去看了老师给的示例，然后对照着自己尝试实现。
这一部分对我来说有些复杂，两种形式，学的不是很清晰，中途遇到一些问题，在老师帮助下，都很好的得到了解决。
<br>&emsp;&emsp;希望日后能学习的更加透彻。