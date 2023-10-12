public enum Sinal {
    VERMELHO("PARE", "VERMELHO", 15),
    AMARELO("ATENCAO", "AMARELO", 5),
    VERDE("SIGA", "VERDE", 25);
	
	private String acao;
    private String tipo;
    private Integer time;
	
	// enum constructor - cannot be public or protected
    private Sinal(String acao, String tipo, Integer time) {
        this.acao = acao;
        this.tipo = tipo;
        this.time = time;
    }
	
	public String getAcao() {
		return this.acao;
	}

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getTipo() {
        return this.tipo;
    }

    public Integer getTime() {
        return this.time;
    }
}
