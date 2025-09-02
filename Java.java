package day2;

public class Java {
static void Method(int x){
	System.out.println("parameter and no return value method");
}
static int Method1() {
	System.out.println("no parameter and return value");
	return(10);
}
static int Method2(int n)
{
	System.out.println("parameter and return value");
	return(10);
}
public static void main(String[] args)
{
	Method(10);
	Method1();
	Method2(25);
	
}
}
