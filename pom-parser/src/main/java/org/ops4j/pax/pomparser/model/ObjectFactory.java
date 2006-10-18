//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2006.09.11 at 05:48:47 PM MYT
//

package org.ops4j.pax.pomparser.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.ops4j.pax.pomparser.model.Build.Extensions;
import org.ops4j.pax.pomparser.model.CiManagement.Notifiers;
import org.ops4j.pax.pomparser.model.Dependency.Exclusions;
import org.ops4j.pax.pomparser.model.MailingList.OtherArchives;
import org.ops4j.pax.pomparser.model.Model.Contributors;
import org.ops4j.pax.pomparser.model.Model.Developers;
import org.ops4j.pax.pomparser.model.Model.Licenses;
import org.ops4j.pax.pomparser.model.Model.MailingLists;
import org.ops4j.pax.pomparser.model.Model.Profiles;
import org.ops4j.pax.pomparser.model.Plugin.Executions;
import org.ops4j.pax.pomparser.model.ReportPlugin.ReportSets;
import org.ops4j.pax.pomparser.model.Resource.Excludes;
import org.ops4j.pax.pomparser.model.Resource.Includes;

/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the org.ops4j.pax.runner.pom package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory
{

    private final static QName _Project_QNAME = new QName( "http://maven.apache.org/POM/4.0.0", "project" );

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ops4j.pax.runner.pom
     */
    public ObjectFactory()
    {
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Dependency.Exclusions }
     */
    public Exclusions createDependencyExclusions()
    {
        return new Exclusions();
    }

    /**
     * Create an instance of {@link ReportSets }
     */
    public ReportSets createReportPluginReportSets()
    {
        return new ReportSets();
    }

    /**
     * Create an instance of {@link Executions }
     */
    public Executions createPluginExecutions()
    {
        return new Executions();
    }

    /**
     * Create an instance of {@link DistributionManagement }
     */
    public DistributionManagement createDistributionManagement()
    {
        return new DistributionManagement();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.ReportPlugin.Configuration }
     */
    public org.ops4j.pax.pomparser.model.ReportPlugin.Configuration createReportPluginConfiguration()
    {
        return new org.ops4j.pax.pomparser.model.ReportPlugin.Configuration();
    }

    /**
     * Create an instance of {@link DeploymentRepository }
     */
    public DeploymentRepository createDeploymentRepository()
    {
        return new DeploymentRepository();
    }

    /**
     * Create an instance of {@link Reporting }
     */
    public Reporting createReporting()
    {
        return new Reporting();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Contributor.Properties }
     */
    public org.ops4j.pax.pomparser.model.Contributor.Properties createContributorProperties()
    {
        return new org.ops4j.pax.pomparser.model.Contributor.Properties();
    }

    /**
     * Create an instance of {@link Site }
     */
    public Site createSite()
    {
        return new Site();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.BuildBase.Resources }
     */
    public org.ops4j.pax.pomparser.model.BuildBase.Resources createBuildBaseResources()
    {
        return new org.ops4j.pax.pomparser.model.BuildBase.Resources();
    }

    /**
     * Create an instance of {@link Model }
     */
    public Model createModel()
    {
        return new Model();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.ReportSet.Reports }
     */
    public org.ops4j.pax.pomparser.model.ReportSet.Reports createReportSetReports()
    {
        return new org.ops4j.pax.pomparser.model.ReportSet.Reports();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Build.Plugins }
     */
    public org.ops4j.pax.pomparser.model.Build.Plugins createBuildPlugins()
    {
        return new org.ops4j.pax.pomparser.model.Build.Plugins();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Developer.Properties }
     */
    public org.ops4j.pax.pomparser.model.Developer.Properties createDeveloperProperties()
    {
        return new org.ops4j.pax.pomparser.model.Developer.Properties();
    }

    /**
     * Create an instance of {@link Notifier }
     */
    public Notifier createNotifier()
    {
        return new Notifier();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.DependencyManagement.Dependencies }
     */
    public org.ops4j.pax.pomparser.model.DependencyManagement.Dependencies createDependencyManagementDependencies()
    {
        return new org.ops4j.pax.pomparser.model.DependencyManagement.Dependencies();
    }

    /**
     * Create an instance of {@link MailingLists }
     */
    public MailingLists createModelMailingLists()
    {
        return new MailingLists();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.BuildBase.Plugins }
     */
    public org.ops4j.pax.pomparser.model.BuildBase.Plugins createBuildBasePlugins()
    {
        return new org.ops4j.pax.pomparser.model.BuildBase.Plugins();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Developer.Roles }
     */
    public org.ops4j.pax.pomparser.model.Developer.Roles createDeveloperRoles()
    {
        return new org.ops4j.pax.pomparser.model.Developer.Roles();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Model.Properties }
     */
    public org.ops4j.pax.pomparser.model.Model.Properties createModelProperties()
    {
        return new org.ops4j.pax.pomparser.model.Model.Properties();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Model.Reports }
     */
    public org.ops4j.pax.pomparser.model.Model.Reports createModelReports()
    {
        return new org.ops4j.pax.pomparser.model.Model.Reports();
    }

    /**
     * Create an instance of {@link Extension }
     */
    public Extension createExtension()
    {
        return new Extension();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Model.Dependencies }
     */
    public org.ops4j.pax.pomparser.model.Model.Dependencies createModelDependencies()
    {
        return new org.ops4j.pax.pomparser.model.Model.Dependencies();
    }

    /**
     * Create an instance of {@link ReportSet }
     */
    public ReportSet createReportSet()
    {
        return new ReportSet();
    }

    /**
     * Create an instance of {@link OtherArchives }
     */
    public OtherArchives createMailingListOtherArchives()
    {
        return new OtherArchives();
    }

    /**
     * Create an instance of {@link Plugin }
     */
    public Plugin createPlugin()
    {
        return new Plugin();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Model.Modules }
     */
    public org.ops4j.pax.pomparser.model.Model.Modules createModelModules()
    {
        return new org.ops4j.pax.pomparser.model.Model.Modules();
    }

    /**
     * Create an instance of {@link CiManagement }
     */
    public CiManagement createCiManagement()
    {
        return new CiManagement();
    }

    /**
     * Create an instance of {@link License }
     */
    public License createLicense()
    {
        return new License();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.BuildBase.TestResources }
     */
    public org.ops4j.pax.pomparser.model.BuildBase.TestResources createBuildBaseTestResources()
    {
        return new org.ops4j.pax.pomparser.model.BuildBase.TestResources();
    }

    /**
     * Create an instance of {@link Profiles }
     */
    public Profiles createModelProfiles()
    {
        return new Profiles();
    }

    /**
     * Create an instance of {@link Build }
     */
    public Build createBuild()
    {
        return new Build();
    }

    /**
     * Create an instance of {@link Licenses }
     */
    public Licenses createModelLicenses()
    {
        return new Licenses();
    }

    /**
     * Create an instance of {@link Notifiers }
     */
    public Notifiers createCiManagementNotifiers()
    {
        return new Notifiers();
    }

    /**
     * Create an instance of {@link Prerequisites }
     */
    public Prerequisites createPrerequisites()
    {
        return new Prerequisites();
    }

    /**
     * Create an instance of {@link PluginExecution }
     */
    public PluginExecution createPluginExecution()
    {
        return new PluginExecution();
    }

    /**
     * Create an instance of {@link Relocation }
     */
    public Relocation createRelocation()
    {
        return new Relocation();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Profile.Properties }
     */
    public org.ops4j.pax.pomparser.model.Profile.Properties createProfileProperties()
    {
        return new org.ops4j.pax.pomparser.model.Profile.Properties();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Model.PluginRepositories }
     */
    public org.ops4j.pax.pomparser.model.Model.PluginRepositories createModelPluginRepositories()
    {
        return new org.ops4j.pax.pomparser.model.Model.PluginRepositories();
    }

    /**
     * Create an instance of {@link Scm }
     */
    public Scm createScm()
    {
        return new Scm();
    }

    /**
     * Create an instance of {@link BuildBase }
     */
    public BuildBase createBuildBase()
    {
        return new BuildBase();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Build.Resources }
     */
    public org.ops4j.pax.pomparser.model.Build.Resources createBuildResources()
    {
        return new org.ops4j.pax.pomparser.model.Build.Resources();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.PluginExecution.Configuration }
     */
    public org.ops4j.pax.pomparser.model.PluginExecution.Configuration createPluginExecutionConfiguration()
    {
        return new org.ops4j.pax.pomparser.model.PluginExecution.Configuration();
    }

    /**
     * Create an instance of {@link Resource }
     */
    public Resource createResource()
    {
        return new Resource();
    }

    /**
     * Create an instance of {@link ReportPlugin }
     */
    public ReportPlugin createReportPlugin()
    {
        return new ReportPlugin();
    }

    /**
     * Create an instance of {@link Repository }
     */
    public Repository createRepository()
    {
        return new Repository();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Profile.PluginRepositories }
     */
    public org.ops4j.pax.pomparser.model.Profile.PluginRepositories createProfilePluginRepositories()
    {
        return new org.ops4j.pax.pomparser.model.Profile.PluginRepositories();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Reporting.Plugins }
     */
    public org.ops4j.pax.pomparser.model.Reporting.Plugins createReportingPlugins()
    {
        return new org.ops4j.pax.pomparser.model.Reporting.Plugins();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Profile.Reports }
     */
    public org.ops4j.pax.pomparser.model.Profile.Reports createProfileReports()
    {
        return new org.ops4j.pax.pomparser.model.Profile.Reports();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Build.TestResources }
     */
    public org.ops4j.pax.pomparser.model.Build.TestResources createBuildTestResources()
    {
        return new org.ops4j.pax.pomparser.model.Build.TestResources();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.PluginManagement.Plugins }
     */
    public org.ops4j.pax.pomparser.model.PluginManagement.Plugins createPluginManagementPlugins()
    {
        return new org.ops4j.pax.pomparser.model.PluginManagement.Plugins();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Plugin.Configuration }
     */
    public org.ops4j.pax.pomparser.model.Plugin.Configuration createPluginConfiguration()
    {
        return new org.ops4j.pax.pomparser.model.Plugin.Configuration();
    }

    /**
     * Create an instance of {@link Extensions }
     */
    public Extensions createBuildExtensions()
    {
        return new Extensions();
    }

    /**
     * Create an instance of {@link DependencyManagement }
     */
    public DependencyManagement createDependencyManagement()
    {
        return new DependencyManagement();
    }

    /**
     * Create an instance of {@link Exclusion }
     */
    public Exclusion createExclusion()
    {
        return new Exclusion();
    }

    /**
     * Create an instance of {@link Includes }
     */
    public Includes createResourceIncludes()
    {
        return new Includes();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Notifier.Configuration }
     */
    public org.ops4j.pax.pomparser.model.Notifier.Configuration createNotifierConfiguration()
    {
        return new org.ops4j.pax.pomparser.model.Notifier.Configuration();
    }

    /**
     * Create an instance of {@link ActivationFile }
     */
    public ActivationFile createActivationFile()
    {
        return new ActivationFile();
    }

    /**
     * Create an instance of {@link Organization }
     */
    public Organization createOrganization()
    {
        return new Organization();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Plugin.Dependencies }
     */
    public org.ops4j.pax.pomparser.model.Plugin.Dependencies createPluginDependencies()
    {
        return new org.ops4j.pax.pomparser.model.Plugin.Dependencies();
    }

    /**
     * Create an instance of {@link PluginManagement }
     */
    public PluginManagement createPluginManagement()
    {
        return new PluginManagement();
    }

    /**
     * Create an instance of {@link Dependency }
     */
    public Dependency createDependency()
    {
        return new Dependency();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Profile.Repositories }
     */
    public org.ops4j.pax.pomparser.model.Profile.Repositories createProfileRepositories()
    {
        return new org.ops4j.pax.pomparser.model.Profile.Repositories();
    }

    /**
     * Create an instance of {@link MailingList }
     */
    public MailingList createMailingList()
    {
        return new MailingList();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.PluginExecution.Goals }
     */
    public org.ops4j.pax.pomparser.model.PluginExecution.Goals createPluginExecutionGoals()
    {
        return new org.ops4j.pax.pomparser.model.PluginExecution.Goals();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Profile.Dependencies }
     */
    public org.ops4j.pax.pomparser.model.Profile.Dependencies createProfileDependencies()
    {
        return new org.ops4j.pax.pomparser.model.Profile.Dependencies();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.BuildBase.Filters }
     */
    public org.ops4j.pax.pomparser.model.BuildBase.Filters createBuildBaseFilters()
    {
        return new org.ops4j.pax.pomparser.model.BuildBase.Filters();
    }

    /**
     * Create an instance of {@link Profile }
     */
    public Profile createProfile()
    {
        return new Profile();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Model.Repositories }
     */
    public org.ops4j.pax.pomparser.model.Model.Repositories createModelRepositories()
    {
        return new org.ops4j.pax.pomparser.model.Model.Repositories();
    }

    /**
     * Create an instance of {@link ActivationOS }
     */
    public ActivationOS createActivationOS()
    {
        return new ActivationOS();
    }

    /**
     * Create an instance of {@link Activation }
     */
    public Activation createActivation()
    {
        return new Activation();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Build.Filters }
     */
    public org.ops4j.pax.pomparser.model.Build.Filters createBuildFilters()
    {
        return new org.ops4j.pax.pomparser.model.Build.Filters();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Profile.Modules }
     */
    public org.ops4j.pax.pomparser.model.Profile.Modules createProfileModules()
    {
        return new org.ops4j.pax.pomparser.model.Profile.Modules();
    }

    /**
     * Create an instance of {@link Contributors }
     */
    public Contributors createModelContributors()
    {
        return new Contributors();
    }

    /**
     * Create an instance of {@link Developers }
     */
    public Developers createModelDevelopers()
    {
        return new Developers();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Plugin.Goals }
     */
    public org.ops4j.pax.pomparser.model.Plugin.Goals createPluginGoals()
    {
        return new org.ops4j.pax.pomparser.model.Plugin.Goals();
    }

    /**
     * Create an instance of {@link Excludes }
     */
    public Excludes createResourceExcludes()
    {
        return new Excludes();
    }

    /**
     * Create an instance of {@link RepositoryPolicy }
     */
    public RepositoryPolicy createRepositoryPolicy()
    {
        return new RepositoryPolicy();
    }

    /**
     * Create an instance of {@link Developer }
     */
    public Developer createDeveloper()
    {
        return new Developer();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.ReportSet.Configuration }
     */
    public org.ops4j.pax.pomparser.model.ReportSet.Configuration createReportSetConfiguration()
    {
        return new org.ops4j.pax.pomparser.model.ReportSet.Configuration();
    }

    /**
     * Create an instance of {@link ActivationProperty }
     */
    public ActivationProperty createActivationProperty()
    {
        return new ActivationProperty();
    }

    /**
     * Create an instance of {@link IssueManagement }
     */
    public IssueManagement createIssueManagement()
    {
        return new IssueManagement();
    }

    /**
     * Create an instance of {@link Contributor }
     */
    public Contributor createContributor()
    {
        return new Contributor();
    }

    /**
     * Create an instance of {@link Parent }
     */
    public Parent createParent()
    {
        return new Parent();
    }

    /**
     * Create an instance of {@link org.ops4j.pax.pomparser.model.Contributor.Roles }
     */
    public org.ops4j.pax.pomparser.model.Contributor.Roles createContributorRoles()
    {
        return new org.ops4j.pax.pomparser.model.Contributor.Roles();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Model }{@code >}}
     */
    @XmlElementDecl( namespace = "http://maven.apache.org/POM/4.0.0", name = "project" )
    public JAXBElement<Model> createProject( Model value )
    {
        return new JAXBElement<Model>( _Project_QNAME, Model.class, null, value );
    }

}
