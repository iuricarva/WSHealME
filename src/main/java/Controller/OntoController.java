/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.IndividualModel;
import Model.PlatformModel;
import OntoDAO.OntoDAO;
import java.util.ArrayList;

/**
 *
 * @author icarv
 */
public class OntoController {
    
    public static ArrayList<IndividualModel> returnPlatforms(){
        return OntoDAO.returnPlatforms();
    }    
    
    public static ArrayList<IndividualModel> returnHeterogeneity(){
        //return OntoDAO.returnHeterogeneity();
        return OntoDAO.returnHeterogeneity();
    }
    
    public static ArrayList<IndividualModel> returnRegenerationAbility(){
        return OntoDAO.returnRegenerationAbility();
    }
    
    public static ArrayList<IndividualModel> returnEffortBalance(){
        return OntoDAO.returnEffortBalance();
    }
    
    public static ArrayList<IndividualModel> returnExpertiseBalance(){
        return OntoDAO.returnExpertiseBalance();
    }
    
    public static ArrayList<IndividualModel> returnVisibility(){
        return OntoDAO.returnVisibility();
    }
    
    public static ArrayList<IndividualModel> returnSustainability(){
        return OntoDAO.returnSustainability();
    }
    
    public static ArrayList<IndividualModel> returnHealth(){
        return OntoDAO.returnHealth();
    }
    
    public static ArrayList<IndividualModel> returnProductivity(){
        return OntoDAO.returnProductivity();
    }
    
    public static ArrayList<IndividualModel> returnDiversity(){
        return OntoDAO.returnDiversity();
    }
    
    public static ArrayList<IndividualModel> returnNicheCreation(){
        return OntoDAO.returnNicheCreation();
    }
    
    public static ArrayList<IndividualModel> returnInformationConsistence(){
        return OntoDAO.returnInformationConsistence();
    }
    
    public static ArrayList<IndividualModel> returnInterrelatedness(){
        return OntoDAO.returnInterrelatedness();
    }
    
    public static ArrayList<IndividualModel> returnClustering(){
        return OntoDAO.returnClustering();
    }
    
    public static ArrayList<IndividualModel> returnFinancialConsistence(){
        return OntoDAO.returnFinancialConsistence();
    }
     
    public static void salvaIndividuos(String platform, String parameter){
        IndividualModel plat = new IndividualModel();
        IndividualModel par = new IndividualModel();
        plat.setName(platform);
        par.setName(parameter);
        OntoDAO.salvaIndividuos(plat, par);
    }
    
}
