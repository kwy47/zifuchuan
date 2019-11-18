package string;
import java.util.Scanner;
public class chang {
 public static void main(String[] args) {
 try {
; 
  
 StringBuffer s=new StringBuffer("汉皇重色思倾国御宇多年求不"
 		           + "得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王"
 		           + "侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍"
 		           + "儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起"
 		           + "从此君王不早朝承欢侍宴无闲暇春从春游夜专夜");
 for(int i=7;i<s.length();i=i+15){
    s.insert(i, ",");}
 for(int i=15;i<s.length()+1;i=i+16){
     s.insert(i, "。");}
 for(int i=16;i<s.length();i=i+17){
     s.insert(i, "\n");}
 System.out.println(s);
  
 Scanner in = new Scanner(System.in);//定义scanner，等待输入  
 System.out.println("请输入:");  
 String input = in.nextLine();
   }
    catch(Exception e){
     System.err.println("发生异常"+e.toString());
    }

 }
 
}