package by.inexsoft.jsonparser.parser.validator;

import by.inexsoft.jsonparser.parser.validator.helper.Element;

public interface IValidator {

	default boolean isValid(String parsedElement){
		return parsedElement != null;
	}
	
	public Element getElement();
}