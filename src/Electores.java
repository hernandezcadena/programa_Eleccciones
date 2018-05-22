import java.sql.*;
import conexion.conexion;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;
public class Electores extends ElectoresApp.ElectoresPOA {
    
   private ORB orb;
    conexion conex = new conexion();
    
    @Override
    public boolean insertarElectores(int EL_ID, String EL_NOMBRE, String EL_CANDIDATO,  String EL_PARTIDO) {
      boolean resultado=false;
        try {
            
            String query ="insert into Electores(EL_ID, EL_NOMBRE,EL_CANDIDATO,EL_PARTIDO)"
            + "value('"+ EL_ID+"','"+EL_NOMBRE+"','"+EL_CANDIDATO+"','"+EL_PARTIDO+"')";
            conex.conexion();
            Statement st = conex.conex.createStatement();
            int valor =st.executeUpdate(query);
            if (valor >0){
                resultado=true;
                JOptionPane.showMessageDialog(null, "datos insertados correctamente");
            }
            st.close();
            conex.conex.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error"+e.getMessage());
        }
      return resultado;
    }

    @Override
    public String consultarElectores(int EL_ID, String EL_NOMBRE, String EL_CANDIDATO,  String EL_PARTIDO) {
       String resultado ="";
        
        try {
            String query="Select * from electores WHERE CL_ID="+EL_ID;
            conex.conexion();
            Statement st = conex.conex.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                resultado += rs.getLong(1)+ " - " 
                        + rs.getString(2)+ " - "
                        + rs.getString(3)+ " - "
                        + rs.getString(5)+ "\n";
            }
            st.close();
            rs.close();
            conex.conex.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ocurrio un error"+e.getMessage());
        }
        return resultado;
    
    }

   

  

    @Override
    public String listarElectores() {
        String resultado ="";
        
        try {
            String query="Select * from electores";
            conex.conexion();
            Statement st = conex.conex.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                resultado += rs.getLong(1)+ " - " 
                        + rs.getString(2)+ " - "
                        + rs.getString(3)+ " - "
                        + rs.getString(4)+ "\n";
            }
            st.close();
            rs.close();
            conex.conex.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ocurrio un error"+e.getMessage());
        }
        return resultado;
    }

    @Override
    public boolean eliminarElectores(int EL_ID, String EL_NOMBRE, String EL_CANDIDATO, String EL_PARTIDO) {
        boolean resultado=false;
        try {  
        String query ="delete from electores where EL_ID = "+ EL_ID;
        conex.conexion();
            Statement st = conex.conex.createStatement();
            int valor =st.executeUpdate(query);
            if (valor >0){
                resultado=true;
                JOptionPane.showMessageDialog(null, "datos eliminado correctamente");
            }
            st.close();
            conex.conex.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error"+e.getMessage());
        }
      return resultado;
    }

    @Override
    public boolean actualizarElectores(int EL_ID, String EL_NOMBRE, String EL_CANDIDATO, String EL_PARTIDO) {
        boolean resultado=false;
        try {
        String query ="update electores set El_NOMBRE = '"+EL_NOMBRE+"',EL_CANDIDATO= '"+EL_CANDIDATO+"',EL_PARTIDO= '"+EL_PARTIDO+ "' where EL_ID='"+EL_ID+"'";
         conex.conexion();
            Statement st = conex.conex.createStatement();
            int valor =st.executeUpdate(query);
            if (valor >0){
                resultado=true;
                JOptionPane.showMessageDialog(null, "datos insertados correctamente");
            }
            st.close();
            conex.conex.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error"+e.getMessage());
        }
      return resultado;
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

}
