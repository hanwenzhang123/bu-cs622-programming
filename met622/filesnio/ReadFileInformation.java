package edu.bu.met622.filesnio;

import java.io.File;

public class ReadFileInformation {
	public static void main(String[] args) {
//		File temp;
//		try {
//			temp = File.createTempFile("testttt", ".txt");
//			System.out.println("Is file existed:"+temp.exists());
//			System.out.println("--- its path: ---"+temp.getAbsolutePath());
//		}catch (Exception ex){
//			ex.printStackTrace();
//		}
		
		File file = new File("/Users/rawassizadeh/demo");
		System.out.println("File Exists: " + file.exists());
		if (file.exists()) {
			System.out.println("Absolute Path: " + file.getAbsolutePath());
			System.out.println("Is Directory: " + file.isDirectory());
			System.out.println("Parent Path: " + file.getParent());
			if (file.isFile()) {
				System.out.println("File size: " + file.length());
				System.out.println("File LastModified: " + file.lastModified());
			} else {
				for (File subfile : file.listFiles()) {
					System.out.println("\t" + subfile.getName());
				} // 2nd if
			} // 1st if
		} // main
	}
}
