import java.util.*;
public class ifelse1 {

    public void main(String[] args) {
        
    
    String vUser = "teste";
    String vPass = "teste";

    Scanner scnUser = new Scanner(System.in);
    System.out.println("Digite a sneha do usuario (login)");
    String user = scnUser.nextLine();

    Scanner scnPass = new Scanner(System.in);
    System.out.println("Digite a senha do usuário");
    String pass = scnPass.nextLine();

    if (user.equals(vUser) && pass.equals(vPass)) {
        System.out.println("Bem vindo ao sistema.");

    } else {
        System.out.println("Usário ou senha inválidos.");
    }

    scnUser.close();
    scnPass.close();
}
}