/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.pcm.PCMBaseClass;
import org.palladiosimulator.pcm.PCMClass;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.*;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.SystemIntegration;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage
 * @generated
 */
public class AttackerSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AttackerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackerSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = AttackerPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case AttackerPackage.ATTACKER_CONTAINER:
			{
				AttackerContainer attackerContainer = (AttackerContainer)theEObject;
				T result = caseAttackerContainer(attackerContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AttackerPackage.ATTACKER:
			{
				Attacker attacker = (Attacker)theEObject;
				T result = caseAttacker(attacker);
				if (result == null) result = caseEntity(attacker);
				if (result == null) result = caseIdentifier(attacker);
				if (result == null) result = caseNamedElement(attacker);
				if (result == null) result = casePCMBaseClass(attacker);
				if (result == null) result = casePCMClass(attacker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AttackerPackage.ATTACKER_SPECIFICATION:
			{
				AttackerSpecification attackerSpecification = (AttackerSpecification)theEObject;
				T result = caseAttackerSpecification(attackerSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AttackerPackage.ATTACK_CONTAINER:
			{
				AttackContainer attackContainer = (AttackContainer)theEObject;
				T result = caseAttackContainer(attackContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AttackerPackage.VULNERABILITY_CONTAINER:
			{
				VulnerabilityContainer vulnerabilityContainer = (VulnerabilityContainer)theEObject;
				T result = caseVulnerabilityContainer(vulnerabilityContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AttackerPackage.CATEGORY_SPECIFICATION:
			{
				CategorySpecification categorySpecification = (CategorySpecification)theEObject;
				T result = caseCategorySpecification(categorySpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AttackerPackage.ATTACKER_SYSTEM_SPECIFICATION_CONTAINER:
			{
				AttackerSystemSpecificationContainer attackerSystemSpecificationContainer = (AttackerSystemSpecificationContainer)theEObject;
				T result = caseAttackerSystemSpecificationContainer(attackerSystemSpecificationContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AttackerPackage.DATAMODEL_ATTACKER:
			{
				DatamodelAttacker datamodelAttacker = (DatamodelAttacker)theEObject;
				T result = caseDatamodelAttacker(datamodelAttacker);
				if (result == null) result = caseEntity(datamodelAttacker);
				if (result == null) result = caseIdentifier(datamodelAttacker);
				if (result == null) result = caseNamedElement(datamodelAttacker);
				if (result == null) result = casePCMBaseClass(datamodelAttacker);
				if (result == null) result = casePCMClass(datamodelAttacker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AttackerPackage.ASSEMBLY_CONTEXT_DETAIL:
			{
				AssemblyContextDetail assemblyContextDetail = (AssemblyContextDetail)theEObject;
				T result = caseAssemblyContextDetail(assemblyContextDetail);
				if (result == null) result = caseEntity(assemblyContextDetail);
				if (result == null) result = caseIdentifier(assemblyContextDetail);
				if (result == null) result = caseNamedElement(assemblyContextDetail);
				if (result == null) result = casePCMBaseClass(assemblyContextDetail);
				if (result == null) result = casePCMClass(assemblyContextDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AttackerPackage.MITIGATION:
			{
				Mitigation mitigation = (Mitigation)theEObject;
				T result = caseMitigation(mitigation);
				if (result == null) result = caseSystemIntegration(mitigation);
				if (result == null) result = caseEntity(mitigation);
				if (result == null) result = caseIdentifier(mitigation);
				if (result == null) result = caseNamedElement(mitigation);
				if (result == null) result = casePCMBaseClass(mitigation);
				if (result == null) result = casePCMClass(mitigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AttackerPackage.MITIGATION_SPECIFICATION:
			{
				MitigationSpecification mitigationSpecification = (MitigationSpecification)theEObject;
				T result = caseMitigationSpecification(mitigationSpecification);
				if (result == null) result = caseEntity(mitigationSpecification);
				if (result == null) result = caseIdentifier(mitigationSpecification);
				if (result == null) result = caseNamedElement(mitigationSpecification);
				if (result == null) result = casePCMBaseClass(mitigationSpecification);
				if (result == null) result = casePCMClass(mitigationSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AttackerPackage.ENCRYPTION:
			{
				Encryption encryption = (Encryption)theEObject;
				T result = caseEncryption(encryption);
				if (result == null) result = caseMitigationSpecification(encryption);
				if (result == null) result = caseEntity(encryption);
				if (result == null) result = caseIdentifier(encryption);
				if (result == null) result = caseNamedElement(encryption);
				if (result == null) result = casePCMBaseClass(encryption);
				if (result == null) result = casePCMClass(encryption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AttackerPackage.DATAMODEL_CONTAINER:
			{
				DatamodelContainer datamodelContainer = (DatamodelContainer)theEObject;
				T result = caseDatamodelContainer(datamodelContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttackerContainer(AttackerContainer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attacker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attacker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttacker(Attacker object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttackerSpecification(AttackerSpecification object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attack Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attack Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttackContainer(AttackContainer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vulnerability Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vulnerability Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVulnerabilityContainer(VulnerabilityContainer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategorySpecification(CategorySpecification object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Specification Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Specification Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttackerSystemSpecificationContainer(AttackerSystemSpecificationContainer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datamodel Attacker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datamodel Attacker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatamodelAttacker(DatamodelAttacker object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Context Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Context Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyContextDetail(AssemblyContextDetail object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mitigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mitigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMitigation(Mitigation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mitigation Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mitigation Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMitigationSpecification(MitigationSpecification object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encryption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encryption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncryption(Encryption object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datamodel Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datamodel Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatamodelContainer(DatamodelContainer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMClass(PCMClass object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Base Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Base Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMBaseClass(PCMBaseClass object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Integration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Integration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemIntegration(SystemIntegration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //AttackerSwitch
