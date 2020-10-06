import java.util.Scanner;
class Product{
     int pid;
     int price;
     int quantity;
    static int a[]=new int[5];
    static int i=0;
    
    Product(int pid,int price,int quantity){
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }
    static void amount(int price,int quantity){
        a[i]=price*quantity;
        System.out.println(a[i]);
        i++;
    }

}
class ProductDemo{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        Product arr[]=new Product[5];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter pid,price and quantity");
            int id=sc.nextInt();
            int pr=sc.nextInt();
            int qu=sc.nextInt();
            arr[i]=new Product(id,pr,qu);
            Product.amount(arr[i].price,arr[i].quantity);
        
        }
        
        
    }
}