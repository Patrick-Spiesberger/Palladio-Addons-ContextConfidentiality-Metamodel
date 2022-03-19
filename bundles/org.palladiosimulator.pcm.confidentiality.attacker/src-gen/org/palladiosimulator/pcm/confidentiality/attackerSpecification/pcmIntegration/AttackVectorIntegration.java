/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attack Vector Integration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.AttackVectorIntegration#isChangeAttackVectorToLocal <em>Change Attack Vector To Local</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage#getAttackVectorIntegration()
 * @model
 * @generated
 */
public interface AttackVectorIntegration extends SystemIntegration
{
	/**
	 * Returns the value of the '<em><b>Change Attack Vector To Local</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Attack Vector To Local</em>' attribute.
	 * @see #setChangeAttackVectorToLocal(boolean)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage#getAttackVectorIntegration_ChangeAttackVectorToLocal()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isChangeAttackVectorToLocal();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.AttackVectorIntegration#isChangeAttackVectorToLocal <em>Change Attack Vector To Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Attack Vector To Local</em>' attribute.
	 * @see #isChangeAttackVectorToLocal()
	 * @generated
	 */
	void setChangeAttackVectorToLocal(boolean value);

} // AttackVectorIntegration
