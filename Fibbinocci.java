package week2.day2;

public class Fibbinocci {
	public static void main(String[] args) {
		int i,firstNum=0,secNum=1,sum=0;
		System.out.println(firstNum+"\n"+secNum);
		
		for(i=1;i<10;++i) {
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.println(sum);
	}

}
}
