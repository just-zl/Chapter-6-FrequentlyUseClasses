package test_String;

//基本数据类型包装类
public class TestClassOfPackage {

	public static void main(String[] args) {
		Integer i = new Integer(100);
		Double d = new Double("123.456");
		int j = i.intValue() + d.intValue();  //intValue:将Integer类的对象提取出来，转换成int类型的数字
		float f = i.floatValue() + d.floatValue();
		System.out.println(i);
		System.out.println(j);
		
		double pi = new Double("3.1415926");
		double r = Double.valueOf("2.0").doubleValue();  //Double.valueOf()返回的是Double对象
		double area = pi*r*r;
		
		try {
			int k = Integer.parseInt("1.25");
		}
		catch (NumberFormatException e) {
			System.out.println("数据格式不对");
		}
		
		System.out.println(Integer.toBinaryString(123)+"B");
		System.out.println(Integer.toOctalString(123)+"O");
		System.out.println(Integer.toHexString(123)+"H");
	}

}
