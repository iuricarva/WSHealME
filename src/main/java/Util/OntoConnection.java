/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.InfModel;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.reasoner.Reasoner;
import com.hp.hpl.jena.shared.JenaException;
import com.hp.hpl.jena.util.FileManager;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import org.mindswap.pellet.jena.PelletReasonerFactory;




/**
 *
 * @author icarv
 */
public class OntoConnection {
    
    public static InfModel OntoConnection(){
        
        String f = "C:\\Seco 6\\Seco 6.owl";        
        OntModelSpec especRacioc = OntModelSpec.OWL_DL_MEM; 
        OntModel seco = ModelFactory.createOntologyModel(especRacioc, null);
        
        try {
            InputStream in = FileManager.get().open(f);
            seco.read(in, "RDF/XML");
            Reasoner reasoner = (Reasoner) PelletReasonerFactory.theInstance().create();
            //Reasoner reasoner = ReasonerRegistry.getOWLReasoner();
            reasoner = reasoner.bindSchema(seco);
            InfModel infmodel = ModelFactory.createInfModel(reasoner,seco);
            infmodel.prepare();
            
            /*-----------------------------*/
            FileWriter arquivo = null;
            try {
            //caminho para o novo arquivo de ontologia
                arquivo = new FileWriter("C:\\Seco 7\\Seco 7.owl");
            //se não existir arquivo, o mesmo será criado, se não, será reescrito
            } catch (IOException ex) {
                ex.printStackTrace(); //verificando problemas
            }
            //determinando que o fluxo de saida vai para o arquivo e não para a tela            
            BufferedWriter out = new BufferedWriter(arquivo);
            infmodel.write(out);
            /*-----------------------------*/
            
            
            
            
            return infmodel;
        } catch (JenaException je) {
            System.out.println("ERROR" + je.getMessage());
            je.printStackTrace();
            System.exit(0);
        }
        
        return null;
    }
    
    
}
