package test_enum;

//ö������
public class TestEnum {
	
	public enum myColor {red,blue,white};
	public static void main(String[] args) {
		myColor m = myColor.blue;
		switch (m) {
		case red:
			System.out.println("��ɫ");
			break;
		case blue:
			System.out.println("��ɫ");
			break;
		default:
			System.out.println("default");
			break;
		}
		System.out.println(m);
	}

}
