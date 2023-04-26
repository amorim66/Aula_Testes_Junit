import com.mycompany.projetoteste.Carro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CarroTeste {
    
    public void testeAcelerar(){
        Carro c1 = new Carro("Honda", "City", 2023, 20);
        c1.acelerar(10);
        c1.acelerar(10);
        c1.acelerar(10);
        c1.acelerar(10);
        assertEquals(40, c1.getVelocidade());
    }
    
    public void testeReduzir(){
        Carro c1 = new Carro("Honda", "City", 2023, 20);
        c1.acelerar(109);
        c1.reduzir();
        assertEquals(-1, c1.getVelocidade());
    }
    
    public void testeECarroNovo_AnoNovo(){
        Carro c1 = new Carro("Honda", "City", 2023, 20);
        c1.acelerar(100000);
        //assertEquals(true, c1.eCarroNovo());
        assertTrue(c1.eCarroNovo());
    }
    
    public void testeECarroNovo_BaixaKM(){
        Carro c1 = new Carro("Honda", "City", 2023, 20);
        c1.acelerar(1000);
        assertTrue(c1.eCarroNovo());
    }
    
    public void testeECarroVelho(){
        Carro c1 = new Carro("Honda", "City", 2010, 20);
        c1.acelerar(1000000);
        assertFalse(c1.eCarroNovo());
    }
    
    
    
}
