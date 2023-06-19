public class Apple {
    public static void main(String[] args) {
      Iphone iphone = new Iphone();
        System.out.println("Usando iphone para aparelho telefonico");
        System.out.println();
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();

        System.out.println();
        System.out.println("Usando iphone para navegador de internet");
        System.out.println();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina();

        System.out.println();
        System.out.println("Usando iphone como reprodutor musical");
        System.out.println();
        iphone.tocar();
        iphone.selecionarMusica();
        iphone.pausar();

       
    }
}
