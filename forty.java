import java.util.Scanner;
class Student{
    String name;
    int rollno;
    int age;
    int score;
    static int g1=0;
    static int g2=0;
    static int g3=0;
    static int g4=0;

    static int arr[]=new int[10];
    static int arr1[]=new int[10];
    static int arr2[]=new int[10];
    static int arr3[]=new int[10];

    void set(String name,int rollno,int age,int score){
        this.name=name;
        this.rollno=rollno;
        this.age=age;
        this.score=score;
    }
    void showScore(){
        System.out.println(name+" "+rollno+" "+age+" "+score);
    }
    void groupScore(){
        if( (score>=0 && score<=50) ){
            arr[g1]=score;
            g1++;
        }
        else if( (score>50 && score<=65) ){
            arr1[g2]=score;
            g2++;
        }
        else if( (score>65 && score <=80) ){
            arr2[g3]=score;
            g3++;
        }
        else{
            arr3[g4]=score;
            g4++;
        }
    }
    void groupShowScore(){
        System.out.println("between 0 to 50");
        for(int a=0;a<arr.length;a++){
            System.out.println(arr[a]);
        }
        System.out.println("between 50 to 65");
        for(int a=0;a<arr1.length;a++){
            System.out.println(arr1[a]);
        }
        System.out.println("between 65 to 80");
        for(int a=0;a<arr2.length;a++){
            System.out.println(arr2[a]);
        }
        System.out.println("between 80 to 100");
        for(int a=0;a<arr3.length;a++){
            System.out.println(arr3[a]);
        }
        
    }
    
}
class forty{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Student s[]=new Student[10];
        for(int i=0;i<s.length;i++){
            System.out.println("Enter name,roll no,age and score");
            String s1=sc.next();
            int roll=sc.nextInt();
            int age1=sc.nextInt();
            int sco=sc.nextInt();
            s[i]=new Student();
            s[i].set(s1,roll,age1,sco);
            s[i].groupScore();
            s[i].groupShowScore();
            
        }
    }
}