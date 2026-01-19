public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Sejam Bem-Vindos(as) a Lanchonete !");

        Item item1 = new Item("Hambúrguer", 15.0, 1);
        Item item2 = new Item("Batata Frita", 7.5, 2);
        Item item3 = new Item("Refrigerante", 5.0, 3);
        Item item4 = new Item("Milkshake", 10.0, 4);

        Carrinho c = new Carrinho();

        c.adicionarItem(item1);
        c.adicionarItem(item2);
        c.adicionarItem(item3);
        c.adicionarItem(item4);

        c.calcularPreco();
    }
}
