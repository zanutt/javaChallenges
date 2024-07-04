package DatasTempos;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;

public class ValidandoData {
    public static void main(String[] args) {
        String data = JOptionPane.showInputDialog("Digite uma data (dia, mes, ano)");
        String[] partes = data.split(",");
        String dia = partes[0];
        String mes = partes[1];
        String ano = partes[2];

        String dataArrumada = (ano + "-" + mes + "-" + dia);


        try {
            LocalDate validaData = LocalDate.parse(dataArrumada);
            System.out.println("A data "+ validaData + " é valida.");
        }catch(DateTimeParseException e){
            System.out.println("Desculpa a data " + dataArrumada + " não é valida.");
        }

    }

}