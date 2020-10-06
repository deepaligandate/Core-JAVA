class Faculty{
    int facultyId;
    static int salary=0;
    static int sal=0;
    void get(int facultyId){
        this.facultyId=facultyId;
    }
}
class FullTimeFaculty extends Faculty{
    int basicSal;
    int allowance;
    void get(int basicSal,int allowance){
        //super.get();
        this.basicSal=basicSal;
        this.allowance=allowance;
        super.salary=basicSal+allowance;
    }
    void show(){
        System.out.println(salary);
    }
}

class PartTimeFaculty extends Faculty{
    int hr;
    int rate;
    void get(int hr,int rate){
        this.hr=hr;
        this.rate=rate;
        super.sal=salary+(hr*rate);
    }
    void show(){
        System.out.println(sal);
    }
}
class FortyFour{
   public static void main(String args[]){
    FullTimeFaculty f=new FullTimeFaculty();
    f.get(45000,10);
    f.show();
    PartTimeFaculty p=new PartTimeFaculty();
    p.get(10,75);
    p.show();
   }
}
