public class Buy {
    private Chart chart;

    public Buy() {
        chart = new Chart();
    }

    public void addItemToChart(Items item) {
        try {
            chart.addItem(item);
        } catch (NotEnoughSpace | ItemAlreadyExists | NullParameters e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeItemFromChart(String name) {
        try {
            chart.removeItem(name);
        } catch (NotFound | NullParameters e) {
            System.out.println(e.getMessage());
        }
    }

    public void searchItemInChart(String name) {
        try {
            String result = chart.searchItem(name);
            System.out.println(result);
        } catch (NotFound | NullParameters e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayChartItems() {
        chart.getItems();
    }

}
