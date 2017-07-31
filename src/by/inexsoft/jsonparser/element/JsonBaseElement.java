/**
 * 
 */
package by.inexsoft.jsonparser.element;

/**
 * @author JenkaBY
 *
 */
public class JsonBaseElement {
	private Object value;

	/**
	 * @return the value
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(Object value) {
		this.value = value;
	}

	public boolean isJson() {
		return false;
	}

	public boolean isArray() {
		return false;
	}

	public boolean isString() {
		return false;
	}

	public boolean isNumber() {
		return false;
	}

	public boolean isNull() {
		return false;
	}

	public boolean isTrue() {
		return false;
	}

	public boolean isFalse() {
		return false;
	}
}
