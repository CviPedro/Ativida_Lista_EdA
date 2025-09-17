public class Main {
    public static void main(String[] args) {
        Trello aFazer = new Trello();
        Trello concluido = new Trello();
        Trello emAndamento = new Trello();

        aFazer.inserirNoInicio("matematica");
        aFazer.inserirNoInicio("5*9");
        aFazer.inserirNoFim("4+5");
        aFazer.imprimirLista();

        aFazer.inserir("5-8", 1);
        aFazer.imprimirLista();

        aFazer.alteraElemento("4+9", 2);
        aFazer.imprimirLista();

        aFazer.remove(0);
        aFazer.imprimirLista();

        aFazer.moverTarefa(emAndamento, 0);
        System.out.println("\n* À fazer após * a movimentação:");
        aFazer.imprimirLista();
        System.out.println("\n* Em andamento * :");
        emAndamento.imprimirLista();

        emAndamento.moverTarefa(concluido, 0);
        System.out.println("\n* Em andamento * após movimentação: ");
        emAndamento.imprimirLista();
        System.out.println("\n* Concluido * : ");
        concluido.imprimirLista();
    }
}
