package zoo;

public class MainJonJ {

	public static void main(String[] args) {
		
		Animal[] animales = new Animal[5];
				
		animales[0]= new Leon();
		
		animales[1] = new Lombriz();
		
		animales[2] = new Gekko();
		
		animales[3] = new Puercoespin();
				
		for(int i = 0 ; i < animales.length; i++){
			animales[i].mostrar();
		}

	}

}
