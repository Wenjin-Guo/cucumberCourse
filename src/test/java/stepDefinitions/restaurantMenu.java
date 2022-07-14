package stepDefinitions;

import java.util.ArrayList;

public class restaurantMenu {
    ArrayList<restaurantMenuItem> menuItems = new ArrayList<restaurantMenuItem>();
    public boolean addMenuItem(restaurantMenuItem newMenuItem) {
        return menuItems.add(newMenuItem);
    }

    public boolean DoesItemExist(restaurantMenuItem newMenuItem) {
        boolean Exists = false;
        if(menuItems.contains(newMenuItem)){
            Exists = true;
        }
        return Exists;
    }
}
