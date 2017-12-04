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
    
        
    public static ArrayList<PlatformModel> returnHeterogeneity(){
        return OntoDAO.returnHeterogeneity();
    }
    
    public static ArrayList<PlatformModel> returnRegenerationAbility(){
        return OntoDAO.returnRegenerationAbility();
    }
    
    public static ArrayList<PlatformModel> returnEffortBalance(){
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
    
    public static ArrayList<PlatformModel> returnProductivity(){
        return OntoDAO.returnProductivity();
    }
    
    public static ArrayList<PlatformModel> returnDiversity(){
        return OntoDAO.returnDiversity();
    }
    
     public static ArrayList<PlatformModel> returnNicheCreation(){
        return OntoDAO.returnNicheCreation();
    }
    
}
