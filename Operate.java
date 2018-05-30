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
    		str="欢迎"+name+"光临";
    	}else {
    		str="错误的用户名和密码";
    	}
    	return str;
    }
    public void isExit() {
        if(this.info.length!=2) {
       	 System.out.println("你输入的参数不正确，系统推出！");
       	 System.out.println("格式:java LoginDemo02 用户名 密码");
       	 System.exit(1);
        }
   }
}
