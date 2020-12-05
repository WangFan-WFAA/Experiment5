package package1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Scanner;
import java.io.*;

public class Test {
    public static void main(String args[]) {
        Student stu = new Student();
        System.out.println("输入姓名，性别，年龄，学号");
        Scanner ss = new Scanner(System.in);
        String name = ss.nextLine();
        String sex = ss.nextLine();
        int age = ss.nextInt();
        int number = ss.nextInt();
        stu.setGraduate(name, sex, age, number);

        try {
            FileReader fileReader = new FileReader("D:\\Java实验五文本\\文本B.txt");//读取D盘文件
            BufferedReader bufferedReader = new BufferedReader(fileReader);//把文件存到缓冲区
            Writer poem = new FileWriter(new File("D:\\Java实验五文本\\文本A.txt"));//将缓冲区文件写入A文件中
            
            
            String str = bufferedReader.readLine();
            String regex = "(.{7})";
            
            
            str = str.replaceAll(regex, "$1，");
            StringBuffer x = new StringBuffer(str);
            for (int  i = 15; i <289; i = i + 17) {
                x.replace(i, i + 1, "。\n");
            }
            
            System.out.println(x);
            
            
            poem.write(String.valueOf(stu));
            poem.write("\n");
            poem.write(String.valueOf(x));
            bufferedReader.close();//关闭缓冲区
            fileReader.close();//关闭文件读取
            poem.close();//关闭写入

            a:
            while (true) {
                System.out.println("查询文中的字请输入1，退出系统请输入0");
                Scanner in = new Scanner(System.in);
                int z = in.nextInt();
                switch (z) {
                    case 1:
                        Scanner y = new Scanner(System.in);
                        System.out.println("请输入您要查询的字:");
                        String c = y.nextLine();
                        int count = (str.length() - str.replace(c, "").length()) / c.length(); 
                        System.out.println(count);
                        break;
                    case 0:
                        System.out.println("您已退出该系统，感谢您的使用。");
                        break a;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("错误!");
        }
    }
}
