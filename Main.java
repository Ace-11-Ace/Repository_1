//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        baking();
        sum(14, 44);
        sum(123,4213,321);
        sum("zxc","qwe");
        sum("abc","def");
    }
    public static void sum (int a,int b){
        int res = a+b;
        System.out.println(res);
    }
    public static void sum (int a,int b, int c){
        int res = a+b+c;
        System.out.println(res);
    }
    public static void sum (String a, String b){
        String res = a+" "+b;
        System.out.println(res);
    }
    public static void batter(){
            System.out.println("Mix the dry ingredients.");
            System.out.println("Cream the butter and sugar.");
            System.out.println("Beat in the eggs.");
            System.out.println("Stir in the dry ingredients.");
    }
    public static void baking(){
            System.out.println("Set the oven temperature.");
            System.out.println("Set the timer.");
            System.out.println("Place a batch of cookies into the oven.");
            System.out.println("Allow the cookies to bake.");
            System.out.println("Set the oven temperature.");
            System.out.println("Set the timer.");
            System.out.println("Place a batch of cookies into the oven.");
            System.out.println("Allow the cookies to bake.");
        }
        public static void decorate() {
                System.out.println("Mix ingredients for frosting.");
                System.out.println("Spread frosting and sprinkles.");
        }
}