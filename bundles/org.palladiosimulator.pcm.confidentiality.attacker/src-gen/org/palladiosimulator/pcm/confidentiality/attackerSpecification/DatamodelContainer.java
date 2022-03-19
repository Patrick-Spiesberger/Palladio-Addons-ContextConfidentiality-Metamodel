/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datamodel Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelContainer#getDatamodelattacker <em>Datamodelattacker</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getDatamodelContainer()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface DatamodelContainer extends CDOObject
{
	/**
	 * Returns the value of the '<em><b>Datamodelattacker</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datamodelattacker</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getDatamodelContainer_Datamodelattacker()
	 * @model containment="true"
	 * @generated
	 */
	EList<DatamodelAttacker> getDatamodelattacker();

} // DatamodelContainer
