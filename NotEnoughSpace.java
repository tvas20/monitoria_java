public class NotEnoughSpace extends Exception {
    
    public NotEnoughSpace() {
        super("Não há espaço suficiente para adicionar o item");
    }
}
