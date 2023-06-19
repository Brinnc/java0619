class Test8{
	public static void main(String[] args){
		//실행 시 매개변수를 아래와 같이 넘길 경우
		//java ☆ 5

		String str=args[0]; //첫번째 매개변수는 출력 문자
		int n=Integer.parseInt(args[1]);

		for(int i=1; i<=n; i++){
			System.out.print(str);
		}
	}
}