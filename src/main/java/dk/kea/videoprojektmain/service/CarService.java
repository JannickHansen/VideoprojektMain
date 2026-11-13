package dk.kea.videoprojektmain.service;

import org.springframework.stereotype.Service;

@Service
public class CarService {

    public String getImg (String brand, String colour) {

        String img = null;

        if (brand.contains("Volvo")) {
            img = "blaavolvostationcar.jpg";
        } else if (brand.contains("VW")){
            if (colour.contains("grøn") || colour.contains("green")) {
                img = "GroenVWpolo.jpg";
            } else {
                img = "GulVWBobbel.jpg";
            }
        } else if (brand.contains("Western Star")) {
            img = "WSRT.jpg";
        } else {
            img = "generic.jpg";
        }
        return img;
    }

}
