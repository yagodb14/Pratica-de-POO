/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.livro;

/**
 *
 * @author yago62977756
 */
public class Leitor {
    String titulo;
    String autor;
    String genero;  
    int anoPublicado;
    int idadeLivro;;
    int numeroPag;
    double preco;    
    
     public Leitor(String tituloInformado, String autorInformado, String generoInformado, int anoPublicadoInformado, int numeroPagInformado, double precoInformado){
    titulo = tituloInformado;
    autor = autorInformado;
    genero = generoInformado;
    anoPublicado = anoPublicadoInformado;
    idadeLivro = 0;
    numeroPag = numeroPagInformado;
    preco = precoInformado;
   
   }
   public void calcular(){
       idadeLivro = 2026 - anoPublicado;
       
   }
     
   public void imprimir(){
       System.out.println("Titulo: " + titulo);
       System.out.println("Autor: " + autor);
       System.out.println("Genero: " + genero);
       System.out.println("Ano de publicação do livro: " + anoPublicado);
       System.out.println("Idade do livro: " + idadeLivro);
       System.out.println("Numero de páginas do livro: " + numeroPag);
       System.out.println("Preco: " + preco);
       
   }
 }