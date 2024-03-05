import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class Test {
        @org.junit.jupiter.api.Test
	void shouldArrayIndexOutOfBoundsExceptionIsThrown() {
		CalcularDNI calcularDNI = new CalcularDNI();
		
		final int invalidResto = 23;
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
	        char actual = calcularDNI.encontrarLaLetra(invalidResto);
	    });
		
		
	}

}
