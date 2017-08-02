package by.inexsoft.jsonparser.parser.element;

import by.inexsoft.jsonparser.exception.NotValidJsonException;

public class JsonParser extends BaseParser{

	public JsonParser(String parsedElement) {
		super(parsedElement);
	}

	/**
	 * 
	 * @return Часть строки, которая должна быть преобразована в JSON элемент
	 * @throws NotValidJsonException
	 */
	@Override
	public String getParsedElement() throws NotValidJsonException{

		
		while (counterFirstCharacter != 0){
			
		}
		validate();
		return null;
	}
	
	
}
