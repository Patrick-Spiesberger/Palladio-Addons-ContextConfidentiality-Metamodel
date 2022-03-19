/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelContainer;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.Mitigation;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.MitigationSpecification;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.SystemIntegrationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mitigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.MitigationImpl#getMitigationspecification <em>Mitigationspecification</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.MitigationImpl#getDatamodelcontainer <em>Datamodelcontainer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MitigationImpl extends SystemIntegrationImpl implements Mitigation
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MitigationImpl()
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
		return AttackerPackage.Literals.MITIGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MitigationSpecification> getMitigationspecification()
	{
		return (EList<MitigationSpecification>)eGet(AttackerPackage.Literals.MITIGATION__MITIGATIONSPECIFICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatamodelContainer getDatamodelcontainer()
	{
		return (DatamodelContainer)eGet(AttackerPackage.Literals.MITIGATION__DATAMODELCONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatamodelcontainer(DatamodelContainer newDatamodelcontainer)
	{
		eSet(AttackerPackage.Literals.MITIGATION__DATAMODELCONTAINER, newDatamodelcontainer);
	}

} //MitigationImpl
