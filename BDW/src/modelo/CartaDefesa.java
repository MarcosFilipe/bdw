package modelo;

public class CartaDefesa extends Carta {
	
	private int defesa;

	public CartaDefesa(int antimateria,  String nome, int id, String img, int defesa) {
		super(antimateria, nome, id, img);
		this.defesa = defesa;
	}
	
	public int getDefesa() {
		return this.defesa;
	}

}
