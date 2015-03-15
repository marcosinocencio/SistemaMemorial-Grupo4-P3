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
public class Controlador {
    private Usuario currentUser;
    
    public void gerarHistórico(ArrayList arquivos, String nomeHistorico, String localArquivo){}
    public void alterarMemorial(String texto){}
    public boolean acessarSistema(String login, String senha){
    }
    public boolean cancelarUsuario(int confirmacao){
    }
    public boolean registrarUsuario(String nome, String usuario, String senha, String dataNasc, int sexo, int cpf, int rg, String email, String uf, String enderecoPessoal, String enderecoProfissional){
    }
    public void enviaEmail(Usuario usuario){}
    public boolean anexarDocumento(File doc){
    }
    public boolean removerDocumento(File documento){
    }
    public void registraSecao(Usuario usuario){}
    public boolean recuperarSenha(String login, String email){
    }
    public void alterarDados(String nome, String usuario, String senha, String dataNasc, int sexo, int cpf, int rg, String email, String uf, String ruaPes, String bairroPes, int numPes, String cidadePes, String ruaProf, String bairroProf, int numProf, String cidaedProf){}
    public void registrarMemorial(String textoUnico){}
    public void buscaArquivo(String nomeDocumento){}
    public void buscaArquivos(){}
}
