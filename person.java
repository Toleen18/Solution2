public class person {
    private String name;
    private int age;

    public void setName(String name){
        if (name.equals("")){
            System.out.println("unknow");
        }
        this.name=name;

    }
    public String getName(){
        return name;
    }



    public void setAge(int age){
        if (age>0&&age<120){
            System.out.println("good");
            this.age=age;
        }else {
            System.out.println("error");
        }


    }
    public int getAge(){
        return age;
    }

    public void printperson(){
        System.out.println("the name is: "+getName());
        System.out.println("the age is "+getAge());

    }

}