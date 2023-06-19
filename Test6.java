class Test6{
	public static void main(String[] args){

		int n=Integer.parseInt(args[0]);

		/*
		if(n%2==0){
			System.out.println("Â¦¼ö");
		}else{
			System.out.println("È¦¼ö");
		}
		*/

		String result=(n%2==0)? "Â¦¼ö":"È¦¼ö";
		System.out.println(result);
	}
}