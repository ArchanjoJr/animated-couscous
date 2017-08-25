package aula;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		String menu;
		Ponto[] lista = new Ponto[10];
		do{
			menu = JOptionPane.showInputDialog(
					"1 - Criar array\n"+
							"2 - Imprimir na ordem normal\n"+
							"3 - Imprimir na ordem invertida\n"+
							"4 - Imprimir os elementos em posições pares\n"+
							"5 - Imprimir os elementos pares\n"+
							"6 - Imprimir o somatório\n"+
							"7 - Imprimir os elementos com Distancia maior que 4\n"+
							"8 - Imprimir a somatoria das origens"
			);
			if( menu != null ){
				switch( menu ){
					case "1" :{
						for(int i=0;i<lista.length;i++){
							lista[i] = new Ponto();
						}
						break;
					}
					case "2" : {
						for(int i=0;i<lista.length;i++){
							lista[i].imprimir();
						}
						break;
					}

					case "3" :{
						for(int i = 9;i>0;i--){
							lista[i].imprimir();
						}
						break;
					}
					case "4" :{
						for(int i =0;i<lista.length;i++){
							if(i%2 == 0){
								lista[i].imprimir();
							}
						}
						break;
					}
					case "5" :{
						for (int i=0;i<lista.length;i++){
							if(lista[i].x%2 == 0){
								System.out.println("\nPosicao: "+i+" X: "+lista[i].x);
							}else{
								if(lista[i].y%2==0)System.out.println("\nPosicao: "+i+" Y: "+lista[i].y);
							}
						}
						break;
					}
					case "6" :{
						int soma=0;
						for(int i =0;i<lista.length;i++){
							soma += lista[i].x+lista[i].y;
						}
						System.out.println(soma);
						break;
					}
					case "7":{
						for(int i =0;i<lista.length;i++){
							if(lista[i].distancia()>=4){
								lista[i].imprimir();
							}
						}
						break;
					}
					case "8":{
						double soma = 0.0;
						for(int i =0;i<lista.length;i++){
							soma += lista[i].distancia();
						}
						System.out.println(soma);
						break;
					}

				}
			}
		}while(menu != null);
	}
}