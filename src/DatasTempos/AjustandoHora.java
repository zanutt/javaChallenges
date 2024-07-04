package DatasTempos;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class AjustandoHora {
    public static void main(String[] args) {
        LocalDateTime dataHoraAtual = LocalDateTime.now();

        String horasPlus = JOptionPane.showInputDialog("Quantas Horas deseja adcionar? em HH:mm");

        String[] partes = horasPlus.split(":");
        int horas = Integer.parseInt(partes[0]);
        int min = Integer.parseInt(partes[1]);

        dataHoraAtual = dataHoraAtual.plusHours(horas).plusMinutes(min);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String dataHoraFormatada = dataHoraAtual.format(formatter);

        System.out.println("Data e hora após a adição solicitada: " + dataHoraFormatada);

    }
}
