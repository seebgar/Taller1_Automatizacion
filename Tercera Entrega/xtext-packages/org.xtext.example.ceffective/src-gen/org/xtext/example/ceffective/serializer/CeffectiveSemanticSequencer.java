/*
 * generated by Xtext 2.20.0
 */
package org.xtext.example.ceffective.serializer;

import ceffective.Almacenamiento;
import ceffective.AmbienteDespliegue;
import ceffective.AutenticacionBasica;
import ceffective.AutenticacionFirma;
import ceffective.AutenticacionUsuario;
import ceffective.Ceffective;
import ceffective.CeffectivePackage;
import ceffective.GrupoSeguridad;
import ceffective.InternetGateway;
import ceffective.ProveedorNube;
import ceffective.Regla;
import ceffective.Servidor;
import ceffective.ServidorAplicaciones;
import ceffective.ServidorBD;
import ceffective.Subred;
import ceffective.VPC;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.example.ceffective.services.CeffectiveGrammarAccess;

@SuppressWarnings("all")
public class CeffectiveSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CeffectiveGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CeffectivePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CeffectivePackage.ALMACENAMIENTO:
				sequence_Almacenamiento(context, (Almacenamiento) semanticObject); 
				return; 
			case CeffectivePackage.AMBIENTE_DESPLIEGUE:
				sequence_AmbienteDespliegue(context, (AmbienteDespliegue) semanticObject); 
				return; 
			case CeffectivePackage.AUTENTICACION_BASICA:
				sequence_AutenticacionBasica(context, (AutenticacionBasica) semanticObject); 
				return; 
			case CeffectivePackage.AUTENTICACION_FIRMA:
				sequence_AutenticacionFirma(context, (AutenticacionFirma) semanticObject); 
				return; 
			case CeffectivePackage.AUTENTICACION_USUARIO:
				sequence_AutenticacionUsuario_Impl(context, (AutenticacionUsuario) semanticObject); 
				return; 
			case CeffectivePackage.CEFFECTIVE:
				sequence_Ceffective(context, (Ceffective) semanticObject); 
				return; 
			case CeffectivePackage.GRUPO_SEGURIDAD:
				sequence_GrupoSeguridad(context, (GrupoSeguridad) semanticObject); 
				return; 
			case CeffectivePackage.INTERNET_GATEWAY:
				sequence_InternetGateway(context, (InternetGateway) semanticObject); 
				return; 
			case CeffectivePackage.PROVEEDOR_NUBE:
				sequence_ProveedorNube(context, (ProveedorNube) semanticObject); 
				return; 
			case CeffectivePackage.REGLA:
				sequence_Regla(context, (Regla) semanticObject); 
				return; 
			case CeffectivePackage.SERVIDOR:
				sequence_Servidor_Impl(context, (Servidor) semanticObject); 
				return; 
			case CeffectivePackage.SERVIDOR_APLICACIONES:
				sequence_ServidorAplicaciones(context, (ServidorAplicaciones) semanticObject); 
				return; 
			case CeffectivePackage.SERVIDOR_BD:
				sequence_ServidorBD(context, (ServidorBD) semanticObject); 
				return; 
			case CeffectivePackage.SUBRED:
				sequence_Subred(context, (Subred) semanticObject); 
				return; 
			case CeffectivePackage.VPC:
				sequence_VPC(context, (VPC) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Recurso returns Almacenamiento
	 *     Almacenamiento returns Almacenamiento
	 *
	 * Constraint:
	 *     (
	 *         nombre=EString? 
	 *         zonaDisponibilidad=EString? 
	 *         zonaNombre=EString? 
	 *         tamanoInicial=EInt? 
	 *         (recursos+=[Recurso|EString] recursos+=[Recurso|EString]*)? 
	 *         vpc=[VPC|EString]?
	 *     )
	 */
	protected void sequence_Almacenamiento(ISerializationContext context, Almacenamiento semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AmbienteDespliegue returns AmbienteDespliegue
	 *
	 * Constraint:
	 *     (ambiente=TipoAmbiente? (recursos+=[Recurso|EString] recursos+=[Recurso|EString]*)?)
	 */
	protected void sequence_AmbienteDespliegue(ISerializationContext context, AmbienteDespliegue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AutenticacionUsuario returns AutenticacionBasica
	 *     AutenticacionBasica returns AutenticacionBasica
	 *
	 * Constraint:
	 *     (usuario=EString? correo=EString? password=EString?)
	 */
	protected void sequence_AutenticacionBasica(ISerializationContext context, AutenticacionBasica semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AutenticacionUsuario returns AutenticacionFirma
	 *     AutenticacionFirma returns AutenticacionFirma
	 *
	 * Constraint:
	 *     (usuario=EString? correo=EString? nombre=EString? certificado=EString?)
	 */
	protected void sequence_AutenticacionFirma(ISerializationContext context, AutenticacionFirma semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AutenticacionUsuario returns AutenticacionUsuario
	 *     AutenticacionUsuario_Impl returns AutenticacionUsuario
	 *
	 * Constraint:
	 *     (usuario=EString? correo=EString?)
	 */
	protected void sequence_AutenticacionUsuario_Impl(ISerializationContext context, AutenticacionUsuario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Ceffective returns Ceffective
	 *
	 * Constraint:
	 *     proveedorNube=ProveedorNube?
	 */
	protected void sequence_Ceffective(ISerializationContext context, Ceffective semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MecanismoSeguridad returns GrupoSeguridad
	 *     GrupoSeguridad returns GrupoSeguridad
	 *
	 * Constraint:
	 *     (
	 *         nombre=EString? 
	 *         zonaNombre=EString? 
	 *         zonaDisponibilidad=EString? 
	 *         descripcion=EString? 
	 *         reglasSalida+=[Regla|EString] 
	 *         reglasSalida+=[Regla|EString]* 
	 *         reglasEntrada+=[Regla|EString] 
	 *         reglasEntrada+=[Regla|EString]*
	 *     )
	 */
	protected void sequence_GrupoSeguridad(ISerializationContext context, GrupoSeguridad semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MecanismoSeguridad returns InternetGateway
	 *     InternetGateway returns InternetGateway
	 *
	 * Constraint:
	 *     (nombre=EString? zonaNombre=EString? zonaDisponibilidad=EString?)
	 */
	protected void sequence_InternetGateway(ISerializationContext context, InternetGateway semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProveedorNube returns ProveedorNube
	 *
	 * Constraint:
	 *     (
	 *         nombre=EString? 
	 *         (ambientedespliegue+=[AmbienteDespliegue|EString] ambientedespliegue+=[AmbienteDespliegue|EString]*)? 
	 *         (vpc+=[VPC|EString] vpc+=[VPC|EString]*)? 
	 *         autenticacionUsuario+=AutenticacionUsuario 
	 *         autenticacionUsuario+=AutenticacionUsuario*
	 *     )
	 */
	protected void sequence_ProveedorNube(ISerializationContext context, ProveedorNube semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Regla returns Regla
	 *
	 * Constraint:
	 *     (tipo=EString? protocolo=EString? puerto=EString? origen=EString? descripcion=EString?)
	 */
	protected void sequence_Regla(ISerializationContext context, Regla semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Recurso returns ServidorAplicaciones
	 *     ServidorAplicaciones returns ServidorAplicaciones
	 *
	 * Constraint:
	 *     (
	 *         nombre=EString? 
	 *         zonaDisponibilidad=EString? 
	 *         zonaNombre=EString? 
	 *         tamano=TamanoServidor? 
	 *         sistemaOperativo=EString? 
	 *         (recursos+=[Recurso|EString] recursos+=[Recurso|EString]*)? 
	 *         vpc=[VPC|EString]?
	 *     )
	 */
	protected void sequence_ServidorAplicaciones(ISerializationContext context, ServidorAplicaciones semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Recurso returns ServidorBD
	 *     ServidorBD returns ServidorBD
	 *
	 * Constraint:
	 *     (
	 *         nombre=EString? 
	 *         zonaDisponibilidad=EString? 
	 *         zonaNombre=EString? 
	 *         tamano=TamanoServidor? 
	 *         tipo=TipoBaseDatos? 
	 *         sistemaManejador=EString? 
	 *         (recursos+=[Recurso|EString] recursos+=[Recurso|EString]*)? 
	 *         vpc=[VPC|EString]?
	 *     )
	 */
	protected void sequence_ServidorBD(ISerializationContext context, ServidorBD semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Recurso returns Servidor
	 *     Servidor_Impl returns Servidor
	 *
	 * Constraint:
	 *     (
	 *         nombre=EString? 
	 *         zonaDisponibilidad=EString? 
	 *         zonaNombre=EString? 
	 *         tamano=TamanoServidor? 
	 *         (recursos+=[Recurso|EString] recursos+=[Recurso|EString]*)? 
	 *         vpc=[VPC|EString]?
	 *     )
	 */
	protected void sequence_Servidor_Impl(ISerializationContext context, Servidor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MecanismoSeguridad returns Subred
	 *     Subred returns Subred
	 *
	 * Constraint:
	 *     (nombre=EString? zonaNombre=EString? zonaDisponibilidad=EString? cidrBlock=EString?)
	 */
	protected void sequence_Subred(ISerializationContext context, Subred semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VPC returns VPC
	 *
	 * Constraint:
	 *     (
	 *         nombre=EString? 
	 *         (mecanismoseguridad+=[MecanismoSeguridad|EString] mecanismoseguridad+=[MecanismoSeguridad|EString]*)? 
	 *         (recurso+=[Recurso|EString] recurso+=[Recurso|EString]*)?
	 *     )
	 */
	protected void sequence_VPC(ISerializationContext context, VPC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
