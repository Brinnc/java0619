class Test12{
	public static void main(String[] args){
		//���ڿ��� �ٷ�� String��ü�� �޼��� �� split�� �˾ƺ���
		//����� js�� java�� ���� �ٸ� ���������, �Ϲ����� ���α׷��� ���� ���ڿ��� �ٷ�� �޼������ ���� ����ϱ� ������
		//java api�� js api�� ���ڿ��� ���ؼ� ���� ���� 

		

		String filename=args[0];

		/*
		//1) split���� ó���ϴ� ���
		String[] arr=filename.split("\\."); //. �� �ν��ϴµ�  Ư�����ڷ� �ν��ϱ⶧���� �������� \\ _�ϴ� split�� ����
		//��Ģ���� \\�Ⱥٿ��� �Ǵµ� ���ø��� ���� �޼���� �ٿ�����

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		*/

		//2) substring()���� ó���ϴ� ���
		//filename.substring(����index, ������index(���Ե�������));
		//�����̸� ����: filename.substring(0, ���̹߰ߵ� �ε���);
		String name=filename.substring(0, filename.indexOf("."));
		System.out.println("�����̸���"+name);

		//Ȯ���� ����: 
		String extension=filename.substring(filename.indexOf(".")+1, filename.length()); //.length() js���� ���������� �ڹٿ����� �޼�����
		System.out.println("Ȯ���ڸ�"+extension);
	}
}