package donorschooseapplication.project;

public class Material {
    private String reference;
    private String description;
    private String unit_price;
    private String needed_quantity;
    // constructor
    public Material( String reference , String description , String unit_price ,
            String needed_quantity){
        this.reference = reference;
        this.description = description;
        this.unit_price = unit_price;
        this.needed_quantity = needed_quantity;
        
    }
    //setters & getters
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(String unit_price) {
        this.unit_price = unit_price;
    }

    public String getNeeded_quantity() {
        return needed_quantity;
    }

    public void setNeeded_quantity(String needed_quantity) {
        this.needed_quantity = needed_quantity;
    }
    public String toString(){
        return "the reference is : " + this.reference + ", the description is :"+ this.description 
                + ", the unit price is : "+ this.unit_price + ", the quantity needed : "
                + this.needed_quantity; 
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                         package donorschooseapplication.project;

public class Material {
    private String reference;
    private String description;
    private String unit_price;
    private String needed_quantity;
    // constructor
    public Material( String reference , String description , String unit_price ,
            String needed_quantity){
        this.reference = reference;
        this.description = description;
        this.unit_price = unit_price;
        this.needed_quantity = needed_quantity;
        
    }
    //setters & getters
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(String unit_price) {
        this.unit_price = unit_price;
    }

    public String getNeeded_quantity() {
        return needed_quantity;
    }

    public void setNeeded_quantity(String needed_quantity) {
        this.needed_quantity = needed_quantity;
    }
    public String toString(){
        return "the reference is : " + this.reference + ", the description is :"+ this.description 
                + ", the unit price is : "+ this.unit_price + ", the quantity needed : "
                + this.needed_quantity; 
    }
}
