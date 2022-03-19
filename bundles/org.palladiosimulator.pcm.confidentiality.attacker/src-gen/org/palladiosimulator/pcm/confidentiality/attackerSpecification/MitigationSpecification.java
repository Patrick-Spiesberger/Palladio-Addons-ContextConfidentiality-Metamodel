/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability;

import org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mitigation Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.MitigationSpecification#getNecessaryCredentials <em>Necessary Credentials</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.MitigationSpecification#getVulnerabilities <em>Vulnerabilities</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getMitigationSpecification()
 * @model abstract="true"
 * @generated
 */
public interface MitigationSpecification extends Entity
{
	/**
	 * Returns the value of the '<em><b>Necessary Credentials</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Necessary Credentials</em>' reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getMitigationSpecification_NecessaryCredentials()
	 * @model
	 * @generated
	 */
	EList<UsageSpecification> getNecessaryCredentials();

	/**
	 * Returns the value of the '<em><b>Vulnerabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Vulnerability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vulnerabilities</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getMitigationSpecification_Vulnerabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vulnerability> getVulnerabilities();

} // MitigationSpecification
