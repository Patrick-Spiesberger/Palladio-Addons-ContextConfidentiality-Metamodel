/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.AttackVectorIntegration;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attack Vector Integration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.AttackVectorIntegrationImpl#isChangeAttackVectorToLocal <em>Change Attack Vector To Local</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackVectorIntegrationImpl extends SystemIntegrationImpl implements AttackVectorIntegration
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackVectorIntegrationImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return PcmIntegrationPackage.Literals.ATTACK_VECTOR_INTEGRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChangeAttackVectorToLocal()
	{
		return (Boolean)eGet(PcmIntegrationPackage.Literals.ATTACK_VECTOR_INTEGRATION__CHANGE_ATTACK_VECTOR_TO_LOCAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeAttackVectorToLocal(boolean newChangeAttackVectorToLocal)
	{
		eSet(PcmIntegrationPackage.Literals.ATTACK_VECTOR_INTEGRATION__CHANGE_ATTACK_VECTOR_TO_LOCAL, newChangeAttackVectorToLocal);
	}

} //AttackVectorIntegrationImpl
