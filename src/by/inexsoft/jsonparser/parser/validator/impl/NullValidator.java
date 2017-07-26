package by.inexsoft.jsonparser.parser.validator.impl;

public class NullValidator extends AbstractSimpleValidator {

	public NullValidator() {
		super("n", "l", 4);
	}
	
	@Override
	protected boolean validateMiddle(String parsedElement){
		return parsedElement.length() == 4;
	}
}
