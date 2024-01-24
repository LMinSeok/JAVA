package ex03;

public class exam01 {

	public static void main(String[] args) {
		
		int exam = 4000;
		
		int hour = exam/3600;
		int minute = (exam %3600)/60;
		int second = (exam %3600)%60;
		
		System.out.println("출력 : ");
		System.out.println(hour+"시간"+minute+"분"+second+"초");
		
		int a=5;
		int b=0;
		int c=0;
		int d=0;
		int e=0;
		
		b=a++;
		/*
		 * b=a;
		 * a++
		 */
		c = ++a;
		/*
		 * ++a;
		 * c=a;
		*/
		d=++c;
		e=b++;
		
		System.out.println("a :" +a);
		System.out.println("b :" +b);
		System.out.println("c :" +c);
		System.out.println("d :" +d);
		System.out.println("e :" +e);
		
		
		String a0="JAVABook";
		String c0="JAVA";
		String d0="Book";
		String b0=c0+d0;
		
		if(a0==b0) {
			System.out.println("a와b는 같다.");
		}
		else {
			System.out.println("a와b는 같지 않다.");
		}
		
			

	}

}
