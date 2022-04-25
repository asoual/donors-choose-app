package donorschooseapplication.project;

public class CategoryNotFoundException extends Exception {

    public CategoryNotFoundException(String input) {
        super("your input: " + input
                + "is ipackage donorschooseapplication.project;

public class CategoryNotFoundException extends Exception {

    public CategoryNotFoundException(String input) {
        super("your input: " + input
                + "is invalid. Here is a list from where you can choose: \n");
    }

    public String getValidCategories() {
        String errorMessage = "the possible inputs are : \n";
        for (Category cat : Category.values()) {
            errorMessage += cat + "\n";
        }
        return errorMessage;
    }
}
