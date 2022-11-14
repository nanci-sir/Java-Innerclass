# Java-Innerclass
Java 内部类
## 包装类

#### 其实就是8种基本数据类型对应的引用类型

| 基本数据类型 | 引用数据类型 |
| ------------ | ------------ |
| byte         | Byte         |
| short        | Short        |
| int          | Integer      |
| long         | Long         |
| char         | Character    |
| float        | Float        |
| double       | Double       |
| boolean      | Boolean      |

#### 为什么提供包装类？

Java为了实现一切皆对象，为8种基本类型提供了对应的引用类型。
后面的集合和泛型其实也只能支持包装类型，不支持基本数据类型。



```java
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
```

#### 1、包装类是什么，作用是什么？

基本数据类型对应的引用类型，实现了一切皆对象。
后期集合和泛型不支持基本类型，只能使用包装类。

#### 2、包装类有哪些特殊功能？

可以把基本类型的数据转换成字符串类型(用处不大)
可以把字符串类型的数值转换成真实的数据类型（真的很有用）

## 正则表达式

#### 需求：校验qq

假如现在要求校验一个qq号码是否正确，6位及20位之内，必须全部是数字 。

```java
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
```

public boolean matches(String regex): 
判断是否匹配正则表达式，匹配返回true，不匹配返回false。

#### 需求:校验信息

请编写程序模拟用户输入手机号码、验证格式正确，并给出提示，直到格式输入正确为止。
请编写程序模拟用户输入邮箱号码、验证格式正确，并给出提示，直到格式输入正确为止。
请编写程序模拟用户输入电话号码、验证格式正确，并给出提示，直到格式输入正确为止。

```java
package regex;

import java.util.Scanner;

public class Demo2 {
    //校验手机号码，邮箱电话号码
    public static void main(String[] args) {
        checkPhone();
        checkEmail();

    }
    public static  void  checkEmail(){
        Scanner sc = new Scanner( System.in);
        while (true) {
            System.out.println("请输入你的注册邮箱：");
            String phone = sc.next();
            //判断手机号是否正确；
            //正则表达式
            // \\w 英文数组
            if(phone.matches( "\\w{1,30}@[a-zA-z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}" )){
                System.out.println("邮箱注册完成");
                break;
            }else {
                System.out.println( "邮箱注册失败" );
            }}

            }
    public static  void  checkPhone(){
        Scanner sc = new Scanner( System.in);
        while (true) {
            System.out.println("请输入你的手机号：");
            String phone = sc.next();
            //判断手机号是否正确；
            //正则表达式
            if(phone.matches( "1[3-9]\\d{9}" )){
                System.out.println("手机号注册完成");
                break;
            }else{
                System.out.println("手机号注册失败");


            }
        }
    }
}
```

#### 正则表达式在方法中的应用

```java
package regex;

public class Demo3 {
    public static void main(String[] args) {
        //按照正则表达式匹配的内容进行替换
        String names = "张三8347937李四893475王五234";
      String[] arrs =   names.split( "\\w+" );
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }
        String names2 =names.replaceAll( "\\w"," " );
        System.out.println( names2 );
    }
}
```

#### 正则表达式支持爬取信息

```java
package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String rs = "来黑马程序学习Java,电话020-43422424，或者联系邮箱" +
                "itcast@itcast.cn,电话18762832633，0203232323" +
                "邮箱bozai@itcast.cn，400-100-3233 ，4001003232";
        // 1.定义爬取规则
        // 2.编译正则表达式成为一个匹配规则对象
        // | 代表或
        String regex = "(\\w{1,}@\\w{2,10}(\\.\\w{2,10}){1,2})|" +
                "(1[3-9]\\d{9})|(0\\d{2,5}-?\\d{5,15})|400-?\\d{3,8}-?\\d{3,8}";
        Pattern pattern = Pattern.compile( regex );
        // 3.通过匹配规则对象得到一个匹配数据内容的匹配器对象
        Matcher matcher = pattern.matcher( rs );
        //4.通过匹配器去内容中爬取出信息
        while (matcher.find()) {
            System.out.println( matcher.group() );
        }
    }}
```

