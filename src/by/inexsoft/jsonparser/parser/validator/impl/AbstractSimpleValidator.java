package by.inexsoft.jsonparser.parser.validator.impl;

import by.inexsoft.jsonparser.parser.validator.IValidator;
import by.inexsoft.jsonparser.parser.validator.helper.Element;

public abstract class AbstractSimpleValidator implements IValidator {
	private Element element;

	public AbstractSimpleValidator(Element element) {
		this.element = element;
	}

	@Override
	public boolean isValid(String parsedElement) {
		return IValidator.super.isValid(parsedElement) && startsWith(parsedElement) && endsWith(parsedElement) && validateLength(parsedElement)
				&& validateMiddle(parsedElement);
	}

	protected boolean validateMiddle(String parsedElement) {
		// TODO Implement me
		return true;
	}

	protected boolean startsWith(String parsedElement) {
		return element.getFirstPossibleCharacters().contains(getFirstCharacterInLowerCase(parsedElement));
	}

	protected boolean endsWith(String parsedElement) {
		return element.getFirstPossibleCharacters().contains(getLastCharacterInLowerCase(parsedElement));
	}

	protected boolean validateLength(String parsedElement) {
		return parsedElement.length() >= element.getMinPossibleLength();
	}

	protected Character getFirstCharacterInLowerCase(String parsedElement) {
		return parsedElement.charAt(0);
	}

	protected Character getLastCharacterInLowerCase(String parsedElement) {
		return parsedElement.charAt(parsedElement.length() - 1);
	}

	public Element getElement() {
		return element;
	}
}