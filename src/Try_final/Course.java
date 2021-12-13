package Try_final;

import java.io.Serializable;

public class Course implements Serializable {
    private int id;
    private String name;
    private String place;
    private String time;
    private Teacher teacher;
    private int week;  //星期几
    private int stu_num; //学生数量

    private Course(){
    }

    public Course(int id, String name, String place, String time, int week, int stu_num){
        this.id = id;
        this.name = name;
        this.place = place;
        this.time = time;
        this.week = week;
        this.stu_num = stu_num;
        //this.teacher = teacher;
    }

    public int getId(){
        return id;
    }

    public int getWeek(){
        return week;
    }

    public int getStu_num(){
        return stu_num;
    }

    public String getName(){
        return name;
    }

    public String getPlace(){
        return place;
    }
    public String getTime(){
        return time;
    }

    public String getTeacher(){
        return teacher.getName();
    }

    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }
}
