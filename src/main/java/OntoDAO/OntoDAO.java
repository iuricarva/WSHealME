/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OntoDAO;


import Model.IndividualModel;
import Model.PlatformModel;
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
import javafx.application.Platform;


/**
 *
 * @author icarv
 */
public class OntoDAO {
    
    static final String URI = "http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl";
    static final String Prefixo =  "    Prefix txt: <http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#>\n" +
                    "    Prefix owl: <http://www.w3.org/2002/07/owl#/>\n" +
                    "    Prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "    Prefix xml: <http://www.w3.org/XML/1998/namespace>\n" +
                    "    Prefix xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "    Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "    Prefix seco: <http://www.seco.com/ontoloy/seco.owl#>\n" +
                    "    Prefix swrl: <http://www.w3.org/2003/11/swrl#>\n" +
                    "    Prefix swrla: <http://swrl.stanford.edu/ontologies/3.3/swrla.owl#>\n" +
                    "    Prefix swrlb: <http://www.w3.org/2003/11/swrlb#>\n"+
                    "    Prefix data:<http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#>";
    
    public static ArrayList<IndividualModel> returnPlatforms(){
        
        IndividualModel model;
        InfModel seco = OntoConnection.OntoConnectionSInferencia();
        ArrayList<IndividualModel> Result = new ArrayList<IndividualModel>();
            
        if(seco != null){
        
            String query;
            query = Prefixo+
                    "      SELECT *\n" +
                    "      WHERE \n" +
                    "	{?k rdf:type seco:Platform\n}";

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
    
    public static ArrayList<IndividualModel> returnHeterogeneity(){
        
        IndividualModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<IndividualModel> Result = new ArrayList<IndividualModel>();

        if(seco != null){
        
            String query;
            query = Prefixo+
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
            query = Prefixo+
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
            query = Prefixo+
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
            query = Prefixo+
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
            query = Prefixo+
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
            query = Prefixo +
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
            query = Prefixo +
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
            query = Prefixo +
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
            query = Prefixo +
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
            query = Prefixo +
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
            query = Prefixo +
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
            query = Prefixo +
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
            query = Prefixo +
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
            query = Prefixo +
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
    
    public static ArrayList<PlatformModel> returnDataHet(){
        
        PlatformModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<PlatformModel> Result = new ArrayList<PlatformModel>();
              
        if(seco != null){
        
            String query;
            query = Prefixo +
                    "      SELECT *\n" +
                    "      WHERE \n" +
                    "   {?k data:numberOfCountries ?a.\n" +
                    "	?k data:semanticClosenessAvg ?b.\n" +
                    "	?k data:numberOfNodeTypes ?c.\n" +
                    "	}";

                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new PlatformModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    subject = linha.get("a");
                    model.setNumberOfCountries(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("b");
                    model.setSemanticClosenessAvg(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("c");
                    model.setNumberOfNodeTypes(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<PlatformModel> returnDataRegAb(){
        
        PlatformModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<PlatformModel> Result = new ArrayList<PlatformModel>();
              
        if(seco != null){
        
            String query;
            query = Prefixo +
                    "SELECT *\n" +
                    "WHERE\n" +
                    "	{ ?k data:timeWorkTogether ?d.\n" +
                    "	?k data:numberOfNewMembers ?e}";

                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new PlatformModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    subject = linha.get("d");
                    model.setTimeWorkTogether(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("e");
                    model.setNumberOfNewMembers(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
     
    public static ArrayList<PlatformModel> returnDataEffBal(){
        
        PlatformModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<PlatformModel> Result = new ArrayList<PlatformModel>();
              
        if(seco != null){
        
            String query;
            query = Prefixo +
                    "SELECT *\n" +
                    "WHERE\n" +
                    "	{ ?k data:DeveloperCommits ?f.\n" +
                    "	?k data:numberOfHoursWorked ?g.\n" +
                    "	?k data:activeMembers ?h.\n" +
                    "	?k data:numberOfCommunits ?i.\n" +
                    "	?k data:numberOfReleases ?j.\n" +
                    "	?k data:totalEffor ?l}";

                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new PlatformModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    subject = linha.get("f");
                    model.setDeveloperCommits(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("g");
                    model.setNumberOfHoursWorked(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("h");
                    model.setActiveMembers(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("i");
                    model.setNumberOfCommunits(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("j");
                    model.setNumberOfReleases(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("l");
                    model.setTotalEffor(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<PlatformModel> returnDataExBal(){
        
        PlatformModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<PlatformModel> Result = new ArrayList<PlatformModel>();
              
        if(seco != null){
        
            String query;
            query = Prefixo +
                    "SELECT *\n" +
                    "WHERE\n" +
                    "	{ ?k data:numberOfModifiedFiles ?m.\n" +
                    "	?k data:numberModifiedFileTypes ?n.\n" +
                    "	?k data:numberOfEventParticipants ?o\n" +
                    "	}";

                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new PlatformModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    subject = linha.get("m");
                    model.setNumberOfModifiedFiles(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("n");
                    model.setNumberModifiedFileTypes(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("o");
                    model.setNumberOfEventParticipants(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<PlatformModel> returnDataVis(){
        
        PlatformModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<PlatformModel> Result = new ArrayList<PlatformModel>();
              
        if(seco != null){
        
            String query;
            query = Prefixo +
                    "SELECT *\n" +
                    "WHERE\n" +
                    "	{ ?k data:numberOfEventProjectParticipants ?p.\n" +
                    "	  ?k data:numberOfJobAdvertisements ?q.\n" +
                    "     ?k data:numberOfDownloads ?r.\n" +
                    "	  ?k data:numberOfMailingListMembers ?s.\n" +
                    "	  ?k data:numberOfPassiveUsers ?t.\n" +
                    "	  ?k data:numberOfReaders ?u.\n" +
                    "	  ?k data:numberOfScientificPublication ?v.\n" +
                    "	  ?k data:numberOfSocialMediaHits ?w.\n" +
                    "	  ?k data:numberOfWebPageRequests ?x\n" +
                    "	}";

                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new PlatformModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    subject = linha.get("p");
                    model.setNumberOfEventProjectParticipants(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("q");
                    model.setNumberOfJobAdvertisements(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("r");
                    model.setNumberOfDownloads(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("s");
                    model.setNumberOfMailingListMembers(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("t");
                    model.setNumberOfPassiveUsers(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("u");
                    model.setNumberOfReaders(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("v");
                    model.setNumberOfScientificPublication(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("w");
                    model.setNumberOfSocialMediaHits(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("x");
                    model.setNumberOfWebPageRequests(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<PlatformModel> returnDataDiv(){
        
        PlatformModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<PlatformModel> Result = new ArrayList<PlatformModel>();
              
        if(seco != null){
        
            String query;
            query = Prefixo +
                    "SELECT *\n" +
                    "WHERE\n" +
                    "	{ ?k data:numberOfDevelopers ?y.\n" +
                    "	  ?k data:numberOfUsersGroups ?z.\n" +
                    "	  ?k data:numberOfProgrammingLanguagesSupported ?aa.\n" +
                    "	  ?k data:numberOfDifferentHardwareDevices ?ab.\n" +
                    "	  ?k data:existPlanForCollapse ?ac\n"+
                    "	}";

                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new PlatformModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    subject = linha.get("y");
                    model.setNumberOfDevelopers(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("z");
                    model.setNumberOfUsersGroups(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("aa");
                    model.setNumberOfProgrammingLanguagesSupported(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("ab");
                    model.setNumberOfDifferentHardwareDevices(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("ac");
                    model.setExistPlanForCollapse(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#string","").replace("\"", ""));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
     
    public static ArrayList<PlatformModel> returnDataProd(){
        
        PlatformModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<PlatformModel> Result = new ArrayList<PlatformModel>();
              
        if(seco != null){
        
            String query;
            query = Prefixo +
                    "SELECT *\n" +
                    "WHERE\n" +
                    "	{ ?k data:numberOfProjectsAdded ?ad.\n" +
                    "     ?k data:numberOfEvents ?ae.\n" +
                    "	  ?k data:addedKLOC ?af.\n" +
                    "	  ?k data:numberOfArtifacts ?ag.\n" +
                    "	  ?k data:numberOfTransmittedMessages ?ah.\n" +
                    "	  ?k data:bugFixTime ?ai.\n" +
                    "	  ?k data:numberOfPartnersAdded ?aj.\n" +
                    "	  ?k data:numberOfUsers ?ak.\n" +
                    "	  ?k data:averageTimeUse ?al\n" +
                    "	}";

                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new PlatformModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    subject = linha.get("ad");
                    model.setNumberOfProjectsAdded(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("ae");
                    model.setNumberOfEvents(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("af");
                    model.setAddedKLOC(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("ag");
                    model.setNumberOfArtifacts(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("ah");
                    model.setNumberOfTransmittedMessages(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("ai");
                    model.setBugFixTime(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("aj");
                    model.setNumberOfPartnersAdded(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("ak");
                    model.setNumberOfUsers(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("al");
                    model.setAverageTimeUse(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<PlatformModel> returnDataInterr(){
        
        PlatformModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<PlatformModel> Result = new ArrayList<PlatformModel>();
              
        if(seco != null){
        
            String query;
            query = Prefixo +
                    "SELECT *\n" +
                    "WHERE\n" +
                    "	{ ?k data:numberOfNodesConnections ?am.\n" +
                    "     ?k data:ConnectivityCapacity ?an.\n" +
                    "	  ?k data:ratioConnectionsCapacity ?ao.\n" +
                    "	  ?k data:nodesCentrality ?ap.\n" +
                    "	  ?k data:numberOfExternalPartners ?aq\n" +
                    "	}";

                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new PlatformModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    subject = linha.get("am");
                    model.setNumberOfNodesConnections(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("an");
                    model.setConnectivityCapacity(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("ao");
                    model.setRatioConnectionsCapacity(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("ap");
                    model.setNodesCentrality(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("aq");
                    model.setNumberOfExternalPartners(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<PlatformModel> returnDataInfoCons(){
        
        PlatformModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<PlatformModel> Result = new ArrayList<PlatformModel>();
              
        if(seco != null){
        
            String query;
            query = Prefixo +
                    "SELECT *\n" +
                    "WHERE\n" +
                    "	{ ?k data:GlossaryOfTerms ?zz }";
                    
                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new PlatformModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    subject = linha.get("zz");
                    model.setGlossaryOfTerms(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#string","").replace("\"", ""));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<PlatformModel> returnDataClust(){
        
        PlatformModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<PlatformModel> Result = new ArrayList<PlatformModel>();
              
        if(seco != null){
        
            String query;
            query = Prefixo +
                    "SELECT *\n" +
                    "WHERE\n" +
                    "	{ ?k data:numberOfProductTypes ?ar.\n" +
                    "     ?k data:GreaterCollaboration ?as.\n" +
                    "	  ?k data:numberOfActiveProjects ?at.\n" +
                    "	  ?k data:TotalProducedFiles ?au\n" +
                    "	}";

                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new PlatformModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    subject = linha.get("ar");
                    model.setNumberOfProductTypes(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("as");
                    model.setGreaterCollaboration(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("at");
                    model.setNumberOfActiveProjects(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("au");
                    model.setTotalProducedFiles(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<PlatformModel> returnDataFinCons(){
        
        PlatformModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<PlatformModel> Result = new ArrayList<PlatformModel>();
              
        if(seco != null){
        
            String query;
            query = Prefixo +
                    "SELECT *\n" +
                    "WHERE\n" +
                    "	{?k data:numberOfPartners ?av.\n" +
                    "	 ?k data:numberOfCommercialSponsors ?aw.\n" +
                    "	 ?k data:TotalContributionValue ?ax.\n" +
                    "    ?k data:numberOfActiveContributors ?ay.\n" +
                    "    ?k data:numberOfFrequentUsers ?az\n" +
                    "	}";

                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new PlatformModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    subject = linha.get("av");
                    model.setNumberOfPartners(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("aw");
                    model.setNumberOfCommercialSponsors(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("ax");
                    model.setTotalContributionValue(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("ay");
                    model.setNumberOfActiveContributors(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("az");
                    model.setNumberOfFrequentUsers(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static ArrayList<PlatformModel> returnDataNicheCrea(){
        
        PlatformModel model;
        InfModel seco = OntoConnection.OntoConnection();
        ArrayList<PlatformModel> Result = new ArrayList<PlatformModel>();
              
        if(seco != null){
        
            String query;
            query = Prefixo +
                    "SELECT *\n" +
                    "WHERE\n" +
                    "	{ ?k data:haveDocumentation ?ba.\n" +
                    "	  ?k data:numberOfContributorsTypes ?bb.\n" +
                    "	  ?k data:numberOfTypesAppProjects ?bc.\n" +
                    "	  ?k data:supportNaturalLanguages ?bd.\n" +
                    "	  ?k data:numberOfTypesTechSupported ?be.\n" +
                    "  	  ?k data:numberOfTypesDevTechSupported ?bf}";

                    Dataset dataset = DatasetFactory.create(seco);
                    Query consulta = QueryFactory.create(query);
                    QueryExecution qexec = QueryExecutionFactory.create(consulta,dataset);
                    ResultSet resultado = qexec.execSelect();
                while(resultado.hasNext()) {
                    QuerySolution linha = (QuerySolution) resultado.next();
                    model = new PlatformModel();
                    RDFNode subject = linha.get("k");
                    model.setName(subject.toString().replace("http://www.semanticweb.org/icarv/ontologies/2016/7/seco-6.owl#", ""));
                    subject = linha.get("ba");
                    model.setHaveDocumentation(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#string","").replace("\"", ""));
                    subject = linha.get("bb");
                    model.setNumberOfContributorsTypes(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("bc");
                    model.setNumberOfTypesAppProjects(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("bd");
                    model.setSupportNaturalLanguages(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#string","").replace("\"", ""));
                    subject = linha.get("be");
                    model.setNumberOfTypesTechSupported(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("bf");
                    model.setNumberOfTypesDevTechSupported(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static void salvaIndividuos(IndividualModel platform, IndividualModel parameter){
        
        OntModel seco = OntoConnection.OntoConnectionSInferencia();
        Resource plat = seco.getResource(URI+"#Platform");
        Resource par = seco.getResource(URI+"#Parameter");
        Individual p = seco.createIndividual(platform.getName(), plat);
        Individual pa = seco.createIndividual(parameter.getName(), par);
        //Individual p = seco.getIndividual(URI+"#"+platform.getName());
        //Individual pa = seco.getIndividual(URI+"#"+parameter.getName());
        ObjectProperty hasParameter = seco.getObjectProperty(URI+"#hasParameter");
        p.addProperty(hasParameter, pa);
        
        OntoConnection.gravaOnto(seco);
    }
    
}
