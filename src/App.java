public class App {
    public static void main(String[] args) throws Exception {
    // %s - substitui no texto um valor string 
    System.out.printf("Vai imprimir %s","Um texto");

    // %d substutui o coriga %d por um numero inteiro no texto
    System.out.printf("minha idade e: %d", 33 );

    // %f substutui o coriga %f por um numero flutuante
    System.out.printf("/n valor de PI e: %f", 3.1415f);

    // %.2f substutui o coriga %.2f por numero flutuante
    // com duas casas decimais 
    System.out.printf("/n valor de PI e: %.2f", 3.1415f);

    // %b substutui o coriga %b por um valor booleano
    System.out.printf("/n esse valor e %b", true);
    System.out.printf("/n esse valor e %b", false);

    // %c substutui o coriga %c por carectere 
    System.out.printf("/nO carectere é: %c", 'A');
    System.out.printf("/nO carectere é: %c", '5');
    System.out.printf("/nO carectere é: %c", '*');
    System.out.printf("/nO carectere é: %c", '\\');

    // printf com todos os tipos usando variaveis 
    String texto = "alguma coisa";
    int numeroInteiro = 1;
    float numeroQuebrado = 123.232f;
    boolean valorVerdadeiro = true; 
    char umCaractere = '*';
    System.out.println("\n%s, %d, %.2f, %b, %c,texto, numeroInteiro, numeroQuebrado, valorVeradeiro, UmCaractere");
    
 
    }
}
