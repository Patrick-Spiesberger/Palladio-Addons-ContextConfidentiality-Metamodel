/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.palladiosimulator.pcm.confidentiality.context.policy.util.PolicyAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyItemProviderAdapterFactory extends PolicyAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
{
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyItemProviderAdapterFactory()
	{
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.context.policy.PolicySet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicySetItemProvider policySetItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.context.policy.PolicySet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPolicySetAdapter()
	{
		if (policySetItemProvider == null)
		{
			policySetItemProvider = new PolicySetItemProvider(this);
		}

		return policySetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.context.policy.Policy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyItemProvider policyItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.context.policy.Policy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPolicyAdapter()
	{
		if (policyItemProvider == null)
		{
			policyItemProvider = new PolicyItemProvider(this);
		}

		return policyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.context.policy.Rule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleItemProvider ruleItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.context.policy.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuleAdapter()
	{
		if (ruleItemProvider == null)
		{
			ruleItemProvider = new RuleItemProvider(this);
		}

		return ruleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.context.policy.AllOf} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllOfItemProvider allOfItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.context.policy.AllOf}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAllOfAdapter()
	{
		if (allOfItemProvider == null)
		{
			allOfItemProvider = new AllOfItemProvider(this);
		}

		return allOfItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.context.policy.Apply} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplyItemProvider applyItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.context.policy.Apply}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplyAdapter()
	{
		if (applyItemProvider == null)
		{
			applyItemProvider = new ApplyItemProvider(this);
		}

		return applyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeSelector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeSelectorItemProvider attributeSelectorItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeSelector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeSelectorAdapter()
	{
		if (attributeSelectorItemProvider == null)
		{
			attributeSelectorItemProvider = new AttributeSelectorItemProvider(this);
		}

		return attributeSelectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.context.policy.FunctionReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionReferenceItemProvider functionReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.context.policy.FunctionReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionReferenceAdapter()
	{
		if (functionReferenceItemProvider == null)
		{
			functionReferenceItemProvider = new FunctionReferenceItemProvider(this);
		}

		return functionReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeDesignator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDesignatorItemProvider attributeDesignatorItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeDesignator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeDesignatorAdapter()
	{
		if (attributeDesignatorItemProvider == null)
		{
			attributeDesignatorItemProvider = new AttributeDesignatorItemProvider(this);
		}

		return attributeDesignatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.context.policy.XMLString} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLStringItemProvider xmlStringItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.context.policy.XMLString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXMLStringAdapter()
	{
		if (xmlStringItemProvider == null)
		{
			xmlStringItemProvider = new XMLStringItemProvider(this);
		}

		return xmlStringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.context.policy.VariableDefinitions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDefinitionsItemProvider variableDefinitionsItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.context.policy.VariableDefinitions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableDefinitionsAdapter()
	{
		if (variableDefinitionsItemProvider == null)
		{
			variableDefinitionsItemProvider = new VariableDefinitionsItemProvider(this);
		}

		return variableDefinitionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.context.policy.VariableReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableReferenceItemProvider variableReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.context.policy.VariableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableReferenceAdapter()
	{
		if (variableReferenceItemProvider == null)
		{
			variableReferenceItemProvider = new VariableReferenceItemProvider(this);
		}

		return variableReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeValueReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueReferenceItemProvider attributeValueReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.context.policy.AttributeValueReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeValueReferenceAdapter()
	{
		if (attributeValueReferenceItemProvider == null)
		{
			attributeValueReferenceItemProvider = new AttributeValueReferenceItemProvider(this);
		}

		return attributeValueReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.context.policy.SimpleAttributeCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleAttributeConditionItemProvider simpleAttributeConditionItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.context.policy.SimpleAttributeCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleAttributeConditionAdapter()
	{
		if (simpleAttributeConditionItemProvider == null)
		{
			simpleAttributeConditionItemProvider = new SimpleAttributeConditionItemProvider(this);
		}

		return simpleAttributeConditionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory()
	{
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
	{
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type)
	{
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type)
	{
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type)
	{
		if (isFactoryForType(type))
		{
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter)))
			{
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification)
	{
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null)
		{
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose()
	{
		if (policySetItemProvider != null) policySetItemProvider.dispose();
		if (policyItemProvider != null) policyItemProvider.dispose();
		if (ruleItemProvider != null) ruleItemProvider.dispose();
		if (allOfItemProvider != null) allOfItemProvider.dispose();
		if (applyItemProvider != null) applyItemProvider.dispose();
		if (attributeSelectorItemProvider != null) attributeSelectorItemProvider.dispose();
		if (functionReferenceItemProvider != null) functionReferenceItemProvider.dispose();
		if (attributeDesignatorItemProvider != null) attributeDesignatorItemProvider.dispose();
		if (xmlStringItemProvider != null) xmlStringItemProvider.dispose();
		if (variableDefinitionsItemProvider != null) variableDefinitionsItemProvider.dispose();
		if (variableReferenceItemProvider != null) variableReferenceItemProvider.dispose();
		if (attributeValueReferenceItemProvider != null) attributeValueReferenceItemProvider.dispose();
		if (simpleAttributeConditionItemProvider != null) simpleAttributeConditionItemProvider.dispose();
	}

}