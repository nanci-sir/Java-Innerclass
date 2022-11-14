package integer;

        import org.w3c.dom.ls.LSOutput;

        import java.net.Inet4Address;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        Integer a1 = 11;
        Integer a2 = a; //自动装箱
        System.out.println( a );
        System.out.println( a1 );

        Integer it = 100;
        int it1 = it;
        System.out.println( it1 );
        double db = 99.5;

        Double db2 = db;//装箱
        double db3 = db2;//拆箱
        System.out.println( db3 );

        //容错率更高
        Integer age1 = null;
        Integer age2 = 0;
        System.out.println( "*******************" );
        //基本数据类型转换成字符串
        Integer i3 = 23;
        String rs = i3.toString();
        System.out.println( rs + 1 );//231

        String rs1 = Integer.toString( i3 );
        System.out.println( rs1 + 1 );
        //可以直接加字符串得到字符串类型
        String rs2 = i3 + "";
        System.out.println( rs2 + 1 );
        System.out.println( "***********************" );
        //可以把字符串类型的数值转换成真实的数据类型
        String number = "23";

        //valueOf
        //转换成整数
        //int age = Integer.parseInt( number );
        int age = Integer.valueOf( number );
        System.out.println( age + 1 );

        String number1 = "99.1";
        //转换成小数
        // double score = Double.parseDouble( number1 );
        double score = Double.valueOf( number1 );
        System.out.println(score+0.7);
    }
}
