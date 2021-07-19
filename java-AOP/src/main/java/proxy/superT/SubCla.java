package proxy.superT;

public class SubCla extends SuperCla {
    private String str;
    public SubCla(){
//        this("SubCla");
//        super();

        System.out.println("SubCla 构造");



    }
    public static void staFun(){
        System.out.println("static staFun");
    }

    static {
        System.out.println("static 运行---");
    }

    public SubCla(String str) {
        this.str = str;
        System.out.println("str: " + str);
    }

    public void tes1(){
        System.out.println("tes1");
    }


    public static void main(String[] args) {
//        SubCla a = new SubCla();
        SubCla.staFun();

    }
}
