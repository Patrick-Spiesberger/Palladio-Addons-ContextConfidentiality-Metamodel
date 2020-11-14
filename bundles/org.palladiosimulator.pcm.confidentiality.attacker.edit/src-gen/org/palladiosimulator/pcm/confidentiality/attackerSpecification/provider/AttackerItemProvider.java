/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage;

import org.palladiosimulator.pcm.core.entity.provider.EntityItemProvider;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AttackerItemProvider extends EntityItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttackerItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addCapabilitiesPropertyDescriptor(object);
            addCompromisedComponentsPropertyDescriptor(object);
            addCompromisedResourcesPropertyDescriptor(object);
            addCompromisedLinkingResourcesPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Capabilities feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCapabilitiesPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(), getString("_UI_Attacker_capabilities_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_Attacker_capabilities_feature",
                                "_UI_Attacker_type"),
                        AttackerPackage.Literals.ATTACKER__CAPABILITIES, true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Compromised Components feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCompromisedComponentsPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(), getString("_UI_Attacker_compromisedComponents_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_Attacker_compromisedComponents_feature",
                                "_UI_Attacker_type"),
                        AttackerPackage.Literals.ATTACKER__COMPROMISED_COMPONENTS, true, false, true, null, null,
                        null));
    }

    /**
     * This adds a property descriptor for the Compromised Resources feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCompromisedResourcesPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(), getString("_UI_Attacker_compromisedResources_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_Attacker_compromisedResources_feature",
                                "_UI_Attacker_type"),
                        AttackerPackage.Literals.ATTACKER__COMPROMISED_RESOURCES, true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Compromised Linking Resources feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCompromisedLinkingResourcesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Attacker_compromisedLinkingResources_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Attacker_compromisedLinkingResources_feature",
                        "_UI_Attacker_type"),
                AttackerPackage.Literals.ATTACKER__COMPROMISED_LINKING_RESOURCES, true, false, true, null, null, null));
    }

    /**
     * This returns Attacker.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Attacker"));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean shouldComposeCreationImage() {
        return true;
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Attacker) object).getEntityName();
        return label == null || label.length() == 0 ? getString("_UI_Attacker_type")
                : getString("_UI_Attacker_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}