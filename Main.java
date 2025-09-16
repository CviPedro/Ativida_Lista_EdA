public class Main {
    public static void main(String[] args) {
        TodoList lista = new TodoList();
        lista.inserirNoInicio("matematica");
        lista.inserirNoInicio("5*9");
        lista.inserirNoFim("4+5");
        lista.imprimirLista();

        lista.inserir("5-8", 1);
        lista.imprimirLista();

        lista.alteraElemento("4+9", 2);
        lista.imprimirLista();

        lista.remove(0);
        lista.imprimirLista();

    }
}
