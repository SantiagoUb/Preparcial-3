import co.edu.uniquindio.poo.*;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.util.logging.Logger;

public class PuestoControlTest {

    private static  final Logger log = Logger.getLogger(PuestoControlTest.class.getName());
    Empresa empresaTest;
    PuestoControl puestoControl1;
    Conductor conductor1;
    Conductor conductor2;
    Camion camion1;
    Camion camion2;

    @BeforeEach
    void setUp() {

        empresaTest = new Empresa("Peajes SAS");
        puestoControl1 = new PuestoControl("Principal", "Quindio");
        conductor1 = new Conductor("CARLOS ANDRÉS", "RAMÍREZ", "987654321", LocalDate.of(1985, 7, 22));
        conductor2 = new Conductor("DIEGO", "FERNÁNDEZ", "5678", LocalDate.of(1992, 5, 3));
        camion1 = new Camion(12, 5, "14", 15);
        camion2 = new Camion(10, 6, "9", 20);


    }
}


