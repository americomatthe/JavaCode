/*
* Author: Matheus da Silveira
* Curso: +PraTi
* Professor: Marlon Nunes
* Modulo I
* Data 30/09/23
* Versão 1.0 do Código
* */

import java.util.Scanner; // Importação de outra biblioteca.

public class Main{
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in); //instanciando o objeto Scanner
        boolean continuar = true; //Declarando variavel verdadeiro ou falso.

        //Iniciando program com estrutura DO-WHILE.
        do{
            //Estrurura do Menu Principal
            System.out.println("MATHEUS DA SILVEIRA                 +PraTi   v1.0");
            System.out.println("+===============================================+");
            System.out.println("|                 MENU PRINCIPAL                |");
            System.out.println("+===============================================+");
            System.out.println("| Escolha o modulo para acessar os exercicios.  |");
            System.out.println("+-----------------------------------------------+");
            System.out.println("|   1 - MODULO I                                |");
            System.out.println("|   2 - MODULO II                               |");
            System.out.println("|                                               |");
            System.out.println("+--------------------------------------Sair(0)--+");
            System.out.print("Opcao: ");

            try {
                Integer opcao = sc.nextInt(); //Guardando resposta a uma variavel WrapperInteger com sc.next.

                if (opcao.equals(1)) {
                    //Modulo I.
                    boolean conmodI = true; // Declarando variavel verdadeiro ou falso.
                    do {
                        //Estrurura do Menu Modulo I
                        System.out.println("MATHEUS DA SILVEIRA                 +PraTi   v1.0");
                        System.out.println("+===============================================+");
                        System.out.println("|                    MODULO I                   |");
                        System.out.println("+===============================================+");
                        System.out.println("|     Escolha qual exercicio quer executar.     |");
                        System.out.println("+-----------------------------------------------+");
                        System.out.println("|   1 - CALCULANDO MEDIA DE NOTA - 1° CODE      |");
                        System.out.println("|   2 - NUMERO POSITIVO OU NEGATIVO - IF-ELS    |");
                        System.out.println("|   3 - MENU DE OPCOES - SWITCH-CASE            |");
                        System.out.println("|   4 - CONTAGEM REGRESSIVA - WHILE             |");
                        System.out.println("|   5 - CONTAGEM CRESCENTE - DO-WHILE           |");
                        System.out.println("|   6 - TABUADA DO 7X - FOR                     |");
                        System.out.println("|   7 - WRAPPER - TIPOS WRAPPERS E STRING       |");
                        System.out.println("|   8 - CALCULADORA - LEITURA DE DADOS          |");
                        System.out.println("|   9 - DESAFIO FINAL                           |");
                        System.out.println("|                                               |");
                        System.out.println("+------------------------------------Voltar(0)--+");
                        System.out.print("Opcao: ");

                        Integer opcaomodI = sc.nextInt(); //Guardando resposta a uma variavel WrapperInteger com sc.next.
                        switch (opcaomodI) {
                            case 0:
                                conmodI = false;
                                break;
                            case 1:
                                /*
                                 *
                                 *  CALCULANDO MEDIA DE NOT - 1° CODE
                                 *
                                 */
                                //Declarando variaveis de tipo double para armazenar as notas do aluno.
                                double nota1, nota2, media;
                                //Declarando constante do tipo double atribuindo o valor 5.0
                                final double PESO_NOTA = 0.5;
                                //Atribuindo valores as variaveis nota1 e nota2.
                                nota1 = 8.0;
                                nota2 = 9.5;
                                //Formula para calcular a média.
                                media = (nota1 * PESO_NOTA) + (nota2 * PESO_NOTA);
                                //Imprimindo resultado
                                System.out.println("A nota media e: " + media);
                                System.out.println("Voltando para o Menu do Modulo I!");
                                Thread.sleep(5000);
                                break;
                            /*
                             *  FIM
                             */
                            case 2:
                                /*
                                 *
                                 *  NUMERO POSITIVO OU NEGATIVO - IF-ELS
                                 *
                                 */
                                //Declarando uma variavel inteira chamada numero e atribuindo um valor.
                                int numero = -10;
                                //Criando estrutura if-else
                                if (numero > 0) {
                                    //Se numero for menor que 0 printar.
                                    System.out.println("O numero e positivo.");
                                } else {
                                    //Se numero for maior que 0 printar.
                                    System.out.println("O numero e negativo.");
                                }
                                System.out.println("Voltando para o Menu do Modulo I!");
                                Thread.sleep(5000);
                                break;
                            /*
                             *  FIM
                             */
                            case 3:
                                /*
                                 *
                                 *  MENU DE OPCOES - SWITCH-CASE
                                 *
                                 */
                                //Declarando uma variavel inteira chamada opc e atribuindo a ela um valor entre 1 e 3
                                int opc = 1;
                                //Estrutura de controle switch-case
                                switch (opc) {
                                    case 1:
                                        System.out.println("Voce escolheu opcao 1.");
                                        break;
                                    case 2:
                                        System.out.println("Voce escolheu opcao 2.");
                                        break;
                                    case 3:
                                        System.out.println("Voce escolheu opcao 3.");
                                        break;
                                    default:
                                        System.out.println("Opcao Invalida!");
                                        break;
                                }
                                System.out.println("Voltando para o Menu do Modulo I!");
                                Thread.sleep(5000);
                                break;
                            /*
                             *  FIM
                             */
                            case 4:
                                /*
                                 *
                                 *  CONTAGEM REGRESSIVA - WHILE
                                 *
                                 */
                                //Declarando uma variavel inteira e atribuindo o valor 10.
                                int num = 10;
                                //Estrutura While
                                while (num > 0) {
                                    System.out.println("Contagem iniciada: " + num);
                                    num--;
                                }
                                //Mensagem de contagem Finalizada.
                                System.out.println("Contagem finalizada!");
                                System.out.println("Voltando para o Menu do Modulo I!");
                                Thread.sleep(5000);
                                break;
                            /*
                             *  FIM
                             */
                            case 5:
                                /*
                                 *
                                 *  CONTAGEM CRESCENTE - DO-WHILE
                                 *
                                 */
                                //Declarando uma variavel inteira e atribuindo o valor 0.
                                int num2 = 0;
                                //Estrutura do-while.
                                do {
                                    //Fazer isso:
                                    System.out.println("Contagem iniciada: " + num2);
                                    num2++;
                                } while (num2 <= 5);
                                System.out.println("Contagem finalizada!");
                                System.out.println("Voltando para o Menu do Modulo I!");
                                Thread.sleep(5000);
                                break;
                            /*
                             *  FIM
                             */
                            case 6:
                                /*
                                 *
                                 *  TABUADA DO 7X - FOR
                                 *
                                 */
                                //Declarando uma variavel inteira e atribuindo o valor 7.
                                int multiplicar = 7;
                                //Mensagem
                                System.out.println("Calculando a tabuada do 7:");
                                //Enquanto numero for menor ou igual a 10 somar mais 1.
                                for (int num3 = 1; num3 <= 10; num3++) {
                                    //Formula para multiplicar.
                                    int resultado = multiplicar * num3;
                                    System.out.println(multiplicar + "x" + num3 + " = " + resultado);
                                }
                                System.out.println("Voltando para o Menu do Modulo I!");
                                Thread.sleep(5000);
                                break;
                            /*
                             *  FIM
                             */
                            case 7:
                                /*
                                 *
                                 *  WRAPPER - TIPOS WRAPPERS E STRING
                                 *
                                 */
                                int x = -127;
                                Integer xWrapper = x;

                                Integer y = x;
                                if (xWrapper == y) {
                                    System.out.println("== - E igual.");
                                } else {
                                    System.out.println("== - Nao e igual.");
                                }

                                if (xWrapper.equals(y)) {
                                    System.out.println("== - E igual.");
                                } else {
                                    System.out.println("== - Nao e igual");
                                }
                                System.out.println("Voltando para o Menu do Modulo I!");
                                Thread.sleep(5000);
                                break;
                            /*
                             *  FIM
                             */
                            case 8:
                                /*
                                 *
                                 *  CALCULADORA - LEITURA DE DADOS
                                 *
                                 */
                                //Declarando variavel verdadeiro ou falso.
                                boolean continuar1 = true;

                                //Estrutura repetição.
                                do {
                                    //Mensagem pedindo informação.
                                    System.out.println("Voce deseja continuar? Digite 's' sim  ou 'n 'nao");
                                    //Atribuindo resposta a uma variavel WrapperString com sc.next.
                                    String resposta = sc.next();
                                    //Estrutura If.
                                    //Se Resposta for igual a 's'.
                                    if (resposta.equals("s")) {
                                        try {
                                            //Perguntando qual operação matemática ele deseja realizar(soma, subtração, multiplicação ou divisão).
                                            System.out.println("Informe qual operacao matematica deseja fazer.");
                                            System.out.print("[1]soma, [2]subtracao, [3]multiplicacao ou [4]divisao: ");
                                            int resposta2 = sc.nextInt();
                                            //Pedindo para digitar um numero e atribuindo ele a uma variavel double com sc.nextInt.
                                            System.out.println("Digite um numero:");
                                            double n1 = sc.nextDouble();
                                            //Pedindo para digitar outro numero e atribuindo ele a uma variavel double com sc.nextInt.
                                            System.out.println("Digite um outro numero:");
                                            double n2 = sc.nextDouble();
                                            switch (resposta2) {
                                                case 1:
                                                    double soma = n1 + n2;
                                                    System.out.println("A soma entre " + n1 + " e " + n2 + " é igual a: " + soma);
                                                    Thread.sleep(5000);
                                                    break;
                                                case 2:
                                                    double subtracao = n1 - n2;
                                                    System.out.println("A subtracao entre " + n1 + " e " + n2 + " é igual a: " + subtracao);
                                                    Thread.sleep(5000);
                                                    break;
                                                case 3:
                                                    double multiplica = n1 * n2;
                                                    System.out.println("A subtracao entre " + n1 + " e " + n2 + " é igual a: " + multiplica);
                                                    Thread.sleep(5000);
                                                    break;
                                                case 4:
                                                    if (n1 == 0) {
                                                        System.out.println("0 Nao e um numero divisivel! Tente outro numero.");
                                                        Thread.sleep(5000);
                                                    } else if (n2 == 0) {
                                                        System.out.println(n1 + " E igual a ele mesmo.");
                                                        Thread.sleep(5000);
                                                    } else {
                                                        double divisao = n1 / n2;
                                                        System.out.println("A subtracao entre " + n1 + " e " + n2 + " é igual a: " + divisao);
                                                        Thread.sleep(5000);
                                                    }
                                                    Thread.sleep(5000);
                                                    break;
                                                default:
                                                    System.out.println("Opcao Invalida!");
                                                    Thread.sleep(5000);
                                                    break;
                                            }
                                        } catch (RuntimeException i) {
                                            System.out.println("Numero invalido, vamos comecar novamente!");
                                            Thread.sleep(5000);
                                        }
                                    } else if (resposta.equals("n")) {
                                        System.out.println("Voltando para o Menu do Modulo I!");
                                        Thread.sleep(5000);
                                        break;
                                    } else {
                                        System.out.println("Opção invalida!");
                                        Thread.sleep(5000);
                                    }
                                } while (continuar1);
                                Thread.sleep(5000);
                                break;
                            /*
                             *  FIM
                             */
                            case 9:
                                /*
                                 *
                                 *  DESAFIO FINAL
                                 *
                                 */
                                //Declarando variavel do tipo double.
                                Double imc, peso, altura;

                                try {
                                    //Coletando informacao e atribuindo a variavel peso.
                                    System.out.print("Informe seu peso em Quilogramas: ");
                                    peso = sc.nextDouble();
                                    //Coletando informacao e atribuindo a variavel altura.
                                    System.out.print("Informe sua altura em Metros: ");
                                    altura = sc.nextDouble();

                                    //Formula de calculo IMC
                                    imc = peso / (altura * altura);

                                    System.out.println("Seu IMC e de: "+imc);
                                    if(imc<18.5){
                                        System.out.println("Voce esta abaixo do peso ideal!");
                                    } else if(imc<=24.9){
                                        System.out.println("Voce esta no peso ideal (faixa considerada saudável)");
                                    } else if(imc<=34.9){
                                        System.out.println("Voce esta com sobrepeso");
                                    } else if(imc<=34.9){
                                        System.out.println("Obesidade grau 1");
                                    }else if(imc<=39.9){
                                        System.out.println("Obesidade grau 2");
                                    } else if(imc<=40){
                                        System.out.println("Obesidade grau 3 (obesidade mórbida).");
                                    }
                                    System.out.println("Voltando para o Menu do Modulo I!");
                                    Thread.sleep(5000);

                                }catch (RuntimeException i){
                                    System.out.println("So e valido numeros e pontos! Sistema sera incerrado...");
                                    Thread.sleep(5000);
                                    break;
                                }

                                /*
                                 *  FIM
                                 */
                                break;
                            default:
                                System.out.println("Opcao Invalida!");
                                Thread.sleep(5000);
                                break;
                        }
                    } while (conmodI);

                } else if (opcao.equals(2)) {
                    //Modulo II.
                    System.out.println("Ainda nenhum exercicio iniciado! Redirecionando para o Menu Principal...");
                    Thread.sleep(5000);
                } else if (opcao.equals(0)) {
                    //Sair.
                    System.out.println("Encerrando Sistema...");
                    break;
                } else {
                    //Opcao invalida.
                    System.out.println("Opcao Invalida!");
                    Thread.sleep(5000);
                }
            } catch (RuntimeException i) {
                System.out.println("Opcao invalida! Sistema será incerrado...");
                break;
            }
        }while(continuar);
    }
}