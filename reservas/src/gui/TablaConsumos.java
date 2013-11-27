/**
 * 
 */
package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

/**
 * @author Jhamir
 *
 */
public class TablaConsumos extends JPanel{
	
	private JScrollPane scrollPane;

	private JTable tablaConsumos;
	
	private JLabel lblTotal;
	
	private JTextField txtTotal;
	
	private DefaultTableModel dtm;
	/**
	 * 
	 */
	public TablaConsumos() {
		this.setName("tabla_consumos");
		this.setBorder(new TitledBorder("Lista de Consumos"));
		this.setLayout(null);			
		
		dtm = new DefaultTableModel(new String[]{"Nombre", "Valor", "Cantidad"}, 30){
		    @Override
		    public boolean isCellEditable(int row, int column) {
		       return false;
		    }
		};
		
		tablaConsumos = new JTable(dtm);		
				
		scrollPane = new JScrollPane(tablaConsumos);
		scrollPane.setBounds(10, 20, 360, 125);
		
		lblTotal = new JLabel("Total Recaudado");
		lblTotal.setBounds(100, 150, 130, 25);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(240, 150, 130, 25);
		
		this.add(scrollPane);		
		this.add(lblTotal);
		this.add(txtTotal);
	}
	
	/**
	 * retorna el valor total recaudado
	 * @return
	 */
	public double getTotal() {
		return Double.parseDouble(txtTotal.getText());
	}
	
	/**
	 * establece los nombres de los campos y la cantidad de registros que se van a ingresar
	 * @param campos
	 * @param numeroRegistros
	 */
	public void setDtm(String[] campos, int numeroRegistros) {
		dtm = new DefaultTableModel(campos, numeroRegistros){
		    @Override
		    public boolean isCellEditable(int row, int column) {
		       return false;
		    }
		};
		
		tablaConsumos = new JTable(dtm);
		this.add(tablaConsumos);
	}
	
	/**
	 * agrega un registro a la tabla
	 * @param registro
	 */
	public void agregarRegistro(String[] registro){
		dtm.addRow(registro);
	}
}
