class Test12{
	public static void main(String[] args){
		//문자열을 다루는 String객체의 메서드 중 split을 알아보자
		//참고로 js와 java는 서로 다른 기술이지만, 일반적인 프로그래밍 언어에서 문자열을 다루는 메서드들은 거의 비슷하기 때문에
		//java api와 js api는 문자열에 대해서 거의 같음 

		

		String filename=args[0];

		/*
		//1) split으로 처리하는 방법
		String[] arr=filename.split("\\."); //. 을 인식하는데  특수문자로 인식하기때문에 역슬래쉬 \\ _일단 split은 ㅇㅇ
		//원칙상은 \\안붙여도 되는데 스플릿과 같은 메서드는 붙여야함

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		*/

		//2) substring()으로 처리하는 방법
		//filename.substring(시작index, 마지막index(포함되지않음));
		//파일이름 추출: filename.substring(0, 점이발견된 인덱스);
		String name=filename.substring(0, filename.indexOf("."));
		System.out.println("파일이름만"+name);

		//확장자 추출: 
		String extension=filename.substring(filename.indexOf(".")+1, filename.length()); //.length() js에선 변수였으나 자바에서는 메서드임
		System.out.println("확장자만"+extension);
	}
}