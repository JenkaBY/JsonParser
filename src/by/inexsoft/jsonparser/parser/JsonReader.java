package by.inexsoft.jsonparser.parser;

import java.util.List;

import by.inexsoft.jsonparser.element.JsonBaseElement;
import by.inexsoft.jsonparser.exception.NotValidJsonException;
import by.inexsoft.jsonparser.parser.element.BaseParser;
import by.inexsoft.jsonparser.parser.element.NullParser;

public class JsonReader {
	private List<JsonBaseElement> jsons;
	private String json;

	/**
	 * @param jsons
	 */
	public JsonReader(String json) {
		this.json = removeExtraSymbols(json).trim();
	}

	public List<JsonBaseElement> getJSONs(){

		return jsons;
	}
	
/**
 * Убирает переносы строк (\r, \n) и табуляцию \t . Не учитывает такие же символы, находящиеся в строковых литералах. 
 * @param text текст из которого должны быть убраны символы
 * @return строку без символов
 */
	protected String removeExtraSymbols(String text) {
		return text.replaceAll("\n", "").replaceAll("\r", "");
	}

	public String getParsedElement()  throws NotValidJsonException {
		BaseParser parser = new NullParser(json);
		return parser.getParsedElement();
	}
}
