/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OntoDAO;


import Model.IndividualModel;
import Model.PlatformModel;
import Util.OntoConnection;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.query.DatasetFactory;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.RDFNode;
import java.util.ArrayList;


/**
 *
 * @author icarv
 */
public class OntoDAO {
    
          
    public static ArrayList<PlatformModel> returnHeterogeneity(){
        
        PlatformModel model;
        OntModel seco = OntoConnection.OntoConnection();
        ArrayList<PlatformModel> Result = new ArrayList<PlatformModel>();
              
              
        
        if(seco != null){
        
            String query;
            query = "PREFIX xmlns: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#>\n" +
                    "PREFIX base: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl>\n" +
                    "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n" +
                    "PREFIX xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "PREFIX seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "PREFIX swrl: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#>\n" +
                    "	SELECT *\n" +
                    "	WHERE { ?k seco:isDevelopedOf ?a.\n" +
                    "	        ?k seco:isDevelopedOf ?b.\n" +
                    "	        ?a swrl:hasLiveDifferentCountry ?b.\n" +
                    "	        ?k swrl:hasLinkTo ?w.\n" +
                    "           ?k swrl:hasLinkTo ?z.\n" +
                    "           ?w swrl:hasNetworkNode ?z.\n" +
                    "           ?k seco:hasSuport ?c.\n" +
                    "           ?k seco:hasSuport ?d.\n" +
                    "           ?c swrl:hasSemanticDistance ?d}";



                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new PlatformModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("a");
                    model.setNameDeveloper1(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#", ""));
                    subject = linha.get("b");
                    model.setNameDeveloper2(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#", ""));
                    subject = linha.get("c");
                    model.setNameSupport1(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#", ""));
                    subject = linha.get("d");
                    model.setNameSupport2(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#", ""));
                    subject = linha.get("w");
                    model.setNameNode1(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#", ""));
                    subject = linha.get("z");
                    model.setNameNode2(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#", ""));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<PlatformModel> returnRegenerationAbility(){
        
        PlatformModel model;
        OntModel seco = OntoConnection.OntoConnection();
        ArrayList<PlatformModel> Result = new ArrayList<PlatformModel>();
        String trata;
        
        if(seco != null){
        
            String query;
            query = "PREFIX xmlns: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#>\n" +
                    "PREFIX base: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl>\n" +
                    "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n" +
                    "PREFIX xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "PREFIX seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "PREFIX swrl: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#>\n" +
                    "	SELECT *\n" +
                    "	WHERE {?a seco:hasMaintained ?k.\n" +
                    "          ?a swrl:timeWorkTogether ?t.\n" +
                    "          ?k swrl:hasNewMember ?b}";



                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    trata = "";
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new PlatformModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("t");
                    trata = subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", "");
                    trata = trata.replace("^^","");
                    trata = trata.replace("\"","");
                    trata = trata.replace("<","");
                    trata = trata.replace(">","");
                    trata = trata.replace("http://www.w3.org/2001/XMLSchema#int","");
                    model.setTimeWorkTogether(Integer.parseInt(trata));
                    subject = linha.get("b");
                    model.setNameDeveloper1(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#", ""));

                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<PlatformModel> returnEffortBalance(){
        
        PlatformModel model;
        OntModel seco = OntoConnection.OntoConnection();
        ArrayList<PlatformModel> Result = new ArrayList<PlatformModel>();
        String trata;
        
        if(seco != null){
        
            String query;
            query = "PREFIX xmlns: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#>\n" +
                    "PREFIX base: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl>\n" +
                    "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n" +
                    "PREFIX xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "PREFIX seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "PREFIX swrl: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#>\n" +
                    "	SELECT *\n" +
                    "	WHERE { ?k seco:isDevelopedOf ?a.\n" +
                    "	        ?a swrl:DeveloperCommits ?c.\n" +
                    "           ?k seco:isDevelopedOf ?b.\n" +
                    "           ?b swrl:DeveloperHoursWork ?h.\n" +
                    "           ?k seco:isDevelopedOf ?d.\n" +
                    "           ?d swrl:ActiveDeveloper ?t.\n" +
                    "		?k seco:isDevelopedOf ?e.\n" +
                    "           ?e swrl:NumberOfReleases ?r}";



                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    trata = "";
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new PlatformModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("c");
                    trata = subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", "");
                    trata = trata.replace("^^","");
                    trata = trata.replace("\"","");
                    trata = trata.replace("<","");
                    trata = trata.replace(">","");
                    trata = trata.replace("http://www.w3.org/2001/XMLSchema#int","");
                    model.setDeveloperCommits(Integer.parseInt(trata));
                    subject = linha.get("h");
                    trata = subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", "");
                    trata = trata.replace("^^","");
                    trata = trata.replace("\"","");
                    trata = trata.replace("<","");
                    trata = trata.replace(">","");
                    trata = trata.replace("http://www.w3.org/2001/XMLSchema#int","");
                    model.setDeveloperHoursWork(Integer.parseInt(trata));
                    subject = linha.get("t");
                    trata = subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", "");
                    trata = trata.replace("^^","");
                    trata = trata.replace("\"","");
                    trata = trata.replace("<","");
                    trata = trata.replace(">","");
                    trata = trata.replace("http://www.w3.org/2001/XMLSchema#boolean","");
                    model.setActiveDeveloper(Boolean.valueOf(trata));
                    subject = linha.get("r");
                    trata = subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", "");
                    trata = trata.replace("^^","");
                    trata = trata.replace("\"","");
                    trata = trata.replace("<","");
                    trata = trata.replace(">","");
                    trata = trata.replace("http://www.w3.org/2001/XMLSchema#int","");
                    model.setNumberOfReleases(Integer.parseInt(trata));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<IndividualModel> returnExpertiseBalance(){
        
        IndividualModel model;
        OntModel seco = OntoConnection.OntoConnection();
        ArrayList<IndividualModel> Result = new ArrayList<IndividualModel>();
        
        if(seco != null){
        
            String query;
            query = "PREFIX xmlns: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#>\n" +
                    "PREFIX base: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl>\n" +
                    "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n" +
                    "PREFIX xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "PREFIX seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "PREFIX swrl: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#>\n" +
                    "	SELECT *\n" +
                    "   WHERE { \n" +
                    "		?k rdf:type ?<http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#ExpertiseBalance>.  \n" +
                    "	}";



                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new IndividualModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<IndividualModel> returnVisibility(){
        
        IndividualModel model;
        OntModel seco = OntoConnection.OntoConnection();
        ArrayList<IndividualModel> Result = new ArrayList<IndividualModel>();
        
        if(seco != null){
        
            String query;
            query = "PREFIX xmlns: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#>\n" +
                    "PREFIX base: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl>\n" +
                    "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n" +
                    "PREFIX xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "PREFIX seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "PREFIX swrl: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#>\n" +
                    "	SELECT *\n" +
                    "   WHERE { \n" +
                    "		?k rdf:type ?<http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#Visibility>.  \n" +
                    "	}";



                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new IndividualModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<IndividualModel> returnSustainability(){
        
        IndividualModel model;
        OntModel seco = OntoConnection.OntoConnection();
        ArrayList<IndividualModel> Result = new ArrayList<IndividualModel>();
        
        if(seco != null){
        
            String query;
            query = "PREFIX xmlns: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#>\n" +
                    "PREFIX base: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl>\n" +
                    "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n" +
                    "PREFIX xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "PREFIX seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "PREFIX swrl: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#>\n" +
                    "	SELECT *\n" +
                    "   WHERE { \n" +
                    "		?k rdf:type ?<http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#Sustainability>.  \n" +
                    "	}";



                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new IndividualModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<IndividualModel> returnHealth(){
        
        IndividualModel model;
        OntModel seco = OntoConnection.OntoConnection();
        ArrayList<IndividualModel> Result = new ArrayList<IndividualModel>();
        
        if(seco != null){
        
            String query;
            query = "PREFIX xmlns: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#>\n" +
                    "PREFIX base: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl>\n" +
                    "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n" +
                    "PREFIX xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "PREFIX seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "PREFIX swrl: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#>\n" +
                    "	SELECT *\n" +
                    "   WHERE { \n" +
                    "		?k rdf:type ?<http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#Health>.  \n" +
                    "	}";



                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new IndividualModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<PlatformModel> returnProductivity(){
        
        PlatformModel model;
        OntModel seco = OntoConnection.OntoConnection();
        ArrayList<PlatformModel> Result = new ArrayList<PlatformModel>();
        String trata;
        
        if(seco != null){
        
            String query;
            query = "PREFIX xmlns: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#>\n" +
                    "PREFIX base: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl>\n" +
                    "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n" +
                    "PREFIX xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "PREFIX seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "PREFIX swrl: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#>\n" +
                    "	SELECT *\n" +
                    "                    	WHERE { \n" +
                    "		?k swrl:addedKLOC ?x.\n" +
                    "		?k swrl:hasFile ?j.\n" +
                    "		?j swrl:createData ?c.\n" +
                    "		?k swrl:totalTransmittedMessages ?t.\n" +
                    "		?k swrl:hasProject ?y. \n" +
                    "		?y swrl:StartData ?s.\n" +
                    "		?k swrl:bugFixTime ?f.\n" +
                    "		?k swrl:numberOfUsers ?l.\n" +
                    "		?k swrl:averageTimeUse ?m.\n" +
                    "		?k swrl:hasNewMember ?n.\n" +
                    "           ?k swrl:hasEvent ?e.\n"+
                    "           ?e swrl:occurredDate ?o \n"+
                    "		\n" +
                    "	}";
                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    trata = "";
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new PlatformModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("x");
                    trata = subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", "");
                    //System.out.println(trata);
                    trata = trata.replace("^^","");
                    trata = trata.replace("\"","");
                    trata = trata.replace("<","");
                    trata = trata.replace(">","");
                    trata = trata.replace("http://www.w3.org/2001/XMLSchema#int","");
                    model.setKLOC(Integer.parseInt(trata));
                    subject = linha.get("j");
                    model.setFileName(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("c");
                    model.setCreationData(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("t");
                    trata = subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", "");
                    trata = trata.replace("^^","");
                    trata = trata.replace("\"","");
                    trata = trata.replace("<","");
                    trata = trata.replace(">","");
                    trata = trata.replace("http://www.w3.org/2001/XMLSchema#int","");
                    model.setNumMessages(Integer.parseInt(trata));
                    subject = linha.get("y");
                    model.setProjectName(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("s");
                    model.setStarData(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("f");
                    trata = subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", "");
                    trata = trata.replace("^^","");
                    trata = trata.replace("\"","");
                    trata = trata.replace("<","");
                    trata = trata.replace(">","");
                    trata = trata.replace("http://www.w3.org/2001/XMLSchema#int","");
                    model.setBugFixTime(Integer.parseInt(trata));
                    subject = linha.get("l");
                    trata = subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", "");
                    trata = trata.replace("^^","");
                    trata = trata.replace("\"","");
                    trata = trata.replace("<","");
                    trata = trata.replace(">","");
                    trata = trata.replace("http://www.w3.org/2001/XMLSchema#int","");
                    model.setNumberOfUser(Integer.parseInt(trata));
                    subject = linha.get("m");
                    trata = subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", "");
                    trata = trata.replace("^^","");
                    trata = trata.replace("\"","");
                    trata = trata.replace("<","");
                    trata = trata.replace(">","");
                    trata = trata.replace("http://www.w3.org/2001/XMLSchema#int","");
                    model.setAverageTimeUse(Integer.parseInt(trata));
                    subject = linha.get("n");
                    model.setNewMemberName(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("e");
                    model.setEventName(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("o");
                    model.setOccurredDate(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<PlatformModel> returnDiversity(){
        
        PlatformModel model;
        OntModel seco = OntoConnection.OntoConnection();
        ArrayList<PlatformModel> Result = new ArrayList<PlatformModel>();
        String trata;
        
        if(seco != null){
        
            String query;
            query = "PREFIX xmlns: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#>\n" +
                    "PREFIX base: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl>\n" +
                    "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n" +
                    "PREFIX xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "PREFIX seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "PREFIX swrl: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#>\n" +
                    "	SELECT *\n" +
                    "                    	WHERE { \n" +
                    "		\n" +
                    "		?k swrl:hasRunIn ?x.\n" +
                    "		?k swrl:hasRunIn ?w.\n" +
                    "		?k swrl:numberOfUsersGroups ?d.\n" +
                    "		?k seco:isDevelopedOf ?y.\n" +
                    "		?k seco:isDevelopedOf ?z.\n" +
                    "		?k swrl:hasSupportDevTech ?a.\n" +
                    "		?k swrl:hasSupportDevTech ?b.\n" +
                    "		?k swrl:existePlanForCollapse ?p\n" +
                    "		FILTER(?x != ?w && ?y != ?z && ?a != ?b)\n" +
                    "			\n" +
                    "	}";



                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    trata = "";
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new PlatformModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("x");
                    model.setNameHardwareSupport1(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("w");
                    model.setNameHardwareSupport2(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("d");
                    trata = subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", "");
                    trata = trata.replace("^^","");
                    trata = trata.replace("\"","");
                    trata = trata.replace("<","");
                    trata = trata.replace(">","");
                    trata = trata.replace("http://www.w3.org/2001/XMLSchema#int","");
                    model.setNumberOfUsersGroups(Integer.parseInt(trata));
                    subject = linha.get("y");
                    model.setNameDeveloper1(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("z");
                    model.setNameDeveloper2(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("a");
                    model.setTechName1(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("b");
                    model.setTechName2(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("p");
                    trata = subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", "");
                    trata = trata.replace("^^","");
                    trata = trata.replace("\"","");
                    trata = trata.replace("<","");
                    trata = trata.replace(">","");
                    trata = trata.replace("http://www.w3.org/2001/XMLSchema#boolean","");
                    model.setPlanForCollapse(trata);
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<PlatformModel> returnNicheCreation(){
        
        PlatformModel model;
        OntModel seco = OntoConnection.OntoConnection();
        ArrayList<PlatformModel> Result = new ArrayList<PlatformModel>();
        String trata;
        
        if(seco != null){
        
            String query;
            query = "PREFIX xmlns: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#>\n" +
            "PREFIX base: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl>\n" +
            "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
            "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n" +
            "PREFIX xml: <http://www.w3.org/XML/1998/namespace>\n" +
            "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
            "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
            "PREFIX seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
            "PREFIX swrl: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-4.owl#>\n" +
            "	SELECT *\n" +
            "                    	WHERE { \n" +
            "		?k seco:hasSuport ?x.\n" +
            "		?k seco:hasSuport ?y.\n" +
            "		?k swrl:supportNaturalLanguages ?l.\n" +
            "		?k swrl:hasSupportDevTech ?h.\n" +
            "		?k swrl:hasSupportDevTech ?m.\n" +
            "		?k seco:isDevelopedOf ?i.\n" +
            "		?k seco:isDevelopedOf ?j.\n" +
            "		?k swrl:hasSupportTech ?b.\n" +
            "		?k swrl:hasSupportTech ?c.\n" +
            "		?k swrl:haveDocumentation ?s\n" +
            "		FILTER(?x != ?y && ?h != ?m && ?i != ?j && ?b != ?c)\n" +
            "	}";



                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    trata = "";
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new PlatformModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("x");
                    model.setNameSupport1(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("y");
                    model.setNameSupport2(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("l");
                    trata = subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", "");
                    trata = trata.replace("^^","");
                    trata = trata.replace("\"","");
                    trata = trata.replace("<","");
                    trata = trata.replace(">","");
                    trata = trata.replace("http://www.w3.org/2001/XMLSchema#boolean","");
                    model.setSupportNaturalLanguages(trata);
                    subject = linha.get("h");
                    model.setNameDevTech1(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("m");
                    model.setNameDevTech2(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("i");
                    model.setNameDeveloper1(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("j");
                    model.setNameDevTech2(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("b");
                    model.setTechName1(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("c");
                    model.setTechName2(subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", ""));
                    subject = linha.get("s");
                    trata = subject.toString().replace("http://www.seco.com/ontoloy/seco.owl#", "");
                    trata = trata.replace("^^","");
                    trata = trata.replace("\"","");
                    trata = trata.replace("<","");
                    trata = trata.replace(">","");
                    trata = trata.replace("http://www.w3.org/2001/XMLSchema#boolean","");
                    model.setHaveDocumentation(trata);
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
}
