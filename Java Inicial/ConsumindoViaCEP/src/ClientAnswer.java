import java.util.Scanner;

public class ClientAnswer {

    private Scanner input = new Scanner(System.in);
    private String response;

    public void resposta () {

        System.out.println("Digite o cep: ");
        this.response = input.nextLine();
    }

    public String getResponse() {
        return response;
    }

}
