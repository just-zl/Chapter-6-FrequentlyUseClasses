package test_String;

//StringBuffer���ǿɱ���ַ�����
public class TestStringBuffer {

	public static void main(String[] args) {
		String s = "Microsfot";
		char ch[] = {'a','b','c'};
		StringBuffer sb1 = new StringBuffer(s);
		sb1.append("/").append("Sun").append("/").append("Oracle");  //��ĩβ����ַ���
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer("����");
		for(int i=0;i<=9;i++) {
			sb2.append(i);
		}
		System.out.println(sb2);
		
		sb2.delete(8,sb2.length()).insert(0,ch);  //���±�Ϊ8�ĵط���ʼ��ɾ��sb2��������ݣ�Ȼ�����±�Ϊ0��֮ǰ����ch[]
		System.out.println(sb2);
		
		System.out.println(sb2.reverse());  //����
	}

}
