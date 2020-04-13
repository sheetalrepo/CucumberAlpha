package parallel;

import java.util.HashMap;
import java.util.Map;

public class Data {

	private static  Map<String,String> globalDataMap = new HashMap<String, String>();

	public static Map<String, String> getGlobalDataMap() {
		return globalDataMap;
	}

	public static void setGlobalDataMap(Map<String, String> globalDataMap) {
		Data.globalDataMap = globalDataMap;
	}
}
