import java.util.Scanner;
public class MainPaciente {
    public static void main(String[] args) {
            Paciente paciente1 = new Paciente();
        String a,e;
        int i;
    
        Scanner op = new Scanner(System.in);
        System.out.print("Ingresa nombre: ");
        a = op.next();
        System.out.print("Ingresa el apellido: ");
        e = op.next();
        System.out.print("Ingresa NSS: ");
        i = op.nextInt();

        paciente1.nombre = a;
        paciente1.apellido = e;
        paciente1.nss = i;

        paciente1.MostrarNombre();
        paciente1.MostrarNSS();


    }
}