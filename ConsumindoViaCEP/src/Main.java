public class Main {
    public static void main(String[] args) {

        Files files = new Files();
        ClientAnswer clientAnswer = new ClientAnswer();

        clientAnswer.resposta();

        Busca busca = new Busca();
        Data newdata = busca.requisicao(clientAnswer.getResponse());
        System.out.println(newdata);

        Files files1 = new Files();
        files1.saveFile(newdata);




    }
}
