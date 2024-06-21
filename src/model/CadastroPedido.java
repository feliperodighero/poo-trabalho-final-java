package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CadastroPedido {

    private static final String DIRECTORY_PATH = "cadastrospedidos/";

    // Certifique-se de que o diretório de cadastros exista
    static {
        File directory = new File(DIRECTORY_PATH);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }

    // Método para salvar um funcionário em um arquivo separado
    public static void salvarPedido(Pedido pedido) {
        String fileName = DIRECTORY_PATH + pedido.getNumeroMesa() + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(pedido.getNumeroMesa() + "\n");
            writer.write(pedido.getNomeComida() + "\n");
            writer.write(pedido.getQuantidadeComida()+ "\n");
            writer.write(pedido.getNomeBebida()+ "\n");
            writer.write(pedido.getQuantidadeBebida()+ "\n");
            writer.write(pedido.getPrecoTotal()+ "\n");
            
            // Mensagens de depuração
            System.out.println("Salvando Pedido: " + pedido.getNomeComida());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    // Método para ler um cadastro do diretório
    public static Pedido lerPedido(String numero) {
        String fileName = DIRECTORY_PATH + numero + ".txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int numeroMesa = Integer.parseInt(reader.readLine());
            String nomeComida = reader.readLine();
            int quantidadeComida = Integer.parseInt(reader.readLine());
            String nomeBebida = reader.readLine();
            int quantidadeBebida = Integer.parseInt(reader.readLine());
            float valorTotal = Float.parseFloat(reader.readLine());

            return new Pedido(numeroMesa, nomeComida, quantidadeComida, nomeBebida, quantidadeBebida, valorTotal);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Método para excluir um cadastro pelo nome do arquivo
    public static void excluirPedido(String numero) {
        String fileName = DIRECTORY_PATH + numero + ".txt";
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        } else {
            System.out.println("Arquivo não encontrado: " + fileName);
        }
    }
}
