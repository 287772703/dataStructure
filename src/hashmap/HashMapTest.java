package hashmap;


import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {

       HashMap hm=  new HashMap<>();
       hm.put("张三",23);
        Object zhangsan = hm.get("张三");
        System.out.println(zhangsan.toString());
        System.out.println("杨小洲是煞笔");
        System.out.println(zhangsan.toString());
        System.out.println("杨小洲是煞笔");
        System.out.println("杨小洲是煞笔");
        hm.put("lisi",34);
        hm.put("wangu",65);
        //fork开发分支，远程github同步主项目测试。
        //fork测试冲突2
        //第三次测试
    }
}
