package com.icloud.sclubber;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		MyFileFilter mFF = new MyFileFilter("jpg");
		File folderSource = new File("E:/Kosice");
		File folderTarget = new File("E:/temp/");
		folderTarget.mkdirs();
		File[] fileList = folderSource.listFiles(mFF);
		System.out.println("Files at source folder: ");
		for (File file : fileList) {
			System.out.println(file);
		}
		System.out.println("Files at target folder:");
		for (int i = 0; i < fileList.length; i++) {
			try {
				folderTarget = new File("E:/temp/" + fileList[i].getName());
				CopyFiles.fileCopy(fileList[i], folderTarget);

			} catch (IOException e) {

				e.printStackTrace();
			}
			System.out.println(folderTarget);
		}
	}

}
