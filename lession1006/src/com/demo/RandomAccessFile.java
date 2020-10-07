package com.demo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class RandomAccessFile {

	public static void main(String[] args) throws IOException {
//		EmployeeOne e1 = new EmployeeOne("mary", 24);
		java.io.RandomAccessFile font = null;
		java.io.RandomAccessFile fin = null;
		try {
			// 写出
			font = new java.io.RandomAccessFile("D:\\1.txt", "rw");
			font.writeChars("test");
//			font.seek(0);
			font.writeInt(127);
			font.close();

			// 读出
			// 现在的缺点就是必须知道读取姓名的字段长度 不然会报错
			fin = new java.io.RandomAccessFile("D:\\1.txt", "rw");
			String name = "";
			for (int i = 0; i < 4; i++) {
				name += "" + fin.readChar();
			}
			System.out.println(name);
//			fin.seek(5);//选择特定位置
			System.out.println(fin.readInt());
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
