/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author icarv
 */
@XmlRootElement
public class PlatformModel { 
    private int id;
    private String name;
    private int numberOfCountries;
    private int semanticClosenessAvg;
    private int numberOfNodeTypes;
    private int timeWorkTogether;
    private int numberOfNewMembers;
    private int developerCommits;
    private int numberOfHoursWorked;
    private int activeMembers;
    private int numberOfCommunits;
    private int numberOfReleases;
    private int totalEffor;
    private int numberOfModifiedFiles;
    private int numberModifiedFileTypes;
    private int numberOfEventParticipants;
    private int numberOfEventProjectParticipants;
    private int numberOfJobAdvertisements;
    private int numberOfDownloads;
    private int numberOfMailingListMembers;
    private int numberOfPassiveUsers;
    private int numberOfReaders;
    private int numberOfScientificPublication;
    private int numberOfSocialMediaHits;
    private int numberOfWebPageRequests;
    private int numberOfDevelopers;
    private int numberOfUsersGroups;
    private int numberOfProgrammingLanguagesSupported;
    private int numberOfDifferentHardwareDevices;
    private String existPlanForCollapse;
    private int numberOfProjectsAdded;
    private int numberOfEvents;
    private int addedKLOC;
    private int numberOfArtifacts;
    private int numberOfTransmittedMessages;
    private int bugFixTime;
    private int numberOfPartnersAdded;
    private int numberOfUsers;
    private int averageTimeUse;
    private int numberOfNodesConnections;
    private int connectivityCapacity;
    private int ratioConnectionsCapacity;
    private int nodesCentrality;
    private int numberOfExternalPartners;
    private String glossaryOfTerms;
    private int numberOfProductTypes;
    private int greaterCollaboration;
    private int numberOfActiveProjects;
    private int totalProducedFiles;
    private int numberOfPartners;
    private int numberOfCommercialSponsors;
    private int totalContributionValue;
    private int numberOfActiveContributors;
    private int numberOfFrequentUsers;
    private String haveDocumentation;
    private int numberOfContributorsTypes;
    private int numberOfTypesAppProjects;
    private String supportNaturalLanguages;
    private int numberOfTypesTechSupported;
    private int numberOfTypesDevTechSupported;
    
    private int numberOfCountriesPar;
    private int semanticClosenessAvgPar;
    private int numberOfNodeTypesPar;
    private int timeWorkTogetherPar;
    private int numberOfNewMembersPar;
    private int developerCommitsPar;
    private int numberOfHoursWorkedPar;
    private int activeMembersPar;
    private int numberOfCommunitsPar;
    private int numberOfReleasesPar;
    private int totalEfforPar;
    private int numberOfModifiedFilesPar;
    private int numberModifiedFileTypesPar;
    private int numberOfEventParticipantsPar;
    private int numberOfEventProjectParticipantsPar;
    private int numberOfJobAdvertisementsPar;
    private int numberOfDownloadsPar;
    private int numberOfMailingListMembersPar;
    private int numberOfPassiveUsersPar;
    private int numberOfReadersPar;
    private int numberOfScientificPublicationPar;
    private int numberOfSocialMediaHitsPar;
    private int numberOfWebPageRequestsPar;
    private int numberOfDevelopersPar;
    private int numberOfUsersGroupsPar;
    private int numberOfProgrammingLanguagesSupportedPar;
    private int numberOfDifferentHardwareDevicesPar;
    private String existPlanForCollapsePar;
    private int numberOfProjectsAddedPar;
    private int numberOfEventsPar;
    private int addedKLOCPar;
    private int numberOfArtifactsPar;
    private int numberOfTransmittedMessagesPar;
    private int bugFixTimePar;
    private int numberOfPartnersAddedPar;
    private int numberOfUsersPar;
    private int averageTimeUsePar;
    private int numberOfNodesConnectionsPar;
    private int connectivityCapacityPar;
    private int ratioConnectionsCapacityPar;
    private int nodesCentralityPar;
    private int numberOfExternalPartnersPar;
    private String glossaryOfTermsPar;
    private int numberOfProductTypesPar;
    private int greaterCollaborationPar;
    private int numberOfActiveProjectsPar;
    private int totalProducedFilesPar;
    private int numberOfPartnersPar;
    private int numberOfCommercialSponsorsPar;
    private int totalContributionValuePar;
    private int numberOfActiveContributorsPar;
    private int numberOfFrequentUsersPar;
    private String haveDocumentationPar;
    private int numberOfContributorsTypesPar;
    private int numberOfTypesAppProjectsPar;
    private String supportNaturalLanguagesPar;
    private int numberOfTypesTechSupportedPar;
    private int numberOfTypesDevTechSupportedPar;
    
    
    private boolean heterogeneity;
    private boolean regenerationAbility;
    private boolean effortBalance;
    private boolean expertiseBalance;
    private boolean visibility;
    private boolean sustainability;
    private boolean diversity;
    private boolean productivity;
    private boolean interrelatedness;
    private boolean informationConsistence;
    private boolean clustering;
    private boolean financialConsistence;
    private boolean robustness;
    private boolean nicheCreation;
    private boolean health;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public boolean isHealth() {
        return health;
    }

