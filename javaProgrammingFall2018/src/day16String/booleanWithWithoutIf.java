package day16String;

public class booleanWithWithoutIf {
	public static void main (String[] args) {
		//<,<==,>,>==!=
		//&&,||,!.^
		//&=&&  and |=||--- ikitane olunca birinci false olursa ikincisine gecmiyor. birtane olunca geciyor.
		
		boolean b=12>10;
		System.out.println(b);
		
		//22100--22200 -- mclean
		int zipCode= 22199;
		
         if(zipCode>=22100 && zipCode++ <=22200) {   // 221999 smaller but it is true because first is true..
			System.out.println("mclean");
		}else {
			System.out.println("not mclean");
		}
		System.out.println(zipCode);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
