public class Jogador implements InterfaceJogada {

	protected int antimateria;
	protected boolean vencedor;
	protected boolean daVez;
	protected String nome;
	protected int id;
	/*
	 * deck contem o id das 4 cartas possiveis para jogada
	 * facilita na habilitacao e desabilitacao das cartas de ataque
	 */
	protected int[] deck;
	protected TimerTurno timer;
	
	public Jogador(String nome){
		this.nome = nome;
		this.antimateria = 10;
		this.vencedor = false;
		this.daVez = false;
	}
	
	/**
	 * 
	 * @param tempoAtualTurno
	 */
	public boolean verificaTempoSeExcedeu(int tempoAtualTurno) {
		// TODO - implement Jogador.verificaTempoSeExcedeu
		throw new UnsupportedOperationException();
	}

	public void setDaVez(boolean daVez) {
		this.daVez = daVez;
	}
	

	public boolean informarDaVez() {
		// TODO - implement Jogador.informarDaVez
		throw new UnsupportedOperationException();
	}

	public void operation() {
		// TODO - implement Jogador.operation
		throw new UnsupportedOperationException();
	}

	@Override
	public void enviaJogada(Jogada jogada) {
		// TODO Auto-generated method stub
		
	}

	public void iniciar(String idJogador) {
		// TODO Auto-generated method stub
		
	}
	
	public int getAntimateria() {
		return this.antimateria;
	}
	
	public void adicionarAntimateria(int antimateriaAdicao){
		this.antimateria += antimateriaAdicao;
		if(antimateria > 10){
			this.antimateria = 10;
		}
	}
			
	public void decrementarAntimateria(int antimateriaDecremento){
		this.antimateria -= antimateriaDecremento;
	}
	
	public void setAntimateria(int antimateria) {
				this.antimateria = antimateria;
			}
		
			public void setVencedor(boolean vencedor) {
				this.vencedor = vencedor;
			}
			
			public boolean getVencedor() {
				return vencedor;
			}
		
			public String getNome() {
				return nome;
			}
		
			public int getId() {
				return id;
			}
			
			public boolean getDaVez(){
				return this.daVez;
		 	}
		 	

}