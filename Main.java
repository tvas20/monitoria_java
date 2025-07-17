public class Main {
    public static void main(String[] args) {
        Items item1 = new Items("Headset da Avon", 150.50);
        Items item2 = new Items("SmartPhone Banana", 3001.99);
        Items item3 = new Items("Mouse Worker", 99.99);
        Items item4 = new Items("Teclado Eletrico", 250.00);
        Items item5 = new Items("Monitor 3K", 1200.00); // This item won't be added due to space limit
        Items item6 = new Items("Mouse super gamer", 500.00); // This item won't be added due to space limit
        Items item7 = new Items("Cadeira do Mario", 999.99); // This item won't be added due to space limit
        Items item8 = new Items("Mesa do Chefao", 1500.00); // This item won't be added due to space limit
        Items item9 = new Items("Bolsa da Prada", 200.00); // This item will be added
        Items item10 = new Items("Garrafa Tapuer", 200.00); // This item
        Items item11 = new Items("Celular da Pera" , 3000.00); // This item won't be added due to space limit
        
        Buy buy = new Buy();
        buy.addItemToChart(item1);
        buy.addItemToChart(item2);
        buy.addItemToChart(item3);
        buy.addItemToChart(item4);
        buy.addItemToChart(item5); 
        buy.addItemToChart(item6);
        buy.addItemToChart(item7);
        buy.addItemToChart(item8);
        buy.addItemToChart(item9);
        buy.addItemToChart(item10);
        buy.displayChartItems();
        
        buy.addItemToChart(item11); // This will throw NotEnoughSpace exception
        
        buy.removeItemFromChart("Mouse Worker"); // This will remove the item successfully

        buy.addItemToChart(item1); // This should throw ItemAlreadyExists exception
        
        buy.removeItemFromChart("Headsett da Avon"); // This should throw NotFound exception
        
        buy.searchItemInChart(null); // This should throw NullParameters exception
        
        buy.displayChartItems();
    }

}
