package adapter2;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientTableModelAdapter extends AbstractTableModel {
	  protected Covid19Pacient pacient;
	  protected String[] columnNames =
	    new String[] {"Symptom", "Weight" };
	  protected List<Covid19Pacient> pacients;

	  public Covid19PacientTableModelAdapter(Covid19Pacient p) {
	    this.pacient=p;
	  }

	  public int getColumnCount() {
	    // Challenge!
		 return 2;
	  }

	  public String getColumnName(int i) {
	    // Challenge!
		  return columnNames[i];
	  }

	  public int getRowCount() {
	    // Challenge!
		  int suma = 0;
          for(Covid19Pacient p : pacients)
              suma += p.getSymptoms().size();
          return suma;
	  }

	  public Object getValueAt(int row, int col) {
	
		  int currentRow = 0;
          for (Covid19Pacient p : pacients) {
              for (Symptom s : p.getSymptoms()) {
                  if (currentRow == row) {
                      switch (col) {
                          case 0:
                              return s.getName();
                          case 1:
                              return p.getWeight(s);
                      }
                  }
                  currentRow++;
              }
          }
          return null;
	 
	    }
	  
	}
