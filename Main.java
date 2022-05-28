import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Main {


    public static void main(String[] args) { 

        ArrayList<ArrayList<String>> labirinto = new  ArrayList<ArrayList<String>>();
        Fila f = new Fila();        

        Random random = new Random();

        int cols = 8;
        int rows = 20;

        String barreira = "#";
        String espaco = " ";

        int numero1 = random.nextInt(80);     
        int numero2 = random.nextInt(80); 
        int numero3 = random.nextInt(80); 
        int numero4 = random.nextInt(80); 
        int numero5 = random.nextInt(80); 
        int numero6 = random.nextInt(80); 
        int numero7 = random.nextInt(80); 
        int numero8 = random.nextInt(80); 
        int numero9 = random.nextInt(80); 
        int numero10 = random.nextInt(80); 

        // aqui fiz vários if's para gerar a matriz aleatório 

        String caminho1;
        String caminho2;
        String caminho3;
        String caminho4;
        String caminho5;
        String caminho6;
        String caminho7;
        String caminho8;
        String caminho9;
        String caminho10;

        if(numero1 < 50) {
            caminho1 = espaco;
        }
        else {
            caminho1 = barreira;
        } 
        

        if(numero2 < 50) {
            caminho2 = espaco;
        }
        else {
            caminho2 = barreira;
        } 


        if(numero3 < 50) {
            caminho3 = espaco;
        }
        else {
            caminho3 = barreira;
        } 


        if(numero4 < 50) {
            caminho4 = espaco;
        }
        else {
            caminho4 = barreira;
        } 


        if(numero5 < 50) {
            caminho5 = espaco;
        }
        else {
            caminho5 = barreira;
        } 


        if(numero6 < 50) {
            caminho6 = espaco;
        }
        else {
            caminho6 = barreira;
        } 


        if(numero7 < 50) {
            caminho7 = espaco;
        }
        else {
            caminho7 = barreira;
        }


        if(numero8 < 50) {
            caminho8 = espaco;
        }
        else {
            caminho8 = barreira;
        } 


        if(numero9 < 50) {
            caminho9 = espaco;
        }
        else {
            caminho9 = barreira;
        } 


        if(numero10 < 50) {
            caminho10 = espaco;
        }
        else {
            caminho10 = barreira;
        } 

   
        labirinto.add(new ArrayList<String>(
            Arrays.asList("#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#")
        ));



        labirinto.add(new ArrayList<String>(
            Arrays.asList("#", " ", " ", caminho3, caminho4, caminho5, caminho6, caminho7, caminho8, caminho9, caminho10, caminho1, caminho2, caminho3, caminho4, caminho5, caminho6, caminho7, caminho8, "#")
        )); 


                labirinto.add(new ArrayList<String>(
            Arrays.asList("#", " ", " ", caminho6, caminho7, caminho8, caminho5, caminho6, caminho7, caminho8, caminho9, caminho6, caminho7, caminho8, caminho5, caminho6, caminho7, caminho8, "#", "#")
        )); 


                 labirinto.add(new ArrayList<String>(
            Arrays.asList("#", caminho1, " ", " ", " ", " ", " ", caminho7, caminho8, caminho9, caminho10, caminho1, caminho2, caminho3, "#", "#", "#", "#", " ", "#", "#", "#")
        )); 


                 labirinto.add(new ArrayList<String>(
            Arrays.asList("#", caminho2, caminho3, caminho2, caminho3, caminho4, " ", " ", " ", caminho8, caminho9, caminho2, caminho2, " ", " ", " ", " ", " ", caminho8, "#")
        )); 


                labirinto.add(new ArrayList<String>(
            Arrays.asList("#", caminho1, caminho2, caminho3, caminho4, caminho9, caminho8, caminho7, " ", " ", " ", " ", " ", " ", caminho9, caminho8, caminho7, " ", " ", "#")
        ));


                 labirinto.add(new ArrayList<String>(
            Arrays.asList("#", caminho8, caminho7, caminho6, caminho5, caminho4, caminho3, caminho2, caminho1, caminho9, caminho8, caminho7, caminho6, caminho5, caminho4, caminho3, caminho2, " ", " ", "#")
        ));   


               labirinto.add(new ArrayList<String>(
            Arrays.asList("#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#")
        ));







        int x = 6;
        int y = 18;
        int elementoInserido = 0;

        while(true)
        {




            Fila fila = new Fila();

            if (labirinto.get(x).get(y) != "#") {

                System.out.print("\033[H\033[2J");  
            
                System.out.flush();

                System.out.println("Comandos enfileirados " + elementoInserido);
                System.out.println("Comandos comandos disponíveis " + (40 - elementoInserido));



                move(x, y, rows, cols, labirinto);

            } else {

                
                f.mostrar();
                System.out.println("Pressione R para exibir a matriz ");
                Scanner entradaExibirMatriz = new Scanner(System.in);
                char cmd = entradaExibirMatriz.next().charAt(0);
                if (cmd == 'r' || cmd == 'R') {
                    move(x, y, rows, cols, labirinto);
                    entradaExibirMatriz.close();
                }


                if (fila.isEmpty() ) { 

                    fila.inserir_elemento(elementoInserido); 



    
                }

                break;


            }

        
            System.out.println("Esquerda : A");
            System.out.println("Direita  : D");
            System.out.println("Cima     : W");
            System.out.println("Baixo    : S");
            System.out.println("Reniciar : R");

            System.out.println("S = Ponto de Início");
            System.out.println("E = Ponto final");

            System.out.println("Digite o Comando desejado: ");   
 
            Scanner entrada = new Scanner(System.in);
            char cmd = entrada.next().charAt(0);
            System.out.println();
            elementoInserido = elementoInserido + 1;


            if (elementoInserido <= 0) {
                System.out.println("GAME OVER");
                break;
            }

            for (int i = 0; i < cols; i++){
                for (int j = 0; j < rows; j++){
                  //  labirinto.get(i).set(j, " ");

                    if(i == x && j == y){
                        
                        if (i == 1 && j == 1) {
                            System.out.println("GAME OVER");
                            entrada.close();
                            break;
                        }}}}

                      System.out.print("\033[H\033[2J");  
            
                       System.out.flush();
// filaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa


            if (fila.isEmpty() ) { 

                fila.inserir_elemento(elementoInserido); 

                System.out.print("\033[H\033[2J");  
            
                System.out.flush();

                System.out.println("Comandos enfileirados " + elementoInserido);
                System.out.println("Comandos comandos disponíveis " + (40 - elementoInserido));


            }
            else { 
            f.mostrar();
            System.out.println("Pressione R para exibir a matriz ");
            Scanner entradaExibirMatriz = new Scanner(System.in);
            char comando = entradaExibirMatriz.next().charAt(0);
            if (comando == 'r' || comando == 'R') {
                move(x, y, rows, cols, labirinto);
                entradaExibirMatriz.close();
            }

            int contagemFila = 20;

            int contagemFilaLaco = 20;

            while (! fila.isEmpty() && contagemFilaLaco == 20) { 

                        contagemFila = contagemFila - 1;

                        contagemFila = fila.retirar(); 


                        contagemFilaLaco = contagemFilaLaco - 1;

                    }
            }            

            
                if(cmd == 's' || cmd == 'S'){
                    x++;
                    f.adicionar(10);

                } else if(cmd == 'd' || cmd == 'D'){
                    y++;
                    f.adicionar(10);
                }
                else if(cmd == 'a' || cmd == 'A'){
                    y--;
                    f.adicionar(40);


                }
                else if(cmd == 'w' || cmd == 'W'){
                    x--;
                    f.adicionar(30);


                }

                else if(cmd == 'r' || cmd == 'R'){

                    if (fila.isEmpty() ) { 

                        fila.inserir_elemento(elementoInserido); 

                        System.out.print("\033[H\033[2J");  
            
                        System.out.flush();
        
                        System.out.println("Comandos enfileirados " + elementoInserido);
                        System.out.println("Comandos comandos disponíveis " + (40 - elementoInserido));
        
        
                    }
                    else { 
                    f.mostrar();
                    System.out.println("Pressione R para exibir a matriz ");
                    Scanner entradaExibirMatriz = new Scanner(System.in);
                    char comando = entradaExibirMatriz.next().charAt(0);
                    if (comando == 'r' || comando == 'R') {
                        move(x, y, rows, cols, labirinto);
                        entradaExibirMatriz.close();
                    }
                    

        
                    int contagemFila = 20;
        
                    int contagemFilaLaco = 20;
        
                    while (! fila.isEmpty() && contagemFilaLaco == 20) { 
        
                                contagemFila = contagemFila - 1;
        
                                contagemFila = fila.retirar(); 
                
                                contagemFilaLaco = contagemFilaLaco - 1;
        
                            }}
break;
                }

                else {
                    System.out.println("Comando Inválido - menos uma tentativa.");
                }
                


            if(cmd == 'c' || cmd == 'C'){
                break;
            }
            
}}
        
        


        public static void move(int x, int y, int rows, int cols, ArrayList<ArrayList<String>> labirinto){

            

            for (int i = 0; i < cols; i++){
                for (int j = 0; j < rows; j++){
                  //  labirinto.get(i).set(j, " ");


                    if(i == x && j == y){

                        labirinto.get(i).set(j, "S");
                        if (i == 1 && j == 1) {
                            System.out.println("GAME OVER");
                            break;
                        }

                    //    labirinto.get(i).set(j++, " ");

                    }

                    else if(i == 1 && j == 1) {
                        labirinto.get(i).set(j, "E");
                    };

                    System.out.print(labirinto.get(i).get(j));
                }

                System.out.println();
                
            }

            
        }}