package by.inexsoft.jsonparser.parser.validator.impl;

import by.inexsoft.jsonparser.parser.validator.IValidator;

public class StringValidator implements IValidator {
	private static final String START_END_WITH = "\"";

	/* (non-Javadoc)
	 * @see by.inexsoft.jsonparser.parser.validator.IValidator#isValid(java.lang.String)
	 */
	@Override
	public boolean isValid(String parsedElement){
		return IValidator.super.isValid(parsedElement) 
				&& startsWith(parsedElement)
				&& endsWith(parsedElement) 
				&& validateMiddle(parsedElement);
	}
	
	
	private boolean startsWith(String parsedElement){
		return parsedElement.startsWith(START_END_WITH);
	}
	
	private boolean endsWith(String parsedElement){
		return  parsedElement.startsWith(START_END_WITH);
	}

	private boolean validateMiddle(String parsedElement){
		return parsedElement.length() > 1;
	}
}
