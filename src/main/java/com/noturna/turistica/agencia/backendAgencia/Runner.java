package com.noturna.turistica.agencia.backendAgencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.noturna.turistica.agencia.backendAgencia.model.Destinos;
import com.noturna.turistica.agencia.backendAgencia.repository.DestinosRepository;

@Configuration
public class Runner implements CommandLineRunner{
	
	@Autowired
	private DestinosRepository destinoRepository;

	@Override
	public void run(String... args) throws Exception {

		//Destinos
		Destinos destino1 = new Destinos();
		destino1.setIdDestino((long) 1);
		destino1.setNome("Dubaí");
		destino1.setDescricao("Com parques e atrações incomparáveis, Dubai é um destino inovador que vai te surpreender! Em uma só viagem, você vai conhecer os principais pontos turísticos da cidade e aproveitar passeios cheios de diversão e adrenalina. Prepare-se para viver experiências únicas e embarque na melhor viagem da sua vida!");
		destino1.setPreco(2000.00);
		destino1.setImgUrl("https://www.costacruzeiros.com/content/dam/costa/costa-magazine/article-images/what-to-see-in-dubai/dubai-panorama_1.jpg.image.648.487.high.jpg");
		destinoRepository.save(destino1);
		
		Destinos destino2 = new Destinos();
		destino2.setIdDestino((long) 2);
		destino2.setNome("Tokyo");
		destino2.setDescricao("Tóquio é considerada uma das maiores metrópoles do mundo e encanta seus turistas pela preservação das suas características culturais, com seus templos e palácios, enquanto mantém um olhar para o futuro. A capital do Japão, sem dúvida, é um dos destinos mais curiosos, ricos e interessantes do planeta.");
		destino2.setPreco(1500.00);
		destino2.setImgUrl("https://coisasdojapao.com/wp-content/uploads/2017/03/Tokyo-Main-Image.jpg");	
		destinoRepository.save(destino2);
		
		Destinos destino3 = new Destinos();
		destino3.setIdDestino((long) 3);
		destino3.setNome("Rio de Janeiro");
		destino3.setDescricao("Com um grande acervo histórico e arquitetônico e uma paisagem natural diversificada, é o principal centro turístico brasileiro.As suas praias e o desfile das escolas de samba atraem turistas do mundo inteiro.Turismo do Rio de Janeiro Resumo A Cidade do Rio de Janeiro é o principal centro turístico do Brasil, e alguns de seus pontos de atração, como Pão de Açúcar e o Corcovado, tornaram-se mesmo símbolos do País.");
		destino3.setPreco(1000.00);
		destino3.setImgUrl("https://www.melhoresdestinos.com.br/wp-content/uploads/2019/08/rio-de-janeiro-capa2019-01.jpg");
		destinoRepository.save(destino3);
	}

}
