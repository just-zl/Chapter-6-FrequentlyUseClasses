package test_String;

//�����������Ͱ�װ��
public class TestClassOfPackage {

	public static void main(String[] args) {
		Integer i = new Integer(100);
		Double d = new Double("123.456");
		int j = i.intValue() + d.intValue();  //intValue:��Integer��Ķ�����ȡ������ת����int���͵�����
		float f = i.floatValue() + d.floatValue();
		System.out.println(i);
		System.out.println(j);
		
		double pi = new Double("3.1415926");
		double r = Double.valueOf("2.0").doubleValue();  //Double.valueOf()���ص���Double����
		double area = pi*r*r;
		
		try {
			int k = Integer.parseInt("1.25");
		}
		catch (NumberFormatException e) {
			System.out.println("���ݸ�ʽ����");
		}
		
		System.out.println(Integer.toBinaryString(123)+"B");
		System.out.println(Integer.toOctalString(123)+"O");
		System.out.println(Integer.toHexString(123)+"H");
	}

}
