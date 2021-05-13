package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import models.Morador;
import models.Usuario;

public class DaoMoradorSqlLite implements DaoMorador {

    private static DaoMoradorSqlLite instance;
    private Connection conn;
    private Statement stm;

    private DaoMoradorSqlLite() {
        try {
            Class.forName("org.sqlite.JDBC");

            this.conn = DriverManager.getConnection("jdbc:sqlite:banco_de_dados/republica_sqlite.db");
            this.stm = this.conn.createStatement();

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } catch (ClassNotFoundException classEx) {
            classEx.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static DaoMoradorSqlLite getInstance() {
        if (instance == null) {
            instance = new DaoMoradorSqlLite();
        }
        return instance;
    }

    @Override
    public boolean cadastrarMorador(Morador morador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean apagarMorador(Morador morador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Morador getMoradorFromUsuario(Usuario usuario) {
        int identificadorUsuario = usuario.getIdUsuario();

        ResultSet rs;
        Morador morador = null;
        try {
            rs = this.stm.executeQuery("SELECT * FROM MORADOR WHERE IDUSUARIO=" + identificadorUsuario);

            while (rs.next()) {
                
                int idMorador = rs.getInt("IDMORADOR");
                int idRepublica = rs.getInt("IDREPUBLICA");
                int idUsuario = rs.getInt("IDUSUARIO");
                String nome = rs.getString("NOME");
                String apelido = rs.getString("APELIDO");
                String telefone = rs.getString("TELEFONE");
                String redeSociais = rs.getString("REDESSOCIAIS");
                String cpf = rs.getString("CPF");
                String telefoneResponsavel01 = rs.getString("TELEFONERESPONSAVEL01");
                String telefoneResponsavel02 = rs.getString("TELEFONERESPONSAVEL02");
                String tipoPerfil = rs.getString("TIPOPERFIL");
                String representante = rs.getString("representante");
                
                boolean representantes = false;
                if(representante.equalsIgnoreCase("TRUE")){
                    representantes = true;
                }

                morador = new Morador(idMorador,
                        idRepublica,
                        idUsuario,
                        nome,
                        apelido,
                        telefone,
                        redeSociais,
                        cpf,
                        telefoneResponsavel01,
                        telefoneResponsavel02,
                        representantes,
                        tipoPerfil);
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return morador;

    }

    @Override
    public List<Morador> getAllMoradores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
