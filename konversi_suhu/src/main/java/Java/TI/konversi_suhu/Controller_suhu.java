/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.TI.konversi_suhu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author DELL
 */
@Controller
@ResponseBody
public class Controller_suhu {
    
    @RequestMapping("/suhu")
    public String suhu (){
    
        double celcius = 15.0;
        double suhu_k;
        double suhu_f;
        double suhu_r;
            
        suhu_k = celcius + 273.15;
        suhu_f = (celcius * 9 / 5) + 32;
        suhu_r = celcius * 4 / 5;
        
        String konversi = "Suhu "+celcius+" Celsius = "+suhu_k+" Kelvin"
                            +"<br>Suhu "+celcius+" Celsius = "+suhu_f+" Fahrenheit"
                            +"<br>Suhu "+celcius+" Celsius = "+suhu_r+" Reamur";
        
        return konversi;
    }
}
