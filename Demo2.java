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
