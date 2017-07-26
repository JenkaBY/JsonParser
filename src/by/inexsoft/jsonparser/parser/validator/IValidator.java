package by.inexsoft.jsonparser.parser.validator;

public interface IValidator {

	default boolean isValid(String parsedElement){
		return parsedElement != null;
	}
}