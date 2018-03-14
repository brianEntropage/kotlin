package org.jetbrains.kotlin.fir.visitors

import org.jetbrains.kotlin.fir.declarations.*
import org.jetbrains.kotlin.fir.expressions.*
import org.jetbrains.kotlin.fir.*
import org.jetbrains.kotlin.fir.types.*


abstract class FirVisitor<R, D> {
    abstract fun visitElement(element: FirElement, data: D): R

    open fun visitDeclaration(declaration: FirDeclaration, data: D): R {
        return visitElement(declaration, data)
    }

    open fun visitCallableMember(callableMember: FirCallableMember, data: D): R {
        return visitDeclaration(callableMember, data)
    }

    open fun visitDeclarationWithBody(declarationWithBody: FirDeclarationWithBody, data: D): R {
        return visitDeclaration(declarationWithBody, data)
    }

    open fun visitAnonymousInitializer(anonymousInitializer: FirAnonymousInitializer, data: D): R {
        return visitDeclarationWithBody(anonymousInitializer, data)
    }

    open fun visitFunction(function: FirFunction, data: D): R {
        return visitDeclarationWithBody(function, data)
    }

    open fun visitConstructor(constructor: FirConstructor, data: D): R {
        return visitFunction(constructor, data)
    }

    open fun visitNamedFunction(namedFunction: FirNamedFunction, data: D): R {
        return visitFunction(namedFunction, data)
    }

    open fun visitPropertyAccessor(propertyAccessor: FirPropertyAccessor, data: D): R {
        return visitFunction(propertyAccessor, data)
    }

    open fun visitErrorDeclaration(errorDeclaration: FirErrorDeclaration, data: D): R {
        return visitDeclaration(errorDeclaration, data)
    }

    open fun visitNamedDeclaration(namedDeclaration: FirNamedDeclaration, data: D): R {
        return visitDeclaration(namedDeclaration, data)
    }

    open fun visitMemberDeclaration(memberDeclaration: FirMemberDeclaration, data: D): R {
        return visitNamedDeclaration(memberDeclaration, data)
    }

    open fun visitClass(klass: FirClass, data: D): R {
        return visitMemberDeclaration(klass, data)
    }

    open fun visitEnumEntry(enumEntry: FirEnumEntry, data: D): R {
        return visitClass(enumEntry, data)
    }

    open fun visitTypeAlias(typeAlias: FirTypeAlias, data: D): R {
        return visitMemberDeclaration(typeAlias, data)
    }

    open fun visitTypeParameter(typeParameter: FirTypeParameter, data: D): R {
        return visitNamedDeclaration(typeParameter, data)
    }

    open fun visitProperty(property: FirProperty, data: D): R {
        return visitDeclaration(property, data)
    }

    open fun visitTypedDeclaration(typedDeclaration: FirTypedDeclaration, data: D): R {
        return visitDeclaration(typedDeclaration, data)
    }

    open fun visitValueParameter(valueParameter: FirValueParameter, data: D): R {
        return visitDeclaration(valueParameter, data)
    }

    open fun visitVariable(variable: FirVariable, data: D): R {
        return visitDeclaration(variable, data)
    }

    open fun visitImport(import: FirImport, data: D): R {
        return visitElement(import, data)
    }

    open fun visitPackageFragment(packageFragment: FirPackageFragment, data: D): R {
        return visitElement(packageFragment, data)
    }

    open fun visitFile(file: FirFile, data: D): R {
        return visitPackageFragment(file, data)
    }

    open fun visitStatement(statement: FirStatement, data: D): R {
        return visitElement(statement, data)
    }

    open fun visitExpression(expression: FirExpression, data: D): R {
        return visitStatement(expression, data)
    }

    open fun visitBody(body: FirBody, data: D): R {
        return visitExpression(body, data)
    }

    open fun visitCall(call: FirCall, data: D): R {
        return visitExpression(call, data)
    }

    open fun visitAnnotationCall(annotationCall: FirAnnotationCall, data: D): R {
        return visitCall(annotationCall, data)
    }

    open fun visitConstructorCall(constructorCall: FirConstructorCall, data: D): R {
        return visitCall(constructorCall, data)
    }

    open fun visitType(type: FirType, data: D): R {
        return visitElement(type, data)
    }

    open fun visitDelegatedType(delegatedType: FirDelegatedType, data: D): R {
        return visitType(delegatedType, data)
    }

    open fun visitErrorType(errorType: FirErrorType, data: D): R {
        return visitType(errorType, data)
    }

    open fun visitImplicitType(implicitType: FirImplicitType, data: D): R {
        return visitType(implicitType, data)
    }

    open fun visitTypeWithNullability(typeWithNullability: FirTypeWithNullability, data: D): R {
        return visitType(typeWithNullability, data)
    }

    open fun visitDynamicType(dynamicType: FirDynamicType, data: D): R {
        return visitTypeWithNullability(dynamicType, data)
    }

    open fun visitFunctionType(functionType: FirFunctionType, data: D): R {
        return visitTypeWithNullability(functionType, data)
    }

    open fun visitResolvedType(resolvedType: FirResolvedType, data: D): R {
        return visitTypeWithNullability(resolvedType, data)
    }

    open fun visitUserType(userType: FirUserType, data: D): R {
        return visitTypeWithNullability(userType, data)
    }

    open fun visitTypeProjection(typeProjection: FirTypeProjection, data: D): R {
        return visitElement(typeProjection, data)
    }

    open fun visitStarProjection(starProjection: FirStarProjection, data: D): R {
        return visitTypeProjection(starProjection, data)
    }

    open fun visitTypeProjectionWithVariance(typeProjectionWithVariance: FirTypeProjectionWithVariance, data: D): R {
        return visitTypeProjection(typeProjectionWithVariance, data)
    }

}
