/**
 * Created by Ilia Shelkovenko on 10.09.2023.
 */

package com.gmail.hostov47.materialcalculator.domain

sealed interface ExpressionPart {
    data class Number(val number: Double): ExpressionPart
    data class Op(val operation: Operation): ExpressionPart
    data class Parentheses(val type: ParenthesesType): ExpressionPart
}

sealed interface ParenthesesType {
    object Opening: ParenthesesType
    object Closing: ParenthesesType
}