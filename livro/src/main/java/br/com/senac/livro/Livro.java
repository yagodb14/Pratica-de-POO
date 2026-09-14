/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.livro;

/**
 *
 * @author yago62977756
 */
public class Livro {

    public static void main(String[] args) {
     Leitor leitor1 = new Leitor("Dom Casmurro", "Machado de Assis", "Romance", 1899, 400, 69.90);
     
     leitor1.calcular();
     leitor1.imprimir();
     System.out.println("----------------");
        
     Leitor leitor2 = new Leitor("Memórias Póstumas de Brás Cubas", "Machado de Assis", "Romance", 1881, 368, 54.90);
     
     leitor2.calcular();
     leitor2.imprimir();
     System.out.println("---------------");
     
     Leitor leitor3 = new Leitor("Vidas Secas", "Graciliano Ramos", "Romance", 1938, 176, 54.90);
     
     leitor3.calcular();
     leitor3.imprimir();
     System.out.println("--------------");
        
     Leitor leitor4 = new Leitor( "Grande Sertão: Veredas", "joão Guimarães Rosa", "Romance", 1956, 560, 144.90);
     
     leitor4.calcular();
     leitor4.imprimir();
     System.out.println("--------------");
        
     Leitor leitor5 = new Leitor("O Alquimista", "Paulo Coelho", "Ficção", 1988, 170, 49.90);
     
     leitor5.calcular();
     leitor5.imprimir();
     System.out.println("-------------");
     
     Leitor leitor6 = new Leitor("A Hora da Estrela", "Clarice Lispector", "Psicologia", 1977, 88, 44.90);
     
     leitor6.calcular();
     leitor6.imprimir();
     System.out.println("------------");
     
     Leitor leitor7 = new Leitor("Capitães da Areia", "Jorge Amado", "Romance Social", 1937, 280, 59.90);
     
     leitor7.calcular();
     leitor7.calcular();
     System.out.println("------------");
     
     Leitor leitor8 = new Leitor("Quarto de Despejo", "Carolina Maria de Jesus", "Diario", 1960, 200, 52.0);
     
     leitor8.calcular();
     leitor8.imprimir();
     System.out.println("------------");
     
     Leitor leitor9 = new Leitor("O Cortiço", "Aluísio Azevedo", "Naturalista", 1890, 320, 39.90);
     
     leitor9.calcular();
     leitor9.imprimir();
     System.out.println("------------");
    
     Leitor leitor10 = new Leitor("Torto Arado", "Itamar Vieira Junior", "ficção", 2019, 264, 64.90);
     
     leitor10.calcular();
     leitor10.imprimir();
     System.out.println("------------");
     
     Leitor leitor11 = new Leitor("Iracema", "José de Alencar", "Romantico", 1865, 120, 29.90);
     
     leitor11.calcular();
     leitor11.imprimir();
     System.out.println("--------------");
     
     Leitor leitor12 = new Leitor("Macunaíma", "Mario de Andrade", "Modernista",1928, 168, 42.0);
     
     leitor12.calcular();
     leitor12.imprimir();
     System.out.println("-------------");
     
     Leitor leitor13 = new Leitor("O Auto da Compadecida", "Ariano Suassuna", "comedia", 1955, 208, 54.90);
     
     leitor13.calcular();
     leitor13.imprimir();
     System.out.println("------------");
     
     Leitor leitor14 = new Leitor("O Ateneu", "Raul Pompeia", "Impressionista", 1888, 224, 24.90);
     
     leitor14.calcular();
     leitor14.imprimir();
     System.out.println("------------");
     
     Leitor leitor15 = new Leitor("Felicidade Clandestina", "Clarice Lispector", "Contos", 1971, 160, 49.90);
     
     leitor15.calcular();
     leitor15.imprimir();
     System.out.println("------------");
     
     
   
    }
}
