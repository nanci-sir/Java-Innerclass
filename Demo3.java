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
