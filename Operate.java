package org.oyj.operate;

public class Operate {
    private String info[];
    public Operate(String info[]) {
    	this.info=info;
    }
    public String login() {
    	Check check=new Check();
    	this.isExit();
    	String name=this.info[0];
    	String password=this.info[1];
    	String str=null;
    	if(check.validate(name, password)) {
    		str="��ӭ"+name+"����";
    	}else {
    		str="������û���������";
    	}
    	return str;
    }
    public void isExit() {
        if(this.info.length!=2) {
       	 System.out.println("������Ĳ�������ȷ��ϵͳ�Ƴ���");
       	 System.out.println("��ʽ:java LoginDemo02 �û��� ����");
       	 System.exit(1);
        }
   }
}
