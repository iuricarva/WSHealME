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


/**
 *
 * @author icarv
 */
public class OntoDAO {
    
    static InfModel seco = OntoConnection.OntoConnection();  
    static OntModel sec = OntoConnection.OntoConnectionSInferencia();
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
        //InfModel seco = OntoConnection.OntoConnectionSInferencia();
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
        //InfModel seco = OntoConnection.OntoConnection();
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
        //InfModel seco = OntoConnection.OntoConnection();
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
        //InfModel seco = OntoConnection.OntoConnection();
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
        //InfModel seco = OntoConnection.OntoConnection();
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
        //InfModel seco = OntoConnection.OntoConnection();
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
        //InfModel seco = OntoConnection.OntoConnection();
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
        //InfModel seco = OntoConnection.OntoConnection();
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
        //InfModel seco = OntoConnection.OntoConnection();
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
        //InfModel seco = OntoConnection.OntoConnection();
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
        //InfModel seco = OntoConnection.OntoConnection();
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
        //InfModel seco = OntoConnection.OntoConnection();
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
        //InfModel seco = OntoConnection.OntoConnection();
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
        //InfModel seco = OntoConnection.OntoConnection();
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
        //InfModel seco = OntoConnection.OntoConnection();
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
    
    public static ArrayList<IndividualModel> returnRobustness(){
        
        IndividualModel model;
        //InfModel seco = OntoConnection.OntoConnection();
        ArrayList<IndividualModel> Result = new ArrayList<IndividualModel>();

        if(seco != null){
        
            String query;
            query = Prefixo+
                    "      SELECT *\n" +
                    "      WHERE \n" +
                    "	{?k rdf:type txt:Robustness\n}";

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
    
    public static ArrayList<PlatformModel> returnData(){
        
        PlatformModel model;     
        ArrayList<PlatformModel> Result = new ArrayList<PlatformModel>();
              
        if(seco != null){
        
            String query;
            query = Prefixo +
                    "SELECT *\n" +
                    "WHERE\n" +
                    "{?k data:numberOfCountries ?a.\n" +
                    "?k data:semanticClosenessAvg ?b.\n" +
                    "?k data:numberOfNodeTypes ?c.\n" +
                    "?k data:timeWorkTogether ?d.\n" +
                    "?k data:numberOfNewMembers ?e.\n" +
                    "?k data:DeveloperCommits ?f.\n" +
                    "?k data:numberOfHoursWorked ?g.\n" +
                    "?k data:activeMembers ?h.\n" +
                    "?k data:numberOfCommunits ?i.\n" +
                    "?k data:NumberOfReleases ?j.\n" +
                    "?k data:totalEffort ?l.\n" +
                    "?k data:numberOfModifiedFiles ?m.\n" +
                    "?k data:numberModifiedFileTypes ?n.\n" +
                    "?k data:numberOfEventParticipants ?o.\n" +
                    "?k data:numberOfEventProjectParticipants ?p.\n" +
                    "?k data:numberOfJobAdvertisements ?q.\n" +
                    "?k data:numberOfDownloads ?r.\n" +
                    "?k data:numberOfMailingListMembers ?s.\n" +
                    "?k data:numberOfPassiveUsers ?t.\n" +
                    "?k data:numberOfReaders ?u.\n" +
                    "?k data:numberOfScientificPublication ?v.\n" +
                    "?k data:numberOfSocialMediaHits ?w.\n" +
                    "?k data:numberOfWebPageRequests ?x.\n" +
                    "?k data:numberOfDevelopers ?y.\n" +
                    "?k data:numberOfUsersGroups ?z.\n" +
                    "?k data:numberOfProgrammingLanguagesSupported ?aa.\n" +
                    "?k data:numberOfDifferentHardwareDevices ?ab.\n" +
                    "?k data:existPlanForCollapse ?ac.\n" +
                    "?k data:numberOfProjectsAdded ?ad.\n" +
                    "?k data:numberOfEvents ?ae.\n" +
                    "?k data:addedKLOC ?af.\n" +
                    "?k data:numberOfArtifacts ?ag.\n" +
                    "?k data:numberOfTransmittedMessages ?ah.\n" +
                    "?k data:bugFixTime ?ai.\n" +
                    "?k data:numberOfPartnersAdded ?aj.\n" +
                    "?k data:numberOfUsers ?ak.\n" +
                    "?k data:averageTimeUse ?al.\n" +
                    "?k data:numberOfNodesConnections ?am.\n" +
                    "?k data:ConnectivityCapacity ?an.\n" +
                    "?k data:ratioConnectionsCapacity ?ao.\n" +
                    "?k data:nodesCentrality ?ap.\n" +
                    "?k data:numberOfExternalPartners ?aq.\n" +
                    "?k data:GlossaryOfTerms ?zz.\n" +
                    "?k data:numberOfProductTypes ?ar.\n" +
                    "?k data:GreaterCollaboration ?as.\n" +
                    "?k data:numberOfActiveProjects ?at.\n" +
                    "?k data:TotalProducedFiles ?au.\n" +
                    "?k data:numberOfPartners ?av.\n" +
                    "?k data:numberOfCommercialSponsors ?aw.\n" +
                    "?k data:TotalContributionValue ?ax.\n" +
                    "?k data:numberOfActiveContributors ?ay.\n" +
                    "?k data:numberOfFrequentUsers ?az.\n" +
                    "?k data:haveDocumentation ?ba.\n" +
                    "?k data:numberOfContributorsTypes ?bb.\n" +
                    "?k data:numberOfTypesAppProjects ?bc.\n" +
                    "?k data:supportNaturalLanguages ?bd.\n" +
                    "?k data:numberOfTypesTechSupported ?be.\n" +
                    "?k data:numberOfTypesDevTechSupported ?bf.\n"+
                    "?k txt:hasParameter ?1.\n" +
                    "?1 data:numberOfCountriesPar ?2.\n" +
                    "?1 data:semanticClosenessAvgPar ?3.\n" +
                    "?1 data:numberOfNodeTypesPar ?4.\n" +
                    "?1 data:timeWorkTogetherPar ?5.\n" +
                    "?1 data:numberOfNewMembersPar ?6.\n" +
                    "?1 data:developerCommitsPar ?7.\n" +
                    "?1 data:numberOfHoursWorkedPAr ?8.\n" +
                    "?1 data:activeMembersPar ?9.\n" +
                    "?1 data:numberOfCommunitsPar ?10.\n" +
                    "?1 data:numberOfReleasesPar ?11.\n" +
                    "?1 data:totalEfforPar ?12.\n" +
                    "?1 data:numberOfModifiedFilesPar ?13.\n" +
                    "?1 data:numberModifiedFileTypesPar ?14.\n" +
                    "?1 data:numberOfEventParticipantsPar ?15.\n" +
                    "?1 data:numberOfEventProjectParticipantsPar ?16.\n" +
                    "?1 data:numberOfJobAdvertisementsPar ?17.\n" +
                    "?1 data:numberOfDownloadsPar ?18.\n" +
                    "?1 data:numberOfMailingListMembersPar ?19.\n" +
                    "?1 data:numberOfPassiveUsersPar ?20.\n" +
                    "?1 data:numberOfReadersPar ?21.\n" +
                    "?1 data:numberOfScientificPublicationPar ?22.\n" +
                    "?1 data:numberOfSocialMediaHitsPar ?23.\n" +
                    "?1 data:numberOfWebPageRequestsPar ?24.\n" +
                    "?1 data:numberOfDevelopersPar ?25.\n" +
                    "?1 data:numberOfUsersGroupsPar ?26.\n" +
                    "?1 data:numberOfProgrammingLanguagesSupportedPar ?27.\n" +
                    "?1 data:numberOfDifferentHardwareDevicesPar ?28.\n" +
                    "?1 data:existPlanForCollapsePar ?29.\n" +
                    "?1 data:numberOfProjectsAddedPar ?30.\n" +
                    "?1 data:numberOfEventsPar ?31.\n" +
                    "?1 data:addedKLOCPar ?32.\n" +
                    "?1 data:numberOfArtifactsPar ?33.\n" +
                    "?1 data:numberOfTransmittedMessagesPar ?34.\n" +
                    "?1 data:bugFixTimePar ?35.\n" +
                    "?1 data:numberOfPartnersAddedPar ?36.\n" +
                    "?1 data:numberOfUsersPar ?37.\n" +
                    "?1 data:averageTimeUsePar ?38.\n" +
                    "?1 data:numberOfNodesConnectionsPar ?39.\n" +
                    "?1 data:ConnectivityCapacityPar ?40.\n" +
                    "?1 data:ratioConnectionsCapacityPar ?41.\n" +
                    "?1 data:nodesCentralityPar ?42.\n" +
                    "?1 data:numberOfExternalPartnersPar ?43.\n" +
                    "?1 data:GlossaryOfTermsPar ?44.\n" +
                    "?1 data:numberOfProductTypesPar ?45.\n" +
                    "?1 data:GreaterCollaborationPar ?46.\n" +
                    "?1 data:numberOfActiveProjectsPar ?47.\n" +
                    "?1 data:TotalProducedFilesPar ?48.\n" +
                    "?1 data:numberOfPartnersPar ?49.\n" +
                    "?1 data:numberOfCommercialSponsorsPar ?50.\n" +
                    "?1 data:TotalContributionValuePar ?51.\n" +
                    "?1 data:numberOfActiveContributorsPar ?52.\n" +
                    "?1 data:numberOfFrequentUsersPar ?53.\n" +
                    "?1 data:haveDocumentationPar ?54.\n" +
                    "?1 data:numberOfContributorsTypesPar ?55.\n" +
                    "?1 data:numberOfTypesAppProjectsPar ?56.\n" +
                    "?1 data:supportNaturalLanguagesPar ?57.\n" +
                    "?1 data:numberOfTypesTechSupportedPar ?58.\n" +
                    "?1 data:numberOfTypesDevTechSupportedPar ?59}";
                    
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
                    subject = linha.get("d");
                    model.setTimeWorkTogether(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("e");
                    model.setNumberOfNewMembers(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
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
                    subject = linha.get("m");
                    model.setNumberOfModifiedFiles(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("n");
                    model.setNumberModifiedFileTypes(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("o");
                    model.setNumberOfEventParticipants(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
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
                    subject = linha.get("zz");
                    model.setGlossaryOfTerms(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#string","").replace("\"", ""));
                    subject = linha.get("ar");
                    model.setNumberOfProductTypes(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("as");
                    model.setGreaterCollaboration(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("at");
                    model.setNumberOfActiveProjects(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("au");
                    model.setTotalProducedFiles(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
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
                    subject = linha.get("2");
                    model.setNumberOfCountriesPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("3");
                    model.setSemanticClosenessAvgPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("4");
                    model.setNumberOfNodeTypesPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("5");
                    model.setTimeWorkTogetherPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("6");
                    model.setNumberOfNewMembersPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("7");
                    model.setDeveloperCommitsPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("8");
                    model.setNumberOfHoursWorkedPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("9");
                    model.setActiveMembersPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("10");
                    model.setNumberOfCommunitsPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("11");
                    model.setNumberOfReleasesPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("12");
                    model.setTotalEfforPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("13");
                    model.setNumberOfModifiedFilesPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("14");
                    model.setNumberModifiedFileTypesPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("15");
                    model.setNumberOfEventParticipantsPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("16");
                    model.setNumberOfEventProjectParticipantsPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("17");
                    model.setNumberOfJobAdvertisementsPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("18");
                    model.setNumberOfDownloadsPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("19");
                    model.setNumberOfMailingListMembersPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("20");
                    model.setNumberOfPassiveUsersPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("21");
                    model.setNumberOfReadersPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("22");
                    model.setNumberOfScientificPublicationPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("23");
                    model.setNumberOfSocialMediaHitsPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("24");
                    model.setNumberOfWebPageRequestsPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("25");
                    model.setNumberOfDevelopersPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("26");
                    model.setNumberOfUsersGroupsPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("27");
                    model.setNumberOfProgrammingLanguagesSupportedPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("28");
                    model.setNumberOfDifferentHardwareDevicesPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("29");
                    model.setExistPlanForCollapsePar(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#string","").replace("\"", ""));
                    subject = linha.get("30");
                    model.setNumberOfProjectsAddedPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("31");
                    model.setNumberOfEventsPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("32");
                    model.setAddedKLOCPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("33");
                    model.setNumberOfArtifactsPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("34");
                    model.setNumberOfTransmittedMessagesPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("35");
                    model.setBugFixTimePar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("36");
                    model.setNumberOfPartnersAddedPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("37");
                    model.setNumberOfUsersPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("38");
                    model.setAverageTimeUsePar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("39");
                    model.setNumberOfNodesConnectionsPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("40");
                    model.setConnectivityCapacityPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("41");
                    model.setRatioConnectionsCapacityPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("42");
                    model.setNodesCentralityPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("43");
                    model.setNumberOfExternalPartnersPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("44");
                    model.setGlossaryOfTermsPar(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#string","").replace("\"", ""));
                    subject = linha.get("45");
                    model.setNumberOfProductTypesPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("46");
                    model.setGreaterCollaborationPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("47");
                    model.setNumberOfActiveProjectsPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("48");
                    model.setTotalProducedFilesPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("49");
                    model.setNumberOfPartnersPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("50");
                    model.setNumberOfCommercialSponsorsPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("51");
                    model.setTotalContributionValuePar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("52");
                    model.setNumberOfActiveContributorsPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("53");
                    model.setNumberOfFrequentUsersPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("54");
                    model.setHaveDocumentationPar(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#string","").replace("\"", ""));
                    subject = linha.get("55");
                    model.setNumberOfContributorsTypesPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("56");
                    model.setNumberOfTypesAppProjectsPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("57");
                    model.setSupportNaturalLanguagesPar(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#string","").replace("\"", ""));
                    subject = linha.get("58");
                    model.setNumberOfTypesTechSupportedPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                    subject = linha.get("59");
                    model.setNumberOfTypesDevTechSupportedPar(Integer.parseInt(subject.toString().replace("^^http://www.w3.org/2001/XMLSchema#int","").replace("\"", "")));
                   
                    
                   boolean parametro = false;
                    
                    ArrayList<IndividualModel> lista = returnHeterogeneity();
                    for(int i = 0 ; i < lista.size(); i++){
                        if(lista.get(i).getName().equals(model.getName()))
                            parametro = true;
                    }
                    model.setHeterogeneity(parametro);
                    parametro = false;
                    
                    lista = returnRegenerationAbility();
                    for(int i = 0 ; i < lista.size(); i++){
                        if(lista.get(i).getName().equals(model.getName()))
                            parametro = true;
                    }
                    model.setRegenerationAbility(parametro);
                    parametro = false;
                    
                    lista = returnEffortBalance();
                    for(int i = 0 ; i < lista.size(); i++){
                        if(lista.get(i).getName().equals(model.getName()))
                            parametro = true;
                    }
                    model.setEffortBalance(parametro);
                    parametro = false;
                    
                    lista = returnExpertiseBalance();
                    for(int i = 0 ; i < lista.size(); i++){
                        if(lista.get(i).getName().equals(model.getName()))
                            parametro = true;
                    }
                    model.setExpertiseBalance(parametro);
                    parametro = false;
                    
                    lista = returnVisibility();
                    for(int i = 0 ; i < lista.size(); i++){
                        if(lista.get(i).getName().equals(model.getName()))
                            parametro = true;
                    }
                    model.setVisibility(parametro);
                    parametro = false;
                    
                     lista = returnVisibility();
                    for(int i = 0 ; i < lista.size(); i++){
                        if(lista.get(i).getName().equals(model.getName()))
                            parametro = true;
                    }
                    model.setVisibility(parametro);
                    parametro = false;
                    
                    lista = returnSustainability();
                    for(int i = 0 ; i < lista.size(); i++){
                        if(lista.get(i).getName().equals(model.getName()))
                            parametro = true;
                    }
                    model.setSustainability(parametro);
                    parametro = false;
                    
                    lista = returnProductivity();
                    for(int i = 0 ; i < lista.size(); i++){
                        if(lista.get(i).getName().equals(model.getName()))
                            parametro = true;
                    }
                    model.setProductivity(parametro);
                    parametro = false;
                    
                    lista = returnInterrelatedness();
                    for(int i = 0 ; i < lista.size(); i++){
                        if(lista.get(i).getName().equals(model.getName()))
                            parametro = true;
                    }
                    model.setInterrelatedness(parametro);
                    parametro = false;
                    
                     lista = returnInformationConsistence();
                    for(int i = 0 ; i < lista.size(); i++){
                        if(lista.get(i).getName().equals(model.getName()))
                            parametro = true;
                    }
                    model.setInformationConsistence(parametro);
                    parametro = false;
                    
                    lista = returnClustering();
                    for(int i = 0 ; i < lista.size(); i++){
                        if(lista.get(i).getName().equals(model.getName()))
                            parametro = true;
                    }
                    model.setClustering(parametro);
                    parametro = false;
                    
                    lista = returnFinancialConsistence();
                    for(int i = 0 ; i < lista.size(); i++){
                        if(lista.get(i).getName().equals(model.getName()))
                            parametro = true;
                    }
                    model.setFinancialConsistence(parametro);
                    parametro = false;
                    
                     lista = returnRobustness();
                    for(int i = 0 ; i < lista.size(); i++){
                        if(lista.get(i).getName().equals(model.getName()))
                            parametro = true;
                    }
                    model.setRobustness(parametro);
                    parametro = false;
                    
                    lista = returnNicheCreation();
                    for(int i = 0 ; i < lista.size(); i++){
                        if(lista.get(i).getName().equals(model.getName()))
                            parametro = true;
                    }
                    model.setNicheCreation(parametro);
                    parametro = false;
                    
                    lista = returnHealth();
                    for(int i = 0 ; i < lista.size(); i++){
                        if(lista.get(i).getName().equals(model.getName()))
                            parametro = true;
                    }
                    model.setHealth(parametro);
                    
                    Result.add(model);
                }
                return Result;
        }else{
            return null;
        }
    }
    
    public static void salvaIndividuos(IndividualModel platform, IndividualModel parameter){
        
        //OntModel seco = OntoConnection.OntoConnectionSInferencia();
        Resource plat = sec.getResource(URI+"#Platform");
        Resource par = sec.getResource(URI+"#Parameter");
        Individual p = sec.createIndividual(platform.getName(), plat);
        Individual pa = sec.createIndividual(parameter.getName(), par);
        Individual testep = sec.getIndividual(URI+"#"+platform.getName());
        Individual testepa = sec.getIndividual(URI+"#"+parameter.getName());
        ObjectProperty hasParameter = sec.getObjectProperty(URI+"#hasParameter");
        testep.addProperty(hasParameter, testepa);
        
        OntoConnection.gravaOnto(sec);
    }
    
}
