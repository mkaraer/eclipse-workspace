package day45_static_block_INHERITANCE;

public class blocks {
static int num=100;
static String str;

static {
	System.out.println("static block");
	num=num+1000;
	str="Hello";
}
{
	System.out.println("int block");
num=num+500;
str=str+"world";
}
public blocks() {
	System.out.println("constructor");
	num=num*2;
	str=str+"!!!";
}




}
