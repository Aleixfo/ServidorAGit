package com.company;

//Paquet que conte la classe JFrame

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//http://web.mit.edu/6.005/www/sp14/psets/ps4/java-6-tutorial/components.html (PAGINA PER VEURE ELS COMPONENTS VISUALMENT)

//Classe que fa apareixer l¡interfaz grafica (finestra)
public class Videoteca extends JFrame {

    private JButton cercarPelicula;
    private JPanel mainPanel;
    private JButton actualitzarPelicula;
    private JButton crearPelicula;
    private JButton borrarPelicula;
    private JButton llistarTotesPelicules;
    private JTextField titolField;
    private JTextField anyField;
    private JTextField directorField;
    private JTextField genereField;
    private JTable table1;
    private JTextField idField;
    private JScrollBar scrollBar1;

    private final CRUDPelicula peli = new CRUDPelicula();

    public Videoteca() throws Exception {

        //Botons
        llistarTotesPelicules.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DefaultTableModel tmodel = new DefaultTableModel();
                tmodel.addColumn("id");
                tmodel.addColumn("titol");
                tmodel.addColumn("any");
                tmodel.addColumn("director");
                tmodel.addColumn("genere");

                table1.setModel(tmodel);
                try {
                    ArrayList<Pelicula> pelis = peli.readAll();

                    for (Pelicula pelicula : pelis) {

                        tmodel.addRow(new Object[]{pelicula.getId(), pelicula.getTitol(), pelicula.getAny(), pelicula.getDirector(), pelicula.getGenere()});

                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        borrarPelicula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    peli.delete(Integer.parseInt(idField.getText()));

                    llistarTot();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        crearPelicula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    peli.create(
                            titolField.getText(),
                            anyField.getText(),
                            directorField.getText(),
                            genereField.getText()
                    );

                    llistarTot();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        actualitzarPelicula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    peli.update(

                            Integer.parseInt(idField.getText()),
                            titolField.getText(),
                            anyField.getText(),
                            directorField.getText(),
                            genereField.getText()
                    );

                    llistarTot();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        cercarPelicula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DefaultTableModel tmodel = new DefaultTableModel();
                tmodel.addColumn("id");
                tmodel.addColumn("titol");
                tmodel.addColumn("any");
                tmodel.addColumn("director");
                tmodel.addColumn("genere");

                table1.setModel(tmodel);

                try {

                    Pelicula pelicula = peli.read(Integer.parseInt(idField.getText()));

                    tmodel.addRow(new Object[]{pelicula.getId(), pelicula.getTitol(), pelicula.getAny(), pelicula.getDirector(), pelicula.getGenere()});

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

    }//Fi constructor VideoTeca

    private void createUIComponents() {

        //Linia importantissima per que ens apareguin els elements/components
        this.mainPanel = new JPanel();
        setContentPane(mainPanel);

        //Per posicionar el programa centrat a la pantalla utilitzam toolkit i dimension
        //Enmagatzema el nostre sistema natiu de finestres
        Toolkit screen = Toolkit.getDefaultToolkit();
        //Obte el temany de la pantalla, retorna objecte de tipo Dimension
        //screenSize enmagatzema tipo (1900x1080)
        Dimension screenSize = screen.getScreenSize();

        //int alturaPantalla = screenSize.height;
        int anchuraPantalla = screenSize.width;

        //Permet redimensionar la finestra (true) o no (false)
        this.setResizable(false);
        //setExtendedState(Frame.MAXIMIZED_BOTH) -> Fa que el frame s¡obri a pantalla completa
        //setExtendedState(Frame.MAXIMIZED_BOTH);

        //SetLocation(x, y) -> Estableix la posicio que apareix la finestra a la pantalla
        //setLocation(700, 20);
        //setSize(w, h) -> Estableix l'ample i l'altura de la finestra
        //setSize(600, 1000);
        //setBounds(x, y, w, h) -> Els dos metodes anterior combinats
        this.setBounds(anchuraPantalla/3, 30, 600, 700 );

        //Fa la finestra visible
        this.setVisible(true);
        //Fa que el programa s¡aturi quan es tanca la finestra
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //setTitle(String title) -> Canvia el titol del programa
        this.setTitle("VideoTeca");

        //Canvia l'icone del programa (jpg, gif i png)
        Image icono = screen.getImage("icono.png");
        //setIconImage(Image image) -> Canvia l'icona del programa
        this.setIconImage(icono);

    }

    //Extraccio de metode
    public void llistarTot() throws Exception {

        DefaultTableModel tmodel = new DefaultTableModel();
        tmodel.addColumn("id");
        tmodel.addColumn("titol");
        tmodel.addColumn("any");
        tmodel.addColumn("director");
        tmodel.addColumn("genere");

        table1.setModel(tmodel);

        ArrayList<Pelicula> pelis = peli.readAll();

        for (Pelicula pelicula : pelis) {

            tmodel.addRow(new Object[]{pelicula.getId(), pelicula.getTitol(), pelicula.getAny(), pelicula.getDirector(), pelicula.getGenere()});

        }
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    private void $$$setupUI$$$() {
        final JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
    }






}
