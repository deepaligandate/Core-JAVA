class Student{
    private int rno;
    private String name;
    
    void setData(int studrno,String studname)
    {
        rno=studrno;
        name=studname;
    }
    void showData()
    {
        System.out.println(rno+" "+name);
    }
}
class StudentDemo
{
    public static void main(String args[])
    {
        Student s=new Student();
        s.setData(101,"Manju");
        s.showData();
    }
}