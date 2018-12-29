package test_String;


public class TestString {

	public static void main(String[] args) {
		//求一个字符串里大写字母数、小写字母数、其他字符数
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
		System.out.println("小写字母数："+lowerCaseNum);
		System.out.println("大写字母数："+upperCaseNum);
		System.out.println("数字个数："+countNum);
		System.out.println("其他字符数："+otherNum);
		
		//求一个字符串里，有多少个相同的子字符串
		String st = "ijavawalfjavaaojavnwjacsdefjavae";  //有三个java子字符串
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
		
		System.out.println("该字符串里，java子字符串的个数为："+sum);
		
		//检验两个指向同一个字符串的引用，如果改变其中一个的值，另一个会不会改变，我先判断是会改变
		String test = new String("test");
		String change = new String();
		change = test;
		System.out.println(change);  
		change = "tast";
		System.out.println(change);  //tast
		System.out.println(test);  //test ????????????????????????
	}

}
