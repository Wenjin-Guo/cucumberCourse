package stepDefinitions;

public class restaurantMenuItem {
    private String ItemName;
    private String Description;
    private int Price;

    public restaurantMenuItem(String itemName, String description, int price) {
        ItemName = itemName;
        Description = description;
        Price = price;
    }

    public String getItemName() {
        return ItemName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }


}
