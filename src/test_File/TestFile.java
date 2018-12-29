package test_File;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		String separator = File.separator; //·���ָ�������windows�£��Ƿ�б��/����Linux�£�����б��\��һ����\����
		String filename = "myfile.txt";
		String director = "mydir1"+ separator + "mydir2";  //����·��
		File f = new File(director,filename);  //��mydir1/mydir2/myfile.txt
		if(f.exists()) {
			System.out.println("�ļ�����" + f.getAbsolutePath());
			System.out.println("�ļ���С��" + f.length());
		}
		else {
			f.getParentFile().mkdirs();  //�����ϲ�·�������ɴ��½���һϵ��·��    ���ļ��������װ����test_File���
										 //�������ϲ�·��Ϊ�ð����ϲ�·����Ȼ���½���·�����ļ����ŵ������档
										 //���û�а��������class�ļ����ϲ�·������
			try {
				f.createNewFile();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
