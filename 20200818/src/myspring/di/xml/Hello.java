package myspring.di.xml;

public class Hello {
	private String name;
	private Printer printer;
	
	//setter �޼���
	public void setName(String name) {
		this.name = name;
	}
	
	//setter �޼���
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public String sayHello() {
		return "Hello "+name;
	}
	
	public void print() {
		this.printer.print(sayHello());
	}
	
	
}
