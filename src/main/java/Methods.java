public class Methods {
    static int x = 2;
    public static void main (String [] args){
     foo();
     System.out.println(foobar());
     System.out.println(barfoo(barfoo(1,2), barfoo(1,2)));
    }
    public static void foo (){
       
        bar(x,1,2  );
    }
    public static void bar (int b, int c, int d){
        System.out.println(b+c+d);
    }
    public static String foobar(){
        return "Hi";
    }
    public static int barfoo(int a,int b){
        return a+b;
    }
}
