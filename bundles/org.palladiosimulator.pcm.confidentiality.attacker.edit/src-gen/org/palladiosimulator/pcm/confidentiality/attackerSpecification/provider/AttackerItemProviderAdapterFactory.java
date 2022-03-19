/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.util.AttackerAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AttackerItemProviderAdapterFactory extends AttackerAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender
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
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(AttackerEditPlugin.INSTANCE, AttackerPackage.eNS_URI);

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
	public AttackerItemProviderAdapterFactory()
	{
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackerContainerItemProvider attackerContainerItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttackerContainerAdapter()
	{
		if (attackerContainerItemProvider == null)
		{
			attackerContainerItemProvider = new AttackerContainerItemProvider(this);
		}

		return attackerContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackerItemProvider attackerItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttackerAdapter()
	{
		if (attackerItemProvider == null)
		{
			attackerItemProvider = new AttackerItemProvider(this);
		}

		return attackerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackerSpecificationItemProvider attackerSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttackerSpecificationAdapter()
	{
		if (attackerSpecificationItemProvider == null)
		{
			attackerSpecificationItemProvider = new AttackerSpecificationItemProvider(this);
		}

		return attackerSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackContainerItemProvider attackContainerItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttackContainerAdapter()
	{
		if (attackContainerItemProvider == null)
		{
			attackContainerItemProvider = new AttackContainerItemProvider(this);
		}

		return attackContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.VulnerabilityContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VulnerabilityContainerItemProvider vulnerabilityContainerItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.VulnerabilityContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVulnerabilityContainerAdapter()
	{
		if (vulnerabilityContainerItemProvider == null)
		{
			vulnerabilityContainerItemProvider = new VulnerabilityContainerItemProvider(this);
		}

		return vulnerabilityContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.CategorySpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategorySpecificationItemProvider categorySpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.CategorySpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCategorySpecificationAdapter()
	{
		if (categorySpecificationItemProvider == null)
		{
			categorySpecificationItemProvider = new CategorySpecificationItemProvider(this);
		}

		return categorySpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSystemSpecificationContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackerSystemSpecificationContainerItemProvider attackerSystemSpecificationContainerItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSystemSpecificationContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttackerSystemSpecificationContainerAdapter()
	{
		if (attackerSystemSpecificationContainerItemProvider == null)
		{
			attackerSystemSpecificationContainerItemProvider = new AttackerSystemSpecificationContainerItemProvider(this);
		}

		return attackerSystemSpecificationContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatamodelAttackerItemProvider datamodelAttackerItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDatamodelAttackerAdapter()
	{
		if (datamodelAttackerItemProvider == null)
		{
			datamodelAttackerItemProvider = new DatamodelAttackerItemProvider(this);
		}

		return datamodelAttackerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AssemblyContextDetail} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyContextDetailItemProvider assemblyContextDetailItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AssemblyContextDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssemblyContextDetailAdapter()
	{
		if (assemblyContextDetailItemProvider == null)
		{
			assemblyContextDetailItemProvider = new AssemblyContextDetailItemProvider(this);
		}

		return assemblyContextDetailItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Mitigation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MitigationItemProvider mitigationItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Mitigation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMitigationAdapter()
	{
		if (mitigationItemProvider == null)
		{
			mitigationItemProvider = new MitigationItemProvider(this);
		}

		return mitigationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Encryption} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncryptionItemProvider encryptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Encryption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEncryptionAdapter()
	{
		if (encryptionItemProvider == null)
		{
			encryptionItemProvider = new EncryptionItemProvider(this);
		}

		return encryptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatamodelContainerItemProvider datamodelContainerItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDatamodelContainerAdapter()
	{
		if (datamodelContainerItemProvider == null)
		{
			datamodelContainerItemProvider = new DatamodelContainerItemProvider(this);
		}

		return datamodelContainerItemProvider;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders()
	{
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain)
	{
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator()
	{
		return childCreationExtenderManager;
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
		if (attackerContainerItemProvider != null) attackerContainerItemProvider.dispose();
		if (attackerItemProvider != null) attackerItemProvider.dispose();
		if (attackerSpecificationItemProvider != null) attackerSpecificationItemProvider.dispose();
		if (attackContainerItemProvider != null) attackContainerItemProvider.dispose();
		if (vulnerabilityContainerItemProvider != null) vulnerabilityContainerItemProvider.dispose();
		if (categorySpecificationItemProvider != null) categorySpecificationItemProvider.dispose();
		if (attackerSystemSpecificationContainerItemProvider != null) attackerSystemSpecificationContainerItemProvider.dispose();
		if (datamodelAttackerItemProvider != null) datamodelAttackerItemProvider.dispose();
		if (assemblyContextDetailItemProvider != null) assemblyContextDetailItemProvider.dispose();
		if (mitigationItemProvider != null) mitigationItemProvider.dispose();
		if (encryptionItemProvider != null) encryptionItemProvider.dispose();
		if (datamodelContainerItemProvider != null) datamodelContainerItemProvider.dispose();
	}

}
