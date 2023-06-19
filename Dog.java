class Dog{
	int x=3;

	public static void main(String[] args){
		//dog이 보유한 x를 출력하시오
		//class라는 단위는 실제 사물이 아닌, 거푸집이므로 직접 사용할 수 없음
		//따라서 거푸집으로부터 인스턴스를 생성해야만, 클래스가 보유한 변수와 메서드에 접근할 수 있음
		//자바의 자료형은 4가지 : 문자 / 숫자 / 논리값 / 자료형
		Dog d=new Dog(); //자료형은 객체형(문자+숫자+논리값), 즉 dog형(개발자가 만들어낸 자료형)
		System.out.print(d.x);
	}
}