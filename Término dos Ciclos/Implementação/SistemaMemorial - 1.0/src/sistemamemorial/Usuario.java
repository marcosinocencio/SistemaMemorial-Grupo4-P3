/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemamemorial;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author alex
 */
public class Usuario {
    private String nome;
    private String senha;
    private String login;
    private Date dataNascimento;
    private char sexo;
    private String CPF;
    private String RG;
    private String email;
    private String uf;
    private String ruaPessoal;
    private String bairroPessoal;
    private String numPessoal;
    private String cidadePessoal;
    private String ruaProfissional;
    private String bairroProfissional;
    private String numProfissional;
    private String cidadeProfissional;
    
    public void cria(String nome, String usuario, String senha, Date dataNasc, int sexo, int cpf, int rg, String email, int uf , String enderecoPessoal, String enderecoProfissional ){}
    public void alterarDados(String nome, String senha, Date datadeNascimento, int sexo, int cpf, int rg, int uf, String ruaPes, String bairroPes, int numPes, String cidadePes, String ruaProf, String bairroProf, int numProf, String cidaedProf){}
    public void registrarMemorial(String textoUnico){}
    public void enviaDocumento(File doc){}
    public void buscaArquivo(String nomeArquivo){}
    public void alterarMemorial(String textoUnico){}
    public void getArquivos(){}
    public void gerarHistórico(ArrayList arquivos, String nomeHistorico, String localArquivo){}

}
