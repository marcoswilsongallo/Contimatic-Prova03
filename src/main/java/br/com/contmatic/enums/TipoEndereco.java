package br.com.contmatic.enums;

public enum TipoEndereco {
	 RESIDENCIAL("Residencial", 11), 
	COMERCIAL("Comercial", 9);

	private String descricao;
	private int tamanho;

	private TipoEndereco(String descricao, int tamanho) {
		this.descricao = descricao;
		this.tamanho = tamanho;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getTamanho() {
		return tamanho;
	}

}
