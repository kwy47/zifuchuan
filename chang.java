package string;
import java.util.Scanner;
public class chang {
 public static void main(String[] args) {
 try {
; 
  
 StringBuffer s=new StringBuffer("������ɫ˼������������"
 		           + "�������Ů���������������δʶ��������������һ��ѡ�ھ���"
 		           + "�����һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬��"
 		           + "����������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���"
 		           + "�Ӵ˾������糯�л���������Ͼ���Ӵ���ҹרҹ");
 for(int i=7;i<s.length();i=i+15){
    s.insert(i, ",");}
 for(int i=15;i<s.length()+1;i=i+16){
     s.insert(i, "��");}
 for(int i=16;i<s.length();i=i+17){
     s.insert(i, "\n");}
 System.out.println(s);
  
 Scanner in = new Scanner(System.in);//����scanner���ȴ�����  
 System.out.println("������:");  
 String input = in.nextLine();
   }
    catch(Exception e){
     System.err.println("�����쳣"+e.toString());
    }

 }
 
}