package models;

import java.util.Date;

public class Republica {

    private String nome;
    private Date dataFundacao;
    private Date dataExtincao;
    private String endereco;
    private String CEP;
    private String bairro;
    private String referencia;
    private String localizacaoGeografica;
    private double despesaMorador;
    private int totalVagas;
    private int vagasOcupadas;
    private int vagasDisponiveis;
    private String vantagens;
    private String logradouro;

    public Republica(String nome, Date dataFundacao, Date dataExtincao, String endereco, String CEP, String bairro, String referencia, String localizacaoGeografica, double despesaMorador, int totalVagas, int vagasOcupadas, int vagasDisponiveis, String vantagens, String logradouro) {
        this.nome = nome;
        this.dataFundacao = dataFundacao;
        this.dataExtincao = dataExtincao;
        this.endereco = endereco;
        this.CEP = CEP;
        this.bairro = bairro;
        this.referencia = referencia;
        this.localizacaoGeografica = localizacaoGeografica;
        this.despesaMorador = despesaMorador;
        this.totalVagas = totalVagas;
        this.vagasOcupadas = vagasOcupadas;
        this.vagasDisponiveis = vagasDisponiveis;
        this.vantagens = vantagens;
        this.logradouro = logradouro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Date dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Date getDataExtincao() {
        return dataExtincao;
    }

    public void setDataExtincao(Date dataExtincao) {
        this.dataExtincao = dataExtincao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getLocalizacaoGeografica() {
        return localizacaoGeografica;
    }

    public void setLocalizacaoGeografica(String localizacaoGeografica) {
        this.localizacaoGeografica = localizacaoGeografica;
    }

    public double getDespesaMorador() {
        return despesaMorador;
    }

    public void setDespesaMorador(double despesaMorador) {
        this.despesaMorador = despesaMorador;
    }

    public int getTotalVagas() {
        return totalVagas;
    }

    public void setTotalVagas(int totalVagas) {
        this.totalVagas = totalVagas;
    }

    public int getVagasOcupadas() {
        return vagasOcupadas;
    }

    public void setVagasOcupadas(int vagasOcupadas) {
        this.vagasOcupadas = vagasOcupadas;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void setVagasDisponiveis(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public String getVantagens() {
        return vantagens;
    }

    public void setVantagens(String vantagens) {
        this.vantagens = vantagens;
    }

}
