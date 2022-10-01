package ProjetoJavaSenai;

import java.util.Scanner;
import java.util.Random;

public class Objeto{

    public static void main(String[] args){
        Classe objs = new Classe();
        Classe p1 = new Classe();
        Scanner obj = new Scanner(System.in);
        Random aleatorio = new Random();

        Integer valor = aleatorio.nextInt(3) + 1;
        
        objs.terminal();
        Integer terminal = obj.nextInt();

        if(terminal == 1){
            objs.terminal1();
            Integer dificuldade = obj.nextInt();

            if (dificuldade == 1){
                p1.pergunta1();
                p1.pergunta2();
                p1.pergunta3();
                p1.pergunta4();
                p1.pergunta5();
                p1.pergunta6();
                p1.pergunta7();
                p1.pergunta8();
                p1.pergunta9();
                p1.pergunta10();
                p1.faceisresultado();
            }
            
            if (dificuldade == 2){
                p1.pergunta1d();
                p1.pergunta2d();
                p1.pergunta3d();
                p1.pergunta4d();
                p1.pergunta5d();
                p1.pergunta6d();
                p1.pergunta7d();
                p1.pergunta8d();
                p1.pergunta9d();
                p1.pergunta10d();
                p1.dificeisresultado();
            }
            
            if (dificuldade == 3)  
                System.exit(0);
        }
        
        if (terminal == 2){
            objs.terminal2();
            Integer materia = obj.nextInt();
            
            if (materia == 1){
                p1.matematica();
                Integer matematica = obj.nextInt();
                
                if (matematica.equals(1)){
                    p1.matematicaTeste1();  
                }
                
                if (matematica.equals(2)){
                    p1.matematicaTeste2();  
                }
                                
                if (matematica.equals(3)){
                    p1.matematicaSites();  
                }
                                                
                if (matematica.equals(4)){
                    p1.matematicaDicas(); 
                    
                    if (valor.equals(1)){
                        p1.dicaMat1();
                    }
                    if (valor.equals(2)){
                        p1.dicaMat2();
                    }
                    if (valor.equals(3)){
                        p1.dicaMat3();  
                    }
                }
            }
            
            if (materia == 2){
                p1.linguaPortuguesa();
                Integer linguaPortuguesa = obj.nextInt();
                
                if (linguaPortuguesa.equals(1)){
                    p1.lpTeste1();  
                }
                
                if (linguaPortuguesa.equals(2)){
                    p1.lpTeste2();  
                }
                                
                if (linguaPortuguesa.equals(3)){
                    p1.lpSites();  
                }
                                                
                if (linguaPortuguesa.equals(4)){
                    p1.lpDicas(); 
                             
                    if (valor.equals(1)){
                        p1.dicaLp1();
                    }
                    if (valor.equals(2)){
                        p1.dicaLp2();
                    }
                    if (valor.equals(3)){
                        p1.dicaLp3();  
                    }
                }
            }
            
            if (materia == 3){
                p1.geografia();
                Integer geografia = obj.nextInt();
                
                if (geografia.equals(1)){
                    p1.geografiaTeste1();
                }
                
                if (geografia.equals(2)){
                    p1.geografiaTeste2();
                }
                                
                if (geografia.equals(3)){
                    p1.geografiaSites();
                }
                                                
                if (geografia.equals(4)){
                    p1.geografiaDicas();
                                        
                    if (valor.equals(1)){
                        p1.dicaGeo1();
                    }
                    if (valor.equals(2)){
                        p1.dicaGeo2();
                    }
                    if (valor.equals(3)){
                        p1.dicaGeo3();  
                    }
                }
            }

            if (materia == 4){
                p1.historia();
                Integer historia = obj.nextInt();
                
                if (historia.equals(1)){
                    p1.historiaTeste1();
                }
                
                if (historia.equals(2)){
                    p1.historiaTeste2();
                }
                                
                if (historia.equals(3)){
                    p1.historiaSites();
                }
                                                
                if (historia.equals(4)){
                    p1.historiaDicas();
                                        
                    if (valor.equals(1)){
                        p1.dicaHist1();
                    }
                    if (valor.equals(2)){
                        p1.dicaHist2();
                    }
                    if (valor.equals(3)){
                        p1.dicaHist3();  
                    }
                }
            }            
        }
                
                
        if (terminal == 3){
            System.exit(0);
        }
        obj.close();
    }
}
