package by.inexsoft.jsonparser.parser.element;

import by.inexsoft.jsonparser.element.JsonBaseElement;
import by.inexsoft.jsonparser.element.StringElement;
import by.inexsoft.jsonparser.exception.NotValidJsonException;

public class StringParser extends BaseParser {

	public StringParser(String parsedElement) {
		super(parsedElement);

	}

	@Override
	public JsonBaseElement getJsonElement() throws NotValidJsonException {
		super.validate();
		JsonBaseElement jsonElement = new StringElement();
		jsonElement.setValue(parsedElement);
		return jsonElement;
	}
}
