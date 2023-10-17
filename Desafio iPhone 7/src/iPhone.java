import java.util.Scanner;

// Interface ReprodutorMusical
interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica();
}

// Interface AparelhoTelefonico
interface AparelhoTelefonico {
    void ligar();
    void atender();
    void iniciarCorreioDeVoz();
}

// Interface NavegadorInternet
interface NavegadorInternet {
    void exibirPagina();
    void adicionarNovaAba();
    void atualizarPagina();
}

// Classe iPhone que implementa todas as interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos das interfaces ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reprodutor de música: Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Reprodutor de música: Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Reprodutor de música: Selecionando música");
    }

    // Implementação dos métodos das interfaces AparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("Aparelho telefônico: Ligando telefone");
    }

    @Override
    public void atender() {
        System.out.println("Aparelho telefônico: Atendendo chamada telefônica");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Aparelho telefônico: Iniciando correio de voz");
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina() {
        System.out.println("Navegador de internet: Exibindo página na internet");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Navegador de internet: Adicionando nova aba de navegação");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Navegador de internet: Atualizando página");
    }

    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Reprodutor Musical");
            System.out.println("2. Aparelho Telefônico");
            System.out.println("3. Navegador na Internet");
            System.out.println("4. Desligar");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Escolha uma ação de Reprodutor Musical:");
                    System.out.println("1. Tocar");
                    System.out.println("2. Pausar");
                    System.out.println("3. Selecionar Música");

                    int acaoReprodutor = scanner.nextInt();

                    switch (acaoReprodutor) {
                        case 1:
                            meuiPhone.tocar();
                            break;
                        case 2:
                            meuiPhone.pausar();
                            break;
                        case 3:
                            meuiPhone.selecionarMusica();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Escolha uma ação de Aparelho Telefônico:");
                    System.out.println("1. Ligar");
                    System.out.println("2. Atender");
                    System.out.println("3. Iniciar Correio de Voz");

                    int acaoTelefone = scanner.nextInt();

                    switch (acaoTelefone) {
                        case 1:
                            meuiPhone.ligar();
                            break;
                        case 2:
                            meuiPhone.atender();
                            break;
                        case 3:
                            meuiPhone.iniciarCorreioDeVoz();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Escolha uma ação de Navegador na Internet:");
                    System.out.println("1. Exibir Página");
                    System.out.println("2. Adicionar Nova Aba");
                    System.out.println("3. Atualizar Página");

                    int acaoInternet = scanner.nextInt();

                    switch (acaoInternet) {
                        case 1:
                            meuiPhone.exibirPagina();
                            break;
                        case 2:
                            meuiPhone.adicionarNovaAba();
                            break;
                        case 3:
                            meuiPhone.atualizarPagina();
                            break;
                    }
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }
}

