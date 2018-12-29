package test_enum;

//枚举类型
public class TestEnum {
	
	public enum myColor {red,blue,white};
	public static void main(String[] args) {
		myColor m = myColor.blue;
		switch (m) {
		case red:
			System.out.println("红色");
			break;
		case blue:
			System.out.println("蓝色");
			break;
		default:
			System.out.println("default");
			break;
		}
		System.out.println(m);
	}

}
