package com.demo;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class CreateFile {

	public static void main(String[] args) {
		File creatFileTest = new File("D:\\1.txt");
		if (!creatFileTest.exists()) {
			System.out.println("creating");
			try {
				creatFileTest.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Absolute path:" + creatFileTest.getAbsolutePath() + 
				"\n Can read?: " + creatFileTest.canRead()+ 
				"\n Can write?: " + creatFileTest.canWrite()+
				"\n getName: "+creatFileTest.getName()+
				"\n getParent: "+creatFileTest.getParent()+
				"\n getPath: "+creatFileTest.getPath()+
				"\n length: "+creatFileTest.length()+
				"\n is hidden?: "+creatFileTest.isHidden()+
				"\n last modified?:"+new Date(creatFileTest.lastModified()));
	}

}
