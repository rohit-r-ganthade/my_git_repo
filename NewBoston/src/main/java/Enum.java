/**
 * Created by rohit on 08/09/17.
 */
public enum  Enum {

    Rohit("Nice","26"),
    Ramesh("Good","51"),
    Suresh("Average","45"),
    Akash("Patil", "32"),
    Suraj("Chavan", "19");

    private final String desc;
    private final String year;

    Enum(String description, String birthday){
        desc = description;
        year = birthday;
    }

    public String getDesc() {
        return desc;
    }

    public String getYear() {
        return year;
    }
}
