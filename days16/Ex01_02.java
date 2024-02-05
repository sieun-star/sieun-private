package days16;


import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author SIEUN
 *@date2024. 1. 22. - 오전 10:15:00
 *@subject
 *@content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		String n = "keNik";
		String m = "kKnie";
		
		n = n.toUpperCase().chars().sorted().collect(StringBuilder::new,
				StringBuilder::appendCodePoint, StringBuilder::append).toString();
		
		m = Stream.of(m.toUpperCase().split("")).sorted().collect(Collectors.joining());

		System.out.println(n.equals(m));
		
	} // main

} // class
