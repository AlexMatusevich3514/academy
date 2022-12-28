package by.academy.homework3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface Validator {

   Pattern getPattern();

    default boolean validate(String textNumber) {
        return getPattern().matcher(textNumber).matches();
    }
}
