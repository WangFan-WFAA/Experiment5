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
        System.out.println("�����������Ա����䣬ѧ��");
        Scanner ss = new Scanner(System.in);
        String name = ss.nextLine();
        String sex = ss.nextLine();
        int age = ss.nextInt();
        int number = ss.nextInt();
        stu.setGraduate(name, sex, age, number);

        try {
            FileReader fileReader = new FileReader("D:\\Javaʵ�����ı�\\�ı�B.txt");//��ȡD���ļ�
            BufferedReader bufferedReader = new BufferedReader(fileReader);//���ļ��浽������
            Writer poem = new FileWriter(new File("D:\\Javaʵ�����ı�\\�ı�A.txt"));//���������ļ�д��A�ļ���
            
            
            String str = bufferedReader.readLine();
            String regex = "(.{7})";
            
            
            str = str.replaceAll(regex, "$1��");
            StringBuffer x = new StringBuffer(str);
            for (int  i = 15; i <289; i = i + 17) {
                x.replace(i, i + 1, "��\n");
            }
            
            System.out.println(x);
            
            
            poem.write(String.valueOf(stu));
            poem.write("\n");
            poem.write(String.valueOf(x));
            bufferedReader.close();//�رջ�����
            fileReader.close();//�ر��ļ���ȡ
            poem.close();//�ر�д��

            a:
            while (true) {
                System.out.println("��ѯ���е���������1���˳�ϵͳ������0");
                Scanner in = new Scanner(System.in);
                int z = in.nextInt();
                switch (z) {
                    case 1:
                        Scanner y = new Scanner(System.in);
                        System.out.println("��������Ҫ��ѯ����:");
                        String c = y.nextLine();
                        int count = (str.length() - str.replace(c, "").length()) / c.length(); 
                        System.out.println(count);
                        break;
                    case 0:
                        System.out.println("�����˳���ϵͳ����л����ʹ�á�");
                        break a;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("����!");
        }
    }
}
