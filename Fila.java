public class Fila {


    private int   pontoFinal; 
    private int   total; 
    private int[] elementoInserir; 
    private int   pontoInicial;

    public Fila() {

        elementoInserir  = new int[20];

        pontoInicial = 0;
        pontoFinal   = 0;

        total    = 0;


        inicio = fim = -1;
        tamanho = 100;
        f = new int[tamanho];
        qtdeElementos = 0;
    }


    public void inserir_elemento(int elemento)  { 

        if (isFull()) { 
            throw new RuntimeException(" Fila cheia");
        }


        elementoInserir[pontoFinal] = elemento;
        pontoFinal = (pontoFinal + 1) % elementoInserir.length;


        total++;
    }

    public int retirar()  {

        if (isEmpty()) { throw new RuntimeException("Fila Vazia"); }

        int elemento = elementoInserir[pontoInicial];

        pontoInicial = (pontoInicial + 1)% elementoInserir.length; 

        total--;

        
        return elemento; 

    }

    public boolean isEmpty() { 
        return total==0;
    }

    public boolean isFull() {
        return total==elementoInserir.length;
    }

    int inicio;
    int fim;
    int tamanho;
    int qtdeElementos;
    int f[];

    public boolean estaVazia(){
        if (qtdeElementos == 0){
            return true;
        }
        return false;
    }

    public boolean estaCheia(){
        if (qtdeElementos == tamanho - 1){
            return true;
        }
        return false;
    }

    public void adicionar(int e){
        if (! estaCheia()){
            if (inicio == -1){
                inicio = 0;
            }
            fim++;
            f[fim] = e;
            qtdeElementos++;
        }
    }

    public void remover(){
        if (! estaVazia() ){
            inicio++;
            qtdeElementos--;
        }
    }


    public void mostrar(){
        System.out.println("Sequencia de comandos desempilhados");
        System.out.println();

            for (int i = inicio; i<=fim; i++) {
                if (f[i] == 10)
                {
                    System.out.println("Direita ");
                }
                else if (f[i] == 10)
                {
                    System.out.println("Baixo ");
                }
                else if (f[i] == 30)
                {
                    System.out.println("Cima");
                }
                else if (f[i] == 40)
                {
                    System.out.println("Esquerda");
                }
            }
    }

}
