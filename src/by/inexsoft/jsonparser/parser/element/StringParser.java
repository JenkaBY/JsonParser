package by.inexsoft.jsonparser.parser.element;

import by.inexsoft.jsonparser.element.JsonBaseElement;
import by.inexsoft.jsonparser.element.StringElement;
import by.inexsoft.jsonparser.exception.NotValidJsonException;

public class StringParser extends BaseParser {

	public StringParser(String parsedElement) {
		super(parsedElement);

	}

	/**
	 * @return JsonBaseElement Возвращает единичный StringElement
	 */
	@Override
	public JsonBaseElement getJsonElement() throws NotValidJsonException {
//		super.validate();
		JsonBaseElement jsonElement = new StringElement();
		jsonElement.setValue(getParsedElement());
		return jsonElement;
	}
	
	/**
	 * Определяет первую подстроку, содержащую строковый Json элемент. Остальную
	 * часть сохраняет в поле {@value <a>restPart</a>}
	 * 
	 * @return Часть строки, которая должна быть преобразована в JSON элемент
	 * @throws NotValidJsonException
	 */
	public String getParsedElement() throws NotValidJsonException {
		if (wasParsed)
			return parsedElement;
		for (currentPosition = initialPosition; currentPosition < chars.size(); currentPosition++) {
			if (isLastPossibleCharacter(chars.get(currentPosition)) && !isPreviousCharEscape()) {
				setRestPart();
				setParsedElement();
				break;
			}
		}
		return parsedElement;
	}
	
}
