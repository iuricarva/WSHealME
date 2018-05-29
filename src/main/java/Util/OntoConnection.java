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
        
        String f = "C:\\seco6\\seco6.owl";        
        OntModelSpec especRacioc = OntModelSpec.OWL_DL_MEM; 
        OntModel seco = ModelFactory.createOntologyModel(especRacioc, null);
        
        try {
            InputStream in = FileManager.get().open(f);
            seco.read(in, null);
            Reasoner reasoner = (Reasoner) PelletReasonerFactory.theInstance().create();
            //Reasoner reasoner = ReasonerRegistry.getOWLReasoner();
            reasoner = reasoner.bindSchema(seco);
            InfModel infmodel = ModelFactory.createInfModel(reasoner,seco);
            infmodel.prepare();
            
            /*-----------------------------
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
            -----------------------------*/
                  
            return infmodel;
        } catch (JenaException je) {
            System.out.println("ERROR" + je.getMessage());
            je.printStackTrace();
        }
        
        return null;
    }
    
    public static OntModel OntoConnectionSInferencia(){
        
        String f = "c:\\seco6\\seco6.owl";        
        OntModelSpec especRacioc = OntModelSpec.OWL_DL_MEM; 
        OntModel seco = ModelFactory.createOntologyModel(especRacioc);
        
        try {
            InputStream in = FileManager.get().open(f);
            seco.read(in, null);
            return seco;
        } catch (JenaException je) {
            System.out.println("ERROR" + je.getMessage());
            je.printStackTrace();
        }
        
        return null;
    }
    
    public static void gravaOnto(OntModel seco){
        
        String f = "c:\\seco6\\seco6.owl";
        OntModelSpec especRacioc = OntModelSpec.OWL_DL_MEM; 
        //seco = ModelFactory.createOntologyModel(especRacioc, seco);        
                
        try {
                      
            FileWriter arquivo = null;
            try {
            //caminho para o novo arquivo de ontologia
                arquivo = new FileWriter(f);
            //se não existir arquivo, o mesmo será criado, se não, será reescrito
            } catch (IOException ex) {
                ex.printStackTrace(); //verificando problemas
            }
            //determinando que o fluxo de saida vai para o arquivo e não para a tela            
            BufferedWriter out = new BufferedWriter(arquivo);
            
            seco.write(out, "RDF/XML-ABBREV");
        } catch (JenaException je) {
            System.out.println("ERROR" + je.getMessage());
            je.printStackTrace();
        }
    }
    
    
}
