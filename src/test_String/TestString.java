package test_String;


public class TestString {

	public static void main(String[] args) {
		//��һ���ַ������д��ĸ����Сд��ĸ���������ַ���
		String s = "  ZhangLi is 23 years old!   ";
		int upperCaseNum = 0;
		int lowerCaseNum = 0;
		int countNum = 0;
		int otherNum = 0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='a' && c<='z') {
				lowerCaseNum ++;
			}
			else if(c>='A' && c<='Z') {
				upperCaseNum ++;
			}
			else if(c>='0' && c<='9') {
				countNum ++;
			}
			else {
				otherNum ++;
			}
		}
		System.out.println("Сд��ĸ����"+lowerCaseNum);
		System.out.println("��д��ĸ����"+upperCaseNum);
		System.out.println("���ָ�����"+countNum);
		System.out.println("�����ַ�����"+otherNum);
		
		//��һ���ַ�����ж��ٸ���ͬ�����ַ���
		String st = "ijavawalfjavaaojavnwjacsdefjavae";  //������java���ַ���
		int sum = 0;
		String temp;
		String findIt = "java";
		/*for(int i=0;i<=st.length()-findIt.length();i++) {
			String temp = st.substring(i+findIt.length(), findIt.length());
			if(temp.equals(findIt)) {
				sum ++;
			}
		}*/
		/*int index = st.indexOf(findIt);
		if(index >=0) sum++;*/
		while(st.indexOf(findIt)>=0) {
			sum ++;
			st = st.substring(st.indexOf(findIt)+findIt.length(),st.length());
		}
		
		System.out.println("���ַ����java���ַ����ĸ���Ϊ��"+sum);
		
		//��������ָ��ͬһ���ַ��������ã�����ı�����һ����ֵ����һ���᲻��ı䣬�����ж��ǻ�ı�
		String test = new String("test");
		String change = new String();
		change = test;
		System.out.println(change);  
		change = "tast";
		System.out.println(change);  //tast
		System.out.println(test);  //test ????????????????????????
	}

}
