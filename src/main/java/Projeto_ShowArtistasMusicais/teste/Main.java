package Projeto_ShowArtistasMusicais.teste;

import Projeto_ShowArtistasMusicais.dominio.Banda;
import Projeto_ShowArtistasMusicais.dominio.Cantor;
import Projeto_ShowArtistasMusicais.service.EmitirContrato;
import Projeto_ShowArtistasMusicais.service.GeradorRelatorioCache;

import java.util.Scanner;

/*Simulador de contrato de show de Artistas musicais, aplicando polimorfismo, classes abstratas e interfaces. */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ativoSistema = true;

        while (ativoSistema) {
            System.out.println("\n☆☆Cadastro de apresentação do Coachella☆☆");
            System.out.println("1.Inscrever banda.");
            System.out.println("2.Inscrever cantor(solo)");
            System.out.println("3.Sair.");
            int escolha = scanner.nextInt();
            scanner.nextLine();


            switch (escolha) {
                case 1: {
                    System.out.println("Cadastrando BANDA...");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Gênero musical: ");
                    String genero = scanner.nextLine();

                    System.out.print("Público esperado: ");
                    int publicoEsperado = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("É data especial? (s/n): ");
                    boolean dataEspecial = scanner.nextLine().trim().equalsIgnoreCase("s");

                    System.out.print("Tempo de show (min): ");
                    int tempoShow = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Data (dd/MM): ");
                    String data = scanner.nextLine();

                    System.out.print("Número de integrantes: ");
                    int numIntegrantes = scanner.nextInt();
                    scanner.nextLine();

                    Banda artista = new Banda(nome, genero, publicoEsperado, dataEspecial, tempoShow, data, numIntegrantes);


                    System.out.println("-------------------");
                    EmitirContrato.emissaoContrato(artista);
                    System.out.println("-------------------");
                    GeradorRelatorioCache.calcularCache(artista);

                    break;
                }
                case 2: {
                    System.out.println("Cadastrando Cantor...");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Gênero musical: ");
                    String genero = scanner.nextLine();

                    System.out.print("Público esperado: ");
                    int publicoEsperado = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("É data especial? (s/n): ");
                    boolean dataEspecial = scanner.nextLine().trim().equalsIgnoreCase("s");

                    System.out.print("Tempo de show (min): ");
                    int tempoShow = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Data (dd/MM): ");
                    String data = scanner.nextLine();

                    Cantor artista = new Cantor(nome, genero, publicoEsperado, dataEspecial, tempoShow, data);

                    System.out.println("-------------------");
                    GeradorRelatorioCache.calcularCache(artista);
                    System.out.println("-------------------");
                    EmitirContrato.emissaoContrato(artista);

                    break;
                }
                case 3: {
                    System.out.println("Saindo...");
                    ativoSistema = false;
                    break;

                }
                default:
                    System.out.println("Opção inválida.");
            }


        }
    }
}