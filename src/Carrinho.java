import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Item> itens;

    public Carrinho() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }
}
