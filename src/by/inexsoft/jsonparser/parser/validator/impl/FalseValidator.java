package by.inexsoft.jsonparser.parser.validator.impl;

import by.inexsoft.jsonparser.parser.validator.IValidator;

public class FalseValidator implements IValidator {
	private static final String STARTS_WITH = "f";
	private static final String ENDS_WITH = "e";

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * by.inexsoft.jsonparser.parser.validator.IValidator#isValid(java.lang.
	 * String)
	 */
	@Override
	public boolean isValid(String parsedElement) {
		return IValidator.super.isValid(parsedElement) 
				&& startsWith(parsedElement) 
				&& endsWith(parsedElement)
				&& validateMiddle(parsedElement);
	}

	private boolean startsWith(String parsedElement) {
		return parsedElement.startsWith(STARTS_WITH);
	}

	private boolean endsWith(String parsedElement) {
		return parsedElement.endsWith(ENDS_WITH);
	}

	private boolean validateMiddle(String parsedElement){
		return parsedElement.length() == 5;
	}
}
