/**
 * 
 */
package by.inexsoft.jsonparser.element;

/**
 * @author JenkaBY
 *
 */
public class FalseElement extends JsonElement {

	public boolean equals(Object o) {
		if (o == null || !(o instanceof FalseElement)) {
			return false;
		}
		return true;
	}
}
