package by.inexsoft.jsonparser.parser.element;

import by.inexsoft.jsonparser.element.JsonBaseElement;
import by.inexsoft.jsonparser.element.NullElement;
import by.inexsoft.jsonparser.exception.NotValidJsonException;
import by.inexsoft.jsonparser.parser.validator.helper.Element;
import by.inexsoft.jsonparser.util.UtilityMethods;

public class NullParser extends BaseParser {

	public NullParser(String parsedElement) {
		super(parsedElement);
	}

	/**
	 * @return JsonBaseElement Возвращает единичный StringElement
	 */
	@Override
	public JsonBaseElement getJsonElement() throws NotValidJsonException {
		super.validate();
		JsonBaseElement jsonElement = new NullElement();
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
//	public String getParsedElement() throws NotValidJsonException {
//		if (wasParsed)
//			return parsedElement;
//		Element element = validator.getElement();
//		if (element.getLastPossibleCharacters().contains(chars.get(element.getPositionLastCharacter()))) {
//			setRestPart();
//			setParsedElement();
//		}
//		return parsedElement;
//	}

}
