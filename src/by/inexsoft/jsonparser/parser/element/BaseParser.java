/**
 * 
 */
package by.inexsoft.jsonparser.parser.element;

import java.util.List;
import java.util.stream.Collectors;

import by.inexsoft.jsonparser.element.JsonBaseElement;
import by.inexsoft.jsonparser.exception.NotValidJsonException;
import by.inexsoft.jsonparser.parser.validator.IValidator;
import by.inexsoft.jsonparser.parser.validator.ValidatorFactory;
import by.inexsoft.jsonparser.parser.validator.helper.Element;
import by.inexsoft.jsonparser.util.UtilityMethods;

/**
 * @author JenkaBY
 *
 */
public abstract class BaseParser {
	protected int currentPosition;
	protected int counterFirstCharacter = 1;
	protected String restPart;
	protected String parsedElement;
	protected IValidator validator;
	protected List<Character> chars;
	protected static final Character ESCAPE = '\\';
	protected boolean wasParsed;
	protected int initialPosition;

	/**
	 * @param parsedElement
	 */
	public BaseParser(String parsedElement) {
		chars = parsedElement.trim().chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		this.validator = ValidatorFactory.getInstance().getValidator(parsedElement);
		if (validator.getElement() == Element.STRING)
			initialPosition = 1;
	}

	public JsonBaseElement getJsonElement() throws NotValidJsonException {

		return null;
	}

	/**
	 *
	 * @throws NotValidJsonException
	 */
	protected void validate() throws NotValidJsonException {
		if (validator.isValid(parsedElement)) {
			throw new NotValidJsonException();
		}
	}

	/**
	 * Определяет первую подстроку, содержащую строковый Json элемент. Остальную
	 * часть сохраняет в поле {@value <a>restPart</a>} БАзовая реализация
	 * сделана для Null, True, False. Для остальных элементов должен быть
	 * переопределен.
	 * 
	 * @return Часть строки, которая должна быть преобразована в JSON элемент
	 * @throws NotValidJsonException
	 */
	public String getParsedElement() throws NotValidJsonException {
		if (wasParsed)
			return parsedElement;
		Element element = validator.getElement();
		if (element.getLastPossibleCharacters().contains(chars.get(element.getPositionLastCharacter()))) {
			setRestPart();
			setParsedElement();
		}
		return parsedElement;
	}

	protected String getNotParsedPart() {
		return restPart;
	}

	/**
	 * Определяет является ли предыдущий элемент экранирующим символом?
	 * 
	 * @return boolean
	 */
	protected boolean isPreviousCharEscape() {
		return chars.get(currentPosition - 1).equals(ESCAPE);
	}

	protected boolean isLastPossibleCharacter(Character character) {
		return validator.getElement().getLastPossibleCharacters().contains(character);
	}

	protected int getInitialPosition() {
		if (validator.getElement() == Element.STRING)
			initialPosition = 1;
		return initialPosition;
	}

	protected void setParsedElement() {
		parsedElement = UtilityMethods.join(chars.subList(initialPosition, currentPosition));
		wasParsed = true;
	}

	protected void setRestPart() {
		restPart = chars.subList(currentPosition, chars.size() - 1).toString();
	}
}
