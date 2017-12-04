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
import java.io.InputStream;
import org.mindswap.pellet.jena.PelletReasonerFactory;




/**
 *
 * @author icarv
 */
public class OntoConnection {
    
    public static OntModel OntoConnection(){
        
        String f = "C:\\Seco 6\\seco 6.owl";        
        try{
            OntModelSpec especRacioc = OntModelSpec.OWL_DL_MEM;
        }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }
        
        OntModel seco = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM, null);
        
        try {
            InputStream in = FileManager.get().open(f);
            seco.read(in, "RDF/XML");
            Reasoner reasoner = (Reasoner) PelletReasonerFactory.theInstance().create();
            //Reasoner reasoner = ReasonerRegistry.getOWLReasoner();
            reasoner = reasoner.bindSchema(seco);
            InfModel infmodel = ModelFactory.createInfModel(reasoner,seco);
            infmodel.prepare();
            return seco;
        } catch (JenaException je) {
            System.out.println("ERROR" + je.getMessage());
            je.printStackTrace();
            System.exit(0);
        }
        
        return null;
    }
    
    
}
