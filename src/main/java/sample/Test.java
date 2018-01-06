package sample;

import java.util.Collections;
import java.util.Map;

import static Utl.IgniteUtl.startIgnite_default;

public class Test {
	public static void main(String[] args)
	{
		Map<String, String> attrs = Collections.singletonMap("AGENT", "2");
		startIgnite_default(attrs,"AGENT","2");
	}
}
