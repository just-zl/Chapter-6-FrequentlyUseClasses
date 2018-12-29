package test_String;

//将一个字符串，根据符号，分割并组合成一个二维数组
public class StringPractice {

	public static void main(String[] args) {
		/*String s = "1,2;3,4,5;6,7,8";
		double[][] d = new double[3][];
		String st[] = s.split(";");  //分割成了一个一维的字符串数组 st[0]=1,2  st[1]=3,4,5  st[2] = 6,7,8
		String[] sec1 = st[0].split(",");  //sec1[0] = 1 sec[1]=2
		String[] sec2 = st[1].split(","); 
		String[] sec3 = st[2].split(","); 
		
		d[0] = new double[sec1.length];
		d[1] = new double[sec2.length];
		d[2] = new double[sec3.length];
		
		for(int i=0;i<sec1.length;i++) {
			d[0][i] = Double.valueOf(sec1[i]).doubleValue();
		}
		for(int i=0;i<sec2.length;i++) {
			d[1][i] = Double.valueOf(sec2[i]).doubleValue();
		}
		for(int i=0;i<sec3.length;i++) {
			d[2][i] = Double.valueOf(sec3[i]).doubleValue();
		}
		
		//循环输出数组
		for(int i=0;i<d.length;i++) {
			for(int j=0;j<d[i].length;j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}*/
		
		//视频里的方法
		String s = "1,2;3,4,5;6,7,8";
		String[] sFirst = s.split(";"); //先解析成一维,长度为3
		double d[][] = new double[sFirst.length][];  //分配d[][]的一维空间
		for(int i=0;i<sFirst.length;i++) {
			//System.out.println(sFirst[i]);
			String[] sSecond = sFirst[i].split(",");  //解析成二维
			/*for(int j=0;j<sSecond.length;j++) {
				System.out.print(sSecond[j]+" ");
			}
			System.out.println();*/
			d[i] = new double[sSecond.length];
			for(int j=0;j<sSecond.length;j++) {
				d[i][j] = Double.parseDouble(sSecond[j]);
			}
		}
		//循环输出数组
		for(int i=0;i<d.length;i++) {
			for(int j=0;j<d[i].length;j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
	}

}
