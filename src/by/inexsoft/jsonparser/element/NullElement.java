/**
 * 
 */
package by.inexsoft.jsonparser.element;

/**
 * @author JenkaBY
 *
 */
public class NullElement extends JsonBaseElement {
	
	
	@Override
	public boolean isNull() {
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "null";
	}

	@Override
	public Object getValue() {
		return null;
	}
}
