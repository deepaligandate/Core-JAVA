class Premitive{
    	public static void main(String args[]){
        int x=10;
        int y=(x*x)+(3*10)-7;
        System.out.println(y);
        y=x++ + ++x;
        System.out.println("x= "+x+" y= "+y);
        int z=x++ - --y - --x + x++;
        System.out.println("x= "+x+" y= "+y+" z= "+z);
        boolean a=true;
        boolean b=false;
        boolean c=a && b || !(a||b);
        System.out.println(c);
    }
}