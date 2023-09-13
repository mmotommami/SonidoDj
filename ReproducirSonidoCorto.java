import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ReproducirSonidoCorto {

  public static void main(String[] args) {
    try {
      // Cargar el sonido desde un archivo en el directorio principal del proyecto
      Clip clip = AudioSystem.getClip();
      clip.open(AudioSystem.getAudioInputStream(ReproducirSonidoCorto.class.getResourceAsStream("/mi_sonido.wav")));

      // Reproducir el sonido
      clip.start();

      // Esperar hasta que termine la reproducción
      Thread.sleep(clip.getMicrosecondLength() / 1000);

      // Cerrar el Clip después de la reproducción
      clip.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}