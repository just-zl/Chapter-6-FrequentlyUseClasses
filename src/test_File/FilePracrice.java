package test_File;

import java.io.File;

//��ĳһ�ļ��м����������ļ����ļ��� ����״��ӡ
public class FilePracrice {

	public static void main(String[] args) {
		
		File f = new File("D:/A");
		System.out.println(f.getName());
		printPath(f,1);
	}
	
	public static void printPath(File f,int level) {  //level�����ǲ�����û���һ�㣬��������ĸ��ո�
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
			//��Ƶ����
			for(int i=0;i<path.length;i++) {
				System.out.println(preStr + path[i].getName());
				if(path[i].isDirectory()) {
					printPath(path[i],level+1);  //����Ϊʲô�ǵ���level+1����������level++��
				}
			}
		}
	}

}
