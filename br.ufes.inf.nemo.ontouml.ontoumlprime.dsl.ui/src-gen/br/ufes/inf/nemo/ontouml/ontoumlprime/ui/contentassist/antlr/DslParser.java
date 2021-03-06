/*
* generated by Xtext
*/
package br.ufes.inf.nemo.ontouml.ontoumlprime.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import br.ufes.inf.nemo.ontouml.ontoumlprime.services.DslGrammarAccess;

public class DslParser extends AbstractContentAssistParser {
	
	@Inject
	private DslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected br.ufes.inf.nemo.ontouml.ontoumlprime.ui.contentassist.antlr.internal.InternalDslParser createParser() {
		br.ufes.inf.nemo.ontouml.ontoumlprime.ui.contentassist.antlr.internal.InternalDslParser result = new br.ufes.inf.nemo.ontouml.ontoumlprime.ui.contentassist.antlr.internal.InternalDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getEndurantUniversalAccess().getAlternatives(), "rule__EndurantUniversal__Alternatives");
					put(grammarAccess.getUniversalAccess().getAlternatives(), "rule__Universal__Alternatives");
					put(grammarAccess.getDataTypeAccess().getAlternatives(), "rule__DataType__Alternatives");
					put(grammarAccess.getIntrinsicMomentUniversalAccess().getAlternatives(), "rule__IntrinsicMomentUniversal__Alternatives");
					put(grammarAccess.getGeneralizationSetAccess().getAlternatives(), "rule__GeneralizationSet__Alternatives");
					put(grammarAccess.getAnonymousGeneralizationSetAccess().getAlternatives_1(), "rule__AnonymousGeneralizationSet__Alternatives_1");
					put(grammarAccess.getAnonymousGeneralizationSetAccess().getAlternatives_1_0_1(), "rule__AnonymousGeneralizationSet__Alternatives_1_0_1");
					put(grammarAccess.getAnonymousGeneralizationSetAccess().getAlternatives_1_1(), "rule__AnonymousGeneralizationSet__Alternatives_1_1");
					put(grammarAccess.getSingleAnonymousGeneralizationSetAccess().getAlternatives_1(), "rule__SingleAnonymousGeneralizationSet__Alternatives_1");
					put(grammarAccess.getMultipleAnonymousGeneralizationSetAccess().getAlternatives_2(), "rule__MultipleAnonymousGeneralizationSet__Alternatives_2");
					put(grammarAccess.getMeronymicRelationAccess().getAlternatives(), "rule__MeronymicRelation__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getCardinalityUpperBoundAccess().getAlternatives(), "rule__CardinalityUpperBound__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
					put(grammarAccess.getCompleteGeneralizationSetAccess().getGroup(), "rule__CompleteGeneralizationSet__Group__0");
					put(grammarAccess.getCompleteGeneralizationSetAccess().getGroup_7(), "rule__CompleteGeneralizationSet__Group_7__0");
					put(grammarAccess.getAnonymousGeneralizationSetAccess().getGroup(), "rule__AnonymousGeneralizationSet__Group__0");
					put(grammarAccess.getAnonymousGeneralizationSetAccess().getGroup_1_0(), "rule__AnonymousGeneralizationSet__Group_1_0__0");
					put(grammarAccess.getAnonymousGeneralizationSetAccess().getGroup_1_0_0(), "rule__AnonymousGeneralizationSet__Group_1_0_0__0");
					put(grammarAccess.getSingleAnonymousGeneralizationSetAccess().getGroup(), "rule__SingleAnonymousGeneralizationSet__Group__0");
					put(grammarAccess.getMultipleAnonymousGeneralizationSetAccess().getGroup(), "rule__MultipleAnonymousGeneralizationSet__Group__0");
					put(grammarAccess.getMultipleAnonymousGeneralizationSetAccess().getGroup_1(), "rule__MultipleAnonymousGeneralizationSet__Group_1__0");
					put(grammarAccess.getPrimitiveDataTypeAccess().getGroup(), "rule__PrimitiveDataType__Group__0");
					put(grammarAccess.getComplexDataTypeAccess().getGroup(), "rule__ComplexDataType__Group__0");
					put(grammarAccess.getComplexDataTypeAccess().getGroup_4(), "rule__ComplexDataType__Group_4__0");
					put(grammarAccess.getEnumerationAccess().getGroup(), "rule__Enumeration__Group__0");
					put(grammarAccess.getEnumerationAccess().getGroup_4(), "rule__Enumeration__Group_4__0");
					put(grammarAccess.getComponentOfRelationAccess().getGroup(), "rule__ComponentOfRelation__Group__0");
					put(grammarAccess.getComponentOfRelationAccess().getGroup_3(), "rule__ComponentOfRelation__Group_3__0");
					put(grammarAccess.getComponentOfRelationAccess().getGroup_6(), "rule__ComponentOfRelation__Group_6__0");
					put(grammarAccess.getMembershipRelationAccess().getGroup(), "rule__MembershipRelation__Group__0");
					put(grammarAccess.getMembershipRelationAccess().getGroup_3(), "rule__MembershipRelation__Group_3__0");
					put(grammarAccess.getMembershipRelationAccess().getGroup_6(), "rule__MembershipRelation__Group_6__0");
					put(grammarAccess.getSubCollectionRelationAccess().getGroup(), "rule__SubCollectionRelation__Group__0");
					put(grammarAccess.getSubCollectionRelationAccess().getGroup_3(), "rule__SubCollectionRelation__Group_3__0");
					put(grammarAccess.getSubCollectionRelationAccess().getGroup_6(), "rule__SubCollectionRelation__Group_6__0");
					put(grammarAccess.getSubQuantityRelationAccess().getGroup(), "rule__SubQuantityRelation__Group__0");
					put(grammarAccess.getSubQuantityRelationAccess().getGroup_3(), "rule__SubQuantityRelation__Group_3__0");
					put(grammarAccess.getSubQuantityRelationAccess().getGroup_6(), "rule__SubQuantityRelation__Group_6__0");
					put(grammarAccess.getKindAccess().getGroup(), "rule__Kind__Group__0");
					put(grammarAccess.getQuantityUniversalAccess().getGroup(), "rule__QuantityUniversal__Group__0");
					put(grammarAccess.getCollectiveUniversalAccess().getGroup(), "rule__CollectiveUniversal__Group__0");
					put(grammarAccess.getSubKindAccess().getGroup(), "rule__SubKind__Group__0");
					put(grammarAccess.getRoleAccess().getGroup(), "rule__Role__Group__0");
					put(grammarAccess.getPhaseAccess().getGroup(), "rule__Phase__Group__0");
					put(grammarAccess.getCategoryAccess().getGroup(), "rule__Category__Group__0");
					put(grammarAccess.getMixinAccess().getGroup(), "rule__Mixin__Group__0");
					put(grammarAccess.getRoleMixinAccess().getGroup(), "rule__RoleMixin__Group__0");
					put(grammarAccess.getRelatorUniversalAccess().getGroup(), "rule__RelatorUniversal__Group__0");
					put(grammarAccess.getBinaryMaterialRelationAccess().getGroup(), "rule__BinaryMaterialRelation__Group__0");
					put(grammarAccess.getBinaryMaterialRelationAccess().getGroup_3(), "rule__BinaryMaterialRelation__Group_3__0");
					put(grammarAccess.getBinaryMaterialRelationAccess().getGroup_5(), "rule__BinaryMaterialRelation__Group_5__0");
					put(grammarAccess.getBinaryMaterialRelationAccess().getGroup_7(), "rule__BinaryMaterialRelation__Group_7__0");
					put(grammarAccess.getBinaryFormalRelationAccess().getGroup(), "rule__BinaryFormalRelation__Group__0");
					put(grammarAccess.getBinaryFormalRelationAccess().getGroup_3(), "rule__BinaryFormalRelation__Group_3__0");
					put(grammarAccess.getBinaryFormalRelationAccess().getGroup_6(), "rule__BinaryFormalRelation__Group_6__0");
					put(grammarAccess.getModeUniversalAccess().getGroup(), "rule__ModeUniversal__Group__0");
					put(grammarAccess.getQualityUniversalAccess().getGroup(), "rule__QualityUniversal__Group__0");
					put(grammarAccess.getQualityUniversalAccess().getGroup_5(), "rule__QualityUniversal__Group_5__0");
					put(grammarAccess.getQualityUniversalAccess().getGroup_5_3(), "rule__QualityUniversal__Group_5_3__0");
					put(grammarAccess.getNAryMaterialRelationAccess().getGroup(), "rule__NAryMaterialRelation__Group__0");
					put(grammarAccess.getNAryMaterialRelationAccess().getGroup_4(), "rule__NAryMaterialRelation__Group_4__0");
					put(grammarAccess.getNAryMaterialRelationAccess().getGroup_4_1(), "rule__NAryMaterialRelation__Group_4_1__0");
					put(grammarAccess.getNAryMaterialRelationAccess().getGroup_4_2(), "rule__NAryMaterialRelation__Group_4_2__0");
					put(grammarAccess.getNAryMaterialRelationAccess().getGroup_4_3(), "rule__NAryMaterialRelation__Group_4_3__0");
					put(grammarAccess.getNAryFormalRelationAccess().getGroup(), "rule__NAryFormalRelation__Group__0");
					put(grammarAccess.getNAryFormalRelationAccess().getGroup_3(), "rule__NAryFormalRelation__Group_3__0");
					put(grammarAccess.getNAryFormalRelationAccess().getGroup_3_1(), "rule__NAryFormalRelation__Group_3_1__0");
					put(grammarAccess.getNAryFormalRelationAccess().getGroup_3_2(), "rule__NAryFormalRelation__Group_3_2__0");
					put(grammarAccess.getNAryFormalRelationAccess().getGroup_3_3(), "rule__NAryFormalRelation__Group_3_3__0");
					put(grammarAccess.getCharacterizationAccess().getGroup(), "rule__Characterization__Group__0");
					put(grammarAccess.getCharacterizationAccess().getGroup_1(), "rule__Characterization__Group_1__0");
					put(grammarAccess.getCharacterizationAccess().getGroup_4(), "rule__Characterization__Group_4__0");
					put(grammarAccess.getMediationAccess().getGroup(), "rule__Mediation__Group__0");
					put(grammarAccess.getMediationAccess().getGroup_2(), "rule__Mediation__Group_2__0");
					put(grammarAccess.getMediationAccess().getGroup_4(), "rule__Mediation__Group_4__0");
					put(grammarAccess.getDataTypeAttributeAccess().getGroup(), "rule__DataTypeAttribute__Group__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getModelAccess().getElementsAssignment_1(), "rule__Model__ElementsAssignment_1");
					put(grammarAccess.getPackageAccess().getNameAssignment_2(), "rule__Package__NameAssignment_2");
					put(grammarAccess.getPackageAccess().getElementsAssignment_4(), "rule__Package__ElementsAssignment_4");
					put(grammarAccess.getCompleteGeneralizationSetAccess().getIsCoveringAssignment_0(), "rule__CompleteGeneralizationSet__IsCoveringAssignment_0");
					put(grammarAccess.getCompleteGeneralizationSetAccess().getNameAssignment_2(), "rule__CompleteGeneralizationSet__NameAssignment_2");
					put(grammarAccess.getCompleteGeneralizationSetAccess().getSpecializedUniversalAssignment_4(), "rule__CompleteGeneralizationSet__SpecializedUniversalAssignment_4");
					put(grammarAccess.getCompleteGeneralizationSetAccess().getSpecializingUniversalsAssignment_6(), "rule__CompleteGeneralizationSet__SpecializingUniversalsAssignment_6");
					put(grammarAccess.getCompleteGeneralizationSetAccess().getSpecializingUniversalsAssignment_7_1(), "rule__CompleteGeneralizationSet__SpecializingUniversalsAssignment_7_1");
					put(grammarAccess.getAnonymousGeneralizationSetAccess().getSpecializingUniversalsAssignment_0(), "rule__AnonymousGeneralizationSet__SpecializingUniversalsAssignment_0");
					put(grammarAccess.getAnonymousGeneralizationSetAccess().getSpecializingUniversalsAssignment_1_0_0_1(), "rule__AnonymousGeneralizationSet__SpecializingUniversalsAssignment_1_0_0_1");
					put(grammarAccess.getAnonymousGeneralizationSetAccess().getSpecializedUniversalAssignment_2(), "rule__AnonymousGeneralizationSet__SpecializedUniversalAssignment_2");
					put(grammarAccess.getSingleAnonymousGeneralizationSetAccess().getSpecializingUniversalsAssignment_0(), "rule__SingleAnonymousGeneralizationSet__SpecializingUniversalsAssignment_0");
					put(grammarAccess.getSingleAnonymousGeneralizationSetAccess().getSpecializedUniversalAssignment_2(), "rule__SingleAnonymousGeneralizationSet__SpecializedUniversalAssignment_2");
					put(grammarAccess.getMultipleAnonymousGeneralizationSetAccess().getSpecializingUniversalsAssignment_0(), "rule__MultipleAnonymousGeneralizationSet__SpecializingUniversalsAssignment_0");
					put(grammarAccess.getMultipleAnonymousGeneralizationSetAccess().getSpecializingUniversalsAssignment_1_1(), "rule__MultipleAnonymousGeneralizationSet__SpecializingUniversalsAssignment_1_1");
					put(grammarAccess.getMultipleAnonymousGeneralizationSetAccess().getSpecializedUniversalAssignment_3(), "rule__MultipleAnonymousGeneralizationSet__SpecializedUniversalAssignment_3");
					put(grammarAccess.getPrimitiveDataTypeAccess().getNameAssignment_1(), "rule__PrimitiveDataType__NameAssignment_1");
					put(grammarAccess.getPrimitiveDataTypeAccess().get_typeAssignment_3(), "rule__PrimitiveDataType___typeAssignment_3");
					put(grammarAccess.getComplexDataTypeAccess().getNameAssignment_1(), "rule__ComplexDataType__NameAssignment_1");
					put(grammarAccess.getComplexDataTypeAccess().getAttributesAssignment_3(), "rule__ComplexDataType__AttributesAssignment_3");
					put(grammarAccess.getComplexDataTypeAccess().getAttributesAssignment_4_1(), "rule__ComplexDataType__AttributesAssignment_4_1");
					put(grammarAccess.getEnumerationAccess().getNameAssignment_1(), "rule__Enumeration__NameAssignment_1");
					put(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_3(), "rule__Enumeration__EnumerationLiteralsAssignment_3");
					put(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_4_1(), "rule__Enumeration__EnumerationLiteralsAssignment_4_1");
					put(grammarAccess.getComponentOfRelationAccess().getPartIsEssentialAssignment_0_0(), "rule__ComponentOfRelation__PartIsEssentialAssignment_0_0");
					put(grammarAccess.getComponentOfRelationAccess().getPartIsInseparableAssignment_0_1(), "rule__ComponentOfRelation__PartIsInseparableAssignment_0_1");
					put(grammarAccess.getComponentOfRelationAccess().getPartIsShareableAssignment_0_2(), "rule__ComponentOfRelation__PartIsShareableAssignment_0_2");
					put(grammarAccess.getComponentOfRelationAccess().getPartIsImmutableAssignment_0_3(), "rule__ComponentOfRelation__PartIsImmutableAssignment_0_3");
					put(grammarAccess.getComponentOfRelationAccess().getPartAssignment_2(), "rule__ComponentOfRelation__PartAssignment_2");
					put(grammarAccess.getComponentOfRelationAccess().getSourceLowerBoundAssignment_3_1(), "rule__ComponentOfRelation__SourceLowerBoundAssignment_3_1");
					put(grammarAccess.getComponentOfRelationAccess().getSourceUpperBoundAssignment_3_3(), "rule__ComponentOfRelation__SourceUpperBoundAssignment_3_3");
					put(grammarAccess.getComponentOfRelationAccess().getWholeAssignment_5(), "rule__ComponentOfRelation__WholeAssignment_5");
					put(grammarAccess.getComponentOfRelationAccess().getTargetLowerBoundAssignment_6_1(), "rule__ComponentOfRelation__TargetLowerBoundAssignment_6_1");
					put(grammarAccess.getComponentOfRelationAccess().getTargetUpperBoundAssignment_6_3(), "rule__ComponentOfRelation__TargetUpperBoundAssignment_6_3");
					put(grammarAccess.getMembershipRelationAccess().getPartIsEssentialAssignment_0_0(), "rule__MembershipRelation__PartIsEssentialAssignment_0_0");
					put(grammarAccess.getMembershipRelationAccess().getPartIsInseparableAssignment_0_1(), "rule__MembershipRelation__PartIsInseparableAssignment_0_1");
					put(grammarAccess.getMembershipRelationAccess().getPartIsShareableAssignment_0_2(), "rule__MembershipRelation__PartIsShareableAssignment_0_2");
					put(grammarAccess.getMembershipRelationAccess().getPartIsImmutableAssignment_0_3(), "rule__MembershipRelation__PartIsImmutableAssignment_0_3");
					put(grammarAccess.getMembershipRelationAccess().getPartAssignment_2(), "rule__MembershipRelation__PartAssignment_2");
					put(grammarAccess.getMembershipRelationAccess().getSourceLowerBoundAssignment_3_1(), "rule__MembershipRelation__SourceLowerBoundAssignment_3_1");
					put(grammarAccess.getMembershipRelationAccess().getSourceUpperBoundAssignment_3_3(), "rule__MembershipRelation__SourceUpperBoundAssignment_3_3");
					put(grammarAccess.getMembershipRelationAccess().getWholeAssignment_5(), "rule__MembershipRelation__WholeAssignment_5");
					put(grammarAccess.getMembershipRelationAccess().getTargetLowerBoundAssignment_6_1(), "rule__MembershipRelation__TargetLowerBoundAssignment_6_1");
					put(grammarAccess.getMembershipRelationAccess().getTargetUpperBoundAssignment_6_3(), "rule__MembershipRelation__TargetUpperBoundAssignment_6_3");
					put(grammarAccess.getSubCollectionRelationAccess().getPartIsEssentialAssignment_0_0(), "rule__SubCollectionRelation__PartIsEssentialAssignment_0_0");
					put(grammarAccess.getSubCollectionRelationAccess().getPartIsInseparableAssignment_0_1(), "rule__SubCollectionRelation__PartIsInseparableAssignment_0_1");
					put(grammarAccess.getSubCollectionRelationAccess().getPartIsShareableAssignment_0_2(), "rule__SubCollectionRelation__PartIsShareableAssignment_0_2");
					put(grammarAccess.getSubCollectionRelationAccess().getPartIsImmutableAssignment_0_3(), "rule__SubCollectionRelation__PartIsImmutableAssignment_0_3");
					put(grammarAccess.getSubCollectionRelationAccess().getPartAssignment_2(), "rule__SubCollectionRelation__PartAssignment_2");
					put(grammarAccess.getSubCollectionRelationAccess().getSourceLowerBoundAssignment_3_1(), "rule__SubCollectionRelation__SourceLowerBoundAssignment_3_1");
					put(grammarAccess.getSubCollectionRelationAccess().getSourceUpperBoundAssignment_3_3(), "rule__SubCollectionRelation__SourceUpperBoundAssignment_3_3");
					put(grammarAccess.getSubCollectionRelationAccess().getWholeAssignment_5(), "rule__SubCollectionRelation__WholeAssignment_5");
					put(grammarAccess.getSubCollectionRelationAccess().getTargetLowerBoundAssignment_6_1(), "rule__SubCollectionRelation__TargetLowerBoundAssignment_6_1");
					put(grammarAccess.getSubCollectionRelationAccess().getTargetUpperBoundAssignment_6_3(), "rule__SubCollectionRelation__TargetUpperBoundAssignment_6_3");
					put(grammarAccess.getSubQuantityRelationAccess().getPartIsEssentialAssignment_0_0(), "rule__SubQuantityRelation__PartIsEssentialAssignment_0_0");
					put(grammarAccess.getSubQuantityRelationAccess().getPartIsInseparableAssignment_0_1(), "rule__SubQuantityRelation__PartIsInseparableAssignment_0_1");
					put(grammarAccess.getSubQuantityRelationAccess().getPartIsImmutableAssignment_0_2(), "rule__SubQuantityRelation__PartIsImmutableAssignment_0_2");
					put(grammarAccess.getSubQuantityRelationAccess().getPartAssignment_2(), "rule__SubQuantityRelation__PartAssignment_2");
					put(grammarAccess.getSubQuantityRelationAccess().getSourceLowerBoundAssignment_3_1(), "rule__SubQuantityRelation__SourceLowerBoundAssignment_3_1");
					put(grammarAccess.getSubQuantityRelationAccess().getSourceUpperBoundAssignment_3_3(), "rule__SubQuantityRelation__SourceUpperBoundAssignment_3_3");
					put(grammarAccess.getSubQuantityRelationAccess().getWholeAssignment_5(), "rule__SubQuantityRelation__WholeAssignment_5");
					put(grammarAccess.getSubQuantityRelationAccess().getTargetLowerBoundAssignment_6_1(), "rule__SubQuantityRelation__TargetLowerBoundAssignment_6_1");
					put(grammarAccess.getSubQuantityRelationAccess().getTargetUpperBoundAssignment_6_3(), "rule__SubQuantityRelation__TargetUpperBoundAssignment_6_3");
					put(grammarAccess.getKindAccess().getNameAssignment_2(), "rule__Kind__NameAssignment_2");
					put(grammarAccess.getKindAccess().getCharacterizedByAssignment_4(), "rule__Kind__CharacterizedByAssignment_4");
					put(grammarAccess.getQuantityUniversalAccess().getNameAssignment_2(), "rule__QuantityUniversal__NameAssignment_2");
					put(grammarAccess.getQuantityUniversalAccess().getCharacterizedByAssignment_4(), "rule__QuantityUniversal__CharacterizedByAssignment_4");
					put(grammarAccess.getCollectiveUniversalAccess().getIsExtensionalAssignment_0(), "rule__CollectiveUniversal__IsExtensionalAssignment_0");
					put(grammarAccess.getCollectiveUniversalAccess().getNameAssignment_2(), "rule__CollectiveUniversal__NameAssignment_2");
					put(grammarAccess.getCollectiveUniversalAccess().getCharacterizedByAssignment_4(), "rule__CollectiveUniversal__CharacterizedByAssignment_4");
					put(grammarAccess.getSubKindAccess().getNameAssignment_2(), "rule__SubKind__NameAssignment_2");
					put(grammarAccess.getSubKindAccess().getCharacterizedByAssignment_4(), "rule__SubKind__CharacterizedByAssignment_4");
					put(grammarAccess.getRoleAccess().getNameAssignment_1(), "rule__Role__NameAssignment_1");
					put(grammarAccess.getRoleAccess().getCharacterizedByAssignment_3(), "rule__Role__CharacterizedByAssignment_3");
					put(grammarAccess.getPhaseAccess().getNameAssignment_2(), "rule__Phase__NameAssignment_2");
					put(grammarAccess.getPhaseAccess().getCharacterizedByAssignment_4(), "rule__Phase__CharacterizedByAssignment_4");
					put(grammarAccess.getCategoryAccess().getNameAssignment_2(), "rule__Category__NameAssignment_2");
					put(grammarAccess.getMixinAccess().getNameAssignment_2(), "rule__Mixin__NameAssignment_2");
					put(grammarAccess.getRoleMixinAccess().getNameAssignment_1(), "rule__RoleMixin__NameAssignment_1");
					put(grammarAccess.getRelatorUniversalAccess().getNameAssignment_1(), "rule__RelatorUniversal__NameAssignment_1");
					put(grammarAccess.getRelatorUniversalAccess().getCharacterizedByAssignment_3(), "rule__RelatorUniversal__CharacterizedByAssignment_3");
					put(grammarAccess.getRelatorUniversalAccess().getMediationsAssignment_4(), "rule__RelatorUniversal__MediationsAssignment_4");
					put(grammarAccess.getBinaryMaterialRelationAccess().getSourceAssignment_2(), "rule__BinaryMaterialRelation__SourceAssignment_2");
					put(grammarAccess.getBinaryMaterialRelationAccess().getSourceLowerBoundAssignment_3_1(), "rule__BinaryMaterialRelation__SourceLowerBoundAssignment_3_1");
					put(grammarAccess.getBinaryMaterialRelationAccess().getSourceUpperBoundAssignment_3_3(), "rule__BinaryMaterialRelation__SourceUpperBoundAssignment_3_3");
					put(grammarAccess.getBinaryMaterialRelationAccess().getNameAssignment_4(), "rule__BinaryMaterialRelation__NameAssignment_4");
					put(grammarAccess.getBinaryMaterialRelationAccess().getDerivedFromAssignment_5_1(), "rule__BinaryMaterialRelation__DerivedFromAssignment_5_1");
					put(grammarAccess.getBinaryMaterialRelationAccess().getTargetAssignment_6(), "rule__BinaryMaterialRelation__TargetAssignment_6");
					put(grammarAccess.getBinaryMaterialRelationAccess().getTargetLowerBoundAssignment_7_1(), "rule__BinaryMaterialRelation__TargetLowerBoundAssignment_7_1");
					put(grammarAccess.getBinaryMaterialRelationAccess().getTargetUpperBoundAssignment_7_3(), "rule__BinaryMaterialRelation__TargetUpperBoundAssignment_7_3");
					put(grammarAccess.getBinaryFormalRelationAccess().getSourceAssignment_2(), "rule__BinaryFormalRelation__SourceAssignment_2");
					put(grammarAccess.getBinaryFormalRelationAccess().getSourceLowerBoundAssignment_3_1(), "rule__BinaryFormalRelation__SourceLowerBoundAssignment_3_1");
					put(grammarAccess.getBinaryFormalRelationAccess().getSourceUpperBoundAssignment_3_3(), "rule__BinaryFormalRelation__SourceUpperBoundAssignment_3_3");
					put(grammarAccess.getBinaryFormalRelationAccess().getNameAssignment_4(), "rule__BinaryFormalRelation__NameAssignment_4");
					put(grammarAccess.getBinaryFormalRelationAccess().getTargetAssignment_5(), "rule__BinaryFormalRelation__TargetAssignment_5");
					put(grammarAccess.getBinaryFormalRelationAccess().getTargetLowerBoundAssignment_6_1(), "rule__BinaryFormalRelation__TargetLowerBoundAssignment_6_1");
					put(grammarAccess.getBinaryFormalRelationAccess().getTargetUpperBoundAssignment_6_3(), "rule__BinaryFormalRelation__TargetUpperBoundAssignment_6_3");
					put(grammarAccess.getModeUniversalAccess().getNameAssignment_1(), "rule__ModeUniversal__NameAssignment_1");
					put(grammarAccess.getModeUniversalAccess().getCharacterizedByAssignment_3(), "rule__ModeUniversal__CharacterizedByAssignment_3");
					put(grammarAccess.getQualityUniversalAccess().getNameAssignment_1(), "rule__QualityUniversal__NameAssignment_1");
					put(grammarAccess.getQualityUniversalAccess().getCharacterizationAssignment_3(), "rule__QualityUniversal__CharacterizationAssignment_3");
					put(grammarAccess.getQualityUniversalAccess().getDatatypesAssignment_5_2(), "rule__QualityUniversal__DatatypesAssignment_5_2");
					put(grammarAccess.getQualityUniversalAccess().getDatatypesAssignment_5_3_1(), "rule__QualityUniversal__DatatypesAssignment_5_3_1");
					put(grammarAccess.getQualityUniversalAccess().getCharacterizedByAssignment_6(), "rule__QualityUniversal__CharacterizedByAssignment_6");
					put(grammarAccess.getNAryMaterialRelationAccess().getDerivedFromAssignment_2(), "rule__NAryMaterialRelation__DerivedFromAssignment_2");
					put(grammarAccess.getNAryMaterialRelationAccess().getNameAssignment_3(), "rule__NAryMaterialRelation__NameAssignment_3");
					put(grammarAccess.getNAryMaterialRelationAccess().getTargetRelataAssignment_4_0(), "rule__NAryMaterialRelation__TargetRelataAssignment_4_0");
					put(grammarAccess.getNAryMaterialRelationAccess().getSourceLowerBoundAssignment_4_1_1(), "rule__NAryMaterialRelation__SourceLowerBoundAssignment_4_1_1");
					put(grammarAccess.getNAryMaterialRelationAccess().getSourceUpperBoundAssignment_4_1_3(), "rule__NAryMaterialRelation__SourceUpperBoundAssignment_4_1_3");
					put(grammarAccess.getNAryMaterialRelationAccess().getTargetRelataAssignment_4_2_1(), "rule__NAryMaterialRelation__TargetRelataAssignment_4_2_1");
					put(grammarAccess.getNAryMaterialRelationAccess().getSourceLowerBoundAssignment_4_3_1(), "rule__NAryMaterialRelation__SourceLowerBoundAssignment_4_3_1");
					put(grammarAccess.getNAryMaterialRelationAccess().getSourceUpperBoundAssignment_4_3_3(), "rule__NAryMaterialRelation__SourceUpperBoundAssignment_4_3_3");
					put(grammarAccess.getNAryFormalRelationAccess().getNameAssignment_2(), "rule__NAryFormalRelation__NameAssignment_2");
					put(grammarAccess.getNAryFormalRelationAccess().getTargetRelataAssignment_3_0(), "rule__NAryFormalRelation__TargetRelataAssignment_3_0");
					put(grammarAccess.getNAryFormalRelationAccess().getSourceLowerBoundAssignment_3_1_1(), "rule__NAryFormalRelation__SourceLowerBoundAssignment_3_1_1");
					put(grammarAccess.getNAryFormalRelationAccess().getSourceUpperBoundAssignment_3_1_3(), "rule__NAryFormalRelation__SourceUpperBoundAssignment_3_1_3");
					put(grammarAccess.getNAryFormalRelationAccess().getTargetRelataAssignment_3_2_1(), "rule__NAryFormalRelation__TargetRelataAssignment_3_2_1");
					put(grammarAccess.getNAryFormalRelationAccess().getSourceLowerBoundAssignment_3_3_1(), "rule__NAryFormalRelation__SourceLowerBoundAssignment_3_3_1");
					put(grammarAccess.getNAryFormalRelationAccess().getSourceUpperBoundAssignment_3_3_3(), "rule__NAryFormalRelation__SourceUpperBoundAssignment_3_3_3");
					put(grammarAccess.getCharacterizationAccess().getSourceLowerBoundAssignment_1_1(), "rule__Characterization__SourceLowerBoundAssignment_1_1");
					put(grammarAccess.getCharacterizationAccess().getSourceUpperBoundAssignment_1_3(), "rule__Characterization__SourceUpperBoundAssignment_1_3");
					put(grammarAccess.getCharacterizationAccess().getTargetAssignment_3(), "rule__Characterization__TargetAssignment_3");
					put(grammarAccess.getCharacterizationAccess().getTargetLowerBoundAssignment_4_1(), "rule__Characterization__TargetLowerBoundAssignment_4_1");
					put(grammarAccess.getCharacterizationAccess().getTargetUpperBoundAssignment_4_3(), "rule__Characterization__TargetUpperBoundAssignment_4_3");
					put(grammarAccess.getMediationAccess().getSourceLowerBoundAssignment_2_1(), "rule__Mediation__SourceLowerBoundAssignment_2_1");
					put(grammarAccess.getMediationAccess().getSourceUpperBoundAssignment_2_3(), "rule__Mediation__SourceUpperBoundAssignment_2_3");
					put(grammarAccess.getMediationAccess().getTargetAssignment_3(), "rule__Mediation__TargetAssignment_3");
					put(grammarAccess.getMediationAccess().getTargetLowerBoundAssignment_4_1(), "rule__Mediation__TargetLowerBoundAssignment_4_1");
					put(grammarAccess.getMediationAccess().getTargetUpperBoundAssignment_4_3(), "rule__Mediation__TargetUpperBoundAssignment_4_3");
					put(grammarAccess.getDataTypeAttributeAccess().getIsOfTypeAssignment_0(), "rule__DataTypeAttribute__IsOfTypeAssignment_0");
					put(grammarAccess.getDataTypeAttributeAccess().getNameAssignment_1(), "rule__DataTypeAttribute__NameAssignment_1");
					put(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), "rule__ComponentOfRelation__UnorderedGroup_0");
					put(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), "rule__MembershipRelation__UnorderedGroup_0");
					put(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), "rule__SubCollectionRelation__UnorderedGroup_0");
					put(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), "rule__SubQuantityRelation__UnorderedGroup_0");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			br.ufes.inf.nemo.ontouml.ontoumlprime.ui.contentassist.antlr.internal.InternalDslParser typedParser = (br.ufes.inf.nemo.ontouml.ontoumlprime.ui.contentassist.antlr.internal.InternalDslParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
