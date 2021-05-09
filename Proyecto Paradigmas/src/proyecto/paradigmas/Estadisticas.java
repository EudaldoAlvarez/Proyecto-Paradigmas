package proyecto.paradigmas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author eudal
 */
public class Estadisticas {

    public String estadisticas(String sexo, double imc) {
        if (sexo == "M") {
            if (imc <=16) {
                return desnutricion();
            }else{
                if (imc>16 && imc<=20) {
                    return bajoPeso();
                }else{
                    if(imc>20 && imc<=24){
                        return normal();
                    }else{
                        if (imc>24 && imc<=29) {
                            return sobrePeso();
                        }else{
                            if (imc>29 && imc<=34) {
                                return obesidad();
                            }else{
                                if (imc>34 && imc<=39) {
                                    return obesidadMarcada();
                                }else{
                                    if (imc>39) {
                                      return obesidadMorbida();  
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }else{
            if (imc <=17) {
                return desnutricion();
            }else{
                if (imc>17 && imc<=20) {
                    return bajoPeso();
                }else{
                    if(imc>20 && imc<=25){
                        return normal();
                    }else{
                        if (imc>25 && imc<=30) {
                            return sobrePeso();
                        }else{
                            if (imc>30 && imc<=35) {
                                return obesidad();
                            }else{
                                if (imc>35 && imc<=40) {
                                    return obesidadMarcada();
                                }else{
                                    if (imc>40) {
                                      return obesidadMorbida();  
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return "";
    }

    private String desnutricion() {
        return "Desnutrición";
    }
    private String bajoPeso(){
        return "Bajo Peso";
    }
    private String normal(){
        return"Normal";
    }
    private String sobrePeso(){
        return"Sobre Peso";
    }
    private String obesidad(){
        return"Obesidad";
    }
    private String obesidadMarcada(){
        return"Obesidad Marcada";
    }
    private String obesidadMorbida(){
        return"Obesidad Mórbida";
    }

}
