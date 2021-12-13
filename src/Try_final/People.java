package Try_final;

public class People {
    private String name;
    private int id;
    private String sex;

    public People(){ }

    public People(String name, int id, String sex){
        setId(id);
        setName(name);
        setSex(sex);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getSex(){
        return sex;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

}
