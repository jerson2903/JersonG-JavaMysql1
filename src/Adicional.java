
import java.awt.Color;
import java.awt.Component;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jerso
 */
public final class Adicional {
    public static String PATRON_FECHA_MYSQL = "YYYY-MM-dd";
    public static String PATRON_BS = "###.###,##" ;
    
    public static String aFechaMySQL(Date date){
        String fecha;
        SimpleDateFormat sdf = new SimpleDateFormat(PATRON_FECHA_MYSQL);
        fecha = sdf.format(date);
        
        return fecha;
    }
    
        public static String formatoBS(double valor){
        DecimalFormat formateador = new DecimalFormat();
        String res = "BS" + formateador.format(valor);

        return res;
    }
        
    public static void informar(Component c, String mensaje, String titulo){
        JOptionPane.showMessageDialog(c, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void advertir(Component c, String mensaje, String titulo){
        JOptionPane.showMessageDialog(c, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static String capturar(Component c, String mensaje, String titulo){
        String datos = JOptionPane.showInputDialog(c, mensaje, titulo, JOptionPane.QUESTION_MESSAGE);
        if( datos == null ){
            datos = "";
        }
        return datos;
    }

    public static boolean confirmar(Component c, String mensaje, String titulo){
        int respuesta = JOptionPane.showConfirmDialog(c, mensaje, titulo, JOptionPane.YES_NO_OPTION);
        if( respuesta == JOptionPane.YES_OPTION){
            return true;
        } else {
            return false;
        }
    }    

    private static int hex( String color_hex ) {
        return Integer.parseInt(color_hex, 16);
    }
    
    public static Color COLOR_ENFOQUE = new  Color( hex("CCFFCC"));
    public static Color COLOR_SINENFOQUE = Color.WHITE;
    
}
