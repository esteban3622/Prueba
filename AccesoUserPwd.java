import java.util.Scanner;

public class AccesoUserPwd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "";
        String password = "";
        System.out.println(username == password);
        
        System.out.print("Ingrese usuario: ");
        
        username = sc.nextLine();
        
        System.out.print("Ingrese contraseña: ");
        
        password = sc.nextLine();
        sc.close();
        System.out.println(username == password);
        // System.out.println(username);
        // System.out.println(password);

        // if((username.equals("admin")) && (password.equals("1234"))){
        // System.out.println("Acceso permitido");
        // } else {
        // System.out.println("Acceso denegado");
        // }

    }
}
