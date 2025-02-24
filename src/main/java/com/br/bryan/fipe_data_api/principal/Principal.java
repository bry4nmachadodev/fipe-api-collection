package com.br.bryan.fipe_data_api.principal;

import com.br.bryan.fipe_data_api.model.Dados;
import com.br.bryan.fipe_data_api.model.Modelos;
import com.br.bryan.fipe_data_api.service.ConsumoApi;
import com.br.bryan.fipe_data_api.service.ConverteDados;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URL;
import java.text.Normalizer;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {
        private Scanner leitura = new Scanner(System.in);
        private ConsumoApi consumo = new ConsumoApi();
        private ConverteDados conversor = new ConverteDados();
        private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";






        public void exibeMenu(){
            System.out.println("**** OPÇÕES ****" +
                    "\nCarros" +
                    "\nMotos" +
                    "\nCaminhões\n");

            System.out.print("Digite uma das opções para consultar valores: ");
            var opcao = leitura.nextLine();

            String endereco;
            if(opcao.toLowerCase().contains("carr")){
                endereco = URL_BASE + "carros/marcas";
            } else if (opcao.toLowerCase().contains("mot")){
                endereco = URL_BASE + "motos/marcas";
            } else {
                endereco = URL_BASE + "caminhoes/marcas";
            }


            var json = consumo.obterDados(endereco);
            System.out.println(json);

            var marcas = conversor.obterLista(json, Dados.class);
            marcas.stream()
                    .sorted(Comparator.comparing(Dados::codigo))
                    .forEach(System.out::println);

            System.out.print("Qual o código da marca para consulta: ");
            var codigoMarca = leitura.nextLine();

            endereco = endereco + "/" + codigoMarca + "/modelos";
            json = consumo.obterDados(endereco);
            var modeloLista = conversor.obterDados(json, Modelos.class);
            System.out.println("Modelos dessa marca: " + modeloLista);
            modeloLista.modelos().stream()
                    .sorted(Comparator.comparing(Dados::codigo))
                    .forEach(System.out::println);

            System.out.print("Digite um trecho do nome do carro para ser buscado: ");
            var nomeVeiculo = leitura.nextLine();

            List<Dados> modelosFiltrados = modeloLista.modelos().stream()
                    .filter(m -> m.nome().toLowerCase().contains(nomeVeiculo.toLowerCase()))
                    .collect(Collectors.toList());

            System.out.println("Modelos filtrados: ");
            modelosFiltrados.forEach(System.out::println);




        }
}


