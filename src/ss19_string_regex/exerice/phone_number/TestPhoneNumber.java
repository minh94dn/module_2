package ss19_string_regex.exerice.phone_number;

public class TestPhoneNumber {
    private static PhoneNumberExample phoneNumberExample;
    public static final String[] validPhoneNumber = new String[] {"(84)-(0978489648)"};
    public static final String[] invalidPhoneNumber = new String[] {"(a8)-(22222222)"};
    public static void main(String[] args) {
        phoneNumberExample = new PhoneNumberExample();
        for(String name : validPhoneNumber){
            boolean isvalid = phoneNumberExample.validate(name);
            System.out.println("Name is " + name + " is valid: " + isvalid);
        }
        for(String name : invalidPhoneNumber){
            boolean isvalid = phoneNumberExample.validate(name);
            System.out.println("Name is " + name + " is invalid: " + isvalid);
        }
    }
}
