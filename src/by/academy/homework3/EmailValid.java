package by.academy.homework3;

import java.util.regex.Pattern;

public class EmailValid implements Validator{
    private static final Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    @Override
    public Pattern getPattern() {
        return pattern;
    }
}
