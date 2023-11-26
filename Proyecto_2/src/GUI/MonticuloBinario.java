/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author Gustavo
 */
import com.mxgraph.layout.mxCompactTreeLayout;
import com.mxgraph.layout.mxIGraphLayout;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import EDD.*;
import javaapplication7.*;
import javax.swing.*;
import java.awt.*;

public class MonticuloBinario extends JPanel {

    private Documento[] elementos;

     public MonticuloBinario(Heap heap) {
         elementos = heap.getHeap();
        if(elementos[0]!=null){
            String[] aux = new String[elementos.length];
            for (int i = 0; i < aux.length; i++) {
                if (elementos[i]!=null){
                    aux[i] = elementos[i].getNombre();
                }
            }
            
            setLayout(new BorderLayout()); // Utilizar un BorderLayout para el panel

            mxGraph graph = new mxGraph();
            Object parent = graph.getDefaultParent();

            // Crear los nodos del montículo
            Object[] nodos = new Object[aux.length];
            for (int i = 0; i < aux.length; i++) {
                nodos[i] = graph.insertVertex(parent, null, aux[i], 0, 0, 50, 50);
            }

            // Conectar los nodos del montículo
            for (int i = 0; i < nodos.length; i++) {
                int hijoIzquierdo = 2 * i + 1;
                int hijoDerecho = 2 * i + 2;
                if (hijoIzquierdo < nodos.length) {
                    graph.insertEdge(parent, null, null, nodos[i], nodos[hijoIzquierdo]);
                }
                if (hijoDerecho < nodos.length) {
                    graph.insertEdge(parent, null, null, nodos[i], nodos[hijoDerecho]);
                }
            }

            // Ajustar el layout del grafo
            mxIGraphLayout layout = new mxCompactTreeLayout(graph, false);
            layout.execute(parent);

            mxGraphComponent graphComponent = new mxGraphComponent(graph);
            graphComponent.setEnabled(false);

            add(graphComponent, BorderLayout.CENTER); // Agregar el mxGraphComponent al panel
        }
        
        
    }
     
//    JPanel panel = new JPanel(new GridBagLayout());
//    GridBagConstraints gbc = new GridBagConstraints();
//    gbc.gridx = 0;
//    gbc.gridy = 0;
//    gbc.weightx = 1.0;
//    gbc.weighty = 1.0;
//    gbc.fill = GridBagConstraints.CENTER;
//    panel.add(graphComponent, gbc);
//
//    add(panel, BorderLayout.CENTER); // Agregar el mxGraphComponent al panel
//}

    
    public MonticuloBinario() {
    
    }
}
