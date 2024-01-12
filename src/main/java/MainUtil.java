public class MainUtil {
    public static void main(String[] args) {
        MainUtil mainUtil = new MainUtil();
       new MainUtil().test().test2();
    }
    public MainUtil test(){
        return new MainUtil();
    }
    public void test2(){
        System.out.println(200);
    }
}
