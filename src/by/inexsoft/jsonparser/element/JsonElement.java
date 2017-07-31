/**
 * 
 */
package by.inexsoft.jsonparser.element;

/**
 * @author JenkaBY
 *
 */
public class JsonElement extends JsonBaseElement {
	private String key;
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	@Override
	public boolean isJson() {
		return true;
	}
}
