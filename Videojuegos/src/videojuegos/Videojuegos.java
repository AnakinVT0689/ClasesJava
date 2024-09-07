package videojuegos;

import java.util.ArrayList;
import java.util.List;
import videojuegos.logica.VideoJuego;

public class Videojuegos {

    public static void main(String[] args) {
        
        List<VideoJuego> listaVideoJuegos = new ArrayList<VideoJuego>();
        
        VideoJuego video1 = new VideoJuego(123, "Banjo Kazooie", "Nintendo 64", 4 , "Plataforma");
        VideoJuego video2 = new VideoJuego(456, "Mario Party 3", "Nintendo 64", 4 , "Plataforma");
        VideoJuego video3 = new VideoJuego(789, "Age of Empire II", "PC", 1, "Estrategia");
        VideoJuego video4 = new VideoJuego(101, "Couter Strike 1.6", "PC", 1, "Shooter");
        VideoJuego video5 = new VideoJuego(100, "Mario Kart 64", "Nintendo 64", 2, "Plataforma");
        
        
        listaVideoJuegos.add(video1);
        listaVideoJuegos.add(video2);
        listaVideoJuegos.add(video3);
        listaVideoJuegos.add(video4);
        listaVideoJuegos.add(video5);
        
        //Punto 3 - recorrido
        for(VideoJuego video : listaVideoJuegos){
            System.out.println("Titulo: " + video.getTitulo() + " Consola: " + video.getConsola() + " Cantidad Jugadores: " + video.getCantidadJugadores());
        }
        System.out.println("----------------------------------");
        
        //Punto 4 - Cambio de Nombre y Jugadores
        video1.setTitulo("Banjo Kazooie II");
        video1.setCantidadJugadores(1);
        
        video5.setTitulo("Super Mario Kart 64");
        video5.setCantidadJugadores(4);
        
        //Punto 5 - Motrar solo los videojuegos de Nintento 64
         for(VideoJuego video : listaVideoJuegos){
            if (video.getConsola().equals("Nintendo 64")){
                
                System.out.println(video.toString());
            
            }
        }
        
        
    }
    
}
