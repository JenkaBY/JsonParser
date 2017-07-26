/**
 * 
 */
package by.inexsoft.jsonparser.parser.element;

import by.inexsoft.jsonparser.element.JsonElement;

/**
 * @author JenkaBY
 *
 */
public abstract class BaseParser {
	protected int currentPosition;
	protected String rest;
	protected String parsedElement;
	
	/**
	 * @param parsedElement
	 */
	public BaseParser(String parsedElement) {
		this.parsedElement = parsedElement.trim();
	}

	abstract protected JsonElement getJsonElement();
}
