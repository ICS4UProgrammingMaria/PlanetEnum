/*
 * Created by: Maria Temu
 * Created on: 2-March-2020
 * Created for: ICS4U
 * Day #14 (Planet Enumeration)
 * This program tells you which planetNumber planet you
 * will go to
 */
package planetEnumeration;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class planetEnumeration {
    private JComboBox cmbPlanets;
    private JButton btnClickHere;
    private JPanel Jpanel;

    public static void main(String[] args) {
        JFrame panel = new JFrame("planetEnumeration");
        panel.setContentPane(new planetEnumeration().Jpanel);
        panel.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel.pack();
        panel.setVisible(true);

    }

    //enumeration
    public enum planets {

        //Planets
        MERCURY(1, "Mercury"),
        VENUS(2, "Venus"),
        EARTH(3, "Earth"),
        MARS(4, "Mars"),
        JUPITER(5, "Jupiter"),
        SATURN(6, "Saturn"),
        URANUS(7, "Uranus"),
        NEPTUNE(8, "Neptune");

        private int planetNumber;
        private String planetName;

        // Constructor sets variables
        planets(int planetNumber, String planetName) {
            this.planetNumber = planetNumber;
            this.planetName = planetName;
        }

        // Returns the planetNumber and planetName
        String getPlanetName() {
            return planetName;
        }
        int getPlanetNumber() {
            return planetNumber;
        }

    }

    public planetEnumeration() {

        //Populate cmb
        for (planets nump : planets.values()) {
            cmbPlanets.addItem(nump);
        }

        btnClickHere.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                //Gets planet
                planets planet = (planets) cmbPlanets.getSelectedItem();
                //outputs planet and number
                JOptionPane.showMessageDialog(null,
                        String.format("You want to go to %s, " +
                                "which is planet #%d.", planet.getPlanetName(),
                                planet.getPlanetNumber()));
            }
        });
    }
}


