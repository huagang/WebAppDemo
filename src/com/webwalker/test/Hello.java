/**
 * 
 */
package com.webwalker.test;

/**
 * @author xu.jian
 * 
 */
public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		getUserAgent();
	}

	public static String getUserAgent() {
		String formatVerison = "01";
		String os = String.format("%-7s", "Android");
		String osVersion = String.format("%-6s",
				android.os.Build.VERSION.RELEASE);
		String deviceToken = String.format("%-64s", "fffffffffffffffffffff");
		String versionName = String.format("%-6s", "1.0.1");
		String channel = String.format("%-16s", "myApp");
		String ua = (formatVerison + os + osVersion + deviceToken + versionName + channel)
				.replace(" ", "=");

		System.out.println(ua);
		return ua;
	}
}
