class Test4{
	public static void main(String[] args){

		//main()메서드는 개발자가 직접 호출은 불가능하고,
		//java.exe에 의해 호출되므로, 실행할 때 매개변수를 넘길 수 있음
		//매개변수인 args의 0번째를 꺼내어, 구구단에 활용해보자
		int dan=Integer.parseInt(args[0]); //7 "7"

		for(int i=1; i<=9; i++){
			System.out.println(dan+"*"+i+"="+(dan*i)); //edit플러스에서 줄 복사는 > 컨트롤 +
			
		}
	}
}