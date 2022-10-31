package ss19_string_regex.exerice.class_name;

public class TestClassName {
    private static NameExample nameExample;
    public static final String[] validName = new String[] {"C0318G"};
    public static final String[] invalidName = new String[] {"M0318G","P0323A"};
    public static void main(String[] args) {
        nameExample = new NameExample();
        for(String name : validName){
            boolean isvalid = nameExample.validate(name);
            System.out.println("Name is " + name + " is valid: " + isvalid);
        }
        for(String name : invalidName){
            boolean isvalid = nameExample.validate(name);
            System.out.println("Name is " + name + " is valid: " + isvalid);
        }
    }


}
