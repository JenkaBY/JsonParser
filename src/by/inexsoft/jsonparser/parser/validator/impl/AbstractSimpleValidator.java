package by.inexsoft.jsonparser.parser.validator.impl;

import by.inexsoft.jsonparser.parser.validator.IValidator;

public abstract class AbstractSimpleValidator implements IValidator{
	private final String startWith;
	private final String endsWith;
	private int length;

	public AbstractSimpleValidator(String startWith, String endsWith, int length){
		this.startWith = startWith;
		this.endsWith = endsWith;
		this.length = length;
	}
	
	public AbstractSimpleValidator(String startWith, String endsWith){
		this.startWith = startWith;
		this.endsWith = endsWith;
		length = 1;
	}
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

	protected boolean startsWith(String parsedElement) {
		return parsedElement.startsWith(startWith);
	}

	protected boolean endsWith(String parsedElement) {
		return parsedElement.endsWith(endsWith);
	}

	protected boolean validateMiddle(String parsedElement){
		if (length == 1) {
			return parsedElement.length() > length;
		}
		return parsedElement.length() == length;
	}
}
