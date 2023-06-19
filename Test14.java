class Test14{
	public static void main(String[] args){
		//파일명뿐만 아니라 디렉토리 경로까지 포함된 문자열에서 확장자만 추출하기
		//예) d:/html_workspace/day06.13/mario.png 
		//경로에 점(.)이 여러개 존재함
		String path="d:/html_workspace/day06.13/mario.png";
		int index=path.lastIndexOf("."); //가장 마지막 .의 index 위치 반환

		System.out.println("마지막점의 위치는"+index);

		String result=path.substring(index+1, path.length());

		System.out.println("확장자는"+result);
		

	}
}