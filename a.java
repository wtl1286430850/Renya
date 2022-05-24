package cn.itbaiwu;
import java.util.Scanner;
public class a {
    public static void main(String[] args) {
        System.out.println("请输入一个成绩：");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        //string表示一个字符串类型，不是基本数据结构
        String s=score>=60?"及格":"挂科";
        System.out.println(s);
    }
}
