package test_File;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		String separator = File.separator; //路径分隔符，在windows下，是反斜杠/，在Linux下，是正斜杠\。一般用\即可
		String filename = "myfile.txt";
		String director = "mydir1"+ separator + "mydir2";  //设置路径
		File f = new File(director,filename);  //即mydir1/mydir2/myfile.txt
		if(f.exists()) {
			System.out.println("文件名：" + f.getAbsolutePath());
			System.out.println("文件大小：" + f.length());
		}
		else {
			f.getParentFile().mkdirs();  //返回上层路径，并由此新建立一系列路径    本文件，将其封装到了test_File包里，
										 //所以其上层路径为该包的上层路径，然后将新建的路径和文件，放到这下面。
										 //如果没有包，则放在class文件的上层路径下面
			try {
				f.createNewFile();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
