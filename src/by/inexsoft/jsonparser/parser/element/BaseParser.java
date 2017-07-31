/**
 * 
 */
package by.inexsoft.jsonparser.parser.element;

import by.inexsoft.jsonparser.element.JsonBaseElement;
import by.inexsoft.jsonparser.exception.NotValidJsonException;
import by.inexsoft.jsonparser.parser.validator.IValidator;
import by.inexsoft.jsonparser.parser.validator.ValidatorFactory;

/**
 * @author JenkaBY
 *
 */
public abstract class BaseParser {
	protected int currentPosition;
	protected int counterStartCharacter = 1;
	protected String restPart;
	protected String parsedElement;
	protected IValidator validator;
	
	/**
	 * @param parsedElement
	 */
	public BaseParser(String parsedElement) {
		this.parsedElement = parsedElement.trim();
		this.validator = ValidatorFactory.getInstance().getValidator(parsedElement);
	}

	public JsonBaseElement getJsonElement() throws NotValidJsonException {

		return null;
	}
	
	protected void validate() throws NotValidJsonException {
		if (validator.isValid(parsedElement)) {
			throw new NotValidJsonException();
		}
	}
}
