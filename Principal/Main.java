/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Controlador.ListarModeloDB;
import Modelo.Conexion;
import Vistas.*;
import Modelo.*;



public class Main {
    
    public static void main(String[] args){
        //Llamar la clase conexion para conectarse a la BD
    Conexion conexionDB = new Conexion();
    conexionDB.getConnection();
    ListarModeloDB listas = new ListarModeloDB();
    listas.getListaGerentes();
    listas.getListaOperarios();
    listas.getListaDomiciliarios();            
    Login login = new Login();
        //setVisible hacemos visible la interfaz cuando ejecutamos la aplicacion
    login.setVisible(true);
    
    }
    
}
