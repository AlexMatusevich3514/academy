package by.academy.homework3;

import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {
    private static final Pattern pattern = Pattern.compile("\\+375((29)|(33)|(25)|(44))+([0-9]){7}");

    @Override
    public Pattern getPattern() {
        return pattern;
    }
}
