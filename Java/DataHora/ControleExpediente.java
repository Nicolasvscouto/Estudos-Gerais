package DataHora;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ControleExpediente {
    //esse eh um arquivo separado pois ele eh mais um treino mais robusto do conteudo em geral
    public static void main(String[] args) {
       Scanner checagemHorario = new Scanner(System.in);
       DateTimeFormatter formatacaoHoras = DateTimeFormatter.ofPattern("HH:mm");



       //entrada de dados do usuario
       System.out.println("Digite a hora de entrada (HH:mm)");
       LocalTime entrada = LocalTime.parse(checagemHorario.next(), formatacaoHoras);

       System.out.println("Qual a carga horaria diaria? (em horas)");
       int cargaHoraria = checagemHorario.nextInt();

       System.out.println("Qual a hora que voce realmente saiu (HH:mm)");
       LocalTime saida = LocalTime.parse(checagemHorario.next(), formatacaoHoras);


       //analise dos dados e tratamento deles para transformar em informacoes
       LocalTime saidaPrevista = entrada.plusHours(cargaHoraria);

       String formatacaoSaida = saidaPrevista.format(formatacaoHoras);

       Duration duracaoJornada = Duration.between(saidaPrevista, saida);

       String saldoDeHoras = duracaoJornada.toHours() + "h " + duracaoJornada.toMinutesPart() + "min";


       //saida das informacoes para o usuario

       System.out.println("Horario de Entrada: " + entrada);
       System.out.println("Saida prevista: " + formatacaoSaida);
       System.out.println("Saida na realidade: " + saida);
       System.out.println("Saldo de horas : " + saldoDeHoras);



       //fechamento do scanner para evitar problemas
       checagemHorario.close();
    }
}
