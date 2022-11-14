package regex;

public class Demo1 {
    public static void main(String[] args) {
        //校验qq号
        System.out.println(checkqq( "2134564322345" ));
        System.out.println(checkqq( "21345dc322345" ));
        System.out.println(checkqq( "322345" ));
        System.out.println(checkqq( "213451234253214564322345" ));

    }
    public  static boolean checkqq(String qq){
        return  qq !=null && qq.matches( "\\d{6,20}" );


    }
}
