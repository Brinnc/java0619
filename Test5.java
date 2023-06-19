class Test5{
	public static void main(String[] args){
		
		int dan=Integer.parseInt(args[0]);

		for(int a=dan; a>=2; a--){ //몇단을 찍을지

			System.out.println(a+" 단");

			for(int i=1; i<=9; i++){ //구구단 중 한 단(1~9)을 출력하는 포문
				System.out.println(a+"*"+i+"="+(a*i));
			}
		}
	}
}