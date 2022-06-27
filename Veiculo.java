class Veiculo {
    private String cor;
    private int quantRodas;
    private double velocidade;

    public Veiculo(String cor, int quantRodas) {
        this.cor = cor;
        this.quantRodas = quantRodas;
        this.velocidade = 0.0;
    }

    public void acelerar(double incremento) {
        this.velocidade += incremento;
    }

    public void frear(double decremento) {
        this.velocidade -= decremento;
    }

    // Getters e Setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantRodas() {
        return quantRodas;
    }

    public void setQuantRodas(int quantRodas) {
        this.quantRodas = quantRodas;
    }

    public double getVelocidade() {
        return velocidade;
    }

}