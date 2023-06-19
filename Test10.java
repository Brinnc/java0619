class Test10{
	public static void main(String[] args){

		int n=Integer.parseInt(args[0]);
		
		for(int a=1; a<=5; a++){
			for(int i=1; i<=5; i++){
				
				if(i==a){
					System.out.print("¡Ú");
				}else{
					System.out.print("¡Ù");
				}
				
			}
		System.out.println(); //Ãþ¼ö¸¸Å­ ÁÙ¹Ù²Þ
		}

	}
}