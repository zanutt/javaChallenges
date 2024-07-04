package DatasTempos;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class DiasEntreDuasDatas {
    public static void main(String[] args) {


        LocalDate dataHoje = LocalDate.now();
        String data1 = JOptionPane.showInputDialog("Informe a primera data dd/mm/yyyy?");
        String data2 = JOptionPane.showInputDialog("Informe a segunda data dd/mm/yyyy?");
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataFormatada1 = LocalDate.parse(data1, formatter);
            LocalDate dataFormatada2 = LocalDate.parse(data2, formatter);
            long dias = ChronoUnit.DAYS.between(dataFormatada1, dataFormatada2);
            System.out.println("A quantidade de dias entre as datas é de: " + dias + " dias");
        } catch (DateTimeParseException e){
            System.out.println("Formato de data inválido. Por favor, use o formato dd/MM/yyyy.");
        }
    }
}


