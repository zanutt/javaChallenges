package DatasTempos;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CalcIdade {
    public static void main(String[] args) {
        LocalDate dataHoje = LocalDate.now();
        String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento dd/mm/yyyy?");
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataFormatada = LocalDate.parse(dataNascimento, formatter);
            Period periodo = Period.between(dataFormatada, dataHoje);
            System.out.println("A sua idade é de: "+  periodo.getYears() + " anos");
        } catch (DateTimeParseException e) {
            System.out.println("Formato de data inválido. Por favor, use o formato dd/MM/yyyy.");
    }
    }
}
