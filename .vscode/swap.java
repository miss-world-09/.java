public class Swap{
    public static void main(String[] args){
        int a=10;
        int b=20;
        System.out.println("before swap:"+" "+a+" ,"+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swap:"+" "+a+" ,"+b);
    }
}