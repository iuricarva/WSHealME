/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSSPack;

import Controller.OntoController;
import Model.IndividualModel;
import Model.PlatformModel;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author icarv
 */
@Path("WSSecoRestful")
public class WSSeco {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of WSSeco
     */
    public WSSeco() {
    }

    /**
     * Retrieves representation of an instance of WSSPack.WSSeco
     * @return an instance of java.lang.String
     */
        
   
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getdata")
    public static List<PlatformModel> returnData(){
        return OntoController.returnData();
    }
        
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getplatforms")
    public List<IndividualModel> getPlatforms() {
        
        return OntoController.returnPlatforms();
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getheterogeneity")
    public List<IndividualModel> getHeterogeneity() {
        
        return OntoController.returnHeterogeneity();
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getregenerationability")
    public List<IndividualModel> getRegenerationAbility() {
        
        return OntoController.returnRegenerationAbility();
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("geteffortbalance")
    public List<IndividualModel> getEffortBalance() {
        
        return OntoController.returnEffortBalance();
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getexpertisebalance")
    public List<IndividualModel> getExpertiseBalance() {
        
        return OntoController.returnExpertiseBalance();
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getvisibility")
    public List<IndividualModel> getVisibility() {
        
        return OntoController.returnVisibility();
        
    }
    
       
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getsustainability")
    public List<IndividualModel> getSustainability() {
        
        return OntoController.returnSustainability();
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("gethealth")
    public List<IndividualModel> getHealth() {
        
        return OntoController.returnHealth();
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getproductivity")
    public List<IndividualModel> getProductivity() {
        
        return OntoController.returnProductivity();
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getdiversity")
    public List<IndividualModel> getDiversity() {
        
        return OntoController.returnDiversity();
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getnichecreation")
    public List<IndividualModel> getNicheCreation() {
        
        return OntoController.returnNicheCreation();
        
    }
    
    @GET
    @Path("/insertplatform/{platform}/{parameter}")
    @Produces(MediaType.APPLICATION_XML)
    public void getTeste(@PathParam("platform")String platfomr, @PathParam("parameter")String parameter) {
        OntoController.salvaIndividuos(platfomr, parameter);
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getinformationconsistence")
    public List<IndividualModel> getInformationConsistencce() {
        
        return OntoController.returnInformationConsistence();
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getinterrelatedness")
    public List<IndividualModel> getInterrelatedness() {
        
        return OntoController.returnInterrelatedness();
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getclustering")
    public List<IndividualModel> getClustering() {
        
        return OntoController.returnClustering();
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getfinancialconsistence")
    public List<IndividualModel> getFinancialConsistence() {
        
        return OntoController.returnFinancialConsistence();
        
    }

    /**
     * PUT method for updating or creating an instance of WSSeco
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
