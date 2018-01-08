package zoo;

public class Puercoespin extends Animal {

	//hereda las funciones de la clase animal con el super
	
	public Puercoespin() {
		super("Puercoespin",4);
	}
	
	public void mostrar(){
		System.out.println("El " +super.getEspecie() + " tiene " + super.getPatas() + " patas");
	}

}
