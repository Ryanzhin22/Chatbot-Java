package ProjetoJavaSenai;
import java.util.Scanner;

public class Classe{
    Scanner obj = new Scanner(System.in);
    Integer pontos = 0;
    
// INTERFACE PADRÃO

public void terminal() {
        System.out.println("\033[1;37m--------------------------------");
        System.out.println("Bem-vindo ao Chatbot de Estudos!");
        System.out.println("--------------------------------");

        System.out.println("O que você deseja fazer?");
        System.out.println("\033[1;32m1 - Jogar\033[0m");
        System.out.println("\033[1;36m2 - Estudar\033[0m");
        System.out.println("\033[1;31m3 - Sair\033[0m");
}


// INTERFACE OPÇÃO 1

public void terminal1() {
        System.out.println("\033[1;37m-------------------------------");
        System.out.println("Bem-vindo ao jogo de perguntas!");
        System.out.println("-------------------------------\033[0m");
        System.out.println("\033[1;33mVocê irá responder 10 perguntas na dificuldade fácil ou difícil.");
        System.out.println("No final do questionário será feito uma contagem da quantidade de pontos que você acertou!");
        System.out.println("\033[1;37m-------------------------------\033[0m");
        System.out.println("\033[1;37mDeseja iniciar na dificuldade: \n \033[1;32m 1 - Fácil \033[0m \n \033[1;31m 2 - Difícil \033[0m \n \033[1;37m 3 - Sair\033[0m");
}

// INTERFACE OPÇÃO 2

public void terminal2(){
        System.out.println("\033[1;37m-------------------------------------");
        System.out.println("Bem-Vindo ao nosso Sistema de Estudo!");
        System.out.println("-------------------------------------");
        System.out.println("Escolha uma matéria que deseja aprofundar seus conhecimentos: \033[0m \n \033[1;33m 1 - Matemática \033[0m \n \033[1;34m 2 - Língua Portuguesa \033[0m \n \033[1;35m 3 - Geografia \033[0m \n \033[1;32m 4 - História\033[0m");
        }





// PERGUNTAS DIFÍCEIS DO JOGO

public void pergunta1d() {
    System.out.println("\033[1;32mPERGUNTA 1:\033[0m \033[1;37mQual o primeiro e único presidente negro da história do Brasil? \n A) Nilo Peçanha \n B) Hermes da Fonseca \n C) Michel Temer \n D) Getúlio Vargas\033[0m");
    String resposta3 = obj.nextLine();
    if(resposta3.equals("A")){
        pontos = pontos + 1;
    }
}
    public void pergunta2d() {
    System.out.println("\033[1;32mPERGUNTA 2:\033[0m \033[1;37mQuem foi a primeira pessoa a viajar ao espaço? \n A) Marcos Pontes \n B) Yuri Gagarin \n C) Neil Armstrong \n D) Laika\033[0m");
    String resposta4 = obj.nextLine();
    if(resposta4.equals("B")){
        pontos = pontos + 1;
    }
}
public void pergunta3d() {
    System.out.println("\033[1;32mPERGUNTA 3:\033[0m \033[1;37mQual desses fundadores de marcas famosas do ramo automobilístico fundou uma cidade no Brasil? \n A) Ferruccio Lamborghini \n B) Ettore Bugatti \n C) Henry Ford \n D) Enzo Ferrari\033[0m");
    String resposta5 = obj.nextLine();
    if(resposta5.equals("C")){
        pontos = pontos + 1;
    }
}
public void pergunta4d() {
    System.out.println("\033[1;32mPERGUNTA 4:\033[0m \033[1;37mQuantos ossos um humano adulto possui? \n A) 115 ossos \n B) 320 ossos \n C) 183 ossos \n D) 206 ossos\033[0m");
    String resposta6 = obj.nextLine();
    if(resposta6.equals("D")){
        pontos = pontos + 1;
    }
}
public void pergunta5d() {
    System.out.println("\033[1;32mPERGUNTA 5:\033[0m \033[1;37mO que representam os anéis olímpicos? \n A) Os 5 continentes \n B) Os deuses gregos: Zeus, Atena, Poseidon, Apolo e Hermes \n C) Os cinco símbolos olímpicos: tocha, hino, lema, medalhas e mascote \n D) Os cinco tipos de esporte: de rede, de campo, de combate, de invasão e de precisão\033[0m");
    String resposta7 = obj.nextLine();
    if(resposta7.equals("A")){
        pontos = pontos + 1;
    }
}
public void pergunta6d() {
    System.out.println("\033[1;32mPERGUNTA 6:\033[0m \033[1;37mQual o nome popular do cloreto de sódio? \n A) Sal de cozinha \n B) Fermento \n C) Álcool Etílico \n D) Vinagre\033[0m");
    String resposta8 = obj.nextLine();
    if(resposta8.equals("A")){
        pontos = pontos + 1;
    }
}
public void pergunta7d() {
    System.out.println("\033[1;32mPERGUNTA 7:\033[0m \033[1;37mQue fruto nasce da oliveira? \n A) Oliva \n B) Azeitona \n C) Uva \n D) Abacate\033[0m");
    String resposta9 = obj.nextLine();
    if(resposta9.equals("A")){
        pontos = pontos + 1;
}
}
public void pergunta8d() {
    System.out.println("\033[1;32mPERGUNTA 8:\033[0m \033[1;37mQual a construção mais alta do mundo? \n A) Burj Khalifa \n B) Empire State Building \n C) Merdeka 118 \n D) One World Trade Center\033[0m");
    String resposta10 = obj.nextLine();
    if(resposta10.equals("A")){
        pontos = pontos + 1;
}
}

public void pergunta9d(){
    System.out.println("\033[1;32mPERGUNTA 9:\033[0m \033[1;37mDe quem é a famosa frase 'Penso, logo existo'? \n A) Platão \n B) Galileu Galilei \n C) Descartes \n D) Sócrates\033[0m");
    String resposta10 = obj.nextLine();
    if(resposta10.equals("C")){
        pontos = pontos + 1;
}
}

public void pergunta10d(){
    System.out.println("\033[1;32mPERGUNTA 10:\033[0m \033[1;37mO que significa a palavra 'Shack' na língua portuguesa? \n A) Casaco \n B) Cabana \n C) Caçamba \n D) Mordida\033[0m");
    String resposta10 = obj.nextLine();
    if(resposta10.equals("B")){
        pontos = pontos + 1;
}
}

public void dificeisresultado(){
    System.out.println("\033[1;36mDepois de responder esse questionário, você ficou com: \n ------------------ "+ pontos + "/10 pontos ------------------\033[0m");
}
 


// PERGUNTAS FÁCEIS DO JOGO

public void pergunta1() {
    System.out.println("\033[1;32mPERGUNTA 1:\033[0m \033[1;37mQual o grupo em que todas as palavras foram escritas corretamente? \n A) Asterístico, beneficiente, meteorologia, entertido \n B) Asterisco, beneficente, meteorologia, entretido \n C) Asterisco, beneficente, metereologia, entretido \n D) Asterístico, beneficiente, metereologia, entretido\033[0m");
    String resposta1 = obj.nextLine();
    if (resposta1.equals("B")){
        pontos = pontos + 1;
    } 
}

public void pergunta2() {
    System.out.println("\033[1;32mPERGUNTA 2:\033[0m \033[1;37mEm que período da pré-história o fogo foi descoberto? \n A) Neolítico \n B) Idade dos Metais \n C) Período da Pedra Polida \n D) Paleolítico\033[0m");
    String resposta2 = obj.nextLine();
    if(resposta2.equals("D")){
        pontos = pontos + 1;
    }
}

public void pergunta3() {
    System.out.println("\033[1;32mPERGUNTA 3:\033[0m \033[1;37mQuais são as fases da Lua? \n A) Nova, cheia e superlua \n B) Penumbral, lunar parcial, lunar total e cheia \n C) Nova, cheia, minguante e lua de sangue \n D) Nova, crescente, cheia e minguante\033[0m");
    String resposta3 = obj.nextLine();
    if(resposta3.equals("D")){
        pontos = pontos + 1;
    }
}

public void pergunta4() {
    System.out.println("\033[1;32mPERGUNTA 4:\033[0m \033[1;37mQuantos continentes existem? \n A) 5 \n B) 6 \n C) 4 \n D) 7\033[0m");
    String resposta4 = obj.nextLine();
    if(resposta4.equals("B")){
        pontos = pontos + 1;
    }
}

public void pergunta5() {
    System.out.println("\033[1;32mPERGUNTA 5:\033[0m \033[1;37mKryptonita é a fraqueza de qual super-herói?? \n A) Hulk \n B) Superman \n C) Homem-Aranha \n D) Raio Negro\033[0m");
    String resposta5 = obj.nextLine();
    if(resposta5.equals("B")){
        pontos = pontos + 1;
    }
}

public void pergunta6() {
    System.out.println("\033[1;32mPERGUNTA 6:\033[0m \033[1;37mQual a personagem mais famosa de Maurício de Sousa? \n A) Mônica \n B) Magali \n C) Mafalda \n D) Seninha\033[0m");
    String resposta6 = obj.nextLine();
    if(resposta6.equals("A")){
        pontos = pontos + 1;
    }
}

public void pergunta7() {
    System.out.println("\033[1;32mPERGUNTA 7:\033[0m \033[1;37mEm que país foi construído o Muro de Berlim? \n A) Brasil \n B) Holanda \n C) Estados Unidos \n D) Alemanha\033[0m");
    String resposta7 = obj.nextLine();
    if(resposta7.equals("D")){
        pontos = pontos + 1;
    }
}

public void pergunta8() {
    System.out.println("\033[1;32mPERGUNTA 8:\033[0m \033[1;37mDepois do futebol, qual o esporte mais popular no Brasil? \n A) Esqui \n B) Tênis \n C) Vôlei \n D) Basquete\033[0m");
    String resposta8 = obj.nextLine();
    if(resposta8.equals("C")){
        pontos = pontos + 1;
    }
}

public void pergunta9() {
    System.out.println("\033[1;32mPERGUNTA 9:\033[0m \033[1;37mQual desses países não é europeu? \n A) Luxenburgo \n B) Holanda \n C) Venezuela \n D) Itália\033[0m");
    String resposta9 = obj.nextLine();
    if(resposta9.equals("C")){
        pontos = pontos + 1;
    }
}

public void pergunta10() {
    System.out.println("\033[1;32mPERGUNTA 10:\033[0m \033[1;37mQual a tradução de 'My name's Maria'? \n A) Meu nome é Maria \n B) Moro com a Maria \n C) Sou vizinho da Maria \n D) Eu amo a Maria\033[0m");
    String resposta10 = obj.nextLine();
    if(resposta10.equals("B")){
        pontos = pontos + 1;
    }
}

public void faceisresultado(){
    System.out.println("\033[1;36mDepois de responder esse questionário, você ficou com: \n ------------------- "+pontos+"/10 pontos! ------------------- \033[0m");
}

//GEOGRAFIA

public void geografia(){
    System.out.println("\033[1;32m--------------------");
    System.out.println("Selecione uma opção:\n-------------------- \n \033[1;35m 1 - Hidrografia \n  2 - Relevo \033[0m \n \033[1;36m 3 - Sites \033[0m \n \033[1;34m 4 - Dicas \033[0m ");
}

public void geografiaTeste1(){
    System.out.println("\033[1;35m--------------------------");
    System.out.println("Vamos falar um pouco sobre \n \033[1;36m      HIDROGRAFIA \n\033[1;35m-------------------------- \n\033[1;37m*A hidrografia consiste no estudo das águas, abrangendo lagos, rios, mares, oceanos e geleiras. \n*Uma bacia hidrográfica consiste em um rio principal, seus afluentes, e um oceano no qual ele deságua. \n*97% do planeta é composto pela hidrosfera, que é a parte da Terra composta por água, mas a maioria dessa água é salgada, ou está congelada \033[0m");
}

public void geografiaTeste2(){
    System.out.println("\033[1;35m--------------------------");
    System.out.println("Vamos falar um pouco sobre \n \033[1;36m        RELEVO \n\033[1;35m-------------------------- \n\033[1;37m*O relevo pode ser definido como o conjunto de formas que compõem a perte sólida da Terra (litosfera) \n*Os tipos de relevo existentes são as montanhas, que possuem altitutes superiores em relação às regiões vizinhas, os planaltos que também são mais elevados e possuem superfícies relativamente planas, as planícies que se caracterizam pelo acúmulo de sedimentos trazidos pela agua da chuva e pela sua menor altitude em relação às montanhas e planaltos, e as depressões que possuem altitudes inferiores em relação aos demais tipos de relevo e estão presentes em áreas geologicamente mais antigas. \033[0m");
}

public void geografiaSites(){
    System.out.println("\033[1;35m--------------------");
    System.out.println("       SITES");
    System.out.println("--------------------");    
    System.out.println("\033[1;37mAqui você pode encontrar sites que podem te ajudar em suas pesquisas! \n www.sogeografia.com.br \n www.geografiaparatodos.com.br \n brasilescola.uol.com.br/geografia \033[0m");
}

public void geografiaDicas(){
    System.out.println("\033[1;33m-------------------------------- ");
    System.out.println("Bem-vindo as dicas de GEOGRAFIA!");
    System.out.println("-------------------------------- \033[0m");
}

//HISTÓRIA

public void historia(){
    System.out.println("\033[1;32m--------------------");
    System.out.println("Selecione uma opção:\n--------------------\033[0m \n \033[1;31m 1 - Idade Média \n  2 - Feudalismo \033[0m \n \033[1;34m 3 - Sites \033[0m \n \033[1;33m 4 - Dicas \033[0m ");
}

public void historiaTeste1(){
    System.out.println("\033[1;31m--------------------------");
    System.out.println("Vamos falar um pouco sobre \n \033[1;34m     IDADE MÉDIA \n\033[1;31m-------------------------- \n\033[1;37mA Idade Média é o período da história geral que se inicia no século V, logo após a queda do Império Romano do Ocidente, e termina no século XV. A Igreja Católica tornou-se uma instituição poderosa e influente não apenas na religião, mas também na sociedade medieval. \n\nComo a Idade Média é um período extenso da história geral, convencionou-se dividi-la em dois momentos:\n*Alta Idade Média (séc. V ao século X)\n*Baixa Idade Média (séc. X ao século XV) \033[0m");
}

public void historiaTeste2(){
    System.out.println("\033[1;31m--------------------------");
    System.out.println("Vamos falar um pouco sobre \n \033[1;34m      FEUDALISMO \n\033[1;31m-------------------------- \n\033[1;37mO feudalismo é uma das principais características da Idade Média. Trata-se de um sistema social, econômico e político que vigorou por todo período medieval. Nesse sistema, terras eram concedidas por um suserano ao seu vassalo em troca de fidelidade e ajuda militar. Os senhores feudais controlavam os feudos, e a mão de obra era servil. Os servos deveriam pagar impostos e trabalhar para os senhores e o clero.\nA atividade econômica feudal era a agricultura, e a produção atendia as demandas internas do feudo. A Igreja Católica exercia grande influência dentro dos feudos, onde aconteciam as cerimônias religiosas e os registros de nascimento, casamento e morte. O feudalismo entrou em crise no século XIV, logo após as revoltas servis. \033[0m");
}

public void historiaSites(){
    System.out.println("\033[1;31m--------------------");
    System.out.println("       SITES");
    System.out.println("--------------------");    
    System.out.println("\033[1;37mAqui você pode encontrar sites que podem te ajudar em suas pesquisas! \n www.sohistoria.com.br \n www.historialivre.com \n www.historiadobrasil.net \033[0m");
}

public void historiaDicas(){
    System.out.println("\033[1;33m-------------------------------- ");
    System.out.println("Bem-vindo as dicas de HISTÓRIA!");
    System.out.println("-------------------------------- \033[0m");}

//MATEMÁTICA

public void matematica(){
    System.out.println("\033[1;33m--------------------");
    System.out.println("Selecione uma opção: \n-------------------- \033[0m \n \033[1;32m 1 - Polígonos \n  2 - Números Primos \033[0m \n \033[1;36m 3 - Sites \033[0m \n \033[1;35m 4 - Dicas \033[0m ");
}

public void matematicaTeste1(){
    System.out.println("\033[1;32m--------------------------");
    System.out.println("Vamos falar um pouco sobre \n \033[1;36m       POLÍGONOS \n\033[1;32m-------------------------- \n\033[1;37mOs polígonos são figuras geométricas planas formadas pela união de segmentos de reta e a área representa a medida de sua superfície.\nPara realizar o cálculo da área dos polígonos são necessários alguns dados.\nQuadrado: L² ou L . L\nRetângulo: L . l\nParalelogramo: b . h\nTrapézio: (B + b) . h / 2\nLosango: D . d / 2\nTriângulo: b . h / 2  \033[0m");
}

public void matematicaTeste2(){
    System.out.println("\033[1;32m--------------------------");
    System.out.println("Vamos falar um pouco sobre \n \033[1;36m     NÚMEROS PRIMOS \n\033[1;32m-------------------------- \n\033[1;37mOs números primos são aqueles que apresentam apenas dois divisores: um e o próprio número. Eles fazem parte do conjunto dos números naturais.\n\nO número 1 não é um número primo, pois só é divisível por ele mesmo;\nO número 2 é o menor número primo e também o único que é par;\nO número 5 é o único número primo terminado em 5;\nOs demais números primos são ímpares e terminam com os algarismos 1, 3, 7 e 9. \033[0m");
}

public void matematicaSites(){
    System.out.println("\033[1;31m--------------------");
    System.out.println("       SITES");
    System.out.println("--------------------");    
    System.out.println("\033[1;37mAqui você pode encontrar sites que podem te ajudar em suas pesquisas! \n pt.khanacademy.org \n www.obm.org.br/opencms/ \n calculemais.com.br\033[0m");
}

public void matematicaDicas(){
    System.out.println("\033[1;33m-------------------------------- ");
    System.out.println("Bem-vindo as dicas de MATEMÁTICA!");
    System.out.println("-------------------------------- \033[0m");
}

//LÍNGUA PORTUGUESA

public void linguaPortuguesa(){
    System.out.println("\033[1;34m--------------------");
    System.out.println("Selecione uma opção: \n -------------------- \n \033[1;35m 1 - Pontuação \n  2 - Expressões \033[0m \n \033[1;36m 3 - Sites \033[0m \n \033[1;31m 4 - Dicas \033[0m ");
}

public void lpTeste1(){
    System.out.println("\033[1;35m--------------------------");
    System.out.println("Vamos falar um pouco sobre \n \033[1;36m       PONTUAÇÃO \n\033[1;35m-------------------------- \n\033[1;37m-Vírgula:\n*Utilizada sempre antes de conjunções adversativas (mas; todavia; entretanto; etc) e conclusivas (logo; portanto; etc).\n*Utilizada na listagem de dois, ou mais elementos, como por exemplo: 'um, dois, três...'\n\n-Ponto Final:\n*Utilizado em todo final de frase.\n'Ontem eu fui à praia.'\n\n-Ponto de Interrogação:\n*Utilizado em caso de pergunta.\n'Quantos anos você tem?'\n\n-Ponto de exclamação:\n*Indica principalmente admiração, alegria, surpresa e espanto.\n'Esse desenho ficou lindo!'\n\n-Reticências\n*Indica suspensão ou interrupção da fala ou pensamento.\n'Não sei se aceito o convite... Quero ir, mas não me parece correto.' \033[0m");
}

public void lpTeste2(){
    System.out.println("\033[1;35m--------------------------");
    System.out.println("Vamos falar um pouco sobre \n \033[1;36m       EXPRESSÕES \n\033[1;35m-------------------------- \n\033[1;37m*Traz e Trás\n-'Traz' está relacionado ao verbo trazer, indica uma ação ou ordem.\n'Traz um copo d'água para mim.'\n-'Trás' é um advérbio de lugar.\n'Ele olhou para trás e viu sua mãe.'\n\n*'Em vez' e 'ao invés'\n-'Em vez' tem ideia de 'no lugar de'.\n'Vou querer água em vez de refrigerante.'\n-'Ao invés' tem ideia de 'ao contrário de'.\n'O carro diminuiu a velocidade ao invés de acelerar'\n\n*'Demais' ou 'de mais'\n-'Demais' está relacionado à intensidade.\n'Ele foi multado, pois estava dirigindo rápido demais.'\n-'De mais' está relacionado à quantidade.\nFiz comida de mais, vou precisar congelar. \033[0m");
}

public void lpSites(){
    System.out.println("\033[1;35m--------------------");
    System.out.println("       SITES");
    System.out.println("--------------------");    
    System.out.println("\033[1;37mAqui você pode encontrar sites que podem te ajudar em suas pesquisas! \n www.todamateria.com.br/lingua-portuguesa/\n gramaticaonline.com.br\n www.soportugues.com.br \033[0m");
}

public void lpDicas(){
    System.out.println("\033[1;33m-------------------------------------- ");
    System.out.println("Bem-vindo as dicas de LÍNGUA PORTUGUESA!");
    System.out.println("-------------------------------------- \033[0m");
}

//DICAS MATEMÁTICA

public void dicaMat1(){
    System.out.println("\033[0;32m------------------");
    System.out.println("      TEORIA      ");
    System.out.println("------------------\033[0m");
    System.out.println("\033[1;37mA teoria é muito importante pra toda a área de exatas, portanto, uma parte dos estudos deve ser reservado para leitura e compreensão do conteúdo\033[0m");
}

public void dicaMat2(){
    System.out.println("\033[0;31m------------------");
    System.out.println("     TREINO    ");
    System.out.println("------------------\033[0m");
    System.out.println("\033[1;37mApenas aplicar a teoria não é muito efetivo, visto que aprendemos muito mais resolvendo e interpretando os exercícios. Resolver exercícios de racicíneo lógico diariamente ajuda a exercitar o cérebro e ajuda na capacidade de resolver problemas.\033[0m");
}

public void dicaMat3(){
    System.out.println("\033[0;36m-----------------");
    System.out.println("    DÚVIDAS   ");
    System.out.println("-----------------\033[0m");
    System.out.println("\033[1;37mNa matemática, todo tipo de conhecimento é importante, então qualquer tipo de dúvida que surja durante a resolução de uma questão deve ser sanada, por mais básica que seja.\033[0m");
}

//DICAS LÍNGUA PORTUGUESA

public void dicaLp1(){
    System.out.println("\033[0;32m------------------");
    System.out.println("    APLICATIVOS      ");
    System.out.println("------------------\033[0m");
    System.out.println("\033[1;37mA tecnologia está presente nos dias atuais para nos auxiliar. Existem alguns aplicativos que podem ajudar nos estudos de LP, sendo eles, Acentuando, Quiz de Português, Verbos Portugueses, Gramática de bolso, Entendendo o Português.\033[0m");
}

public void dicaLp2(){
    System.out.println("\033[0;31m------------------");
    System.out.println("      LER     ");
    System.out.println("------------------\033[0m");
    System.out.println("\033[1;37mLer faz toda a diferença para qualquer pessoa, seus benefícios influenciam na carreira, vida profissional e pessoal. Criar o hábito de ler tudo sobre tudo, seja um livro ou uma notícia, é interessante para quem deseja estudar Língua Portuguesa.\033[0m");
}

public void dicaLp3(){
    System.out.println("\033[0;36m-----------------");
    System.out.println("    REDAÇÃO   ");
    System.out.println("-----------------\033[0m");
    System.out.println("\033[1;37mAlém de ser um parâmetro para julgar se uma pessoa consegue escrever sobre determinado assunto de forma concisa, é uma forma da pessoa conseguir se julgar para ver se tem vocabulário e conhecimento o suficiente para conseguir se expressar.\033[0m");
}

//DICAS GEOGRAFIA

public void dicaGeo1(){
    System.out.println("\033[0;32m------------------");
    System.out.println("      MAPAS        ");
    System.out.println("------------------\033[0m");
    System.out.println("\033[1;37mPara estudar geografia, é necessário se atentar aos mapas. Entender onde e como são os biomas, domínios morfoclimáticos, relevos, etc... é extremamente importante!\033[0m");
}

public void dicaGeo2(){
    System.out.println("\033[0;31m------------------");
    System.out.println("   LEIA NOTÍCIAS  ");
    System.out.println("------------------\033[0m");
    System.out.println("\033[1;37mÉ interessante ler notícias para se manter informado sobre o mundo. Muitos consideram a geopolítica um dos temas mais interessantes para se debater, portanto, ler matérias, notícias, reportagens, é ótimo para se interar no assunto.\033[0m");
}

public void dicaGeo3(){
    System.out.println("\033[0;36m------------------");
    System.out.println("    ORGANIZAÇÃO   ");
    System.out.println("------------------\033[0m");
    System.out.println("\033[1;37mExistem muito assuntos para estudar em geografia, demografia, energia, cartografia, geopolítica, impactos ambientais, etc... Por isso é necessário ter uma boa organização e um planejamento prévio para conseguir aproveitar cada vez melhor seu tempo!\033[0m");
}

//DICAS HISTÓRIA

public void dicaHist1(){
    System.out.println("\033[0;32m------------------");
    System.out.println("     YOUTUBE        ");
    System.out.println("------------------\033[0m");
    System.out.println("\033[1;37mO YouTube é uma fonte infinita de vídeos sobre qualquer tipo de coisa, então fazer disso uma forma de estudar pode ser muito bom. Alguns canais que podem ajudar, Historizando, História e Tu, Débora Aladim, Descomplica, etc...\033[0m");
}

public void dicaHist2(){
    System.out.println("\033[0;31m------------------");
    System.out.println("      MÍDIA  ");
    System.out.println("------------------\033[0m");
    System.out.println("\033[1;37mAssistir vídeo aula ou ler sobre algum conteúdo pode ser bem chato para algumas pessoas, pode ser uma boa alternativa ver filmes, documentários, séries e jogos em seu tempo livre.\033[0m");
}

public void dicaHist3(){
    System.out.println("\033[0;36m------------------");
    System.out.println("     RESUMO   ");
    System.out.println("------------------\033[0m");
    System.out.println("\033[1;37mMelhor do que ler ou ver algum vídeo sobre determinado assunto, é escrever o que você já sabe, com isso, podendo ver os aspectos em que você pode melhorar e aprofundar.\033[0m");
}

}