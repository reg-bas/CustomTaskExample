/**
 */
package org.eclipse.bpmn2.modeler.examples.customtask.MyModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.DocumentRoot#getTaskConfig <em>Task Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getDocumentRoot()
 * @model extendedMetaData="name='null' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Task Config</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Config</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Config</em>' containment reference list.
	 * @see org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelPackage#getDocumentRoot_TaskConfig()
	 * @model containment="true"
	 *        extendedMetaData="name='taskConfig' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TaskConfig> getTaskConfig();

} // DocumentRoot
