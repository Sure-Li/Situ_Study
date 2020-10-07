package com.demo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOStream {

	// @SuppressWarnings("null")
	public static void main(String[] args) {
//		// 此处除非你放在根目录，不然必须要写绝对路径
//		File testFile = new File("E:\\situ_Study\\lession1006\\src\\com\\demo\\test.txt");
//		System.out.println(testFile.getAbsolutePath());
//		System.out.println(testFile.getName());
//		System.out.println(testFile.canRead());
//		System.out.println(testFile.canWrite());
//		File testFile1 = new File(".");
//		String[] fileList = testFile1.list();
//		for (String name : fileList) {
//			System.out.println("name:"+name);
//		}
//		for (int i = 0; i < fileList.length; i++) {
//			File currentFile = new File(fileList[i]);
//			System.out.println(currentFile.getAbsolutePath()+
//					"  \t"+currentFile.length()+"字节");
//		}
		FileInputStream in = null;
		FileOutputStream out = null;
		String str = "";
		try {
			in = new FileInputStream("D:\\1.txt");
			DataInputStream din = new DataInputStream(new FileInputStream("D:\\1.txt"));
			String test = din.readLine();
			System.out.println(test);
			DataOutputStream dout = new DataOutputStream(new FileOutputStream("D:\\1.txt"));
			dout.writeUTF("\taatest");
			dout.close();
			din.close();
			// 如果文件不存在，则会报错
			out = new FileOutputStream("D:\\2.txt");
			
			// 如果文件不存在 创建 如果文件存在 覆盖
			int t;
			while ((t = in.read()) != -1) {// 顺序读取文件里的内容并赋值整型变量t，直到文件结束
				str=str+(char)t;
				System.out.print((char)t);
				out.write(t);
			}
			System.out.println();
			System.out.println(str);
			in.close();
			out.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
