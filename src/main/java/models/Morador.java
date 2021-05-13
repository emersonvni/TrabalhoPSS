package models;

public class Morador {
    
    public static String TIPO_PERFIL_PUBLICO="PUBLICO";
    public static String TIPO_PERFIL_PRIVADO="PRIVADO";

    private int idMorador;
    private int idRepublica;
    private int idUsuario;
    private String nome;
    private String apelido;
    private String telefone;
    private String redeSociais;
    private String cpf;
    private String telefoneResponsavel01;
    private String telefoneResponsavel02;
    private boolean representante;
    private String tipoPerfil;

    public Morador(int idMorador, int idRepublica, int idUsuario, String nome, String apelido, String telefone, String redeSociais, String cpf, String telefoneResponsavel01, String telefoneResponsavel02, boolean representante, String tipoPerfil) {
        this.idMorador = idMorador;
        this.idRepublica = idRepublica;
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.apelido = apelido;
        this.telefone = telefone;
        this.redeSociais = redeSociais;
        this.cpf = cpf;
        this.telefoneResponsavel01 = telefoneResponsavel01;
        this.telefoneResponsavel02 = telefoneResponsavel02;
        this.representante = representante;
        this.tipoPerfil = tipoPerfil;
    }

    public int getIdMorador() {
        return idMorador;
    }

    public void setIdMorador(int idMorador) {
        this.idMorador = idMorador;
    }

    public int getIdRepublica() {
        return idRepublica;
    }

    public void setIdRepublica(int idRepublica) {
        this.idRepublica = idRepublica;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRedeSociais() {
        return redeSociais;
    }

    public void setRedeSociais(String redeSociais) {
        this.redeSociais = redeSociais;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefoneResponsavel01() {
        return telefoneResponsavel01;
    }

    public void setTelefoneResponsavel01(String telefoneResponsavel01) {
        this.telefoneResponsavel01 = telefoneResponsavel01;
    }

    public String getTelefoneResponsavel02() {
        return telefoneResponsavel02;
    }

    public void setTelefoneResponsavel02(String telefoneResponsavel02) {
        this.telefoneResponsavel02 = telefoneResponsavel02;
    }

    public boolean isRepresentante() {
        return representante;
    }

    public void setRepresentante(boolean representante) {
        this.representante = representante;
    }

    public String getTipoPerfil() {
        return tipoPerfil;
    }

    public void setTipoPerfil(String tipoPerfil) {
        this.tipoPerfil = tipoPerfil;
    }

    
}
