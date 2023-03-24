import java.util.Scanner;
import java.text.DecimalFormat;

public class programaIMC {
    public static void main(String[] args) {
        
		Scanner leer = new Scanner(System.in);
		
		int peso;
		double altura;
		String nombre;
		
		System.out.println("Ingresa tu nombre");
		nombre= leer.nextLine();
		
		System.out.println("Ingresa tu peso");
		peso= leer.nextInt();
		
		System.out.println("Ingresa tu altura");
		altura= leer.nextDouble();
        
		double IMC=(peso)/(altura*altura);
		
		DecimalFormat formato = new DecimalFormat("#.##");
                String IMCfomrateado = formato.format(IMC);
		
		System.out.println(nombre+" tu IMC es:"+IMCfomrateado);
    }
}
