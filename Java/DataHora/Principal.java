package DataHora;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Principal{
    public static void main(String[] args) {
        //Vamos testar o localtime e o localdate separados agora

        System.out.println("Enviando Relatorios do servico");
        LocalDate novaData = LocalDate.now();
        LocalTime novaHora = LocalTime.now();

        //podemos realizar formatacoes para o ano e a hora aparecerem de acordo como queremos

        System.out.println("Data atual: " + novaData.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

        System.out.println("Hora atual: " + novaHora.format(DateTimeFormatter.ofPattern("HH:mm:ss")));


        //podemos tambem criar um objeto com a formatacao ja aplicada para que nao seja necessario escrever tanto codigo

        DateTimeFormatter novaFormatacao = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data atual usando o objeto de formatacao: " + novaData.format(novaFormatacao));

        //agora vamos comparar duas datas para utilizar condicionais

        LocalDate data1 = LocalDate.now();
        LocalDate data2 = LocalDate.of(2025, 4, 20);

        if(data1.isBefore(data2)){
            System.out.println("O dia data1 " + data1.getDayOfMonth() + " eh antes do dia data2" + data2.getDayOfMonth());
        }else if(data1.isEqual(data2)){
            System.out.println("Ambas datas sao iguais " + data1.getDayOfMonth() + data2.getDayOfMonth());
        }else{
            System.out.println("o dia data1 " + "(" +  data1.getDayOfMonth() + ")" + " eh depois do dia data2 " + "(" + data2.getDayOfMonth() + ")");
        }


        //podemos tambem calcular a diferenca de uma hora a outra

        LocalTime hora1 = LocalTime.of(14, 30, 0);
        LocalTime hora2 = LocalTime.of(16, 45, 0);

        //usamos a classe Duration paraa achar a diferenca com o metodo between

        Duration duration = Duration.between(hora1, hora2);

        //agora imprimimos no console e usamos metodos ToHours e ToMinutes

        System.out.println("A diferenca de horas eh: " + duration.toHours() + " horas " + duration.toMinutesPart() + " minutos");

        //podemos calcular datas de entrega tambem

        LocalDate dataInicio = LocalDate.of(2025, 3, 15);
        int prazoEntrega = 15;
        LocalDate dataEntrega = dataInicio.plusDays(prazoEntrega);

        System.out.println("A data de entrega sera no dia: " + dataEntrega.format(novaFormatacao));


        //podemos diminuir os dias tambem (como por exemplo avisos de antecedencia de cartao)

        LocalDate dataVencimentoCartao = LocalDate.of(2025, 3, 30);
        int diasAntesVencer = 10;
        //para subtrair usamos minus, para adicionar usamos plus (pode ser usado para dias, meses e ate anos)
        LocalDate dataAviso = dataVencimentoCartao.minusDays(diasAntesVencer);

        System.out.println("Data do lembrete do vencimento do cartao: " + dataAviso.format(novaFormatacao));


        //podemos formatar fuso horarios tambem com classe ZonedDateTime

        ZonedDateTime horarioLosAngeles = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        DateTimeFormatter formatacaoHoras = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Horario atualmente em LA: " + horarioLosAngeles.format(formatacaoHoras));

        //agora vamos converter o horario de LA para de tokyo

        ZonedDateTime horarioTokyo = horarioLosAngeles.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        System.out.println("Horario de Tokyo: " + horarioTokyo.format(formatacaoHoras));



    




        
        
        
    }
}