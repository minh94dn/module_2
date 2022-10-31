package ss19_string_regex.exerice.class_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String Name_REGEX ="^[CAP][0-9]{4}[GHIKLM]$";
    public NameExample(){
        pattern = Pattern.compile(Name_REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
