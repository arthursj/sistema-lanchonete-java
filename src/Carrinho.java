import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Item> itens;

    public Carrinho() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(int codigo) {
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getCodigo() == codigo) {
                System.out.println(itens.get(i).getNome() + " foi removido do carrinho !");
                itens.remove(i);
            }
        }
    }
}
