package by.inexsoft.jsonparser.parser.element;

import by.inexsoft.jsonparser.exception.NotValidJsonException;

public class JsonParser extends BaseParser{

	public JsonParser(String parsedElement) {
		super(parsedElement);
	}

	public String getParsedElement() throws NotValidJsonException{
		validate();
		
		while (counterStartCharacter != 0){
			
		}
		
		return null;
	}
	
}
