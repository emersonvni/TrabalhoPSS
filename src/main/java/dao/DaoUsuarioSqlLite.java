package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Usuario;

public class DaoUsuarioSqlLite implements DaoUsuario {

    private static DaoUsuarioSqlLite instance;
    private Connection conn;
    private Statement stm;

    private DaoUsuarioSqlLite() {

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

    public static DaoUsuarioSqlLite getInstance() {
        if (instance == null) {
            instance = new DaoUsuarioSqlLite();
        }
        return instance;
    }

    @Override
    public boolean cadastrarUsuario(Usuario usuario) {

        try {

            this.stm = this.conn.createStatement();
            this.stm.executeUpdate("INSERT INTO USUARIO (NOMEUSUARIO, SENHA) VALUES ("
                    + "'" + usuario.getNomeUsuario() + "'" + ", "
                    + "'" + usuario.getSenha() + "'" + ")");

            System.out.println("Usuario " + usuario.getNomeUsuario() + " cadastrado na base de dados");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return true;
    }

    @Override
    public List<Usuario> getUsuarios() {
        ArrayList<Usuario> array = new ArrayList<Usuario>();
        ResultSet rs;

        try {
            rs = this.stm.executeQuery("SELECT * FROM USUARIO");

            while (rs.next()) {
                array.add(new Usuario(rs.getString("USUARIO"), rs.getString("SENHA")));
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return array;
    }

    @Override
    public boolean existeUsuario(Usuario usuario) {
        String nomeUsuario = usuario.getNomeUsuario();

        ResultSet rs;
        int qtdUsuarios = 0;
        try {
            rs = this.stm.executeQuery("SELECT COUNT(*) AS EXISTE FROM USUARIO WHERE NOMEUSUARIO='" + nomeUsuario + "'");

            while (rs.next()) {
                qtdUsuarios = rs.getInt("EXISTE");
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return qtdUsuarios > 0;
    }

    @Override
    public Usuario getUsuarioByNome(String nomeUsuario) {

        ResultSet rs;
        Usuario usuario = null;
        try {
            rs = this.stm.executeQuery("SELECT * FROM USUARIO WHERE NOMEUSUARIO='" + nomeUsuario + "'");

            while (rs.next()) {
                int idUsuario = rs.getInt("IDUSUARIO");
                String nameUsuario = rs.getString("IDUSUARIO");
                String senha = rs.getString("SENHA");
                
                usuario = new Usuario(idUsuario, nomeUsuario, senha);
                break;
            }
            
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }

    @Override
    public boolean isSenhaOk(Usuario usuario) {
        String nomeUsuario = usuario.getNomeUsuario();
        String senha = usuario.getSenha();

        ResultSet rs;
        int qtdUsuarios = 0;
        try {
            rs = this.stm.executeQuery("SELECT COUNT(*) AS SENHAOK FROM USUARIO WHERE NOMEUSUARIO='" + nomeUsuario
                    + "' AND senha='" + senha + "'");

            while (rs.next()) {
                qtdUsuarios = rs.getInt("SENHAOK");
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return qtdUsuarios > 0;
    }

}
