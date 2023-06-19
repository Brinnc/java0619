//새를 정의함
class Bird{
	int wing=2;

	//자바 클래스 정의 시 main은 필수가 아닌 선택임
	//즉, 현재 프로젝트의 시작점(entry point)을 누가 부담할지에 대한 문제일 뿐,
	//모든 클래스 내에 main을 두려고 하지 말자
	public static void main(String[] args){
		Cat c=new Cat();
		System.out.print(c.name);
	}
}