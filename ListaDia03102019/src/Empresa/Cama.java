package Empresa;

public class Cama extends Madeira{
	private boolean casal;
	private String verdade="N�o";
	

	public boolean isCasal() {
		return casal;
	}

	public void setCasal(boolean casal) {
		this.casal = casal;
	}

	@Override
	public String toString() {
		if(this.casal) {
			this.verdade = "Sim";
		}
		return "Esta Cama foi feita com: "+getTipoMadeira()+" / "+getMaterial()+
				"\nUtilidade: "+getDescricao()+
				"\nPre�o: "+ getPrecoVenda()+
				"\nEsta Cama � de casal: "+this.verdade;
	}

	@Override
	public void aumentarPreco(float percentual) {
		setPrecoVenda(getPrecoVenda()+(getPrecoVenda()*(percentual/100)));
		
	}

}
