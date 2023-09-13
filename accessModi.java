// package Sen;
class Shubh{
    public int a = 1;
    protected int b = 2;
    int c = 3;
    private int d = 4;
    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}


public class accessModi{
    public static void main(String [] args ){
    Shubh s = new Shubh();
     System.out.println(s.a);
        System.out.println(s.b);
        System.out.println(s.c);
        System.out.println(s.d);   //-> throws an error because it is private

    }
}