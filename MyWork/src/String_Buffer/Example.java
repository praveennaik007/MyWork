package String_Buffer;

//		Growable : (oldCapacity*2)+2;
public class Example {
	public static void main(String[] args) {
//		StringBuffer sb = new StringBuffer();// Capacity by default set = 16
//		sb.append("123456789012345675677");
//		sb = sb.append("world").append('A').append(false);
//		System.out.println(sb.reverse());
//		System.out.println(sb.repeat(sb, 2));// hellohellohello
//		System.out.println(sb.capacity());//34
		StringBuffer sb2 = new StringBuffer(2);// Capacity =20
		System.out.println(sb2.append(123).capacity());
	}
}
