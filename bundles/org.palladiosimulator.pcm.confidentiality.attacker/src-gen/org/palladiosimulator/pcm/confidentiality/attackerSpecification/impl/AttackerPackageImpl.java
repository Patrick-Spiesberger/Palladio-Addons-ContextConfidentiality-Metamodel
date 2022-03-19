/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AssemblyContextDetail;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackContainer;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerContainer;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerFactory;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSystemSpecificationContainer;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.CategorySpecification;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelContainer;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.Encryption;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.ListOperationEffort;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.Mitigation;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.MitigationSpecification;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.VulnerabilityContainer;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PcmIntegrationPackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;

import org.palladiosimulator.pcm.confidentiality.context.system.SystemPackage;

import org.palladiosimulator.pcm.core.composition.CompositionPackage;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttackerPackageImpl extends EPackageImpl implements AttackerPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attackerContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attackerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attackerSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attackContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vulnerabilityContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categorySpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attackerSystemSpecificationContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datamodelAttackerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyContextDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mitigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mitigationSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encryptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datamodelContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum listOperationEffortEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AttackerPackageImpl()
	{
		super(eNS_URI, AttackerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AttackerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AttackerPackage init()
	{
		if (isInited) return (AttackerPackage)EPackage.Registry.INSTANCE.getEPackage(AttackerPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAttackerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AttackerPackageImpl theAttackerPackage = registeredAttackerPackage instanceof AttackerPackageImpl ? (AttackerPackageImpl)registeredAttackerPackage : new AttackerPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ContextPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AttackSpecificationPackage.eNS_URI);
		AttackSpecificationPackageImpl theAttackSpecificationPackage = (AttackSpecificationPackageImpl)(registeredPackage instanceof AttackSpecificationPackageImpl ? registeredPackage : AttackSpecificationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PcmIntegrationPackage.eNS_URI);
		PcmIntegrationPackageImpl thePcmIntegrationPackage = (PcmIntegrationPackageImpl)(registeredPackage instanceof PcmIntegrationPackageImpl ? registeredPackage : PcmIntegrationPackage.eINSTANCE);

		// Create package meta-data objects
		theAttackerPackage.createPackageContents();
		theAttackSpecificationPackage.createPackageContents();
		thePcmIntegrationPackage.createPackageContents();

		// Initialize created meta-data
		theAttackerPackage.initializePackageContents();
		theAttackSpecificationPackage.initializePackageContents();
		thePcmIntegrationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAttackerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AttackerPackage.eNS_URI, theAttackerPackage);
		return theAttackerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttackerContainer()
	{
		return attackerContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttackerContainer_Attacker()
	{
		return (EReference)attackerContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttacker()
	{
		return attackerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttacker_Attacks()
	{
		return (EReference)attackerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttacker_CompromisedComponentsDetails()
	{
		return (EReference)attackerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttacker_CompromisedResources()
	{
		return (EReference)attackerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttacker_CompromisedLinkingResources()
	{
		return (EReference)attackerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttacker_Credentials()
	{
		return (EReference)attackerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttacker_ExploitContextProviders()
	{
		return (EAttribute)attackerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttacker_ContextSelectionListEffort()
	{
		return (EAttribute)attackerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttacker_ContextSelectionMaxTime()
	{
		return (EAttribute)attackerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttackerSpecification()
	{
		return attackerSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttackerSpecification_Attackers()
	{
		return (EReference)attackerSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttackerSpecification_Attacks()
	{
		return (EReference)attackerSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttackerSpecification_Vulnerabilites()
	{
		return (EReference)attackerSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttackerSpecification_Categoryspecification()
	{
		return (EReference)attackerSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttackerSpecification_Systemintegration()
	{
		return (EReference)attackerSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttackerSpecification_Mitigation()
	{
		return (EReference)attackerSpecificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttackContainer()
	{
		return attackContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttackContainer_Attack()
	{
		return (EReference)attackContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVulnerabilityContainer()
	{
		return vulnerabilityContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVulnerabilityContainer_Vulnerability()
	{
		return (EReference)vulnerabilityContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategorySpecification()
	{
		return categorySpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategorySpecification_Categories()
	{
		return (EReference)categorySpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttackerSystemSpecificationContainer()
	{
		return attackerSystemSpecificationContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttackerSystemSpecificationContainer_Vulnerabilities()
	{
		return (EReference)attackerSystemSpecificationContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatamodelAttacker()
	{
		return datamodelAttackerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatamodelAttacker_DataType()
	{
		return (EReference)datamodelAttackerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatamodelAttacker_ReferenceName()
	{
		return (EAttribute)datamodelAttackerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatamodelAttacker_Source()
	{
		return (EReference)datamodelAttackerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatamodelAttacker_Method()
	{
		return (EReference)datamodelAttackerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyContextDetail()
	{
		return assemblyContextDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyContextDetail_CompromisedComponents()
	{
		return (EReference)assemblyContextDetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMitigation()
	{
		return mitigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMitigation_Mitigationspecification()
	{
		return (EReference)mitigationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMitigation_Datamodelcontainer()
	{
		return (EReference)mitigationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMitigationSpecification()
	{
		return mitigationSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMitigationSpecification_NecessaryCredentials()
	{
		return (EReference)mitigationSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMitigationSpecification_Vulnerabilities()
	{
		return (EReference)mitigationSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncryption()
	{
		return encryptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatamodelContainer()
	{
		return datamodelContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatamodelContainer_Datamodelattacker()
	{
		return (EReference)datamodelContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getListOperationEffort()
	{
		return listOperationEffortEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackerFactory getAttackerFactory()
	{
		return (AttackerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		attackerContainerEClass = createEClass(ATTACKER_CONTAINER);
		createEReference(attackerContainerEClass, ATTACKER_CONTAINER__ATTACKER);

		attackerEClass = createEClass(ATTACKER);
		createEReference(attackerEClass, ATTACKER__ATTACKS);
		createEReference(attackerEClass, ATTACKER__COMPROMISED_COMPONENTS_DETAILS);
		createEReference(attackerEClass, ATTACKER__COMPROMISED_RESOURCES);
		createEReference(attackerEClass, ATTACKER__COMPROMISED_LINKING_RESOURCES);
		createEReference(attackerEClass, ATTACKER__CREDENTIALS);
		createEAttribute(attackerEClass, ATTACKER__EXPLOIT_CONTEXT_PROVIDERS);
		createEAttribute(attackerEClass, ATTACKER__CONTEXT_SELECTION_LIST_EFFORT);
		createEAttribute(attackerEClass, ATTACKER__CONTEXT_SELECTION_MAX_TIME);

		attackerSpecificationEClass = createEClass(ATTACKER_SPECIFICATION);
		createEReference(attackerSpecificationEClass, ATTACKER_SPECIFICATION__ATTACKERS);
		createEReference(attackerSpecificationEClass, ATTACKER_SPECIFICATION__ATTACKS);
		createEReference(attackerSpecificationEClass, ATTACKER_SPECIFICATION__VULNERABILITES);
		createEReference(attackerSpecificationEClass, ATTACKER_SPECIFICATION__CATEGORYSPECIFICATION);
		createEReference(attackerSpecificationEClass, ATTACKER_SPECIFICATION__SYSTEMINTEGRATION);
		createEReference(attackerSpecificationEClass, ATTACKER_SPECIFICATION__MITIGATION);

		attackContainerEClass = createEClass(ATTACK_CONTAINER);
		createEReference(attackContainerEClass, ATTACK_CONTAINER__ATTACK);

		vulnerabilityContainerEClass = createEClass(VULNERABILITY_CONTAINER);
		createEReference(vulnerabilityContainerEClass, VULNERABILITY_CONTAINER__VULNERABILITY);

		categorySpecificationEClass = createEClass(CATEGORY_SPECIFICATION);
		createEReference(categorySpecificationEClass, CATEGORY_SPECIFICATION__CATEGORIES);

		attackerSystemSpecificationContainerEClass = createEClass(ATTACKER_SYSTEM_SPECIFICATION_CONTAINER);
		createEReference(attackerSystemSpecificationContainerEClass, ATTACKER_SYSTEM_SPECIFICATION_CONTAINER__VULNERABILITIES);

		datamodelAttackerEClass = createEClass(DATAMODEL_ATTACKER);
		createEReference(datamodelAttackerEClass, DATAMODEL_ATTACKER__DATA_TYPE);
		createEAttribute(datamodelAttackerEClass, DATAMODEL_ATTACKER__REFERENCE_NAME);
		createEReference(datamodelAttackerEClass, DATAMODEL_ATTACKER__SOURCE);
		createEReference(datamodelAttackerEClass, DATAMODEL_ATTACKER__METHOD);

		assemblyContextDetailEClass = createEClass(ASSEMBLY_CONTEXT_DETAIL);
		createEReference(assemblyContextDetailEClass, ASSEMBLY_CONTEXT_DETAIL__COMPROMISED_COMPONENTS);

		mitigationEClass = createEClass(MITIGATION);
		createEReference(mitigationEClass, MITIGATION__MITIGATIONSPECIFICATION);
		createEReference(mitigationEClass, MITIGATION__DATAMODELCONTAINER);

		mitigationSpecificationEClass = createEClass(MITIGATION_SPECIFICATION);
		createEReference(mitigationSpecificationEClass, MITIGATION_SPECIFICATION__NECESSARY_CREDENTIALS);
		createEReference(mitigationSpecificationEClass, MITIGATION_SPECIFICATION__VULNERABILITIES);

		encryptionEClass = createEClass(ENCRYPTION);

		datamodelContainerEClass = createEClass(DATAMODEL_CONTAINER);
		createEReference(datamodelContainerEClass, DATAMODEL_CONTAINER__DATAMODELATTACKER);

		// Create enums
		listOperationEffortEEnum = createEEnum(LIST_OPERATION_EFFORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AttackSpecificationPackage theAttackSpecificationPackage = (AttackSpecificationPackage)EPackage.Registry.INSTANCE.getEPackage(AttackSpecificationPackage.eNS_URI);
		PcmIntegrationPackage thePcmIntegrationPackage = (PcmIntegrationPackage)EPackage.Registry.INSTANCE.getEPackage(PcmIntegrationPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI);
		SystemPackage theSystemPackage = (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CompositionPackage theCompositionPackage = (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAttackSpecificationPackage);
		getESubpackages().add(thePcmIntegrationPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		attackerEClass.getESuperTypes().add(theEntityPackage.getEntity());
		datamodelAttackerEClass.getESuperTypes().add(theEntityPackage.getEntity());
		assemblyContextDetailEClass.getESuperTypes().add(theEntityPackage.getEntity());
		mitigationEClass.getESuperTypes().add(thePcmIntegrationPackage.getSystemIntegration());
		mitigationSpecificationEClass.getESuperTypes().add(theEntityPackage.getEntity());
		encryptionEClass.getESuperTypes().add(this.getMitigationSpecification());

		// Initialize classes and features; add operations and parameters
		initEClass(attackerContainerEClass, AttackerContainer.class, "AttackerContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttackerContainer_Attacker(), this.getAttacker(), null, "attacker", null, 0, -1, AttackerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attackerEClass, Attacker.class, "Attacker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttacker_Attacks(), theAttackSpecificationPackage.getAttack(), null, "attacks", null, 0, -1, Attacker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttacker_CompromisedComponentsDetails(), this.getAssemblyContextDetail(), null, "compromisedComponentsDetails", null, 0, -1, Attacker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttacker_CompromisedResources(), theResourceenvironmentPackage.getResourceContainer(), null, "compromisedResources", null, 0, -1, Attacker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttacker_CompromisedLinkingResources(), theResourceenvironmentPackage.getLinkingResource(), null, "compromisedLinkingResources", null, 0, -1, Attacker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttacker_Credentials(), theSystemPackage.getUsageSpecification(), null, "credentials", null, 0, -1, Attacker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttacker_ExploitContextProviders(), ecorePackage.getEBoolean(), "exploitContextProviders", "true", 0, 1, Attacker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttacker_ContextSelectionListEffort(), this.getListOperationEffort(), "contextSelectionListEffort", null, 0, 1, Attacker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttacker_ContextSelectionMaxTime(), theXMLTypePackage.getInt(), "contextSelectionMaxTime", "3600", 0, 1, Attacker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attackerSpecificationEClass, AttackerSpecification.class, "AttackerSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttackerSpecification_Attackers(), this.getAttackerContainer(), null, "attackers", null, 0, 1, AttackerSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttackerSpecification_Attacks(), this.getAttackContainer(), null, "attacks", null, 0, 1, AttackerSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttackerSpecification_Vulnerabilites(), this.getVulnerabilityContainer(), null, "vulnerabilites", null, 0, 1, AttackerSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttackerSpecification_Categoryspecification(), this.getCategorySpecification(), null, "categoryspecification", null, 0, 1, AttackerSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttackerSpecification_Systemintegration(), this.getAttackerSystemSpecificationContainer(), null, "systemintegration", null, 0, 1, AttackerSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttackerSpecification_Mitigation(), this.getMitigation(), null, "mitigation", null, 0, -1, AttackerSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attackContainerEClass, AttackContainer.class, "AttackContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttackContainer_Attack(), theAttackSpecificationPackage.getAttack(), null, "attack", null, 0, -1, AttackContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vulnerabilityContainerEClass, VulnerabilityContainer.class, "VulnerabilityContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVulnerabilityContainer_Vulnerability(), theAttackSpecificationPackage.getVulnerability(), null, "vulnerability", null, 0, -1, VulnerabilityContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categorySpecificationEClass, CategorySpecification.class, "CategorySpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategorySpecification_Categories(), theAttackSpecificationPackage.getAttackCategory(), null, "categories", null, 0, -1, CategorySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attackerSystemSpecificationContainerEClass, AttackerSystemSpecificationContainer.class, "AttackerSystemSpecificationContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttackerSystemSpecificationContainer_Vulnerabilities(), thePcmIntegrationPackage.getSystemIntegration(), null, "vulnerabilities", null, 0, -1, AttackerSystemSpecificationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datamodelAttackerEClass, DatamodelAttacker.class, "DatamodelAttacker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatamodelAttacker_DataType(), theRepositoryPackage.getDataType(), null, "dataType", null, 0, 1, DatamodelAttacker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatamodelAttacker_ReferenceName(), ecorePackage.getEString(), "referenceName", null, 0, 1, DatamodelAttacker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatamodelAttacker_Source(), theEcorePackage.getEObject(), null, "source", null, 0, 1, DatamodelAttacker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatamodelAttacker_Method(), theRepositoryPackage.getOperationSignature(), null, "method", null, 0, 1, DatamodelAttacker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblyContextDetailEClass, AssemblyContextDetail.class, "AssemblyContextDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyContextDetail_CompromisedComponents(), theCompositionPackage.getAssemblyContext(), null, "compromisedComponents", null, 0, -1, AssemblyContextDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mitigationEClass, Mitigation.class, "Mitigation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMitigation_Mitigationspecification(), this.getMitigationSpecification(), null, "mitigationspecification", null, 0, -1, Mitigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMitigation_Datamodelcontainer(), this.getDatamodelContainer(), null, "datamodelcontainer", null, 0, 1, Mitigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mitigationSpecificationEClass, MitigationSpecification.class, "MitigationSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMitigationSpecification_NecessaryCredentials(), theSystemPackage.getUsageSpecification(), null, "necessaryCredentials", null, 0, -1, MitigationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMitigationSpecification_Vulnerabilities(), theAttackSpecificationPackage.getVulnerability(), null, "vulnerabilities", null, 0, -1, MitigationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(encryptionEClass, Encryption.class, "Encryption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(datamodelContainerEClass, DatamodelContainer.class, "DatamodelContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatamodelContainer_Datamodelattacker(), this.getDatamodelAttacker(), null, "datamodelattacker", null, 0, -1, DatamodelContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(listOperationEffortEEnum, ListOperationEffort.class, "ListOperationEffort");
		addEEnumLiteral(listOperationEffortEEnum, ListOperationEffort.STANDARD);
		addEEnumLiteral(listOperationEffortEEnum, ListOperationEffort.PART);
		addEEnumLiteral(listOperationEffortEEnum, ListOperationEffort.ALL);
		addEEnumLiteral(listOperationEffortEEnum, ListOperationEffort.NONE);

		// Create resource
		createResource(eNS_URI);
	}

} //AttackerPackageImpl
