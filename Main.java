public class Main {
    public static void main(String[] args) {
        Items item1 = new Items("Headset PRO", 150.50);
        Items item2 = new Items("SmartPhone Banana", 3001.99);
        Items item3 = new Items("Mouse Gamer", 99.99);
        Items item4 = new Items("Teclado Mecânico", 250.00);

        Buy buy = new Buy();
        buy.addItemToChart(item1);
        buy.addItemToChart(item2);
        buy.addItemToChart(item3);
        buy.addItemToChart(item4);
        buy.displayChartItems();

        buy.searchItemInChart("SmartPhone Banana");
        buy.removeItemFromChart("Mouse Gamer");
        buy.displayChartItems();
        buy.searchItemInChart("Mouse Gamer"); // This should throw NotFound exception
        buy.removeItemFromChart("Nonexistent Item"); // This should also throw NotFound exception
        buy.displayChartItems();
        buy.addItemToChart(null); // This should throw NullParameters exception
        buy.searchItemInChart(null); // This should throw NullParameters exception
        buy.removeItemFromChart(null); // This should throw NullParameters exception
        buy.displayChartItems();
        // Testing NotEnoughSpace exception
       
        Items item5 = new Items("Item Extra", 100.00);
    }

}
