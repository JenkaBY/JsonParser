/**
 * 
 */
package by.inexsoft.jsonparser.util;

import java.util.List;

/**
 * @author JenkaBY
 *
 */
public class UtilityMethods {

	public static String join(List<Character> chars){
		StringBuilder sb = new StringBuilder();
		chars.forEach(ch -> sb.append(ch));
		return sb.toString();
	}
}
