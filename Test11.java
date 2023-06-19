class Test11{
	public static void main(String[] args){
		String str=args[0]; //조사대상 문자열
		String target=args[1]; //문자열 내 인덱스를 구할 문자

		int index=str.indexOf(target); //target 문자열이 몇번째에 들어있는지 반환받음

		System.out.println(target+"이라는 문자열은 "+index+"에 위치합니다");
	}
}