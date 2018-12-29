package test_String;

//StringBuffer类是可变的字符序列
public class TestStringBuffer {

	public static void main(String[] args) {
		String s = "Microsfot";
		char ch[] = {'a','b','c'};
		StringBuffer sb1 = new StringBuffer(s);
		sb1.append("/").append("Sun").append("/").append("Oracle");  //在末尾添加字符串
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer("数字");
		for(int i=0;i<=9;i++) {
			sb2.append(i);
		}
		System.out.println(sb2);
		
		sb2.delete(8,sb2.length()).insert(0,ch);  //从下标为8的地方开始，删除sb2后面的内容，然后在下标为0处之前插入ch[]
		System.out.println(sb2);
		
		System.out.println(sb2.reverse());  //逆序
	}

}
