/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Habitacion[] habitaciones = new Habitacion[]{
            new Habitacion("h001", 1, "regular"),
            new Habitacion("h002", 1, "vip"),
            new Habitacion("h003", 2, "regular"),
            new Habitacion("h004", 2, "vip")
        };

        Medico[] medico = new Medico[]{
            new Medico("m01", "Dra. Polo", 25, 'f', "pediatria", "01"),
            new Medico("m02", "Dr. House", 25, 'm', "cirujano", "01"),
            new Medico("m03", "Dr. Strange", 25, 'm', "oncologo", "01"),
            new Medico("m04", "Dr. Ácula", 25, 'm', "oncologo", "01"),
        };

        Administrativo[] administrativo = new Administrativo[]{
            new Administrativo("a01", "admin1", 25, 'm', "01"),
            new Administrativo("a02", "admin1", 25, 'm', "02"),
            new Administrativo("a03", "admin1", 25, 'm', "03"),};

        ArrayList<Paciente> pacientes = new ArrayList<Paciente>();

        pacientes.add(new Paciente("p01", "paciente1", 25, 'm', medico[0], habitaciones[0], LocalDateTime.of(2020, Month.DECEMBER, 24, 11, 59)));
        pacientes.add(new Paciente("p02", "paciente2", 20, 'f', medico[1], habitaciones[1], LocalDateTime.of(2021, Month.JANUARY, 24, 11, 59)));
        habitaciones[0].setearPaciente(pacientes.get(0));
        habitaciones[1].setearPaciente(pacientes.get(1));

        Login login = new Login(medico, administrativo, pacientes, habitaciones);
        login.setSize(700, 800);
        login.setVisible(true);
        //login.setExtendedState(login.MAXIMIZED_BOTH);

    }

}
