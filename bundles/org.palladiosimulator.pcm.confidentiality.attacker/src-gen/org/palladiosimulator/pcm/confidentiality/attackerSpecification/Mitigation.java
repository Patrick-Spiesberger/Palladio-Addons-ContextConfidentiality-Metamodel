/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.SystemIntegration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mitigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Mitigation#getMitigationspecification <em>Mitigationspecification</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Mitigation#getDatamodelcontainer <em>Datamodelcontainer</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getMitigation()
 * @model
 * @generated
 */
public interface Mitigation extends SystemIntegration
{
	/**
	 * Returns the value of the '<em><b>Mitigationspecification</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.MitigationSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitigationspecification</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getMitigation_Mitigationspecification()
	 * @model containment="true"
	 * @generated
	 */
	EList<MitigationSpecification> getMitigationspecification();

	/**
	 * Returns the value of the '<em><b>Datamodelcontainer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datamodelcontainer</em>' containment reference.
	 * @see #setDatamodelcontainer(DatamodelContainer)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getMitigation_Datamodelcontainer()
	 * @model containment="true"
	 * @generated
	 */
	DatamodelContainer getDatamodelcontainer();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Mitigation#getDatamodelcontainer <em>Datamodelcontainer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datamodelcontainer</em>' containment reference.
	 * @see #getDatamodelcontainer()
	 * @generated
	 */
	void setDatamodelcontainer(DatamodelContainer value);

} // Mitigation
