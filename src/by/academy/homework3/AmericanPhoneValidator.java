package by.academy.homework3;

import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {
    private static final Pattern pattern = Pattern.compile("^((\\+1)+([0-9]){10})$");

    @Override
    public Pattern getPattern() {

        return pattern;
    }
}
