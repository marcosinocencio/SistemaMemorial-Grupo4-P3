/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemamemorial;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class ControladorUsuario {
    public void alterarMemorialUsuario(String texto, Usuario currentUser){}
    public Usuario getUsuario(String login, String senha){
    }
    public boolean confirmarCancelamento(boolean confirmacao){
    }
    public boolean acessarSistema(String user, String senha){
    }
    public void recuperarSenha(String login, String email){}
    public void novoUsuario(String nome, String usuario, String senha, String dataNasc, int sexo, int cpf, int rg, String email, String uf, String enderecoPessoal, String enderecoProfissional){}
    public Usuario cancelar(int confirmacao){
    }
    public void alterarDadosUsuario(String nome, String usuario, String senha, String dataNasc, int sexo, int cpf, int rg, String email, String uf, String enderecoPessoal, String enderecoProfissional, Usuario currentUser){}
    public void registrarMemorial(String textoUnico){}
    public void enviaDocumento(File doc){}
    public void buscaArquivo(String nomeArquivo){}
    public void getArquivos(){}
    public void gerarHistórico(ArrayList arquivos, String nomeHistorico, String localArquivo){}
}
