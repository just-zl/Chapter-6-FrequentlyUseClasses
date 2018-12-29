package test_File;

import java.io.File;

//将某一文件夹及其所有子文件或文件夹 呈树状打印
public class FilePracrice {

	public static void main(String[] args) {
		
		File f = new File("D:/A");
		System.out.println(f.getName());
		printPath(f,1);
	}
	
	public static void printPath(File f,int level) {  //level用来记层数，没多加一层，则多缩进四个空格
		if(f.exists()) {
			String preStr = "";
			for(int i=0;i<level;i++) {
				preStr += "    ";
			}
			
			File path[] = f.listFiles();  //path[0]:D:\A\B  path[1]: D:\A\C  path[2]: D:\A\d.txt
			/*if(path.length!=0) {
				for(int i=0;i<path.length;i++) {
					//System.out.println(path[i]);
					//printPath(path[i]);
					System.out.println(path[i]);
					printPath(path[i]);
					f = f.getParentFile();
				}
			}*/
			//视频代码
			for(int i=0;i<path.length;i++) {
				System.out.println(preStr + path[i].getName());
				if(path[i].isDirectory()) {
					printPath(path[i],level+1);  //这里为什么非得是level+1；而不能是level++？
				}
			}
		}
	}

}
