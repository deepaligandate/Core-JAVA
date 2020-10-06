import java.util.Scanner;
class OneBhk{
    int roomArea;
    int hallArea;
    int price;
    OneBhk(){
        roomArea=150;
        hallArea=90;
        price=4500;
    }

    OneBhk(int roomArea,int hallArea,int price){
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
    }

    void show(){
        System.out.println(roomArea+" "+hallArea+" "+price);
    }
}
class TwoBhk extends OneBhk{
    int room2Area;
    static int total=0;
    TwoBhk(){
        roomArea=200;
        room2Area=150;
        hallArea=100;
        price=4500;
    }
    TwoBhk(int roomArea,int room2Area,int hallArea,int price){
        this.roomArea=roomArea;
        this.room2Area=room2Area;
        this.hallArea=hallArea;
        this.price=price;
        total=total+price;
    }
    void show(){
        System.out.println(roomArea+" "+room2Area+" "+hallArea+" "+price);
        System.out.println(total);
    }

}
class fortyThree{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        TwoBhk t[]=new TwoBhk[3];
        for(int i=0;i<t.length;i++){
            System.out.println("Enter roomarea,room2area,hallarea,price");
            int rm1=s.nextInt();
            int rm2=s.nextInt();
            int ha=s.nextInt();
            int pr=s.nextInt();
            t[i]=new TwoBhk(rm1,rm2,ha,pr);
            t[i].show();
        }
    }
        
}