import java.util.Scanner;

public class conjunto_de_numeros {
	public static Scanner texto;
	public static void main(String[] args) {
	System.out.println("Diga usted cuantos elementos tiene el conjunto ");
	texto=new Scanner(System.in);
    int total = texto.nextInt();
    int [] conjunto = new int[total];
    int [] mayor = new int[4];
    System.out.println("Ahora diga cuál es valor de cada uno");
    for (int i = 0; i < total; i++) {
        conjunto [i]= texto.nextInt();
    }
    int indice = 0;
    int inicial = conjunto[0]*conjunto[1]*conjunto[2]*conjunto[3];
    for (int j = 1; j < total -3; j++) {
        int secundario = conjunto[j]*conjunto[j+1]*conjunto[j+2]*conjunto[j+3];
        if(inicial >= secundario){
                           
        }
        else{
            inicial = secundario;
            indice = j;
        }
    }
    mayor[0] = conjunto[indice];
    mayor[1] = conjunto[indice+1];
    mayor[2] = conjunto[indice+2];
    mayor[3] = conjunto[indice+3];
    System.out.println("Los números consecutivos con mayor producto son: \n");
    for (int k = 0; k < 4; k++) {
        System.out.println(mayor[k]);
}
	}
}


