package kdata.exceptions;

public class MyRuntimeException extends RuntimeException{
	//RuntimeException���� �Ű����� �ִ°� ������ �ϴϱ� ��� �ؾߵɱ�!!!
	public MyRuntimeException (){
		super("MyRuntimeException ������#1");
	}
	//�����Ҷ����� �ٲ�� �Ұ�. 
	public MyRuntimeException (String msg){
		super(msg);
	}
}
