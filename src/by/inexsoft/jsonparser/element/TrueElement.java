/**
 * 
 */
package by.inexsoft.jsonparser.element;

/**
 * @author JenkaBY
 *
 */
public class TrueElement extends JsonBaseElement {
	
	public boolean equals(Object o) {
		if (o == null || !(o instanceof TrueElement)) {
			return false;
		}
		return true;
	}
	
	@Override
	public boolean isTrue() {
		return true;
	}
}
