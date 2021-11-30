package businesscode;

import java.util.stream.Stream;

public class SourceProviders {

	public static Stream<String> fruitMethodSource() {
	return Stream.of("apple", "banana");
	}
	
}