    public void setHealth(boolean Health) {
        this.health = Health;
    }
    
    

    public boolean isHeterogeneity() {
        return heterogeneity;
    }

    public void setHeterogeneity(boolean Heterogeneity) {
        this.heterogeneity = Heterogeneity;
    }

    public boolean isRegenerationAbility() {
        return regenerationAbility;
    }

    public void setRegenerationAbility(boolean RegenerationAbility) {
        this.regenerationAbility = RegenerationAbility;
    }

    public boolean isEffortBalance() {
        return effortBalance;
    }

    public void setEffortBalance(boolean EffortBalance) {
        this.effortBalance = EffortBalance;
    }

    public boolean isExpertiseBalance() {
        return expertiseBalance;
    }

    public void setExpertiseBalance(boolean ExpertiseBalance) {
        this.expertiseBalance = ExpertiseBalance;
    }

    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean Visibility) {
        this.visibility = Visibility;
    }

    public boolean isSustainability() {
        return sustainability;
    }

    public void setSustainability(boolean Sustainability) {
        this.sustainability = Sustainability;
    }

    public boolean isDiversity() {
        return diversity;
    }

    public void setDiversity(boolean Diversity) {
        this.diversity = Diversity;
    }

    public boolean isProductivity() {
        return productivity;
    }

    public void setProductivity(boolean Productivity) {
        this.productivity = Productivity;
    }

    public boolean isInterrelatedness() {
        return interrelatedness;
    }

    public void setInterrelatedness(boolean Interrelatedness) {
        this.interrelatedness = Interrelatedness;
    }

    public boolean isInformationConsistence() {
        return informationConsistence;
    }

    public void setInformationConsistence(boolean InformationConsistence) {
        this.informationConsistence = InformationConsistence;
    }

    public boolean isClustering() {
        return clustering;
    }

    public void setClustering(boolean Clustering) {
        this.clustering = Clustering;
    }

    public boolean isFinancialConsistence() {
        return financialConsistence;
    }

    public void setFinancialConsistence(boolean FinancialConsistence) {
        this.financialConsistence = FinancialConsistence;
    }

    public boolean isRobustness() {
        return robustness;
    }

    public void setRobustness(boolean Robustness) {
        this.robustness = Robustness;
    }

    public boolean isNicheCreation() {
        return nicheCreation;
    }

    public void setNicheCreation(boolean NicheCreation) {
        this.nicheCreation = NicheCreation;
    }
    
    

    public int getActiveMembers() {
        return activeMembers;
    }

    public void setActiveMembers(int activeMembers) {
        this.activeMembers = activeMembers;
    }

    public int getNumberOfCommunits() {
        return numberOfCommunits;
    }

    public void setNumberOfCommunits(int numberOfCommunits) {
        this.numberOfCommunits = numberOfCommunits;
    }

    
    
    public int getNumberOfReleases() {
        return numberOfReleases;
    }

    public void setNumberOfReleases(int numberOfReleases) {
        this.numberOfReleases = numberOfReleases;
    }

    public int getTotalEffor() {
        return totalEffor;
    }

    public void setTotalEffor(int totalEffor) {
        this.totalEffor = totalEffor;
    }

    public int getNumberOfModifiedFiles() {
        return numberOfModifiedFiles;
    }

    public void setNumberOfModifiedFiles(int numberOfModifiedFiles) {
        this.numberOfModifiedFiles = numberOfModifiedFiles;
    }

    public int getNumberModifiedFileTypes() {
        return numberModifiedFileTypes;
    }

    public void setNumberModifiedFileTypes(int numberModifiedFileTypes) {
        this.numberModifiedFileTypes = numberModifiedFileTypes;
    }

    public int getNumberOfEventParticipants() {
        return numberOfEventParticipants;
    }

    public void setNumberOfEventParticipants(int numberOfEventParticipants) {
        this.numberOfEventParticipants = numberOfEventParticipants;
    }

    public int getNumberOfEventProjectParticipants() {
        return numberOfEventProjectParticipants;
    }

    public void setNumberOfEventProjectParticipants(int numberOfEventProjectParticipants) {
        this.numberOfEventProjectParticipants = numberOfEventProjectParticipants;
    }

    public int getNumberOfJobAdvertisements() {
        return numberOfJobAdvertisements;
    }

    public void setNumberOfJobAdvertisements(int numberOfJobAdvertisements) {
        this.numberOfJobAdvertisements = numberOfJobAdvertisements;
    }

    public int getNumberOfDownloads() {
        return numberOfDownloads;
    }

    public void setNumberOfDownloads(int numberOfDownloads) {
        this.numberOfDownloads = numberOfDownloads;
    }

    public int getNumberOfMailingListMembers() {
        return numberOfMailingListMembers;
    }

    public void setNumberOfMailingListMembers(int numberOfMailingListMembers) {
        this.numberOfMailingListMembers = numberOfMailingListMembers;
    }

    public int getNumberOfPassiveUsers() {
        return numberOfPassiveUsers;
    }

    public void setNumberOfPassiveUsers(int numberOfPassiveUsers) {
        this.numberOfPassiveUsers = numberOfPassiveUsers;
    }

    public int getNumberOfReaders() {
        return numberOfReaders;
    }

    public void setNumberOfReaders(int numberOfReaders) {
        this.numberOfReaders = numberOfReaders;
    }

    public int getNumberOfScientificPublication() {
        return numberOfScientificPublication;
    }

    public void setNumberOfScientificPublication(int numberOfScientificPublication) {
        this.numberOfScientificPublication = numberOfScientificPublication;
    }

    public int getNumberOfSocialMediaHits() {
        return numberOfSocialMediaHits;
    }

    public void setNumberOfSocialMediaHits(int numberOfSocialMediaHits) {
        this.numberOfSocialMediaHits = numberOfSocialMediaHits;
    }

    public int getNumberOfWebPageRequests() {
        return numberOfWebPageRequests;
    }

    public void setNumberOfWebPageRequests(int numberOfWebPageRequests) {
        this.numberOfWebPageRequests = numberOfWebPageRequests;
    }

    public int getNumberOfDevelopers() {
        return numberOfDevelopers;
    }

    public void setNumberOfDevelopers(int numberOfDevelopers) {
        this.numberOfDevelopers = numberOfDevelopers;
    }

    public int getNumberOfUsersGroups() {
        return numberOfUsersGroups;
    }

    public void setNumberOfUsersGroups(int numberOfUsersGroups) {
        this.numberOfUsersGroups = numberOfUsersGroups;
    }

    public int getNumberOfProgrammingLanguagesSupported() {
        return numberOfProgrammingLanguagesSupported;
    }

    public void setNumberOfProgrammingLanguagesSupported(int numberOfProgrammingLanguagesSupported) {
        this.numberOfProgrammingLanguagesSupported = numberOfProgrammingLanguagesSupported;
    }

    public int getNumberOfDifferentHardwareDevices() {
        return numberOfDifferentHardwareDevices;
    }

    public void setNumberOfDifferentHardwareDevices(int numberOfDifferentHardwareDevices) {
        this.numberOfDifferentHardwareDevices = numberOfDifferentHardwareDevices;
    }

    public String getExistPlanForCollapse() {
        return existPlanForCollapse;
    }

    public void setExistPlanForCollapse(String existPlanForCollapse) {
        this.existPlanForCollapse = existPlanForCollapse;
    }

    public int getNumberOfProjectsAdded() {
        return numberOfProjectsAdded;
    }

    public void setNumberOfProjectsAdded(int numberOfProjectsAdded) {
        this.numberOfProjectsAdded = numberOfProjectsAdded;
    }

    public int getNumberOfEvents() {
        return numberOfEvents;
    }

    public void setNumberOfEvents(int numberOfEvents) {
        this.numberOfEvents = numberOfEvents;
    }

    public int getAddedKLOC() {
        return addedKLOC;
    }

    public void setAddedKLOC(int addedKLOC) {
        this.addedKLOC = addedKLOC;
    }

    public int getNumberOfArtifacts() {
        return numberOfArtifacts;
    }

    public void setNumberOfArtifacts(int numberOfArtifacts) {
        this.numberOfArtifacts = numberOfArtifacts;
    }

    public int getNumberOfTransmittedMessages() {
        return numberOfTransmittedMessages;
    }

    public void setNumberOfTransmittedMessages(int numberOfTransmittedMessages) {
        this.numberOfTransmittedMessages = numberOfTransmittedMessages;
    }

    public int getBugFixTime() {
        return bugFixTime;
    }

    public void setBugFixTime(int bugFixTime) {
        this.bugFixTime = bugFixTime;
    }

    public int getNumberOfPartnersAdded() {
        return numberOfPartnersAdded;
    }

    public void setNumberOfPartnersAdded(int numberOfPartnersAdded) {
        this.numberOfPartnersAdded = numberOfPartnersAdded;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public void setNumberOfUsers(int numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }

    public int getAverageTimeUse() {
        return averageTimeUse;
    }

    public void setAverageTimeUse(int averageTimeUse) {
        this.averageTimeUse = averageTimeUse;
    }

    public int getNumberOfNodesConnections() {
        return numberOfNodesConnections;
    }

    public void setNumberOfNodesConnections(int numberOfNodesConnections) {
        this.numberOfNodesConnections = numberOfNodesConnections;
    }

    public int getConnectivityCapacity() {
        return connectivityCapacity;
    }

    public void setConnectivityCapacity(int connectivityCapacity) {
        this.connectivityCapacity = connectivityCapacity;
    }

    public int getRatioConnectionsCapacity() {
        return ratioConnectionsCapacity;
    }

    public void setRatioConnectionsCapacity(int ratioConnectionsCapacity) {
        this.ratioConnectionsCapacity = ratioConnectionsCapacity;
    }

    public int getNodesCentrality() {
        return nodesCentrality;
    }

    public void setNodesCentrality(int nodesCentrality) {
        this.nodesCentrality = nodesCentrality;
    }

    public int getNumberOfExternalPartners() {
        return numberOfExternalPartners;
    }

    public void setNumberOfExternalPartners(int numberOfExternalPartners) {
        this.numberOfExternalPartners = numberOfExternalPartners;
    }

    public String getGlossaryOfTerms() {
        return glossaryOfTerms;
    }

    public void setGlossaryOfTerms(String GlossaryOfTerms) {
        this.glossaryOfTerms = GlossaryOfTerms;
    }

    public int getNumberOfProductTypes() {
        return numberOfProductTypes;
    }

    public void setNumberOfProductTypes(int numberOfProductTypes) {
        this.numberOfProductTypes = numberOfProductTypes;
    }

    public int getGreaterCollaboration() {
        return greaterCollaboration;
    }

    public void setGreaterCollaboration(int GreaterCollaboration) {
        this.greaterCollaboration = GreaterCollaboration;
    }

    public int getNumberOfActiveProjects() {
        return numberOfActiveProjects;
    }

    public void setNumberOfActiveProjects(int numberOfActiveProjects) {
        this.numberOfActiveProjects = numberOfActiveProjects;
    }

    public int getTotalProducedFiles() {
        return totalProducedFiles;
    }

    public void setTotalProducedFiles(int TotalProducedFiles) {
        this.totalProducedFiles = TotalProducedFiles;
    }

    public int getNumberOfPartners() {
        return numberOfPartners;
    }

    public void setNumberOfPartners(int numberOfPartners) {
        this.numberOfPartners = numberOfPartners;
    }

    public int getNumberOfCommercialSponsors() {
        return numberOfCommercialSponsors;
    }

    public void setNumberOfCommercialSponsors(int numberOfCommercialSponsors) {
        this.numberOfCommercialSponsors = numberOfCommercialSponsors;
    }

    public int getTotalContributionValue() {
        return totalContributionValue;
    }

    public void setTotalContributionValue(int TotalContributionValue) {
        this.totalContributionValue = TotalContributionValue;
    }

    public int getNumberOfActiveContributors() {
        return numberOfActiveContributors;
    }

    public void setNumberOfActiveContributors(int numberOfActiveContributors) {
        this.numberOfActiveContributors = numberOfActiveContributors;
    }

    public int getNumberOfFrequentUsers() {
        return numberOfFrequentUsers;
    }

    public void setNumberOfFrequentUsers(int numberOfFrequentUsers) {
        this.numberOfFrequentUsers = numberOfFrequentUsers;
    }

    public String getHaveDocumentation() {
        return haveDocumentation;
    }

    public void setHaveDocumentation(String haveDocumentation) {
        this.haveDocumentation = haveDocumentation;
    }

    public int getNumberOfContributorsTypes() {
        return numberOfContributorsTypes;
    }

    public void setNumberOfContributorsTypes(int numberOfContributorsTypes) {
        this.numberOfContributorsTypes = numberOfContributorsTypes;
    }

    public int getNumberOfTypesAppProjects() {
        return numberOfTypesAppProjects;
    }

    public void setNumberOfTypesAppProjects(int numberOfTypesAppProjects) {
        this.numberOfTypesAppProjects = numberOfTypesAppProjects;
    }

    public String getSupportNaturalLanguages() {
        return supportNaturalLanguages;
    }

    public void setSupportNaturalLanguages(String supportNaturalLanguages) {
        this.supportNaturalLanguages = supportNaturalLanguages;
    }

    public int getNumberOfTypesTechSupported() {
        return numberOfTypesTechSupported;
    }

    public void setNumberOfTypesTechSupported(int numberOfTypesTechSupported) {
        this.numberOfTypesTechSupported = numberOfTypesTechSupported;
    }

    public int getNumberOfTypesDevTechSupported() {
        return numberOfTypesDevTechSupported;
    }

    public void setNumberOfTypesDevTechSupported(int numberOfTypesDevTechSupported) {
        this.numberOfTypesDevTechSupported = numberOfTypesDevTechSupported;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCountries() {
        return numberOfCountries;
    }

    public void setNumberOfCountries(int numberOfCountries) {
        this.numberOfCountries = numberOfCountries;
    }

    public int getSemanticClosenessAvg() {
        return semanticClosenessAvg;
    }

    public void setSemanticClosenessAvg(int semanticClosenessAvg) {
        this.semanticClosenessAvg = semanticClosenessAvg;
    }

    public int getNumberOfNodeTypes() {
        return numberOfNodeTypes;
    }

    public void setNumberOfNodeTypes(int numberOfNodeTypes) {
        this.numberOfNodeTypes = numberOfNodeTypes;
    }

    public int getTimeWorkTogether() {
        return timeWorkTogether;
    }

    public void setTimeWorkTogether(int timeWorkTogether) {
        this.timeWorkTogether = timeWorkTogether;
    }

    public int getNumberOfNewMembers() {
        return numberOfNewMembers;
    }

    public void setNumberOfNewMembers(int numberOfNewMembers) {
        this.numberOfNewMembers = numberOfNewMembers;
    }

    public int getDeveloperCommits() {
        return developerCommits;
    }

    public void setDeveloperCommits(int developerCommits) {
        this.developerCommits = developerCommits;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public int getNumberOfCountriesPar() {
        return numberOfCountriesPar;
    }

    public void setNumberOfCountriesPar(int numberOfCountriesPar) {
        this.numberOfCountriesPar = numberOfCountriesPar;
    }

    public int getSemanticClosenessAvgPar() {
        return semanticClosenessAvgPar;
    }

    public void setSemanticClosenessAvgPar(int semanticClosenessAvgPar) {
        this.semanticClosenessAvgPar = semanticClosenessAvgPar;
    }

    public int getNumberOfNodeTypesPar() {
        return numberOfNodeTypesPar;
    }

    public void setNumberOfNodeTypesPar(int numberOfNodeTypesPar) {
        this.numberOfNodeTypesPar = numberOfNodeTypesPar;
    }

    public int getTimeWorkTogetherPar() {
        return timeWorkTogetherPar;
    }

    public void setTimeWorkTogetherPar(int timeWorkTogetherPar) {
        this.timeWorkTogetherPar = timeWorkTogetherPar;
    }

    public int getNumberOfNewMembersPar() {
        return numberOfNewMembersPar;
    }

    public void setNumberOfNewMembersPar(int numberOfNewMembersPar) {
        this.numberOfNewMembersPar = numberOfNewMembersPar;
    }

    public int getDeveloperCommitsPar() {
        return developerCommitsPar;
    }

    public void setDeveloperCommitsPar(int developerCommitsPar) {
        this.developerCommitsPar = developerCommitsPar;
    }

    public int getNumberOfHoursWorkedPar() {
        return numberOfHoursWorkedPar;
    }

    public void setNumberOfHoursWorkedPar(int numberOfHoursWorkedPar) {
        this.numberOfHoursWorkedPar = numberOfHoursWorkedPar;
    }

    public int getActiveMembersPar() {
        return activeMembersPar;
    }

    public void setActiveMembersPar(int activeMembersPar) {
        this.activeMembersPar = activeMembersPar;
    }

    public int getNumberOfCommunitsPar() {
        return numberOfCommunitsPar;
    }

    public void setNumberOfCommunitsPar(int numberOfCommunitsPar) {
        this.numberOfCommunitsPar = numberOfCommunitsPar;
    }

    public int getNumberOfReleasesPar() {
        return numberOfReleasesPar;
    }

    public void setNumberOfReleasesPar(int numberOfReleasesPar) {
        this.numberOfReleasesPar = numberOfReleasesPar;
    }

    public int getTotalEfforPar() {
        return totalEfforPar;
    }

    public void setTotalEfforPar(int totalEfforPar) {
        this.totalEfforPar = totalEfforPar;
    }

    public int getNumberOfModifiedFilesPar() {
        return numberOfModifiedFilesPar;
    }

    public void setNumberOfModifiedFilesPar(int numberOfModifiedFilesPar) {
        this.numberOfModifiedFilesPar = numberOfModifiedFilesPar;
    }

    public int getNumberModifiedFileTypesPar() {
        return numberModifiedFileTypesPar;
    }

    public void setNumberModifiedFileTypesPar(int numberModifiedFileTypesPar) {
        this.numberModifiedFileTypesPar = numberModifiedFileTypesPar;
    }

    public int getNumberOfEventParticipantsPar() {
        return numberOfEventParticipantsPar;
    }

    public void setNumberOfEventParticipantsPar(int numberOfEventParticipantsPar) {
        this.numberOfEventParticipantsPar = numberOfEventParticipantsPar;
    }

    public int getNumberOfEventProjectParticipantsPar() {
        return numberOfEventProjectParticipantsPar;
    }

    public void setNumberOfEventProjectParticipantsPar(int numberOfEventProjectParticipantsPar) {
        this.numberOfEventProjectParticipantsPar = numberOfEventProjectParticipantsPar;
    }

    public int getNumberOfJobAdvertisementsPar() {
        return numberOfJobAdvertisementsPar;
    }

    public void setNumberOfJobAdvertisementsPar(int numberOfJobAdvertisementsPar) {
        this.numberOfJobAdvertisementsPar = numberOfJobAdvertisementsPar;
    }

    public int getNumberOfDownloadsPar() {
        return numberOfDownloadsPar;
    }

    public void setNumberOfDownloadsPar(int numberOfDownloadsPar) {
        this.numberOfDownloadsPar = numberOfDownloadsPar;
    }

    public int getNumberOfMailingListMembersPar() {
        return numberOfMailingListMembersPar;
    }

    public void setNumberOfMailingListMembersPar(int numberOfMailingListMembersPar) {
        this.numberOfMailingListMembersPar = numberOfMailingListMembersPar;
    }

    public int getNumberOfPassiveUsersPar() {
        return numberOfPassiveUsersPar;
    }

    public void setNumberOfPassiveUsersPar(int numberOfPassiveUsersPar) {
        this.numberOfPassiveUsersPar = numberOfPassiveUsersPar;
    }

    public int getNumberOfReadersPar() {
        return numberOfReadersPar;
    }

    public void setNumberOfReadersPar(int numberOfReadersPar) {
        this.numberOfReadersPar = numberOfReadersPar;
    }

    public int getNumberOfScientificPublicationPar() {
        return numberOfScientificPublicationPar;
    }

    public void setNumberOfScientificPublicationPar(int numberOfScientificPublicationPar) {
        this.numberOfScientificPublicationPar = numberOfScientificPublicationPar;
    }

    public int getNumberOfSocialMediaHitsPar() {
        return numberOfSocialMediaHitsPar;
    }

    public void setNumberOfSocialMediaHitsPar(int numberOfSocialMediaHitsPar) {
        this.numberOfSocialMediaHitsPar = numberOfSocialMediaHitsPar;
    }

    public int getNumberOfWebPageRequestsPar() {
        return numberOfWebPageRequestsPar;
    }

    public void setNumberOfWebPageRequestsPar(int numberOfWebPageRequestsPar) {
        this.numberOfWebPageRequestsPar = numberOfWebPageRequestsPar;
    }

    public int getNumberOfDevelopersPar() {
        return numberOfDevelopersPar;
    }

    public void setNumberOfDevelopersPar(int numberOfDevelopersPar) {
        this.numberOfDevelopersPar = numberOfDevelopersPar;
    }

    public int getNumberOfUsersGroupsPar() {
        return numberOfUsersGroupsPar;
    }

    public void setNumberOfUsersGroupsPar(int numberOfUsersGroupsPar) {
        this.numberOfUsersGroupsPar = numberOfUsersGroupsPar;
    }

    public int getNumberOfProgrammingLanguagesSupportedPar() {
        return numberOfProgrammingLanguagesSupportedPar;
    }

    public void setNumberOfProgrammingLanguagesSupportedPar(int numberOfProgrammingLanguagesSupportedPar) {
        this.numberOfProgrammingLanguagesSupportedPar = numberOfProgrammingLanguagesSupportedPar;
    }

    public int getNumberOfDifferentHardwareDevicesPar() {
        return numberOfDifferentHardwareDevicesPar;
    }

    public void setNumberOfDifferentHardwareDevicesPar(int numberOfDifferentHardwareDevicesPar) {
        this.numberOfDifferentHardwareDevicesPar = numberOfDifferentHardwareDevicesPar;
    }

    public String getExistPlanForCollapsePar() {
        return existPlanForCollapsePar;
    }

    public void setExistPlanForCollapsePar(String existPlanForCollapsePar) {
        this.existPlanForCollapsePar = existPlanForCollapsePar;
    }

    public int getNumberOfProjectsAddedPar() {
        return numberOfProjectsAddedPar;
    }

    public void setNumberOfProjectsAddedPar(int numberOfProjectsAddedPar) {
        this.numberOfProjectsAddedPar = numberOfProjectsAddedPar;
    }

    public int getNumberOfEventsPar() {
        return numberOfEventsPar;
    }

    public void setNumberOfEventsPar(int numberOfEventsPar) {
        this.numberOfEventsPar = numberOfEventsPar;
    }

    public int getAddedKLOCPar() {
        return addedKLOCPar;
    }

    public void setAddedKLOCPar(int addedKLOCPar) {
        this.addedKLOCPar = addedKLOCPar;
    }

    public int getNumberOfArtifactsPar() {
        return numberOfArtifactsPar;
    }

    public void setNumberOfArtifactsPar(int numberOfArtifactsPar) {
        this.numberOfArtifactsPar = numberOfArtifactsPar;
    }

    public int getNumberOfTransmittedMessagesPar() {
        return numberOfTransmittedMessagesPar;
    }

    public void setNumberOfTransmittedMessagesPar(int numberOfTransmittedMessagesPar) {
        this.numberOfTransmittedMessagesPar = numberOfTransmittedMessagesPar;
    }

    public int getBugFixTimePar() {
        return bugFixTimePar;
    }

    public void setBugFixTimePar(int bugFixTimePar) {
        this.bugFixTimePar = bugFixTimePar;
    }

    public int getNumberOfPartnersAddedPar() {
        return numberOfPartnersAddedPar;
    }

    public void setNumberOfPartnersAddedPar(int numberOfPartnersAddedPar) {
        this.numberOfPartnersAddedPar = numberOfPartnersAddedPar;
    }

    public int getNumberOfUsersPar() {
        return numberOfUsersPar;
    }

    public void setNumberOfUsersPar(int numberOfUsersPar) {
        this.numberOfUsersPar = numberOfUsersPar;
    }

    public int getAverageTimeUsePar() {
        return averageTimeUsePar;
    }

    public void setAverageTimeUsePar(int averageTimeUsePar) {
        this.averageTimeUsePar = averageTimeUsePar;
    }

    public int getNumberOfNodesConnectionsPar() {
        return numberOfNodesConnectionsPar;
    }

    public void setNumberOfNodesConnectionsPar(int numberOfNodesConnectionsPar) {
        this.numberOfNodesConnectionsPar = numberOfNodesConnectionsPar;
    }

    public int getConnectivityCapacityPar() {
        return connectivityCapacityPar;
    }

    public void setConnectivityCapacityPar(int connectivityCapacityPar) {
        this.connectivityCapacityPar = connectivityCapacityPar;
    }

    public int getRatioConnectionsCapacityPar() {
        return ratioConnectionsCapacityPar;
    }

    public void setRatioConnectionsCapacityPar(int ratioConnectionsCapacityPar) {
        this.ratioConnectionsCapacityPar = ratioConnectionsCapacityPar;
    }

    public int getNodesCentralityPar() {
        return nodesCentralityPar;
    }

    public void setNodesCentralityPar(int nodesCentralityPar) {
        this.nodesCentralityPar = nodesCentralityPar;
    }

    public int getNumberOfExternalPartnersPar() {
        return numberOfExternalPartnersPar;
    }

    public void setNumberOfExternalPartnersPar(int numberOfExternalPartnersPar) {
        this.numberOfExternalPartnersPar = numberOfExternalPartnersPar;
    }

    public String getGlossaryOfTermsPar() {
        return glossaryOfTermsPar;
    }

    public void setGlossaryOfTermsPar(String glossaryOfTermsPar) {
        this.glossaryOfTermsPar = glossaryOfTermsPar;
    }

    public int getNumberOfProductTypesPar() {
        return numberOfProductTypesPar;
    }

    public void setNumberOfProductTypesPar(int numberOfProductTypesPar) {
        this.numberOfProductTypesPar = numberOfProductTypesPar;
    }

    public int getGreaterCollaborationPar() {
        return greaterCollaborationPar;
    }

    public void setGreaterCollaborationPar(int greaterCollaborationPar) {
        this.greaterCollaborationPar = greaterCollaborationPar;
    }

    public int getNumberOfActiveProjectsPar() {
        return numberOfActiveProjectsPar;
    }

    public void setNumberOfActiveProjectsPar(int numberOfActiveProjectsPar) {
        this.numberOfActiveProjectsPar = numberOfActiveProjectsPar;
    }

    public int getTotalProducedFilesPar() {
        return totalProducedFilesPar;
    }

    public void setTotalProducedFilesPar(int totalProducedFilesPar) {
        this.totalProducedFilesPar = totalProducedFilesPar;
    }

    public int getNumberOfPartnersPar() {
        return numberOfPartnersPar;
    }

    public void setNumberOfPartnersPar(int numberOfPartnersPar) {
        this.numberOfPartnersPar = numberOfPartnersPar;
    }

    public int getNumberOfCommercialSponsorsPar() {
        return numberOfCommercialSponsorsPar;
    }

    public void setNumberOfCommercialSponsorsPar(int numberOfCommercialSponsorsPar) {
        this.numberOfCommercialSponsorsPar = numberOfCommercialSponsorsPar;
    }

    public int getTotalContributionValuePar() {
        return totalContributionValuePar;
    }

    public void setTotalContributionValuePar(int totalContributionValuePar) {
        this.totalContributionValuePar = totalContributionValuePar;
    }

    public int getNumberOfActiveContributorsPar() {
        return numberOfActiveContributorsPar;
    }

    public void setNumberOfActiveContributorsPar(int numberOfActiveContributorsPar) {
        this.numberOfActiveContributorsPar = numberOfActiveContributorsPar;
    }

    public int getNumberOfFrequentUsersPar() {
        return numberOfFrequentUsersPar;
    }

    public void setNumberOfFrequentUsersPar(int numberOfFrequentUsersPar) {
        this.numberOfFrequentUsersPar = numberOfFrequentUsersPar;
    }

    public String getHaveDocumentationPar() {
        return haveDocumentationPar;
    }

    public void setHaveDocumentationPar(String haveDocumentationPar) {
        this.haveDocumentationPar = haveDocumentationPar;
    }

    public int getNumberOfContributorsTypesPar() {
        return numberOfContributorsTypesPar;
    }

    public void setNumberOfContributorsTypesPar(int numberOfContributorsTypesPar) {
        this.numberOfContributorsTypesPar = numberOfContributorsTypesPar;
    }

    public int getNumberOfTypesAppProjectsPar() {
        return numberOfTypesAppProjectsPar;
    }

    public void setNumberOfTypesAppProjectsPar(int numberOfTypesAppProjectsPar) {
        this.numberOfTypesAppProjectsPar = numberOfTypesAppProjectsPar;
    }

    public String getSupportNaturalLanguagesPar() {
        return supportNaturalLanguagesPar;
    }

    public void setSupportNaturalLanguagesPar(String supportNaturalLanguagesPar) {
        this.supportNaturalLanguagesPar = supportNaturalLanguagesPar;
    }

    public int getNumberOfTypesTechSupportedPar() {
        return numberOfTypesTechSupportedPar;
    }

    public void setNumberOfTypesTechSupportedPar(int numberOfTypesTechSupportedPar) {
        this.numberOfTypesTechSupportedPar = numberOfTypesTechSupportedPar;
    }

    public int getNumberOfTypesDevTechSupportedPar() {
        return numberOfTypesDevTechSupportedPar;
    }

    public void setNumberOfTypesDevTechSupportedPar(int numberOfTypesDevTechSupportedPar) {
        this.numberOfTypesDevTechSupportedPar = numberOfTypesDevTechSupportedPar;
    }

}
