class Test9{
	public static void main(String[] args){

		String str=args[0];
		int x=Integer.parseInt(args[1]);
		int y=Integer.parseInt(args[2]);

		for(int k=1; k<=x; k++){
			for(int i=1; i<=y; i++){
				System.out.print(str);
			}
		System.out.println("");
		}
	}
}