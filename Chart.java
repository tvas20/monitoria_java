public class Chart {
    private Items[] buyItems;
    private int itemCount;

    public Chart() {
        buyItems = new Items[10]; // Initializing with a fixed size
        itemCount = 0;
    }

    public String searchItem(String name) throws NotFound, NullParameters { // Search for an item by name
        if (name == null) {
            throw new NullParameters();
        }
        for (int i = 0; i < itemCount; i++) {
            if (buyItems[i].getName().equals(name)) {
                return "Item found: " + buyItems[i].getName() + " at price: " + buyItems[i].getPrice();
            }
        }
        throw new NotFound();
    }

    public void addItem(Items item) throws NotEnoughSpace, ItemAlreadyExists, NullParameters { // Add an item to the chart
        if (item == null) {
            throw new NullParameters();
        } 
        if (itemCount >= buyItems.length) {
            throw new NotEnoughSpace();
        }
        for (int i = 0; i < itemCount; i++) {
            if (buyItems[i].getName().equals(item.getName())) {
                throw new ItemAlreadyExists();
            }
        }
        buyItems[itemCount++] = item;
    }

    public void removeItem(String name) throws NotFound, NullParameters { // Remove an item by name
        if (name == null) {
            throw new NullParameters();
        }

        for (int i = 0; i < itemCount; i++) {
            if (buyItems[i].getName().equals(name)) {
                buyItems[i] = buyItems[--itemCount]; // Replace with last item
                buyItems[itemCount] = null; // Clear the last item
                return;
            }
        }
        throw new NotFound();
    }

    public void getItems() { // Display all items
        if (itemCount == 0) {
            System.out.println("No items in the chart.");
            return;
        }
        for (int i = 0; i < itemCount; i++) {
            System.out.println("Item: " + buyItems[i].getName() + ", Price: " + buyItems[i].getPrice());
        }
    }

}


