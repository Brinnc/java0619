class Test4{
	public static void main(String[] args){

		//main()�޼���� �����ڰ� ���� ȣ���� �Ұ����ϰ�,
		//java.exe�� ���� ȣ��ǹǷ�, ������ �� �Ű������� �ѱ� �� ����
		//�Ű������� args�� 0��°�� ������, �����ܿ� Ȱ���غ���
		int dan=Integer.parseInt(args[0]); //7 "7"

		for(int i=1; i<=9; i++){
			System.out.println(dan+"*"+i+"="+(dan*i)); //edit�÷������� �� ����� > ��Ʈ�� +
			
		}
	}
}