/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OntoDAO;


import Model.IndividualModel;
import Util.OntoConnection;
import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.ObjectProperty;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.query.DatasetFactory;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.InfModel;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;
import java.util.ArrayList;


/**
 *
 * @author icarv
 */
public class OntoDAO {
    
          
    public static ArrayList<IndividualModel> returnHeterogeneity(){
        
        IndividualModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<IndividualModel> Result = new ArrayList<IndividualModel>();
              
              
        
        if(seco != null){
        
            String query;
            query = "    Prefix txt: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#>\n" +
                    "    Prefix owl: <http://www.w3.org/2002/07/owl#/>\n" +
                    "    Prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "    Prefix xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "    Prefix xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "    Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "    Prefix seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "    Prefix swrl: <http://www.w3.org/2003/11/swrl#>\n" +
                    "    Prefix swrla: <http://swrl.stanford.edu/ontologies/3.3/swrla.owl#>\n" +
                    "    Prefix swrlb: <http://www.w3.org/2003/11/swrlb#>\n" +
                    "      SELECT *\n" +
                    "      WHERE \n" +
                    "	{?k rdf:type txt:Heterogeneity\n}";



                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new IndividualModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<IndividualModel> returnRegenerationAbility(){
        
        IndividualModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<IndividualModel> Result = new ArrayList<IndividualModel>();
              
              
        
        if(seco != null){
        
            String query;
            query = "    Prefix txt: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#>\n" +
                    "    Prefix owl: <http://www.w3.org/2002/07/owl#/>\n" +
                    "    Prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "    Prefix xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "    Prefix xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "    Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "    Prefix seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "    Prefix swrl: <http://www.w3.org/2003/11/swrl#>\n" +
                    "    Prefix swrla: <http://swrl.stanford.edu/ontologies/3.3/swrla.owl#>\n" +
                    "    Prefix swrlb: <http://www.w3.org/2003/11/swrlb#>\n" +
                    "      SELECT *\n" +
                    "      WHERE \n" +
                    "	{?k rdf:type txt:RegenerationAbility\n}";



                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new IndividualModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<IndividualModel> returnEffortBalance(){
        
        IndividualModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<IndividualModel> Result = new ArrayList<IndividualModel>();
              
              
        
        if(seco != null){
        
            String query;
            query = "    Prefix txt: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#>\n" +
                    "    Prefix owl: <http://www.w3.org/2002/07/owl#/>\n" +
                    "    Prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "    Prefix xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "    Prefix xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "    Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "    Prefix seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "    Prefix swrl: <http://www.w3.org/2003/11/swrl#>\n" +
                    "    Prefix swrla: <http://swrl.stanford.edu/ontologies/3.3/swrla.owl#>\n" +
                    "    Prefix swrlb: <http://www.w3.org/2003/11/swrlb#>\n" +
                    "      SELECT *\n" +
                    "      WHERE \n" +
                    "	{?k rdf:type txt:EffortBalance\n}";



                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new IndividualModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<IndividualModel> returnExpertiseBalance(){
        
        IndividualModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<IndividualModel> Result = new ArrayList<IndividualModel>();
              
              
        
        if(seco != null){
        
            String query;
            query = "    Prefix txt: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#>\n" +
                    "    Prefix owl: <http://www.w3.org/2002/07/owl#/>\n" +
                    "    Prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "    Prefix xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "    Prefix xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "    Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "    Prefix seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "    Prefix swrl: <http://www.w3.org/2003/11/swrl#>\n" +
                    "    Prefix swrla: <http://swrl.stanford.edu/ontologies/3.3/swrla.owl#>\n" +
                    "    Prefix swrlb: <http://www.w3.org/2003/11/swrlb#>\n" +
                    "      SELECT *\n" +
                    "      WHERE \n" +
                    "	{?k rdf:type txt:ExpertiseBalance\n}";



                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new IndividualModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<IndividualModel> returnVisibility(){
        
        IndividualModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<IndividualModel> Result = new ArrayList<IndividualModel>();
              
              
        
        if(seco != null){
        
            String query;
            query = "    Prefix txt: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#>\n" +
                    "    Prefix owl: <http://www.w3.org/2002/07/owl#/>\n" +
                    "    Prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "    Prefix xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "    Prefix xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "    Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "    Prefix seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "    Prefix swrl: <http://www.w3.org/2003/11/swrl#>\n" +
                    "    Prefix swrla: <http://swrl.stanford.edu/ontologies/3.3/swrla.owl#>\n" +
                    "    Prefix swrlb: <http://www.w3.org/2003/11/swrlb#>\n" +
                    "      SELECT *\n" +
                    "      WHERE \n" +
                    "	{?k rdf:type txt:Visibility\n}";



                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new IndividualModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<IndividualModel> returnSustainability(){
        
        IndividualModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<IndividualModel> Result = new ArrayList<IndividualModel>();
              
              
        
        if(seco != null){
        
            String query;
            query = "    Prefix txt: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#>\n" +
                    "    Prefix owl: <http://www.w3.org/2002/07/owl#/>\n" +
                    "    Prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "    Prefix xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "    Prefix xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "    Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "    Prefix seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "    Prefix swrl: <http://www.w3.org/2003/11/swrl#>\n" +
                    "    Prefix swrla: <http://swrl.stanford.edu/ontologies/3.3/swrla.owl#>\n" +
                    "    Prefix swrlb: <http://www.w3.org/2003/11/swrlb#>\n" +
                    "      SELECT *\n" +
                    "      WHERE \n" +
                    "	{?k rdf:type txt:Sustainability\n}";



                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new IndividualModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<IndividualModel> returnHealth(){
        
        IndividualModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<IndividualModel> Result = new ArrayList<IndividualModel>();
        
        if(seco != null){
        
            String query;
            query = "    Prefix txt: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#>\n" +
                    "    Prefix owl: <http://www.w3.org/2002/07/owl#/>\n" +
                    "    Prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "    Prefix xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "    Prefix xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "    Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "    Prefix seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "    Prefix swrl: <http://www.w3.org/2003/11/swrl#>\n" +
                    "    Prefix swrla: <http://swrl.stanford.edu/ontologies/3.3/swrla.owl#>\n" +
                    "    Prefix swrlb: <http://www.w3.org/2003/11/swrlb#>\n" +
                    "      SELECT *\n" +
                    "      WHERE \n" +
                    "	{?k rdf:type txt:Health\n}";



                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new IndividualModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<IndividualModel> returnProductivity(){
        
        IndividualModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<IndividualModel> Result = new ArrayList<IndividualModel>();
              
              
        
        if(seco != null){
        
            String query;
            query = "    Prefix txt: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#>\n" +
                    "    Prefix owl: <http://www.w3.org/2002/07/owl#/>\n" +
                    "    Prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "    Prefix xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "    Prefix xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "    Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "    Prefix seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "    Prefix swrl: <http://www.w3.org/2003/11/swrl#>\n" +
                    "    Prefix swrla: <http://swrl.stanford.edu/ontologies/3.3/swrla.owl#>\n" +
                    "    Prefix swrlb: <http://www.w3.org/2003/11/swrlb#>\n" +
                    "      SELECT *\n" +
                    "      WHERE \n" +
                    "	{?k rdf:type txt:Productivity\n}";



                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new IndividualModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<IndividualModel> returnDiversity(){
        
        IndividualModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<IndividualModel> Result = new ArrayList<IndividualModel>();
              
              
        
        if(seco != null){
        
            String query;
            query = "    Prefix txt: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#>\n" +
                    "    Prefix owl: <http://www.w3.org/2002/07/owl#/>\n" +
                    "    Prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "    Prefix xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "    Prefix xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "    Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "    Prefix seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "    Prefix swrl: <http://www.w3.org/2003/11/swrl#>\n" +
                    "    Prefix swrla: <http://swrl.stanford.edu/ontologies/3.3/swrla.owl#>\n" +
                    "    Prefix swrlb: <http://www.w3.org/2003/11/swrlb#>\n" +
                    "      SELECT *\n" +
                    "      WHERE \n" +
                    "	{?k rdf:type txt:Diversity\n}";



                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new IndividualModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<IndividualModel> returnNicheCreation(){
        
        IndividualModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<IndividualModel> Result = new ArrayList<IndividualModel>();
              
              
        
        if(seco != null){
        
            String query;
            query = "    Prefix txt: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#>\n" +
                    "    Prefix owl: <http://www.w3.org/2002/07/owl#/>\n" +
                    "    Prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "    Prefix xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "    Prefix xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "    Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "    Prefix seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "    Prefix swrl: <http://www.w3.org/2003/11/swrl#>\n" +
                    "    Prefix swrla: <http://swrl.stanford.edu/ontologies/3.3/swrla.owl#>\n" +
                    "    Prefix swrlb: <http://www.w3.org/2003/11/swrlb#>\n" +
                    "      SELECT *\n" +
                    "      WHERE \n" +
                    "	{?k rdf:type txt:NicheCreate\n}";



                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new IndividualModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<IndividualModel> returnInformationConsistence(){
        
        IndividualModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<IndividualModel> Result = new ArrayList<IndividualModel>();
              
              
        
        if(seco != null){
        
            String query;
            query = "    Prefix txt: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#>\n" +
                    "    Prefix owl: <http://www.w3.org/2002/07/owl#/>\n" +
                    "    Prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "    Prefix xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "    Prefix xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "    Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "    Prefix seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "    Prefix swrl: <http://www.w3.org/2003/11/swrl#>\n" +
                    "    Prefix swrla: <http://swrl.stanford.edu/ontologies/3.3/swrla.owl#>\n" +
                    "    Prefix swrlb: <http://www.w3.org/2003/11/swrlb#>\n" +
                    "      SELECT *\n" +
                    "      WHERE \n" +
                    "	{?k rdf:type txt:InformationConsistence\n}";



                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new IndividualModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<IndividualModel> returnInterrelatedness(){
        
        IndividualModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<IndividualModel> Result = new ArrayList<IndividualModel>();
              
              
        
        if(seco != null){
        
            String query;
            query = "    Prefix txt: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#>\n" +
                    "    Prefix owl: <http://www.w3.org/2002/07/owl#/>\n" +
                    "    Prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "    Prefix xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "    Prefix xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "    Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "    Prefix seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "    Prefix swrl: <http://www.w3.org/2003/11/swrl#>\n" +
                    "    Prefix swrla: <http://swrl.stanford.edu/ontologies/3.3/swrla.owl#>\n" +
                    "    Prefix swrlb: <http://www.w3.org/2003/11/swrlb#>\n" +
                    "      SELECT *\n" +
                    "      WHERE \n" +
                    "	{?k rdf:type txt:Interrelatedness\n}";



                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new IndividualModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<IndividualModel> returnClustering(){
        
        IndividualModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<IndividualModel> Result = new ArrayList<IndividualModel>();
              
              
        
        if(seco != null){
        
            String query;
            query = "    Prefix txt: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#>\n" +
                    "    Prefix owl: <http://www.w3.org/2002/07/owl#/>\n" +
                    "    Prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "    Prefix xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "    Prefix xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "    Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "    Prefix seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "    Prefix swrl: <http://www.w3.org/2003/11/swrl#>\n" +
                    "    Prefix swrla: <http://swrl.stanford.edu/ontologies/3.3/swrla.owl#>\n" +
                    "    Prefix swrlb: <http://www.w3.org/2003/11/swrlb#>\n" +
                    "      SELECT *\n" +
                    "      WHERE \n" +
                    "	{?k rdf:type txt:Clustering\n}";



                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new IndividualModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<IndividualModel> returnFinancialConsistence(){
        
        IndividualModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<IndividualModel> Result = new ArrayList<IndividualModel>();
              
              
        
        if(seco != null){
        
            String query;
            query = "    Prefix txt: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#>\n" +
                    "    Prefix owl: <http://www.w3.org/2002/07/owl#/>\n" +
                    "    Prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "    Prefix xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "    Prefix xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "    Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "    Prefix seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "    Prefix swrl: <http://www.w3.org/2003/11/swrl#>\n" +
                    "    Prefix swrla: <http://swrl.stanford.edu/ontologies/3.3/swrla.owl#>\n" +
                    "    Prefix swrlb: <http://www.w3.org/2003/11/swrlb#>\n" +
                    "      SELECT *\n" +
                    "      WHERE \n" +
                    "	{?k rdf:type txt:FinancialConsistence\n}";



                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new IndividualModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static void salvaIndividuos(IndividualModel platform, IndividualModel parameter){
        
        OntModel seco = OntoConnection.OntoConnectionSInferencia();
        Resource plat = seco.getResource("http://www.seco.com/ontoloy/seco.owl#Platform");
        Resource par = seco.getResource("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#Parameter");
        seco.createIndividual(platform.getName(), plat);
        seco.createIndividual(parameter.getName(), par);
        //Individual p = seco.getIndividual("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#"+platform.getName());
         Individual p = seco.getIndividual("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#Android");
        //Individual pa = seco.getIndividual("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#"+parameter.getName());
        Individual pa = seco.getIndividual("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#par");
        ObjectProperty hasParameter = seco.getObjectProperty("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#hasParameter");
        p.addProperty(hasParameter, pa);
        
        OntoConnection.gravaOnto(seco);
    }
    
}
